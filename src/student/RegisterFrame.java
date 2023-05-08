package Student;


import Student_Registration.RegisterData;
import Student_Registration.Student;
import Student_Registration.Validation;
import java.awt.*;
import java.awt.event.*;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.Random;
import javax.swing.*;
import java.io.File;
import java.sql.ResultSet;
/*imports for JDatePicker*/
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import org.mindrot.jbcrypt.BCrypt;
import score.generator.login;

public class RegisterFrame extends JFrame implements ActionListener {

    JLabel message, fileLabel;
    JLabel nameLabel, fname, mname, dobLabel, genderLabel, dobFormat, Id, PraaptaankId;
    JTextField nameField, Fname, Mname;
    JRadioButton genderMale, genderFemale;
    ButtonGroup genderGroup;
    JButton fileButton;

    JLabel mailIdLabel, mobileNoLabel;
    JTextField mailIdField, mobileNoField;

    JLabel passwordLabel, rePasswordLabel;
    JPasswordField passwordField, rePasswordField;

    JComboBox<String> programList;

    JComboBox<String> branchList;
    JComboBox<Integer> semesterList;

    JButton registerButton;
    JDatePanelImpl datePanel;
    JDatePickerImpl datePicker;

    public RegisterFrame() {

        getContentPane().setBackground(new Color(173, 216, 230));
        message = new JLabel("Personal Details");
        message.setFont(new Font("Courier", Font.BOLD, 20));

        nameLabel = new JLabel("Name:");
        nameField = new JTextField();

        fname = new JLabel("Father's Name:");
        Fname = new JTextField();
        mname = new JLabel("Mother's Name:");
        Mname = new JTextField();

        dobLabel = new JLabel("DOB");
        //dobField = new JTextField();

        /*Adding JDatePicker date picker*/
        UtilDateModel model = new UtilDateModel();
        model.setDate(1999, 01, 02);
        model.setSelected(true);
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        datePanel = new JDatePanelImpl(model, p);
        datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        dobFormat = new JLabel("");
        /*End Date picker*/

        genderLabel = new JLabel("Gender");
        genderMale = new JRadioButton("Male", true);
        genderFemale = new JRadioButton("Female");
        genderGroup = new ButtonGroup();
        genderGroup.add(genderMale);
        genderGroup.add(genderFemale);

        mailIdLabel = new JLabel("Mail Id");
        mailIdField = new JTextField();

        mobileNoLabel = new JLabel("Mobile No");
        mobileNoField = new JTextField();

        Id = new JLabel("Praaptank Id:");
        PraaptaankId = new JLabel("");

        passwordLabel = new JLabel("Password");
        passwordField = new JPasswordField();

        rePasswordLabel = new JLabel("Re Password");
        rePasswordField = new JPasswordField();

        
        registerButton = new JButton("Save&Next");

        setBounds();
        addActionListener();
        image();

    }

    public void setBounds() {
        setLayout(null);
        message.setBounds(230, 10, 600, 30);
        add(message);

        nameLabel.setBounds(50, 60, 100, 20);
        nameField.setBounds(150, 60, 200, 20);
        add(nameLabel);
        add(nameField);

        fname.setBounds(50, 90, 100, 20);
        Fname.setBounds(150, 90, 200, 20);
        add(fname);
        add(Fname);

        mname.setBounds(50, 120, 100, 20);
        Mname.setBounds(150, 120, 200, 20);
        add(mname);
        add(Mname);

        dobLabel.setBounds(50, 150, 100, 20);
        datePicker.setBounds(150, 150, 200, 30);
        dobFormat.setBounds(360, 150, 200, 30);
//        datePicker.setBackground(Color.WHITE);
        add(dobLabel);
        add(datePicker);
        add(dobFormat);

        genderLabel.setBounds(50, 180, 100, 20);
        genderMale.setBounds(150, 180, 100, 20);
//        genderMale.setBackground(Color.WHITE);
        genderFemale.setBounds(250, 180, 100, 20);
//        genderFemale.setBackground(Color.WHITE);
        add(genderLabel);
        add(genderMale);
        add(genderFemale);

        mailIdLabel.setBounds(50, 210, 100, 20);
        mailIdField.setBounds(150, 210, 200, 20);
        add(mailIdLabel);
        add(mailIdField);

        mobileNoLabel.setBounds(50, 240, 100, 20);
        mobileNoField.setBounds(150, 240, 200, 20);
        add(mobileNoLabel);
        add(mobileNoField);

        Id.setBounds(50, 270, 100, 20);
        add(Id);
        PraaptaankId.setBounds(150, 270, 200, 20);
        add(PraaptaankId);

        Random ran = new Random();
        long number = ran.nextLong() % 1000000;
        PraaptaankId.setText("" + Math.abs(number));

        passwordLabel.setBounds(50, 300, 100, 20);
        passwordField.setBounds(150, 300, 200, 20);
        add(passwordLabel);
        add(passwordField);

        rePasswordLabel.setBounds(50, 330, 100, 20);
        rePasswordField.setBounds(150, 330, 200, 20);
        add(rePasswordLabel);
        add(rePasswordField);

       
        registerButton.setBounds(200, 430, 200, 30);
        add(registerButton);
    }

