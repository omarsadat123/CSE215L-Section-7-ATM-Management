import javax.swing.JOptionPane;

public class TotalBalance {
    public static void createTotalBalanceGUI(BalanceQuery account) {
        JOptionPane.showMessageDialog(null, "Total Balance: $ " + account.getBalance());
    }
}
