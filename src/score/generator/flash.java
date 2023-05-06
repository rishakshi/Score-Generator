package score.generator;


import javax.swing.*;
import java.awt.*;

public class flash extends JFrame implements Runnable{
    
    Thread t;
    
    flash(){
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/background.jpg"));
        Image i2 = i1.getImage().getScaledInstance(screenSize.width, screenSize.height, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        
//        setBounds(600, 250, 700, 400);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        
        t = new Thread(this);
        t.start();
        setVisible(true);
        
        
        
    }
    
    public void run(){
        
        try{
            Thread.sleep(2000);
//            setVisible(false);
            
            new Loginas();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    
    public static void main(String[] args){
        new flash();
    }
    
}
