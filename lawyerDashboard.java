


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class lawyerDashboard extends JFrame implements ActionListener, MouseListener {
    JPanel panel;
    JLabel wlabel, userNameLabel, passwordLabel,nameLabel,designationLabel,lawyertypLabel,educatioJLabel,casehandledLabel,casewonLabel,caselostLabel,emailLabel;
    JButton addACaseButton, addALawyerButton, viewCasesButton, viewLawyersButton, showButton, logOutButton;
    Font myFont, Font1;
    ImageIcon icon;
    String hiddenPass = "";
    LawyerLogin ll;
    addALawyer aal;
    lawyers lawyers;

    public lawyerDashboard( addALawyer aal, lawyers lawyers, LawyerLogin ll) {
        super("Lawyer  Dashboard");
        this.setSize(1280, 720);
        icon = new ImageIcon("images/student.jpg");
        this.setIconImage(icon.getImage());
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.ll = ll;
        this.lawyers = lawyers;
        this.aal = aal;


        myFont = new Font("Cambria", Font.PLAIN, 17);
        Font1 = new Font("Times New Roman", Font.BOLD, 24);

        panel = new JPanel();
        panel.setLayout(null);

        wlabel = new JLabel("Welcome back, " + aal.getUsername() + "!");
        wlabel.setBounds(550, 50, 300, 50);
        wlabel.setFont(Font1);
        panel.add(wlabel);

        nameLabel = new JLabel("Name: " + aal.getUsername());
        userNameLabel.setBounds(480, 150, 200, 30);
        userNameLabel.setFont(myFont);
        panel.add(userNameLabel);

        
        designationLabel = new JLabel("Designation: " + aal.getDesignation());
        designationLabel.setBounds(480, 190, 350, 30);
        designationLabel.setFont(myFont);
        panel.add(designationLabel);

        lawyertypLabel = new JLabel("Lawyer Type: " + aal.getLawyerType());
        lawyertypLabel.setBounds(480, 230, 200, 30);
        lawyertypLabel.setFont(myFont);
        panel.add(lawyertypLabel);

        educatioJLabel = new JLabel("Education: " + aal.getEducation());
        educatioJLabel.setBounds(480, 270, 200, 30);
        educatioJLabel.setFont(myFont);
        panel.add(educatioJLabel);

        casehandledLabel = new JLabel("Case Handled: " + aal.getCasesHandled());
        casehandledLabel.setBounds(480, 310, 200, 30);
        casehandledLabel.setFont(myFont);
        panel.add(casehandledLabel);

        casewonLabel = new JLabel("Case Won: " + aal.getCasesWon());
        casewonLabel.setBounds(480, 350, 200, 30);
        casewonLabel.setFont(myFont);
        panel.add(casewonLabel);

        caselostLabel = new JLabel("Case Lost: " + aal.getCasesLost());
        caselostLabel.setBounds(480, 390, 200, 30);
        caselostLabel.setFont(myFont);
        panel.add(caselostLabel);

        emailLabel = new JLabel("Email: " + aal.getEmail());
        emailLabel.setBounds(480, 430, 200, 30);
        emailLabel.setFont(myFont);
        panel.add(emailLabel);




       
        viewCasesButton = new JButton("View cases");
        viewCasesButton.setBounds(480, 470, 200, 30);
        viewCasesButton.setFont(myFont);
        viewCasesButton.setBackground(new Color(0x2596BE));
        panel.add(viewCasesButton);

        

       

        logOutButton = new JButton("Log out");
        logOutButton.setBounds(480, 510, 200, 30);
        logOutButton.setFont(myFont);
        logOutButton.setBackground(new Color(0x2596BE));
        panel.add(logOutButton);

        
        String pass = aal.getPassword();
        int passLength = pass.length();
        for (int i = 0; i < passLength; i++) {
            hiddenPass += '*';
        }

        this.add(panel);

        
       
        viewCasesButton.addActionListener(this);
        logOutButton.addActionListener(this);

        viewCasesButton.setFocusable(false);
        logOutButton.setFocusable(false);

        
        // this.setVisible(true);
    }

    public void mouseClicked(MouseEvent me) {
    }

    public void mouseEntered(MouseEvent me) {
    }

    public void mouseExited(MouseEvent me) {
    }

    public void mousePressed(MouseEvent me) {
        
    }

    public void mouseReleased(MouseEvent me) {
       
    }

    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        if (logOutButton.getText().equals(command)) {
            ll.setVisible(true);
            this.setVisible(false);
        }else{}
}

}
