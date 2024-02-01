import javax.swing.*;


public class Start {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            users us = new users();
            lawyers lawyers = new lawyers();
            WelcomePage welcomePage = new WelcomePage(us, lawyers);
            new ClientLogin(welcomePage, us);
            Admin admin = new Admin("admin", "admin");

            System.out.println();
            System.out.println("Admin Username: " + admin.getUsername());
            System.out.println("Admin Password: " + admin.getPassword());
            System.out.println();
            // Uncomment the following line if you want the WelcomePage frame to be visible.
            welcomePage.setVisible(true);
        });
    }
}
