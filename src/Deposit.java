import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deposit extends JFrame {
	private static JTextField AccountField;
	 static JTextField amountField;
    /**
     * @wbp.parser.entryPoint
     */
    public static void createDepositGUI(BalanceQuery account) {
        JFrame frame = new JFrame("Deposit");
        frame.getContentPane().setBackground(new Color(199, 21, 133));
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(670, 700);
        frame.setResizable(false);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        JLabel lblNewLabel = new JLabel("Account No.                 :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(93, 201, 220, 35);
		frame.getContentPane().add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Amount  Money        :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_1.setBounds(93, 244, 205, 35);
		frame.getContentPane().add(lblNewLabel_1);
		

		JButton btnNewButton = new JButton("Reset");
		btnNewButton.setBackground(new Color(0, 191, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountField.setText("");
				amountField.setText("");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(209, 315, 89, 40);
		btnNewButton.setFocusable(false);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Confirm");
		btnNewButton_1.setBackground(new Color(210, 105, 30));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 double amount = Double.parseDouble(amountField.getText());
              account.updateBalance(amount);
             
               JOptionPane.showMessageDialog(null, "Deposited: $" + amount);
               frame.setVisible(false);
               new BankManagementGUI();
               Transaction.addToTransactionHistory("Deposited:  $ " +amountField.getText());
              
               
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(335, 315, 110, 40);
		btnNewButton_1.setFocusable(false);
		frame.getContentPane().add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(60, 179, 113));
		panel.setBounds(48, 101, 543, 392);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		

		AccountField = new JTextField();
		AccountField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		AccountField.setBounds(298, 100, 218, 35);
		panel.add(AccountField);
		AccountField.setColumns(10);
		
		amountField = new JTextField();
		amountField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		amountField.setBounds(298, 149, 218, 35);
		panel.add(amountField);
		amountField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("DEPOSIT MONEY");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBackground(new Color(255, 0, 0));
		lblNewLabel_2.setBounds(169, 11, 194, 43);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.setVisible(true);


       


        
    }
}
