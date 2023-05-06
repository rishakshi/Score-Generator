package score.generator;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class login extends JFrame implements ActionListener{
    
    JTextField username;
    JPasswordField password;
    Choice loginin;
    JButton login,cancel,signup, back;
    login()
    {
        super("Praptank:-Login");
        setBounds(250, 50,900,600);
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        
        
        JLabel lusername = new JLabel("Praaptaank Id : ");
        lusername.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lusername.setForeground(Color.WHITE);
        lusername.setBounds(450, 150, 150, 25);
        add(lusername);
        
        username = new JTextField();
        username.setForeground(Color.black);
        username.setBounds(600, 150, 150, 25);
        add(username);
        
        
        
        JLabel lpassword = new JLabel("password : ");
        lpassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lpassword.setForeground(Color.WHITE);
        lpassword.setBounds(450, 200, 150, 25);
        add(lpassword);
     
        password = new JPasswordField();
        password.setForeground(Color.black);
        password.setBounds(600, 200, 150, 25);
        add(password);
        
        
        
//        JLabel loginas = new JLabel("Login as :");
//        loginas.setForeground(Color.black);
//        loginas.setBounds(350, 150, 100, 20);
//        add(loginas);
        
//        loginin = new Choice();
//        loginin.setForeground(Color.blue);
//        loginin.add("Student");
//        loginin.add("College");
//        loginin.setBounds(450, 150, 150, 20);
//        add(loginin);
        
        
        
        
        login = new JButton("Login");
        login.setForeground(Color.black);
//        login.setBackground(new Color(127, 9, 217));
//        login.setFont(new Font("Tahoma", Font.PLAIN, 20));
        login.setBounds(500, 300, 100, 20);
        login.addActionListener(this);
        add(login);
        
    
        cancel = new JButton("Cancel");
        cancel.setForeground(Color.black);
        cancel.setBounds(650, 300, 100, 20);
        cancel.addActionListener(this);
        add(cancel);
        
  
        signup = new JButton("Signup");
        signup.setForeground(Color.black);
        signup.setBounds(580, 350, 100, 20);
        signup.addActionListener(this);
        add(signup);
        
        back = new JButton("←");
        back.setForeground(Color.black);
        back.setBounds(0, 0, 50, 20);
        back.addActionListener(this);
        add(back);
        
        
       
        
        
     
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/user.png"));
        Image i2 = i1.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(10, 60, 400, 400);
        add(image);
        
        
        
        ImageIcon i5 = new ImageIcon(ClassLoader.getSystemResource("icon/logo.jpg"));
        Image i6 = i5.getImage().getScaledInstance(900, 600, Image.SCALE_DEFAULT);
        ImageIcon i7 = new ImageIcon(i6);
        JLabel image1 = new JLabel(i7);
        image1.setBounds(0, 0, 900, 600);
        add(image1);
        
        
        
        setVisible(true);
    
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==login){
            String id = username.getText();
            String pass = password.getText();
            
            try{
                ConnectJDBC c = new ConnectJDBC();
                String query = "select * from login where Praaptaank_Id ='"+id+"' and Password = '"+pass+"'";
                
                ResultSet rs = c.s.executeQuery(query);
                
                if(rs.next()){
                    String Id = rs.getString("Praaptaank_Id");
                    setVisible(false);
                    new project(Id);
                    
                }else {
                    JOptionPane.showMessageDialog(null, "Invalid Login");
                    username.setText("");
                    password.setText("");
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }else if (ae.getSource() == cancel) {
            setVisible(false);
        } else if (ae.getSource() == signup) {
            setVisible(false);
            
            new RegisterCollege();
    }
        else if (ae.getSource() == back) {
            setVisible(false);
            
            new Loginas();
    }
    }
    
    
    
    
    public static void main(String[] args)
    {
        new login();
    }
}