    public void image() {
       
        fileLabel = new JLabel("Add Image:");
        fileLabel.setBounds(400, 170, 150, 20);
        add(fileLabel);

        fileButton = new JButton("Choose File");
        fileButton.setBounds(470, 170, 150, 20);
        fileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "PNG", "jpeg", "jpg");
                fileChooser.setFileFilter(filter);
                int result = fileChooser.showOpenDialog(fileButton);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    fileButton.setText("Change File");

                    ImageIcon i1 = new ImageIcon(selectedFile.getAbsolutePath());
                    Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
                    ImageIcon i3 = new ImageIcon(i2);
                    JLabel image = new JLabel(i3);

                    Component[] components = getContentPane().getComponents();
                    for (Component c : components) {
                        if (c instanceof JLabel && ((JLabel) c).getIcon() != null) {
                            getContentPane().remove(c);
                        }
                    }
                    image.setBounds(450, 60, 100, 100);
                    getContentPane().add(image,BorderLayout.CENTER);
                    image.setBorder(BorderFactory.createLineBorder(Color.black));
                    revalidate();
                    repaint();
                }
            }
        });
        add(fileButton);
            }

            public void addActionListener() {
                registerButton.addActionListener(this);
            }

            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == registerButton) {
                    System.out.println("Register Button Clicked");
                    String gender = null;
                    if (genderFemale.isSelected()) {
                        gender = "Female";
                    }
                    if (genderMale.isSelected()) {
                        gender = "Male";
                    }
            
                    String dobString = datePicker.getJFormattedTextField().getText();
                    if (dobString.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Date of Birth is Empty");
                        return;
                    }
                    Date dob;
                    try {
                        dob = Date.valueOf(dobString);
                    } catch (IllegalArgumentException ex) {
                        System.out.println("Exception " + ex);
                        JOptionPane.showMessageDialog(null, "Date of birth format is in correct");
                        return;
                    }
                    System.out.println("Praaptaank_id " + PraaptaankId.getText() +"name " + nameField.getText() +"name " + fname.getText() +"name " + mname.getText() + " dob " + dobString
                            + " gender " + gender + " mailid " + mailIdField.getText()
                            + " mobileNo " + mobileNoField.getText() + " password " + passwordField.getText()
                            + " rePassword " + rePasswordField.getText() );

                    Student student = new Student(PraaptaankId.getText(),nameField.getText(),Fname.getText(),Mname.getText(), dob, gender, mailIdField.getText(), mobileNoField.getText(), passwordField.getText(), rePasswordField.getText());
                    student.setEncPassword(BCrypt.hashpw(student.getPassword(), BCrypt.gensalt()));
                    Validation v = new Validation();
                    java.util.List<String> errors = v.validateRegistration(student);
                    if (errors.size() > 0) {
                        JOptionPane.showMessageDialog(null, errors.toArray());
                        return;
                    }
                    RegisterData dao = new RegisterData();
                        int st = dao.registerStudent(student);

                    System.out.println(st);
                    if (st == 1) {
                        JOptionPane.showMessageDialog(null, "Registered Successfully");
                       

                        setVisible(false);
                        new RegisterStudent2(student.getPid());


                    }
                    if (st == -1) {
                        JOptionPane.showMessageDialog(null, "Already Registered");
                    }
                    if (st == -2) {
                        JOptionPane.showMessageDialog(null, "OOps Unable to Register");
                    }
                }
            }

            public static void main(String[] args) {
                RegisterFrame frame = new RegisterFrame();
                frame.setTitle("Student Register Form");
                frame.setBounds(500, 100, 650, 550);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setResizable(true);
                frame.setVisible(true);

            }

            public class DateLabelFormatter extends AbstractFormatter {

                private String datePattern = "yyyy-MM-dd";
                private SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);

                @Override
                public Object stringToValue(String text) throws ParseException {
                    return dateFormatter.parseObject(text);
                }

                @Override
                public String valueToString(Object value) throws ParseException {
                    if (value != null) {
                        Calendar cal = (Calendar) value;
                        return dateFormatter.format(cal.getTime());
                    }

                    return "";
                }

            }
        }