import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Transaction extends JFrame{
    private static ArrayList<String> transactionHistory = new ArrayList<>();
    private static DefaultTableModel tableModel;

    /**
     * @wbp.parser.entryPoint
     */
    public static void createTransactionGUI() {
        JFrame frame = new JFrame("Transaction");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       
        frame.setResizable(false);
        frame.setSize(670, 700);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(240, 240, 240));

        JTable table = new JTable();
        table.setEnabled(false);
        table.setRowHeight(30);
        table.setFont(new Font("Serif", Font.BOLD, 20));
        tableModel = new DefaultTableModel(new String[]{"Transaction"}, 0);
        panel.setLayout(null);
        table.setModel(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(0, 55, 654, 590);

        panel.add(scrollPane);

        // Populate transaction history table
        for (String transaction : transactionHistory) {
            tableModel.addRow(new Object[]{transaction});
        }

        frame.getContentPane().add(panel);
        
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(140, 255, 255));
        menuBar.setBounds(0, 0, 654, 49);
        panel.add(menuBar);
        
        JMenu mnNewMenu = new JMenu("  Main Menu ");
        mnNewMenu.setBackground(new Color(128, 128, 64));
        mnNewMenu.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		new BankManagementGUI();
        		frame.setVisible(false);
        	}
        });
        mnNewMenu.setForeground(new Color(30, 144, 255));
        mnNewMenu.setHorizontalAlignment(SwingConstants.CENTER);
        mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 16));
        menuBar.add(mnNewMenu);
        frame.setVisible(true);
    }

    public static void addToTransactionHistory(String transaction) {
        transactionHistory.add(transaction);
        tableModel.addRow(new Object[]{transaction});
       
    }
}
