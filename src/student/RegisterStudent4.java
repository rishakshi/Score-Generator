package student;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class RegisterStudent4 extends JFrame implements ActionListener {

	private JPanel p;
	private JLabel headingLabel;
	private JLabel boardLabel;
	private JComboBox<String> boardList;
	private JLabel schoolNameLabel;
	private JTextField schoolNameField;
	private Component enrollmentNumberLabel;
	private JTextField enrollmentNumberField;
	private JLabel percentageLabel;
	private JTextField percentageField;
	private Component yearOfPassingLabel;
	private Component yearOfPassingField;
	private Component fileLabel;
	private JButton fileButton;
	private JComponent back2;
	private JButton addButton;
	

	public RegisterStudent4() {
		super("Praptank | Student Registration");
		setBounds(250, 50, 900, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();
		p.setLayout(null);
		p.setBackground(new Color(173, 216, 230));
		add(p);
		
		headingLabel = new JLabel("Certifications");
		headingLabel.setBounds(150, 20, 200, 30);
		p.add(headingLabel);

		boardLabel = new JLabel("Board:");
		boardLabel.setBounds(30, 60, 150, 20);
		p.add(boardLabel);

		String[] boards = { "Select", "CBSE", "State Board", "ICSE" };

		boardList = new JComboBox<String>(boards);
		boardList.setBounds(180, 60, 200, 20);
		p.add(boardList);

		schoolNameLabel = new JLabel("School Name:");
		schoolNameLabel.setBounds(30, 90, 150, 20);
		p.add(schoolNameLabel);

		schoolNameField = new JTextField();
		schoolNameField.setBounds(180, 90, 200, 20);
		p.add(schoolNameField);

		enrollmentNumberLabel = new JLabel("Enrollment Number:");
		enrollmentNumberLabel.setBounds(30, 120, 150, 20);
		p.add(enrollmentNumberLabel);

		enrollmentNumberField = new JTextField();
		enrollmentNumberField.setBounds(180, 120, 200, 20);
		p.add(enrollmentNumberField);

		percentageLabel = new JLabel("Percentage:");
		percentageLabel.setBounds(30, 150, 150, 20);
		p.add(percentageLabel);

		percentageField = new JTextField();
		percentageField.setBounds(180, 150, 200, 20);
		p.add(percentageField);

		yearOfPassingLabel = new JLabel("Year of Passing:");
		yearOfPassingLabel.setBounds(30, 180, 150, 20);
		p.add(yearOfPassingLabel);

		yearOfPassingField = new JTextField();
		yearOfPassingField.setBounds(180, 180, 200, 20);
		p.add(yearOfPassingField);

		fileLabel = new JLabel("Marksheet:");
		fileLabel.setBounds(30, 210, 150, 20);
		p.add(fileLabel);

		fileButton = new JButton("Choose File");
		fileButton.setBounds(180, 210, 150, 20);
		fileButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PDF Images", "jpg", "pdf");
				fileChooser.setFileFilter(filter);
				int result = fileChooser.showOpenDialog(fileButton);
				if (result == JFileChooser.APPROVE_OPTION) {
					File selectedFile = fileChooser.getSelectedFile();
					String fileName = selectedFile.getName();
					fileLabel.setText("Marksheet:                           " + fileName);
					fileLabel.setBounds(30, 210, 350, 20);
					fileButton.setText("Change File");
					fileButton.setBounds(400, 210, 150, 20);
				}
			}
		});
		p.add(fileButton);

		back2 = new JButton("←");
		back2.setForeground(Color.black);
		back2.setBounds(0, 0, 50, 20);
		back2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new RegisterStudent3();

			}
		});
		p.add(back2);

		addButton = new JButton("Add");
		addButton.setBounds(150, 260, 100, 20);
		addButton.addActionListener(new ActionListener() {
			private Component successLabel;
			private AbstractButton addMoreButton;

			public void actionPerformed(ActionEvent e) {
				// Clear the input fields
				boardList.setSelectedIndex(0);
				schoolNameField.setText("");
				enrollmentNumberField.setText("");
				percentageField.setText("");
				yearOfPassingField.setText("");
				fileLabel.setText("Marksheet:");

				p.removeAll();
				p.revalidate();
				p.repaint();
				setBounds(100, 100, 400, 400);

				successLabel = new JLabel(educationLevel + " details added successfully!");
				successLabel.setBounds(100, 80, 300, 30);
				p.add(successLabel);

				addMoreButton = new JButton("Add More Education");
				addMoreButton.setBounds(100, 120, 150, 20);
				addMoreButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
						new RegisterStudent3();
					}
				});
				p.add(addMoreButton);

				completeButton = new JButton("Save and next");
				completeButton.setBounds(100, 150, 150, 20);
				completeButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
						new RegisterStudent4();
					}
				});
				p.add(completeButton);
			}
		});
		p.add(addButton);
		

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
