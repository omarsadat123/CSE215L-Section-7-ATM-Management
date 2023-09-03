import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Withdrawal {
    /**
     * @wbp.parser.entryPoint
     */
	private static JTextField AccountField;
	 static JTextField amountField;
    /**
     * @wbp.parser.entryPoint
     */
    public static void createWithdrawalGUI(BalanceQuery account) {
    	
    	
    	
    	 JFrame frame = new JFrame("Deposit");
    	 frame.getContentPane().setBackground(new Color(128, 128, 128));
         frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         frame.setSize(670, 700);
         frame.setResizable(false);
         frame.setLocationRelativeTo(null);
         frame.setVisible(true);
         frame.getContentPane().setLayout(null);
 		
 		JPanel panel = new JPanel();
 		panel.setBackground(new Color(125, 255, 125));
 		panel.setBounds(69, 89, 514, 428);
 		frame.getContentPane().add(panel);
 		panel.setLayout(null);
 		

 		AccountField = new JTextField();
 		AccountField.setFont(new Font("Tahoma", Font.PLAIN, 16));
 		AccountField.setBounds(223, 114, 260, 46);
 		panel.add(AccountField);
 		AccountField.setColumns(10);
 		
 		amountField= new JTextField();
 		amountField.setFont(new Font("Tahoma", Font.PLAIN, 16));
 		amountField.setBounds(223, 180, 261, 46);
 		panel.add(amountField);
 		amountField.setColumns(10);
 		
 		JLabel lblNewLabel_1 = new JLabel("Withdraw  Money  :");
 		lblNewLabel_1.setBounds(25, 180, 193, 46);
 		panel.add(lblNewLabel_1);
 		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
 		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
 		
 		JButton btnNewButton_1 = new JButton("Withdraw");
 		btnNewButton_1.setForeground(new Color(0, 0, 255));
 		btnNewButton_1.setBounds(275, 268, 110, 46);
 		panel.add(btnNewButton_1);
 		btnNewButton_1.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent e) {
 				 double amount = Double.parseDouble(amountField.getText());
                 if (amount <= account.getBalance()) {
                     account.updateBalance(-amount);
                     JOptionPane.showMessageDialog(null, "Withdrawn: $" + amount);
                     new BankManagementGUI ();
                     frame.setVisible(false);
                     Transaction.addToTransactionHistory("Withdrawn: $ " +amountField.getText());
                     
                 } else {
                     JOptionPane.showMessageDialog(null, "Insufficient balance.");
                     new BankManagementGUI ();
                     frame.setVisible(false);
                 }
               
                
 			}
 		});
 		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
 		btnNewButton_1.setFocusable(false);
 		

 		JButton btnNewButton = new JButton("Reset");
 		btnNewButton.setForeground(new Color(255, 0, 0));
 		btnNewButton.setBounds(130, 268, 89, 46);
 		panel.add(btnNewButton);
 		btnNewButton.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent e) {
 				AccountField.setText("");
 				amountField.setText("");
 			}
 		});
 		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
 		btnNewButton.setFocusable(false);
 		
 		JLabel lblNewLabel = new JLabel("Account No.           :");
 		lblNewLabel.setBounds(31, 111, 187, 46);
 		panel.add(lblNewLabel);
 		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
 		lblNewLabel.setForeground(new Color(0, 0, 0));
 		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
 		frame.setVisible(true);


    }
}

    	
    	
    	
    	
    	
    	

