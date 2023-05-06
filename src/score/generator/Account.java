package score.generator;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class Account extends JPanel implements ActionListener{
    
    
    Account(String praaptaank_id){
        
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 900, 600);
        setBackground(Color.WHITE);
        setLayout(null);
        setForeground(Color.BLACK);
        
        JPanel panel = new JPanel();
        panel.setBounds(20, 20, 650, 100);
        panel.setBackground(Color.WHITE);
        panel.setBorder(new TitledBorder(new LineBorder(new Color(216,173,230), 2), "College Info", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(216,173,230)));
        panel.setLayout(null);
        panel.setForeground(Color.BLACK);
        add(panel);
        
        JLabel cname = new JLabel("College Name: ");
        cname.setForeground(Color.black);
        cname.setBounds(10, 20, 150, 20);
        panel.add(cname);
        
        JLabel Cname = new JLabel("");
        Cname.setBounds(100, 20, 300, 20);
        panel.add(Cname);
        
        JLabel affili = new JLabel("Affeliated To: ");
        affili.setForeground(Color.black);
        affili.setBounds(10, 40, 150, 20);
        panel.add(affili);
        
        JLabel Caffili = new JLabel("");
        Caffili.setBounds(100, 40, 300, 20);
        panel.add(Caffili);
        
        JLabel affiliation = new JLabel("Affeliation No: ");
        affiliation.setForeground(Color.black);
        affiliation.setBounds(10, 60, 150, 20);
        panel.add(affiliation);
        
        JLabel Caffiliation = new JLabel("");
        Caffiliation.setBounds(100, 60, 200, 20);
        panel.add(Caffiliation);
        
        
        
        JPanel panel1 = new JPanel();
        panel1.setBounds(20, 120, 650, 100);
        panel1.setBackground(Color.WHITE);
        panel1.setBorder(new TitledBorder(new LineBorder(new Color(216,173,230), 2), "Contact Info", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(216,173,230)));
        panel1.setLayout(null);
        panel1.setForeground(Color.BLACK);
        add(panel1);
        
        JLabel contact = new JLabel("Contact No: ");
        contact.setForeground(Color.black);
        contact.setBounds(10, 20, 150, 20);
        panel1.add(contact);
        
        JLabel Contact = new JLabel("");
        Contact.setBounds(100, 20, 150, 20);
        panel1.add(Contact);
        
        
        JLabel mail = new JLabel("Mail : ");
        mail.setForeground(Color.black);
        mail.setBounds(10, 40, 150, 20);
        panel1.add(mail);
        
        JLabel Mail = new JLabel("");
        Mail.setBounds(100, 40, 200, 20);
        panel1.add(Mail);
        
        JPanel panel2 = new JPanel();
        panel2.setBounds(20, 220, 650, 100);
        panel2.setBackground(Color.WHITE);
        panel2.setBorder(new TitledBorder(new LineBorder(new Color(216,173,230), 2), "Praaptank Sign In", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(216,173,230)));
        panel2.setLayout(null);
        panel2.setForeground(Color.BLACK);
        add(panel2);
        
        JLabel id = new JLabel("Praaptank Id: ");
        id.setForeground(Color.black);
        id.setBounds(10, 20, 150, 20);
        panel2.add(id);
        
        JLabel Cid = new JLabel("");
        Cid.setBounds(100, 20, 150, 20);
        panel2.add(Cid);
        
        JLabel pass = new JLabel("Password : ");
        pass.setForeground(Color.black);
        pass.setBounds(10, 40, 150, 20);
        panel2.add(pass);
        
        JLabel Pass = new JLabel("");
        Pass.setBounds(100, 40, 150, 20);
        panel2.add(Pass);
        
        
        
        
        try{
            ConnectJDBC c = new ConnectJDBC();
            ResultSet rs = c.s.executeQuery("select * from login where Praaptaank_Id = '"+praaptaank_id+"'");
            
            while(rs.next()){
                Cname.setText(rs.getString("College_Name"));
                Caffili.setText(rs.getString("University_Name"));
                Caffiliation.setText(rs.getString("Affelication_No"));
                Contact.setText(rs.getString("Contact_no"));
                Mail.setText(rs.getString("Mail"));
                Cid.setText(rs.getString("Praaptaank_Id"));
                Pass.setText(rs.getString("Password"));
                
                
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(true);
    }
    
    
    public static void main(String[] args){
        new Account("");
    }
    
}