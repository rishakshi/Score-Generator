package score.generator;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

import org.apache.commons.lang3.RandomStringUtils;

public class RegisterCollege extends JFrame implements ActionListener{
    
    JTextField CollegeName,affelication,Address,City,State,Email,Phone,Pin;
    JPasswordField Password,CPassword;
    JButton create,next,cancel,verif, verif1, verif2;
    JLabel CollegeId;
    Choice Uni,grade; 
    JTextArea ta;
    JCheckBox checkBox1,checkBox2,checkBox3,checkBox4;
    
    RegisterCollege(){
    
        super("Praptank | College Registration");
        setBounds(600,250,900,600);
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel p = new JPanel();
        p.setLayout(null);
        p.setBackground(new Color(173, 216, 230));
        add(p);
        
        ta = new JTextArea("");
        
        JLabel heading = new JLabel("College Registration");
        heading.setBounds(350, 10, 250, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 24));
        p.add(heading);
        
        JLabel lblname = new JLabel("Select University* :");
        lblname.setBounds(300, 80, 120, 20);
        p.add(lblname);
        
        Uni = new Choice();
        Uni.add("Rajathan Technical University");
        Uni.add("Rajasthan University");
        Uni.add("JECRC University");
        Uni.add("Poorima University");
        Uni.setBounds(450, 80, 200, 20);
        p.add(Uni);
        
        JLabel collegename = new JLabel("College Name* :");
        collegename.setBounds(300, 110, 150, 20);
        p.add(collegename);
        
        CollegeName = new JTextField();
        CollegeName.setBounds(450, 110, 200, 20);
        p.add(CollegeName);
        
        JLabel cgrade = new JLabel("College Accreditation* :");
        cgrade.setBounds(300, 140, 150, 20);
        p.add(cgrade);
        
        
        checkBox1 = new JCheckBox("NBA");
        checkBox1.setBounds(450, 140, 60, 20);
        checkBox1.setBackground(new Color(173, 216, 230));
        
        checkBox2 = new JCheckBox("NAAC");
        checkBox2.setBounds(510, 140, 60, 20);
        checkBox2.setBackground(new Color(173, 216, 230));
        
        checkBox3 = new JCheckBox("AICTE");
        checkBox3.setBounds(570, 140, 60, 20);
        checkBox3.setBackground(new Color(173, 216, 230));
        
        checkBox4 = new JCheckBox("UGC");
        checkBox4.setBounds(630, 140, 60, 20);
        checkBox4.setBackground(new Color(173, 216, 230));
        
        p.add(checkBox1);
        p.add(checkBox2);
        p.add(checkBox3);
        p.add(checkBox4);
        
        JLabel affeli = new JLabel("Affiliation No* :");
        affeli.setBounds(300, 170, 150, 20);
        p.add(affeli);
        
        affelication = new JTextField();
        affelication.setBounds(450, 170, 200, 20);
        p.add(affelication);
        
        JLabel mail = new JLabel("College Mail Id* :");
        mail.setBounds(300, 200, 150, 20);
        p.add(mail);
        
        Email = new JTextField();
        Email.setBounds(450, 200, 200, 20);
        p.add(Email);
        
        
        JLabel phone = new JLabel("Contact No*:");
        phone.setBounds(300, 230, 150, 20);
        p.add(phone);
        
        Phone = new JTextField();
        Phone.setBounds(450, 230, 200, 20);
        p.add(Phone);
        
        JLabel address = new JLabel("Address* :");
        address.setBounds(300, 260, 150, 20);
        p.add(address);
        
        Address = new JTextField();
        Address.setBounds(450, 260, 200, 20);
        p.add(Address);
        
        JLabel pin = new JLabel("Pin Code* :");
        pin.setBounds(300, 290, 150, 20);
        p.add(pin);
        
        Pin = new JTextField();
        Pin.setBounds(450, 290, 200, 20);
        p.add(Pin);
        
       
        JLabel Cid = new JLabel("Praaptank Id:");
        Cid.setBounds(300, 320, 150, 20);
        p.add(Cid);
        
        CollegeId = new JLabel ("");
        CollegeId.setBounds(450, 320, 200, 20);
        p.add(CollegeId);

