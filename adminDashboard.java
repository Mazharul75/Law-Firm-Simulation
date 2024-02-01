


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class adminDashboard extends JFrame implements MouseListener, ActionListener {
    JPanel panel;
    JLabel wlabel, userNameLabel, passwordLabel,image;
    JButton addACaseButton, addALawyerButton, viewCasesButton, viewLawyersButton, showButton, logOutButton;
    Font myFont, Font1;
    ImageIcon icon;
    String hiddenPass = "";
    AdminLogin al;
    ImageIcon Image, bg;
    Admin a;
    cases cases;
    lawyers lawyers;

    public adminDashboard(Admin a, AdminLogin al) {
        super("My dashboard");
        this.setSize(1280, 720);
        icon = new ImageIcon("images/student.jpg");
        this.setIconImage(icon.getImage());
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.al = al;
        this.a = a;
        this.cases = new cases();
        this.lawyers = new lawyers();


        myFont = new Font("Cambria", Font.PLAIN, 17);
        Font1 = new Font("Times New Roman", Font.BOLD, 24);

        panel = new JPanel();
        panel.setLayout(null);

        wlabel = new JLabel("Welcome back, " + a.getUsername() + "!");
        wlabel.setBounds(550, 50, 300, 50);
        wlabel.setForeground(Color.white);
        wlabel.setFont(Font1);
        panel.add(wlabel);

        userNameLabel = new JLabel("Username: " + a.getUsername());
        userNameLabel.setBounds(550, 150, 200, 30);
        userNameLabel.setForeground(Color.white);
        userNameLabel.setFont(myFont);
        panel.add(userNameLabel);

        passwordLabel = new JLabel("Password: " + hiddenPass);
        passwordLabel.setBounds(550, 190, 350, 30);
        passwordLabel.setForeground(Color.white);
        passwordLabel.setFont(myFont);
        panel.add(passwordLabel);

        addACaseButton = new JButton("Add a case");
        addACaseButton.setBounds(550, 270, 200, 30);
        addACaseButton.setFont(myFont);
        addACaseButton.setBackground(new Color(0x2596BE));
        panel.add(addACaseButton);

        addALawyerButton = new JButton("Add a lawyer");
        addALawyerButton.setBounds(550, 340, 200, 30);
        addALawyerButton.setFont(myFont);
        addALawyerButton.setBackground(new Color(0x2596BE));
        panel.add(addALawyerButton);

        viewCasesButton = new JButton("View cases");
        viewCasesButton.setBounds(550, 410, 200, 30);
        viewCasesButton.setFont(myFont);
        viewCasesButton.setBackground(new Color(0x2596BE));
        panel.add(viewCasesButton);

        viewLawyersButton = new JButton("View lawyers");
        viewLawyersButton.setBounds(550, 480, 200, 30);
        viewLawyersButton.setFont(myFont);
        viewLawyersButton.setBackground(new Color(0x2596BE));
        panel.add(viewLawyersButton);

        showButton = new JButton("Show");
        showButton.setBounds(800, 190, 100, 30);
        showButton.setBorder(null);
        showButton.setBackground(new Color(0x2596BE));
        showButton.addMouseListener(this);
        showButton.addActionListener(this);
        panel.add(showButton);



        logOutButton = new JButton("Log out");
        logOutButton.setBounds(550, 560, 200, 30);
        logOutButton.setFont(myFont);
        logOutButton.setBackground(new Color(0x2596BE));
        panel.add(logOutButton);

        
        String pass = a.getPassword();
        int passLength = pass.length();
        for (int i = 0; i < passLength; i++) {
            hiddenPass += '*';
        }
      


        image =new JLabel();
        bg=new ImageIcon("images\\gf8.jpg");
        //setIconImage(bg.getImage());
        image.setIcon(bg);
        image.setBounds(0,0,1280,720);
        panel.add(image);


        this.add(panel);

        addACaseButton.addActionListener(this);
        addALawyerButton.addActionListener(this);
        viewCasesButton.addActionListener(this);
        viewLawyersButton.addActionListener(this);
        logOutButton.addActionListener(this);

        addACaseButton.setFocusable(false);
        addALawyerButton.setFocusable(false);
        viewCasesButton.setFocusable(false);
        viewLawyersButton.setFocusable(false);
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
        if (me.getSource() == showButton) {
            passwordLabel.setText("Password: " + a.getPassword());
        }
    }

    public void mouseReleased(MouseEvent me) {
        if (me.getSource() == showButton) {
            passwordLabel.setText("Password: " + hiddenPass);
        }
    }

    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        if (logOutButton.getText().equals(command)) {
            al.setVisible(true);
            this.setVisible(false);
        }else if(addACaseButton.getText().equals(command)){
            AddCase ac = new AddCase(cases, this);
            ac.setVisible(true);
            this.setVisible(false);
        }else if (addALawyerButton.getText().equals(command)) {
            AddLawyer al = new AddLawyer(lawyers,this);
            al.setVisible(true);
            this.setVisible(false);
} else if (viewCasesButton.getText().equals(command)) {
            CaseInfoWindow ciw = new CaseInfoWindow();
            ciw.setVisible(true);
            this.setVisible(false);
        } else if(viewLawyersButton.getText().equals(command)){
            LawyerInfoWindow liw = new LawyerInfoWindow();
            liw.setVisible(true);
            this.setVisible(false);
        }
}
}
