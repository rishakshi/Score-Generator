package score.generator;

//public class StudentCreditScoreGenerator {
//    
//    
//}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StudentCreditScoreGenerator extends JFrame implements ActionListener {
    
    // Define GUI components
     JLabel nameLabel, gpaLabel, satLabel, creditLabel, scoreLabel;
     JTextField nameTextField, gpaTextField, satTextField, creditTextField, scoreTextField;
     JButton calculateButton;
    
    // Constructor
    public StudentCreditScoreGenerator() {
        // Set window properties
        setTitle("Student Credit Score Generator");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Create GUI components
        nameLabel = new JLabel("Name:");
        gpaLabel = new JLabel("GPA:");
        satLabel = new JLabel("SAT Score:");
        creditLabel = new JLabel("Credit Hours:");
        scoreLabel = new JLabel("Credit Score:");
        
        nameTextField = new JTextField();
        gpaTextField = new JTextField();
        satTextField = new JTextField();
        creditTextField = new JTextField();
        scoreTextField = new JTextField();
        scoreTextField.setEditable(false); // Make score text field read-only
        
        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this); // Add action listener to button
        
//        // Create layout using GridBagLayout manager
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5); // Add padding
        
//        // Add components to layout
//        c.gridx = 0;
//        c.gridy = 0;
//        add(nameLabel, c);
//        
//        c.gridx = 1;
//        add(nameTextField, c);
//        
//        c.gridx = 0;
//        c.gridy = 1;
//        add(gpaLabel, c);
//        
//        c.gridx = 1;
//        add(gpaTextField, c);
//        
//        c.gridx = 0;
//        c.gridy = 2;
//        add(satLabel, c);
//        
//        c.gridx = 1;
//        add(satTextField, c);
//        
//        c.gridx = 0;
//        c.gridy = 3;
//        add(creditLabel, c);
//        
//        c.gridx = 1;
//        add(creditTextField, c);
//        
//        c.gridx = 0;
//        c.gridy = 4;
//        add(scoreLabel, c);
//        
//        c.gridx = 1;
//        add(scoreTextField, c);
//        
//        c.gridx = 1;
//        c.gridy = 5;
//        add(calculateButton, c);
//    }
//    
    // Action listener for calculate button
    public void actionPerformed(ActionEvent e) {
        // Get input values
//        String name = nameTextField.getText();
//        double gpa = Double.parseDouble(gpaTextField.getText());
//        int sat = Integer.parseInt(satTextField.getText());
//        int credits = Integer.parseInt(creditTextField.getText());
//        
//        // Calculate credit score
//        double score = gpa * sat / credits;
//        
//        // Update score text field
//        scoreTextField.setText(String.format("%.2f", score));
    }
    
    // Main method
    public static void main(String[] args) {
        StudentCreditScoreGenerator frame = new StudentCreditScoreGenerator();
        frame.setVisible(true);
    }
}
