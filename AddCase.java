

//package com.JMRC;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddCase extends JFrame implements ActionListener{
	private JPanel panel;
	private JLabel userLabel,Cidlabel,clintlabel,opponentlabel,datelabel,casetypelabel,assigendlabel,casestatuslabel,witnessnamelabel,evidencelabel,caseoutcomelabel, casedislabel,keynotslabel,consulationlabel,evidencesublabel,witnesslabel,negotiationslabel,caseclosurelabel,image;
	private JTextField Cidtf,clinttf,opponenttf,datetf,casetypetf,assigendtf,casestatustf,witnessnametf,evidencetf,caseoutcometf,consutf,evidencesubtf,witnesstf,negotiationstf,caseclosuretf;
	private JTextArea textArea;
	private JButton addcase, backToDashboardButton;
	private cases cases;
	ImageIcon Image, bg;
	private adminDashboard adminDashboard;
	
	
	public AddCase(cases cases, adminDashboard adminDashboard){
		super("Add a Case");
		this.setSize( 1280,720);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		this.setLocationRelativeTo(null);

		this.cases = cases;
		this.adminDashboard = adminDashboard;
		
		Font Font1 = new Font("Times New Roman", Font.BOLD, 16);
		Font Font2 = new Font("Times New Roman", Font.BOLD, 14);
		
		
		userLabel = new JLabel("Add a new Case ");
		userLabel.setBounds(550,80,120,30);
		userLabel.setFont(Font1);
	
		//userLabel.setOpaque(true);
		panel.add(userLabel);
		
		
		Cidlabel = new JLabel("Case id:");
		Cidlabel.setBounds(300,120,120,30);
		// userLabel.setBackground(Color.white);
		//userLabel.setOpaque(true);
		panel.add(Cidlabel);
		
		
		clintlabel = new JLabel("Client:");
		clintlabel.setBounds(300,160,120,30);
		userLabel.setBackground(Color.white);
		//userLabel.setOpaque(true);
		panel.add(clintlabel);
		
		opponentlabel = new JLabel("Opponent:");
		opponentlabel.setBounds(300,200,120,30);
	    userLabel.setBackground(Color.white);
		//userLabel.setOpaque(true);
		panel.add(opponentlabel);
		
		datelabel = new JLabel("Date:");
		datelabel.setBounds(300,240,120,30);
		userLabel.setBackground(Color.white);
		//userLabel.setOpaque(true);
		panel.add(datelabel);
		
		
		casetypelabel = new JLabel("Case Type:");
		casetypelabel.setBounds(300,280,120,30);
		userLabel.setBackground(Color.white);
		//userLabel.setOpaque(true);
		panel.add(casetypelabel);
		
		
		assigendlabel = new JLabel("Assigend Lawyer:");
		assigendlabel.setBounds(300,320,120,30);
		userLabel.setBackground(Color.white);
		//userLabel.setOpaque(true);
		panel.add(assigendlabel);
		
		
		
		casestatuslabel = new JLabel("Case Status:");
		casestatuslabel.setBounds(300,360,120,30);
		userLabel.setBackground(Color.white);
		//userLabel.setOpaque(true);
		panel.add(casestatuslabel);
		
		
		
		witnessnamelabel = new JLabel("Witness Name:");
		witnessnamelabel.setBounds(300,400,120,30);
		userLabel.setBackground(Color.white);
		//userLabel.setOpaque(true);
		panel.add(witnessnamelabel);
		
		
		evidencelabel = new JLabel("Evidence:");
		evidencelabel.setBounds(300,440,120,30);
		userLabel.setBackground(Color.white);
		//userLabel.setOpaque(true);
		panel.add(evidencelabel);
		
		
		caseoutcomelabel = new JLabel("Case Outcome:");
		caseoutcomelabel.setBounds(300,480,120,30);
		userLabel.setBackground(Color.white);
		//userLabel.setOpaque(true);
		panel.add(caseoutcomelabel);
		
		
		
		
		Cidtf = new JTextField();
		Cidtf.setBounds(430,120,120,30);
		panel.add(Cidtf);
		
		
		clinttf = new JTextField();
		clinttf.setBounds(430,160,120,30);
		panel.add(clinttf);
		
		opponenttf = new JTextField();
		opponenttf.setBounds(430,200,120,30);
		panel.add(opponenttf);
		
		
		
		datetf = new JTextField();
		datetf.setBounds(430,240,120,30);
		panel.add(datetf);
		
		
		casetypetf = new JTextField();
		casetypetf.setBounds(430,280,120,30);
		panel.add(casetypetf);
		
		
		assigendtf = new JTextField();
		assigendtf.setBounds(430,320,120,30);
		panel.add(assigendtf);
		
		
		casestatustf = new JTextField();
		casestatustf.setBounds(430,360,120,30);
		panel.add(casestatustf);
		
		
		witnessnametf = new JTextField();
		witnessnametf.setBounds(430,400,120,30);
		panel.add(witnessnametf);
		
		
		evidencetf = new JTextField();
		evidencetf.setBounds(430,440,120,30);
		panel.add(evidencetf);
		
		caseoutcometf = new JTextField();
		caseoutcometf.setBounds(430,480,120,30);
		panel.add(caseoutcometf);
		
		
		casedislabel = new JLabel("Case Description:");
		casedislabel.setBounds(580,120,120,30);
		casedislabel.setFont(Font2);
		userLabel.setBackground(Color.white);
		//userLabel.setOpaque(true);
		panel.add(casedislabel);
		
		
		
		textArea = new JTextArea();
		textArea.setBounds(580, 160, 260, 110);
		textArea.setLineWrap(true);
		//textArea.setWrapStyleWrap(true);
        panel.add(textArea);
		
		keynotslabel = new JLabel("key Notes:");
		keynotslabel.setBounds(580,280,120,30);
		keynotslabel.setFont(Font2);
		userLabel.setBackground(Color.white);
		//userLabel.setOpaque(true);
		panel.add(keynotslabel);
		
		consulationlabel = new JLabel("Consulation:");
		consulationlabel.setBounds(580,320,120,30);
		userLabel.setBackground(Color.white);
		//userLabel.setOpaque(true);
		panel.add(consulationlabel);
		
		
		evidencesublabel = new JLabel("Evidence Submission:");
		evidencesublabel.setBounds(580,360,130,30);
		userLabel.setBackground(Color.white);
		//userLabel.setOpaque(true);
		panel.add(evidencesublabel);
		
		
		witnesslabel = new JLabel("Wtiness:");
		witnesslabel.setBounds(580,400,120,30);
		userLabel.setBackground(Color.white);
		//userLabel.setOpaque(true);
		panel.add(witnesslabel);
		
		
		negotiationslabel = new JLabel("Negotiations:");
		negotiationslabel.setBounds(580,440,120,30);
		userLabel.setBackground(Color.white);
		//userLabel.setOpaque(true);
		panel.add(negotiationslabel);
		
		caseclosurelabel = new JLabel("Case Closure:");
		caseclosurelabel.setBounds(580,480,120,30);
		userLabel.setBackground(Color.white);
		//userLabel.setOpaque(true);
		panel.add(caseclosurelabel);
		
		
		
		
		consutf = new JTextField();
		consutf.setBounds(720,320,120,30);
		panel.add(consutf);
		
		evidencesubtf = new JTextField();
		evidencesubtf.setBounds(720,360,120,30);
		panel.add(evidencesubtf);
		
		witnesstf = new JTextField();
		witnesstf.setBounds(720,400,120,30);
		panel.add(witnesstf);
		
		negotiationstf = new JTextField();
		negotiationstf.setBounds(720,440,120,30);
		panel.add(negotiationstf);
		
		caseclosuretf = new JTextField();
		caseclosuretf.setBounds(720,480,120,30);
		panel.add(caseclosuretf);
		
		addcase = new JButton("Add Case");
		addcase.setBackground(new Color(0x2596BE));
		addcase.setOpaque(true);
		addcase.setBounds(470,530,160,30);
		addcase.addActionListener(this);
		panel.add(addcase);
		
		backToDashboardButton = new JButton("Back to Dashboard");
		backToDashboardButton.setBackground(new Color(0x2596BE));
		backToDashboardButton.setOpaque(true);
		backToDashboardButton.setBounds(650,530,160,30);
		backToDashboardButton.addActionListener(this);
		panel.add(backToDashboardButton);
		
		
        image =new JLabel();
        bg=new ImageIcon("images\\bg3.jpg");
        //setIconImage(bg.getImage());
        image.setIcon(bg);
        image.setBounds(0,0,1280,720);
        panel.add(image);

		this.add(panel);
		
		
	}
	
	public void actionPerformed(ActionEvent ae){
		String command = ae.getActionCommand();
		if (backToDashboardButton.getText().equals(command)) {
			adminDashboard.setVisible(true);
			this.setVisible(false);
		}else if(addcase.getText().equals(command)){
			String caseID = Cidtf.getText();
			String client = clinttf.getText();
			String opponent = opponenttf.getText();
			String dateOpened = datetf.getText();
			String casetype = casetypetf.getText();
			String assigendLawyer = assigendtf.getText();
			String caseStatus = casestatustf.getText();
			String witnessName = witnessnametf.getText();
			String evidence = evidencetf.getText();
			String caseOutcome = caseoutcometf.getText();
			String caseDescription = textArea.getText();
			String consulation = consutf.getText();
			String evidenceSubmission = evidencesubtf.getText();
			String Witness = witnesstf.getText();
			String Negotiations = negotiationstf.getText();
			String caseClosure = caseclosuretf.getText();

		

		if(!caseID.isEmpty() && !client.isEmpty() && !opponent.isEmpty() && !dateOpened.isEmpty() && !casetype.isEmpty() && !assigendLawyer.isEmpty() && !caseStatus.isEmpty() && !witnessName.isEmpty() && !evidence.isEmpty() && !caseOutcome.isEmpty() && !caseDescription.isEmpty() && !consulation.isEmpty() && !evidenceSubmission.isEmpty() && !Witness.isEmpty() && !Negotiations.isEmpty() && !caseClosure.isEmpty()){
			addACase aac = new addACase(caseID, client, opponent, dateOpened, casetype, assigendLawyer, caseStatus, witnessName, evidence, caseOutcome, caseDescription, consulation, evidenceSubmission, Witness, Negotiations, caseClosure);
			cases.AddCase(aac);
			JOptionPane.showMessageDialog(this, "Case Added Successfully");

			adminDashboard.setVisible(true);
			this.setVisible(false);
	} else{
		JOptionPane.showMessageDialog(this, "Please fill all the fields");
	}
	}
	
}
}

		
		
		