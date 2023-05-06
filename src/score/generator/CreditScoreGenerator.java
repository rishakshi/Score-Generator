/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package score.generator;

import javax.swing.*;

public class CreditScoreGenerator extends JFrame {
    private static final long serialVersionUID = 1L;
    private JLabel nameLabel, idLabel, gpaLabel, creditsLabel, scoreLabel;
    private JTextField nameField, idField, gpaField, creditsField;
    private JButton generateButton;
    
    public CreditScoreGenerator() {
        setTitle("Credit Score Generator");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        
        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 20, 80, 25);
        add(nameLabel);
        
        nameField = new JTextField();
        nameField.setBounds(100, 20, 200, 25);
        add(nameField);
        
        idLabel = new JLabel("ID:");
        idLabel.setBounds(20, 50, 80, 25);
        add(idLabel);
        
        idField = new JTextField();
        idField.setBounds(100, 50, 200, 25);
        add(idField);
        
        gpaLabel = new JLabel("GPA:");
        gpaLabel.setBounds(20, 80, 80, 25);
        add(gpaLabel);
        
        gpaField = new JTextField();
        gpaField.setBounds(100, 80, 200, 25);
        add(gpaField);
        
        creditsLabel = new JLabel("Credits:");
        creditsLabel.setBounds(20, 110, 80, 25);
        add(creditsLabel);
        
        creditsField = new JTextField();
        creditsField.setBounds(100, 110, 200, 25);
        add(creditsField);
        
        generateButton = new JButton("Generate Score");
        generateButton.setBounds(100, 150, 150, 25);
        generateButton.addActionListener(e -> generateCreditScore());
        add(generateButton);
        
        scoreLabel = new JLabel();
        scoreLabel.setBounds(20, 200, 350, 25);
        add(scoreLabel);
    }
    
    private void generateCreditScore() {
        String name = nameField.getText();
        String id = idField.getText();
        double gpa = Double.parseDouble(gpaField.getText());
        int credits = Integer.parseInt(creditsField.getText());
        
        double score = (gpa * 100) + (credits * 10);
        String message = String.format("%s (%s), your credit score is %.2f", name, id, score);
        scoreLabel.setText(message);
    }
    
    public static void main(String[] args) {
        CreditScoreGenerator app = new CreditScoreGenerator();
        app.setVisible(true);
    }
}







//
//
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.*;
//import javax.swing.*;
//
//public class CreditScoreGenerator extends JFrame implements Serializable {
//    private static final long serialVersionUID = 1L;
//    private JLabel nameLabel, idLabel, gpaLabel, creditsLabel, scoreLabel;
//    private JTextField nameField, idField, gpaField, creditsField;
//    private JButton generateButton, saveButton;
//    private JFileChooser fileChooser;
//    
//    public CreditScoreGenerator() {
//        setTitle("Credit Score Generator");
//        setSize(400, 300);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setResizable(false);
//        setLayout(null);
//        
//        nameLabel = new JLabel("Name:");
//        nameLabel.setBounds(20, 20, 80, 25);
//        add(nameLabel);
//        
//        nameField = new JTextField();
//        nameField.setBounds(100, 20, 200, 25);
//        add(nameField);
//        
//        idLabel = new JLabel("ID:");
//        idLabel.setBounds(20, 50, 80, 25);
//        add(idLabel);
//        
//        idField = new JTextField();
//        idField.setBounds(100, 50, 200, 25);
//        add(idField);
//        
//        gpaLabel = new JLabel("GPA:");
//        gpaLabel.setBounds(20, 80, 80, 25);
//        add(gpaLabel);
//        
//        gpaField = new JTextField();
//        gpaField.setBounds(100, 80, 200, 25);
//        add(gpaField);
//        
//        creditsLabel = new JLabel("Credits:");
//        creditsLabel.setBounds(20, 110, 80, 25);
//        add(creditsLabel);
//        
//        creditsField = new JTextField();
//        creditsField.setBounds(100, 110, 200, 25);
//        add(creditsField);
//        
//        generateButton = new JButton("Generate Score");
//        generateButton.setBounds(100, 150, 150, 25);
//        generateButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                generateCreditScore();
//            }
//        });
//        add(generateButton);
//        
//        scoreLabel = new JLabel();
//        scoreLabel.setBounds(20, 200, 350, 25);
//        add(scoreLabel);
//        
//        saveButton = new JButton("Save Data");
//        saveButton.setBounds(250, 150, 100, 25);
//        saveButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                saveData();
//            }
//        });
//        add(saveButton);
//        
//        fileChooser = new JFileChooser();
//    }
//    
//    private void generateCreditScore() {
//        String name = nameField.getText();
//        String id = idField.getText();
//        double gpa = 0;
//        int credits = 0;
//        try {
//            gpa = Double.parseDouble(gpaField.getText());
//            credits = Integer.parseInt(creditsField.getText());
//        } catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(this, "Invalid input for GPA or credits.");
//            return;
//        }
//        if (gpa < 0 || gpa > 4) {
//            JOptionPane.showMessageDialog(this, "Invalid input for GPA.");
//            return;
//        }
//        if (credits < 0) {
//            JOptionPane.showMessageDialog(this, "Invalid input for credits.");
//            return;
//        }
//        double score = (gpa * 100) + (credits * 10);
//        String message = String.format("%s (%s), your credit score is %.2f", name, id, score);
//        scoreLabel.setText(message);
//    }
//    
//    private void saveData()

