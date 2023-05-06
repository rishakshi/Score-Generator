package score.generator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;




public class Loginas extends JFrame implements ActionListener{
    JButton Student,College;
    
    public Loginas(){
        
        super("Praaptank:-Login");
        setBounds(600,250,900,600);
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        
        
        JLabel heading = new JLabel("PRAAPTAANK");
        heading.setBounds(300, 70, 300, 40);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 50));
        heading.setForeground(Color.WHITE);
        add(heading);
        
        
        Student = new JButton("Student");
        Student.setForeground(Color.WHITE);
        Student.setFont(Student.getFont().deriveFont(30f));
        Student.setBounds(250, 400, 200, 50);
        Student.setOpaque(false);
        Student.setBorderPainted(false);
        Student.setBackground(new Color(0,0,0,0));
        Student.addActionListener(this);
        add(Student);
        
        
        
        College = new JButton("College");
        College.setForeground(Color.WHITE);
        College.setFont(Student.getFont().deriveFont(30f));
        College.setBounds(480, 400, 200, 50);
        College.setOpaque(false);
        College.setBorderPainted(false);
        College.setBackground(new Color(0,0,0,0));
        College.addActionListener(this);
        add(College);
        
       
        
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/credit.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 600);
        add(image);
       
        
        
        
        
        
        setVisible(true);
        
        
}
    
    
        public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == Student) {
            setVisible(false); 
            new login(); 
        } else if (ae.getSource() == College) {
            setVisible(false);
            
            new login();
        }
       }
        
     
    
   
    
    
    public static void main(String[] args){
        new Loginas();
    }
    
}



