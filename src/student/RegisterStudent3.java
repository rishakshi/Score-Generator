package student;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RegisterStudent3 extends JFrame implements ActionListener {

	private JComboBox<String> educationList, boardList;
	private JButton addEducationButton, completeButton, addButton, addMoreButton, back, back2;
	private JLabel educationLabel;
	private String educationLevel;
	private JPanel p;

	public RegisterStudent3() {
		super("Praptank | Student Registration");
		setBounds(100, 100, 600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		p = new JPanel();
		p.setLayout(null);
		p.setBackground(new Color(173, 216, 230));
		add(p);

		educationLabel = new JLabel("Select Education Level:");
		educationLabel.setBounds(29, 49, 142, 14);
		p.add(educationLabel);

		String[] educationLevels = { "High School", "Intermediate", "Graduation", "Post-Graduation", "P.Hd" };

		educationList = new JComboBox<>(educationLevels);
		educationList.setBounds(181, 46, 143, 20);
		p.add(educationList);

		addEducationButton = new JButton("Add Education");
		addEducationButton.setBounds(176, 102, 120, 23);
		addEducationButton.addActionListener(this);
		p.add(addEducationButton);
		
		back = new JButton("←");
        back.setForeground(Color.black);
        back.setBounds(0, 0, 50, 20);
        back.addActionListener(this);
        p.add(back);

		setVisible(true);
	}

	public static void main(String[] args) {
		new RegisterStudent3();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == back) {
			setVisible(false);
			new RegisterStudent2();
		}

		if (e.getSource() == addEducationButton) {

			educationLevel = (String) educationList.getSelectedItem();
			
			if (educationLevel.equals("High School")) {
				p.removeAll();
				p.revalidate();
				p.repaint();

				JLabel headingLabel = new JLabel(educationLevel);
				headingLabel.setBounds(150, 20, 200, 30);
				p.add(headingLabel);
				
				JLabel boardLabel = new JLabel("Board:");
				boardLabel.setBounds(30, 60, 150, 30);
				p.add(boardLabel);
				
				String[] boards = { "CBSE", "State Board", "ICSE" };
				
				boardList = new JComboBox<String>(boards);
				boardList.setBounds(180, 60, 150, 30);
				p.add(boardList);

				JLabel schoolNameLabel = new JLabel("School/College Name:");
				schoolNameLabel.setBounds(30, 100, 150, 30);
				p.add(schoolNameLabel);

				JTextField schoolNameField = new JTextField();
				schoolNameField.setBounds(180, 100, 150, 30);
				p.add(schoolNameField);
				
				JLabel enrollmentNumberLabel = new JLabel("Enrollment Number:");
				enrollmentNumberLabel.setBounds(30, 140, 150, 30);
				p.add(enrollmentNumberLabel);

				JTextField enrollmentNumberField = new JTextField();
				enrollmentNumberField.setBounds(180, 140, 150, 30);
				p.add(enrollmentNumberField);

				JLabel percentageLabel = new JLabel("Percentage:");
				percentageLabel.setBounds(30, 180, 150, 30);
				p.add(percentageLabel);

				JTextField percentageField = new JTextField();
				percentageField.setBounds(180, 180, 150, 30);
				p.add(percentageField);

				JLabel yearOfPassingLabel = new JLabel("Year of Passing:");
				yearOfPassingLabel.setBounds(30, 220, 150, 30);
				p.add(yearOfPassingLabel);

				JTextField yearOfPassingField = new JTextField();
				yearOfPassingField.setBounds(180, 220, 150, 30);
				p.add(yearOfPassingField);
				
				back2 = new JButton("←");
		        back2.setForeground(Color.black);
		        back2.setBounds(0, 0, 50, 20);
		        back2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						setVisible(false);
						new RegisterStudent3();
						
					}
		        });
		        p.add(back2);

				addButton = new JButton("Add");
				addButton.setBounds(150, 260, 100, 30);
				addButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String schoolName = schoolNameField.getText();
						String percentage = percentageField.getText();
						String enrollmentNumber = enrollmentNumberField.getText();
						String yearOfPassing = yearOfPassingField.getText();

						// Code to save the details to the database goes here

						p.removeAll();
						p.revalidate();
						p.repaint();

						JLabel successLabel = new JLabel(educationLevel+" details added successfully!");
						successLabel.setBounds(100, 80, 300, 30);
						p.add(successLabel);

						addMoreButton = new JButton("Add More Education");
						addMoreButton.setBounds(100, 120, 150, 30);
						addMoreButton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								setVisible(false);
								new RegisterStudent3();
							}
						});
						p.add(addMoreButton);

						completeButton = new JButton("Save and next");
						completeButton.setBounds(100, 160, 150, 30);
						completeButton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								dispose();
							}
						});
						p.add(completeButton);
					}
				});
				p.add(addButton);
			}
			
			else if (educationLevel.equals("Intermediate")) {
				p.removeAll();
				p.revalidate();
				p.repaint();

				JLabel headingLabel = new JLabel(educationLevel);
				headingLabel.setBounds(150, 20, 200, 30);
				p.add(headingLabel);
				
				JLabel boardLabel = new JLabel("Board:");
				boardLabel.setBounds(30, 60, 150, 30);
				p.add(boardLabel);
				
				String[] boards = { "CBSE", "State Board", "ICSE" };
				
				boardList = new JComboBox<String>(boards);
				boardList.setBounds(180, 60, 150, 30);
				p.add(boardList);

				JLabel schoolNameLabel = new JLabel("School/College Name:");
				schoolNameLabel.setBounds(30, 100, 150, 30);
				p.add(schoolNameLabel);

				JTextField schoolNameField = new JTextField();
				schoolNameField.setBounds(180, 100, 150, 30);
				p.add(schoolNameField);
				
				JLabel enrollmentNumberLabel = new JLabel("Enrollment Number:");
				enrollmentNumberLabel.setBounds(30, 140, 150, 30);
				p.add(enrollmentNumberLabel);

				JTextField enrollmentNumberField = new JTextField();
				enrollmentNumberField.setBounds(180, 140, 150, 30);
				p.add(enrollmentNumberField);

				JLabel percentageLabel = new JLabel("Percentage:");
				percentageLabel.setBounds(30, 180, 150, 30);
				p.add(percentageLabel);

				JTextField percentageField = new JTextField();
				percentageField.setBounds(180, 180, 150, 30);
				p.add(percentageField);

				JLabel yearOfPassingLabel = new JLabel("Year of Passing:");
				yearOfPassingLabel.setBounds(30, 220, 150, 30);
				p.add(yearOfPassingLabel);

				JTextField yearOfPassingField = new JTextField();
				yearOfPassingField.setBounds(180, 220, 150, 30);
				p.add(yearOfPassingField);
				
				back2 = new JButton("←");
		        back2.setForeground(Color.black);
		        back2.setBounds(0, 0, 50, 20);
		        back2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						setVisible(false);
						new RegisterStudent3();
						
					}
		        });
		        p.add(back2);

				addButton = new JButton("Add");
				addButton.setBounds(150, 260, 100, 30);
				addButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String schoolName = schoolNameField.getText();
						String percentage = percentageField.getText();
						String enrollmentNumber = enrollmentNumberField.getText();
						String yearOfPassing = yearOfPassingField.getText();

						// Code to save the details to the database goes here

						p.removeAll();
						p.revalidate();
						p.repaint();
						

						JLabel successLabel = new JLabel(educationLevel+" details added successfully!");
						successLabel.setBounds(100, 80, 300, 30);
						p.add(successLabel);

						addMoreButton = new JButton("Add More Education");
						addMoreButton.setBounds(100, 120, 150, 30);
						addMoreButton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								setVisible(false);
								new RegisterStudent3();
							}
						});
						p.add(addMoreButton);

						completeButton = new JButton("Save and next");
						completeButton.setBounds(100, 160, 150, 30);
						completeButton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								dispose();
							}
						});
						p.add(completeButton);
					}
				});
				p.add(addButton);
			}
			
		}

	}

}
