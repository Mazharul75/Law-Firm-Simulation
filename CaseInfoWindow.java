import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaseInfoWindow extends JFrame {
    private JTable caseInfoTable;
    // private JButton backToDashboardButton;
    private DefaultTableModel tableModel;

    public CaseInfoWindow() {
        super("Case Information");
        this.setSize(1280, 720); // Set the window size to 1280x720
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);

        // backToDashboardButton = new JButton("Back to Dashboard");
        // backToDashboardButton.setBounds(1000, 600, 200, 40);
        // backToDashboardButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
        // backToDashboardButton.setBackground(new Color(0x2596BE));
        // this.add(backToDashboardButton);


        initialize();
    }

    private void initialize() {
        Vector<String> columnNames = new Vector<>();
        columnNames.add("Case ID");
        columnNames.add("Client");
        columnNames.add("Opponent");
        columnNames.add("Assigned Lawyer");

        Vector<Vector<String>> data = readAllCases();

        tableModel = new DefaultTableModel(data, columnNames);
        caseInfoTable = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(caseInfoTable);
        this.add(scrollPane);
    }

    private Vector<Vector<String>> readAllCases() {
        Vector<Vector<String>> allCases = new Vector<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("Files/caseList.txt"))) {
            String line;
            Vector<String> currentCaseInfo = new Vector<>();

            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Case ID:")) {
                    if (!currentCaseInfo.isEmpty()) {
                        allCases.add(currentCaseInfo);
                    }
                    currentCaseInfo = new Vector<>();
                    currentCaseInfo.add(line.replace("Case ID:", "").trim());
                } else if (line.startsWith("Client:") || line.startsWith("Opponent:") || line.startsWith("Assigned Lawyer:")) {
                    currentCaseInfo.add(line.trim());
                }
            }

          
            if (!currentCaseInfo.isEmpty()) {
                allCases.add(currentCaseInfo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return allCases;
    }

    

    
}
