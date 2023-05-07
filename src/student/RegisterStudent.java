package student;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class RegisterStudent extends JFrame implements ActionListener {

	JTextField Name, FName, MName, email, MobNum, AltMobNum;
	JPasswordField Password, CPassword;
	JRadioButton male, female, other;
	ButtonGroup G;
	DateFormat df;
	JFormattedTextField txtDate;
	JButton eVerify, mVerify, altVerify, next, back;
	JLabel PersDet, NameLabel, FNameLabel, MNameLabel, GenderLabel, DOBLabel, EMailLabel, MobLabel, AltMobLabel, UniqID,
			PassLabel, CPassLabel, ID;
	private JLabel fileLabel;
	private JButton fileButton;

	public RegisterStudent() {

		super("Praptank | Student Registration");
		setBounds(250, 50, 900, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();
		p.setOpaque(false);
		p.setLayout(null);
		p.setBackground(new Color(173, 216, 230));
		add(p);

		PersDet = new JLabel("Personal Details");
		PersDet.setBounds(20, 10, 250, 30);
		PersDet.setFont(new Font("Tahoma", Font.PLAIN, 24));
		p.add(PersDet);

		NameLabel = new JLabel("Name : ");
//        NameLabel.setOpaque(true);
		NameLabel.setBounds(20, 50, 120, 20);
//        NameLabel.setBackground(new Color(0, 0, 230));
		NameLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		p.add(NameLabel);

		Name = new JTextField();
		Name.setBounds(150, 50, 200, 20);
		p.add(Name);

		fileLabel = new JLabel("Add Photo:");
		fileLabel.setBounds(400, 50, 150, 20);
		p.add(fileLabel);

		fileButton = new JButton("Choose File");
		fileButton.setBounds(470, 50, 150, 20);
		fileButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "PNG", "jpeg");
				fileChooser.setFileFilter(filter);
				int result = fileChooser.showOpenDialog(fileButton);
				if (result == JFileChooser.APPROVE_OPTION) {
					File selectedFile = fileChooser.getSelectedFile();
					fileButton.setText("Change File");

					ImageIcon i1 = new ImageIcon(selectedFile.getAbsolutePath());
					Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
					ImageIcon i3 = new ImageIcon(i2);
					JLabel image = new JLabel(i3);
					
					Component[] components = p.getComponents();
			        for (Component c : components) {
			            if (c instanceof JLabel && ((JLabel) c).getIcon() != null) {
			                p.remove(c);
			            }
			        }
					
					image.setBounds(470, 80, 100, 100);
					p.add(image, BorderLayout.CENTER);
					p.revalidate(); 
					p.repaint(); 
				}
			}
		});
		p.add(fileButton);

		FNameLabel = new JLabel("Father's Name : ");
//		FNameLabel.setBackground(new Color(0, 0, 230));
//		FNameLabel.setOpaque(true);
		FNameLabel.setBounds(20, 80, 120, 20);
		FNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		p.add(FNameLabel);

		FName = new JTextField();
		FName.setBounds(150, 80, 200, 20);
		p.add(FName);

		MNameLabel = new JLabel("Mother's Name : ");
		MNameLabel.setBounds(20, 110, 120, 20);
		MNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		p.add(MNameLabel);

		MName = new JTextField();
		MName.setBounds(150, 110, 200, 20);
		p.add(MName);

		GenderLabel = new JLabel("Gender : ");
		GenderLabel.setBounds(20, 140, 120, 20);
		GenderLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		p.add(GenderLabel);

		G = new ButtonGroup();

		male = new JRadioButton("Male");
		male.setBounds(150, 140, 60, 20);
		male.setBackground(new Color(173, 216, 230));
		p.add(male);

		female = new JRadioButton("Female");
		female.setBounds(220, 140, 80, 20);
		female.setBackground(new Color(173, 216, 230));
		p.add(female);

		other = new JRadioButton("Other");
		other.setBounds(300, 140, 60, 20);
		other.setBackground(new Color(173, 216, 230));
		p.add(other);

		G.add(male);
		G.add(female);
		G.add(other);

		DOBLabel = new JLabel("DOB : ");
		DOBLabel.setBounds(20, 170, 120, 20);
		DOBLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		p.add(DOBLabel);

		df = new SimpleDateFormat("dd/MM/yyyy");
		txtDate = new JFormattedTextField(df);
		txtDate.setBounds(150, 170, 200, 20);
		p.add(txtDate);

		txtDate.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)
						|| (c == KeyEvent.VK_SLASH))) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid");
					e.consume();
				}
			}
		});

		EMailLabel = new JLabel("Email : ");
		EMailLabel.setBounds(20, 200, 120, 20);
		EMailLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		p.add(EMailLabel);

		email = new JTextField();
		email.setBounds(150, 200, 200, 20);
		p.add(email);

		MobLabel = new JLabel("Mobile No. : ");
		MobLabel.setBounds(20, 230, 120, 20);
		MobLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		p.add(MobLabel);

		MobNum = new JTextField();
		MobNum.setBounds(150, 230, 200, 20);
		p.add(MobNum);

		AltMobLabel = new JLabel("Alternate No. : ");
		AltMobLabel.setBounds(20, 260, 120, 20);
		AltMobLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		p.add(AltMobLabel);

		AltMobNum = new JTextField();
		AltMobNum.setBounds(150, 260, 200, 20);
		p.add(AltMobNum);

		UniqID = new JLabel("Unique ID : ");
		UniqID.setBounds(20, 290, 120, 20);
		UniqID.setFont(new Font("Tahoma", Font.PLAIN, 15));
		p.add(UniqID);

		ID = new JLabel("*********");
		ID.setBounds(150, 290, 200, 20);
		ID.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ID.setOpaque(true);
		ID.setBackground(Color.lightGray);
		p.add(ID);

		PassLabel = new JLabel("Password* :");
		PassLabel.setBounds(20, 320, 120, 20);
		p.add(PassLabel);

		Password = new JPasswordField();
		Password.setBounds(150, 320, 200, 20);
		p.add(Password);

		CPassLabel = new JLabel("Confirm Password* :");
		CPassLabel.setBounds(20, 350, 120, 20);
		p.add(CPassLabel);

		CPassword = new JPasswordField();
		CPassword.setBounds(150, 350, 200, 20);
		p.add(CPassword);

		back = new JButton("Back to LogIn");
		back.setForeground(Color.BLACK);
		back.setBounds(150, 400, 120, 25);
		back.addActionListener(this);
		p.add(back);

		next = new JButton("Save and Next");
		next.setForeground(Color.BLACK);
		next.setBounds(300, 400, 120, 25);
		next.addActionListener(this);
		p.add(next);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == next) {
			setVisible(false);
			new RegisterStudent2();
		}

		if (e.getSource() == back) {
			setVisible(false);
			new Login();
		}

	}

	public static void main(String[] args) {
		new RegisterStudent();
	}

}
