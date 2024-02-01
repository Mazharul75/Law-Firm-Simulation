import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;


public class LawyerInfoWindow extends JFrame {
    private JTable lawyerInfoTable;
    JLabel image;
    private DefaultTableModel tableModel;
    ImageIcon Image, bg;
    private JPanel panel;

    public LawyerInfoWindow() {
        super("Lawyer Information");
        this.setSize(1280, 720);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        		
		panel = new JPanel();
		panel.setLayout(null);
		this.setLocationRelativeTo(null);

        this.setLocationRelativeTo(null);

        image =new JLabel();
        bg=new ImageIcon("images\\bg4.jpg");
        //setIconImage(bg.getImage());
        image.setIcon(bg);
        image.setBounds(0,0,1280,720);
        panel.add(image);


        initialize();
    }

    private void initialize() {
        Vector<String> columnNames = new Vector<>();
        columnNames.add("Lawyer Name");
        columnNames.add("Lawyer Type");
        columnNames.add("Cases Handled");
        columnNames.add("Cases Won");
        columnNames.add("Cases Lost");

        Vector<Vector<String>> data = readAllLawyers();

        tableModel = new DefaultTableModel(data, columnNames);
        lawyerInfoTable = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(lawyerInfoTable);


        this.add(scrollPane);
    }

    private Vector<Vector<String>> readAllLawyers() {
        Vector<Vector<String>> allLawyers = new Vector<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("Files/LawyerList.txt"))) {
            String line;
            Vector<String> currentLawyerInfo = new Vector<>();

            while ((line = reader.readLine()) != null) {
                if (line.startsWith("First Name:")) {
                    if (!currentLawyerInfo.isEmpty()) {
                        allLawyers.add(currentLawyerInfo);
                    }
                    currentLawyerInfo = new Vector<>();
                    currentLawyerInfo.add(line.replace("First Name:", "").trim());
                } else if (line.startsWith("Lawyer Type:") || line.startsWith("Cases Handled:")
                        || line.startsWith("Cases Won:") || line.startsWith("Cases Lost:")) {
                    currentLawyerInfo.add(line.trim());
                }
            }

            // Add the last lawyer
            if (!currentLawyerInfo.isEmpty()) {
                allLawyers.add(currentLawyerInfo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return allLawyers;
    }

   
}
