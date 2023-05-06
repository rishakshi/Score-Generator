package score.generator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class project extends JFrame implements ActionListener{
    
    String Id;
    project(String praaptaank_id){
        super("Praaptaank:");
        this.Id = praaptaank_id;
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        
        
        JLayeredPane jpl = new JLayeredPane();
        JTabbedPane jtp = new JTabbedPane();
        jpl.add(jtp);
        
        JTextArea ta = new JTextArea("No Applications Recieved");
        JTextArea ta1 = new JTextArea("No Applications Accepted");
        
        Account ac = new Account(Id);
        jtp.add("Account", ac);
        jtp.addTab("Application Recieved", ta);
        jtp.addTab("Application Accepted", ta1);
        getContentPane().add(jtp);
 
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        if(msg.equals("Account")){
            System.out.println("YZ");
        }
    }
    
    
    public static void main(String[] args)
    {
        new project("");
    }
}