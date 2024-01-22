package bank.managment.system;

import java.awt.*;

import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
	
	JTextField pan,aadhar;
	JButton next;
	JRadioButton syes,sno,eyes,eno;
	JComboBox religion,income,category,occupation,educationa;
	String formno;
	
	SignupTwo(String formno)
	{
		this.formno = formno;
		setLayout(null);
		
		setTitle("NEW ACCOUNT FORM - PAGE 2");
		
		
		JLabel additionalDetails = new JLabel("Page 1: Additional Details");
		additionalDetails.setFont(new Font("Ralewat",Font.BOLD, 22));
		additionalDetails.setBounds(290, 80, 400, 30);
		add(additionalDetails);
		
		JLabel name = new JLabel("Religion:");
		name.setFont(new Font("Ralewat",Font.BOLD, 20));
		name.setBounds(100, 140, 100, 30);
		add(name);
		
		String valReligion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
		religion= new JComboBox(valReligion);
		religion.setBounds(300, 140, 400, 30);
		religion.setBackground(Color.WHITE);
		add(religion);
		
		
		JLabel fname = new JLabel("Category:");
		fname.setFont(new Font("Ralewat",Font.BOLD, 20));
		fname.setBounds(100, 190, 200, 30);
		add(fname);
		
		String valcategory[] = {"General","OBC","SC","ST","Other"};
		category= new JComboBox(valcategory);
		category.setBounds(300, 190, 400, 30);
		category.setBackground(Color.WHITE);
		add(category);
		
		
		JLabel dob = new JLabel("Income:");
		dob.setFont(new Font("Ralewat",Font.BOLD, 20));
		dob.setBounds(100, 240, 200, 30);
		add(dob);
		
		String valincome[] = {"Null","< 1,50,000","< 2,50,000","< 5,00,000","Upto 10,00,000"};
		income= new JComboBox(valincome);
		income.setBounds(300, 240, 400, 30);
		income.setBackground(Color.WHITE);
		add(income);
		
		
		JLabel education = new JLabel("Educational:");
		education.setFont(new Font("Ralewat",Font.BOLD, 20));
		education.setBounds(100, 290, 200, 30);
		add(education);
		
		JLabel qual = new JLabel("Qualification:");
		qual.setFont(new Font("Ralewat",Font.BOLD, 20));
		qual.setBounds(100, 315, 200, 30);
		add(qual);
		
		String valedu[] = {"Non-Graduation","Graduation","Post-Graduation","Doctorate","Other"};
		educationa= new JComboBox(valedu);
		educationa.setBounds(300, 300, 400, 30);
		educationa.setBackground(Color.WHITE);
		add(educationa);
		
		
		JLabel marital = new JLabel("Occupation:");
		marital.setFont(new Font("Ralewat",Font.BOLD,20));
		marital.setBounds(100, 390, 200, 30);
		add(marital);
		
		String valoccupation[] = {"Salaried","Self-Employeed","Businessman","Student","Retired","Other"};
		occupation = new JComboBox(valoccupation);
		occupation.setBounds(300, 390, 400, 30);
		occupation.setBackground(Color.WHITE);
		add(occupation);
	
		
		JLabel panno = new JLabel("PAN No:");
		panno.setFont(new Font("Ralewat",Font.BOLD, 20));
		panno.setBounds(100, 440, 200, 30);
		add(panno);
		
		pan = new JTextField();
		pan.setFont(new Font("Ralewat",Font.BOLD,14));
		pan.setBounds(300, 440, 400, 30);
		add(pan);
		
		
		JLabel aadharno = new JLabel("Aadhar No:");
		aadharno.setFont(new Font("Ralewat",Font.BOLD,20));
		aadharno.setBounds(100, 490, 200, 30);
		add(aadharno);
		
		aadhar = new JTextField();
		aadhar.setFont(new Font("Ralewat",Font.BOLD,14));
		aadhar.setBounds(300, 490, 400, 30);
		add(aadhar);
		
		
		JLabel seniorcitizen = new JLabel("Senior Citizen:");
		seniorcitizen.setFont(new Font("Ralewat",Font.BOLD,20));
		seniorcitizen.setBounds(100, 540, 200, 30);
		add(seniorcitizen);
		
		syes = new JRadioButton("Yes");
		syes.setBounds(300, 540, 100, 30);
		syes.setBackground(Color.WHITE);
		add(syes);
		
		sno = new JRadioButton("No");
		sno.setBounds(450, 540, 100, 30);
		sno.setBackground(Color.WHITE);
		add(sno);
		
		ButtonGroup seniorc = new ButtonGroup();
		seniorc.add(syes);
		seniorc.add(sno);
		
		
		JLabel existingac = new JLabel("Existing Account:");
		existingac.setFont(new Font("Ralewat",Font.BOLD,20));
		existingac.setBounds(100, 590, 200, 30);
		add(existingac);
		
		eyes = new JRadioButton("Yes");
		eyes.setBounds(300, 590, 100, 30);
		eyes.setBackground(Color.WHITE);
		add(eyes);
		
		eno = new JRadioButton("No");
		eno.setBounds(450, 590, 100, 30);
		eno.setBackground(Color.WHITE);
		add(eno);
		
		ButtonGroup ea = new ButtonGroup();
		ea.add(eyes);
		ea.add(eno);
		
		
		
		next = new JButton("Next");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway",Font.BOLD, 14));
		next.setBounds(620, 660, 80, 30);
		next.addActionListener(this);
		add(next);
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(850,800);
		setLocation(350, 10);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String sformno = ""+ formno;
		String sreligion = (String)religion.getSelectedItem();
		String scategory = (String)category.getSelectedItem();
		String sincome = (String)income.getSelectedItem();
		String seducation = (String)educationa.getSelectedItem();
		String soccupation = (String)occupation.getSelectedItem();
		String seniorcitizen = null;
		
		if(syes.isSelected())
		{
			seniorcitizen = "Yes";
		}
		else if(sno.isSelected())
		{
			seniorcitizen = "No";
		}
		
		String existingaccount = null;
		
		if(eyes.isSelected())
		{
			existingaccount = "Yes";
		}
		else if(eno.isSelected())
		{
			existingaccount  = "No";
		}
		
		
		String span = pan.getText();
		String saadhar = aadhar.getText();
				
		try {
				Conn c = new Conn();
				String query = "insert into signuptwo values('"+sformno+"','"+sreligion+"','"+scategory+"','"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
				c.s.executeUpdate(query);
				
				//signup3 obj
				setVisible(false);
				new SignupThree(formno).setVisible(true);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		new SignupTwo("");
	}
}
