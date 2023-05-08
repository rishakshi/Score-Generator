package student;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RegisterStudent2 extends JFrame implements ActionListener {

	private JLabel Address, PermAddress, flatHouseNumLabel, areaStreetSectorVillageLabel, areaStreetSectorVillageLabel2,
			pincodeLabel, townCityLabel, stateLabel, currAdd, flatHouseNumLabelSec, areaStreetSectorVillageLabelSec,
			areaStreetSectorVillageLabel2Sec, pincodeLabelSec, townCityLabelSec, stateLabelSec;
	private JComboBox<String> state, stateSec;
	private JButton next, prev;
	private JTextField flatHouseNum, areaStreetSectorVillage, pincode, townCity, flatHouseNumSec,
			areaStreetSectorVillageSec, pincodeSec, townCitySec;

        String praaptaank_Id;
	public RegisterStudent2(String praaptaank_id) {

		super("Praptank | Student Registration");
                this.praaptaank_Id =praaptaank_id;
		setBounds(250, 50, 650, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();
		p.setLayout(null);
		p.setBackground(new Color(173, 216, 230));
		add(p);

		Address = new JLabel("Address Details");
		Address.setBounds(250, 10, 250, 30);
		Address.setFont(new Font("Courier", Font.BOLD, 20));
		p.add(Address);

		PermAddress = new JLabel("Permanent Address : ");
		PermAddress.setBounds(20, 60, 250, 30);
		PermAddress.setFont(new Font("Courier", Font.BOLD, 15));
		p.add(PermAddress);

		flatHouseNumLabel = new JLabel("Flat/House No. : ");
		flatHouseNumLabel.setBounds(20, 100, 120, 20);
//		flatHouseNumLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		p.add(flatHouseNumLabel);

		flatHouseNum = new JTextField();
		flatHouseNum.setBounds(150, 100, 200, 20);
		p.add(flatHouseNum);

		areaStreetSectorVillageLabel = new JLabel("Area/Street/ ");
		areaStreetSectorVillageLabel.setBounds(20, 130, 120, 20);
//		areaStreetSectorVillageLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		p.add(areaStreetSectorVillageLabel);

		areaStreetSectorVillageLabel2 = new JLabel("Sector/Village : ");
		areaStreetSectorVillageLabel2.setBounds(20, 150, 120, 20);
//		areaStreetSectorVillageLabel2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		p.add(areaStreetSectorVillageLabel2);

		areaStreetSectorVillage = new JTextField();
		areaStreetSectorVillage.setBounds(150, 140, 200, 20);
		p.add(areaStreetSectorVillage);

		pincodeLabel = new JLabel("Pincode : ");
		pincodeLabel.setBounds(20, 180, 120, 20);
//		pincodeLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		p.add(pincodeLabel);

		pincode = new JTextField();
		pincode.setBounds(150, 180, 200, 20);
		p.add(pincode);

		townCityLabel = new JLabel("Town/City : ");
		townCityLabel.setBounds(20, 210, 120, 20);
//		townCityLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		p.add(townCityLabel);

		townCity = new JTextField();
		townCity.setBounds(150, 210, 200, 20);
		p.add(townCity);

		stateLabel = new JLabel("State : ");
		stateLabel.setBounds(20, 240, 120, 20);
//		stateLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		p.add(stateLabel);

		String[] states = { "Select", "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa",
				"Gujarat", "Haryana", "Himachal Pradesh", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh",
				"Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim",
				"Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal" };
		state = new JComboBox<>(states);
		state.setBounds(150, 240, 120, 20);
		p.add(state);

		PermAddress = new JLabel("Current Address : ");
		PermAddress.setBounds(20, 280, 250, 30);
		PermAddress.setFont(new Font("Courier", Font.BOLD, 15));
		p.add(PermAddress);

		flatHouseNumLabelSec = new JLabel("Flat/House No. : ");
		flatHouseNumLabelSec.setBounds(20, 320, 120, 20);
//		flatHouseNumLabelSec.setFont(new Font("Tahoma", Font.PLAIN, 15));
		p.add(flatHouseNumLabelSec);

		flatHouseNumSec = new JTextField();
		flatHouseNumSec.setBounds(150, 320, 200, 20);
		p.add(flatHouseNumSec);

		areaStreetSectorVillageLabelSec = new JLabel("Area/Street/ ");
		areaStreetSectorVillageLabelSec.setBounds(20, 350, 120, 20);
//		areaStreetSectorVillageLabelSec.setFont(new Font("Tahoma", Font.PLAIN, 15));
		p.add(areaStreetSectorVillageLabelSec);

		areaStreetSectorVillageLabel2Sec = new JLabel("Sector/Village : ");
		areaStreetSectorVillageLabel2Sec.setBounds(20, 370, 120, 20);
//		areaStreetSectorVillageLabel2Sec.setFont(new Font("Tahoma", Font.PLAIN, 15));
		p.add(areaStreetSectorVillageLabel2Sec);

		areaStreetSectorVillageSec = new JTextField();
		areaStreetSectorVillageSec.setBounds(150, 360, 200, 20);
		p.add(areaStreetSectorVillageSec);

		pincodeLabelSec = new JLabel("Pincode : ");
		pincodeLabelSec.setBounds(20, 400, 120, 20);
//		pincodeLabelSec.setFont(new Font("Tahoma", Font.PLAIN, 15));
		p.add(pincodeLabelSec);

		pincodeSec = new JTextField();
		pincodeSec.setBounds(150, 400, 200, 20);
		p.add(pincodeSec);

		townCityLabelSec = new JLabel("Town/City : ");
		townCityLabelSec.setBounds(20, 430, 120, 20);
//		townCityLabelSec.setFont(new Font("Tahoma", Font.PLAIN, 15));
		p.add(townCityLabelSec);

		townCitySec = new JTextField();
		townCitySec.setBounds(150, 430, 200, 20);
		p.add(townCitySec);

		stateLabelSec = new JLabel("State : ");
		stateLabelSec.setBounds(20, 460, 120, 20);
//		stateLabelSec.setFont(new Font("Tahoma", Font.PLAIN, 15));
		p.add(stateLabelSec);

		stateSec = new JComboBox<>(states);
		stateSec.setBounds(150, 460, 120, 20);
		p.add(stateSec);

		prev = new JButton("Previous");
		prev.setForeground(Color.BLACK);
		prev.setBounds(150, 500, 120, 25);
		prev.addActionListener(this);
		p.add(prev);

		next = new JButton("Save and Next");
		next.setForeground(Color.BLACK);
		next.setBounds(300, 500, 120, 25);
		next.addActionListener(this);
		p.add(next);

		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == prev) {
			setVisible(false);
                        new RegisterFrame();
		}

		if (e.getSource() == next) {
                    String praaptaank_ID =praaptaank_Id;
                    String flatno = flatHouseNum.getText();
                    
                    String area = areaStreetSectorVillage.getText();
                    
                    String pin = pincode.getText();
                    
                    String city = townCity.getText();
                    
                    String State = (String) state.getSelectedItem();
                    
                    String Flatno = flatHouseNumSec.getText();
                    
                    String Area = areaStreetSectorVillageSec.getText();
                    
                    String Pin = pincodeSec.getText();
                    
                    String City = townCitySec.getText();
                    
                    String Statesec = (String) stateSec.getSelectedItem();
                   
                   try{
                    ConnectJDBC c = new ConnectJDBC();
                    
                    String query = null;
                    
                    query ="insert into address_info(Praaptaank_id,flatno,area,pin,city,state,flatnosec,areasec,pinsec,citysec,statesec) values('"+praaptaank_ID+"','"+flatno+"','"+area+"','"+pin+"','"+city+"','"+State+"','"+Flatno+"','"+Area+"','"+Pin+"','"+City+"','"+Statesec+"')";
                   
                    c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Add Successfully");
                
                setVisible(false);
            }catch (Exception ex) {
                ex.printStackTrace();
            }
 
			
                }

	}

	public static void main(String[] args) {
		new RegisterStudent2("");
	}

}