        Random ran = new Random();
        long number = ran.nextLong() % 1000000;
        CollegeId.setText("" + Math.abs(number));
        
        
        JLabel pass = new JLabel("Password* :");
        pass.setBounds(300, 350, 150, 20);
        p.add(pass);
        
        Password = new JPasswordField();
        Password.setBounds(450, 350, 200, 20);
        p.add(Password);
        
        
        JLabel cpass = new JLabel("Confirm Password* :");
        cpass.setBounds(300, 380, 150, 20);
        p.add(cpass);
        
        CPassword = new JPasswordField();
        CPassword.setBounds(450, 380, 200, 20);
        p.add(CPassword);
        
        
        
        verif = new JButton("Verify");
        verif.setBounds(650, 170, 80, 20);
        p.add(verif);
        
        
        verif1 = new JButton("Verify");
        verif1.setBounds(650, 200, 80, 20);
        p.add(verif1);
        
        
        verif2 = new JButton("Verify");
        verif2.setBounds(650, 230, 80, 20);
        p.add(verif2);
        
        
        
        
        
        
        create = new JButton("Create");
//        create.setBackground(new Color(127, 9, 217));
        create.setForeground(Color.BLACK);
        create.setBounds(410, 450, 120, 25);
        create.addActionListener(this);
        p.add(create);
        
        
        next = new JButton("Back");
//        create.setBackground(new Color(127, 9, 217));
        next.setForeground(Color.BLACK);
        next.setBounds(540, 450, 120, 25);
        next.addActionListener(this);
        p.add(next);
        

        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==create){
            String uni = Uni.getSelectedItem();
            String cname = CollegeName.getText();
//            String accr = grade.getSelectedItem();
            String aff_no = affelication.getText();
            int afno = Integer.parseInt(aff_no);
            
            String mail = Email.getText();
            String contact = Phone.getText();
            double phone1 =Double.parseDouble(contact);
            
            String address = Address.getText();
            String pin = Pin.getText();
            int pin1 =Integer.parseInt(pin);
            
            String praaptaankId = CollegeId.getText();
            int id =Integer.parseInt(praaptaankId);
      
            String password = Password.getText();
           
            
            
            
            
            char[] password1 = Password.getPassword();
            char[] password2 = CPassword.getPassword();
            if(!Arrays.equals(password1, password2)) {
            	ta = new JTextArea("*Your Password is invalid!", 1, 20);
            	ta.setBounds(450, 400, 200, 20);
            	
            	Font font = new Font("Times New Roman", Font.PLAIN, 11);
                ta.setFont(font);
                
                ta.setBackground(new Color(173, 216, 230));
                ta.setForeground(Color.RED);
                ta.setEditable(false);
            	this.add(ta);
            }
            else {
                ta.setText("");
                try{
                ConnectJDBC c = new ConnectJDBC();
                
                String query = null;
                
                query = "insert into login (University_Name,College_Name,Affelication_No,Mail,Contact_no,Address,Pin,Praaptaank_Id,Password) values('"+uni+"','"+cname+"','"+afno+"','"+mail+"','"+phone1+"','"+address+"','"+pin1+"','"+id+"','"+password+"')";
                c.s.executeUpdate(query);
                
                if (checkBox1.isSelected()){
                    query = "update login SET NBA = 'YES' WHERE Praaptaank_Id = '"+id+"' ";
                    c.s.executeUpdate(query);
                }
                if (checkBox2.isSelected()){
                    query = "update login SET NAAC = 'YES' WHERE Praaptaank_Id = '"+id+"' ";
                    c.s.executeUpdate(query);
                }
                if (checkBox3.isSelected()){
                    query = "update login SET AICTE = 'YES' WHERE Praaptaank_Id = '"+id+"' ";
                    c.s.executeUpdate(query);
                }
                if (checkBox4.isSelected()){
                    query = "update login SET UGC = 'YES' WHERE Praaptaank_Id = '"+id+"' ";
                    c.s.executeUpdate(query);
                }
                
                JOptionPane.showMessageDialog(null, "Account Created Successfully");
                
                setVisible(false);
                new login();
            }
                
            catch(Exception e){
                e.printStackTrace();
            }
            	
            }
            
            
            
            
        }else if(ae.getSource()== next){
            setVisible(false);
            new login();
        }
    }
    
    
    
    public static void main(String[] args){
        new RegisterCollege();
    }
    
}
