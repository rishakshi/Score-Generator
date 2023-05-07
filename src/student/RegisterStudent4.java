package student;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterStudent4 extends JFrame implements ActionListener{
	
	private JPanel p;
	
	public RegisterStudent4() {
		super("Praptank | Student Registration");
		setBounds(250, 50, 900, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		p = new JPanel();
		p.setLayout(null);
		p.setBackground(new Color(173, 216, 230));
		add(p);
		
		
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
