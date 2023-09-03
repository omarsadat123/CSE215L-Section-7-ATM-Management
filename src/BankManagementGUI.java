import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;

public class BankManagementGUI  {
    static BalanceQuery account = new BalanceQuery(1000.0);

    public BankManagementGUI() {
       
    	JFrame frame = new JFrame("Bank Management");
    	frame.getContentPane().setBackground(new Color(135, 206, 235));
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setSize(670, 700);
    	frame.setResizable(false);
    	frame.getContentPane().setLayout(null);
    	frame.setLocationRelativeTo(null);
    	
    	JPanel panel = new JPanel();
    	panel.setBackground(new Color(32, 178, 170));
    	panel.setBounds(35, 88, 585, 501);
    	frame.getContentPane().add(panel);
    	panel.setLayout(null);
    	
    	JButton depositButton = new JButton("Deposit");
    	depositButton.setForeground(new Color(255, 0, 0));
    	depositButton.setBackground(new Color(0, 191, 255));
    	depositButton.setBounds(408, 42, 140, 58);
    	panel.add(depositButton);
    	depositButton.setFont(new Font("Tahoma", Font.BOLD, 15));
    	
    	JButton btnNewButton_2 = new JButton("Transaction ");
    	btnNewButton_2.setForeground(new Color(255, 0, 0));
    	btnNewButton_2.setBackground(new Color(0, 191, 255));
    	btnNewButton_2.setBounds(408, 278, 140, 58);
    	panel.add(btnNewButton_2);
    	btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
    	
    	JButton withdrawButton = new JButton("Withdraw");
    	withdrawButton.setForeground(new Color(255, 0, 0));
    	withdrawButton.setBackground(new Color(0, 191, 255));
    	withdrawButton.setBounds(408, 162, 140, 58);
    	panel.add(withdrawButton);
    	withdrawButton.setFont(new Font("Tahoma", Font.BOLD, 15));
    	
    	JButton totalBalanceButton = new JButton("Total Balance");
    	totalBalanceButton.setForeground(new Color(255, 0, 0));
    	totalBalanceButton.setBackground(new Color(0, 191, 255));
    	totalBalanceButton.setBounds(408, 386, 140, 58);
    	panel.add(totalBalanceButton);
    	totalBalanceButton.setFont(new Font("Tahoma", Font.BOLD, 15));
    	
    	JLabel lblNewLabel = new JLabel("");
    	lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
    	lblNewLabel.setIcon(new ImageIcon("D:\\CSE215L-Section-7-ATM-Management\\Icon-152-removebg-preview.png"));
    	lblNewLabel.setBounds(231, 31, 167, 82);
    	lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 15));
    	panel.add(lblNewLabel);
    	
    	JLabel lblNewLabel_1 = new JLabel("");
    	lblNewLabel_1.setIcon(new ImageIcon("D:\\\\CSE215L-Section-7-ATM-Management\\Icon-152-removebg-preview.png"));
    	lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
    	lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 15));
    	lblNewLabel_1.setBounds(231, 148, 167, 82);
    	panel.add(lblNewLabel_1);
    	
    	JLabel lblNewLabel_2 = new JLabel("");
    	lblNewLabel_2.setIcon(new ImageIcon("D:\\\\CSE215L-Section-7-ATM-Management\\Icon-152-removebg-preview.png"));
    	lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
    	lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 15));
    	lblNewLabel_2.setBounds(231, 386, 167, 82);
    	panel.add(lblNewLabel_2);
    	
    	JLabel lblNewLabel_2_1 = new JLabel("");
    	lblNewLabel_2_1.setIcon(new ImageIcon("D:\\\\CSE215L-Section-7-ATM-Management\\Icon-152-removebg-preview.png"));
    	lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
    	lblNewLabel_2_1.setFont(new Font("Tahoma", Font.ITALIC, 15));
    	lblNewLabel_2_1.setBounds(231, 266, 167, 82);
    	panel.add(lblNewLabel_2_1);
    	
    	JLabel lblNewLabel_3 = new JLabel("Deposit Money");
    	lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
    	lblNewLabel_3.setBounds(54, 48, 121, 47);
    	panel.add(lblNewLabel_3);
    	
    	JLabel lblNewLabel_4 = new JLabel("Withdraw Money");
    	lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
    	lblNewLabel_4.setBounds(54, 168, 121, 47);
    	panel.add(lblNewLabel_4);
    	
    	JLabel lblNewLabel_5 = new JLabel("Transaction  History");
    	lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
    	lblNewLabel_5.setBounds(54, 284, 150, 47);
    	panel.add(lblNewLabel_5);
    	
    	JLabel lblNewLabel_6 = new JLabel(" Total Balance");
    	lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
    	lblNewLabel_6.setBounds(54, 403, 150, 47);
    	panel.add(lblNewLabel_6);
    	
    	JLabel lblNewLabel_7 = new JLabel("Choice Your Option!!!!!");
    	lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
    	lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 22));
    	lblNewLabel_7.setBounds(158, 25, 335, 48);
    	frame.getContentPane().add(lblNewLabel_7);
    	
    	JButton btnNewButton = new JButton("Log Out");
    	btnNewButton.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			System.exit(0);
    		}
    	});
    	btnNewButton.setForeground(new Color(255, 255, 255));
    	btnNewButton.setBackground(new Color(0, 102, 204));
    	btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
    	btnNewButton.setFocusable(false);
    	btnNewButton.setBounds(255, 600, 137, 50);
    	frame.getContentPane().add(btnNewButton);
    	totalBalanceButton .addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			TotalBalance.createTotalBalanceGUI(account);
    			
    		}
    	});
    	withdrawButton.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			 Withdrawal.createWithdrawalGUI(account);
    			 frame.setVisible(false);
    		}
    	});
    	btnNewButton_2.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			 Transaction.createTransactionGUI();
    			 frame.setVisible(false);
    		}
    	});
    	depositButton.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			  Deposit.createDepositGUI(account);
    			  frame.setVisible(false);
    			  
    		}
    	});
    	
    	frame.setVisible(true);	
    }
}
