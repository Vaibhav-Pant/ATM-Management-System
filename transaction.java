import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class transaction extends JFrame implements ActionListener {

    JButton deposit, fastCash, withdraw, statement, pinChange, balance, exit;
    String pin;

    transaction(String pin) {
        this.pin = pin;
        setLayout(null);

        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("images/atm.jpg"));
        Image i1 = img.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i1);

        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 800);
        add(image);

        JLabel heading = new JLabel("Please select a Transaction");
        heading.setBounds(230, 250, 400, 50);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 18));
        heading.setForeground(Color.white);
        image.add(heading);

        // options: Deposit, cash withdraw, Balance, mini statement, fast cash, pin
        // change, exit
        deposit = new JButton("Deposit");
        deposit.setBounds(180, 370, 100, 25);
        deposit.setBackground(new Color(103, 155, 104));
        deposit.setBorder(null);
        deposit.setBorderPainted(false);
        deposit.setFocusPainted(false);
        deposit.addActionListener(this);
        image.add(deposit);

        withdraw = new JButton("Cash Withdraw");
        withdraw.setBounds(400, 370, 100, 25);
        withdraw.setBackground(new Color(103, 155, 104));
        withdraw.setBorder(null);
        withdraw.setBorderPainted(false);
        withdraw.setFocusPainted(false);
        withdraw.addActionListener(this);
        image.add(withdraw);

        fastCash = new JButton("Fast Cash");
        fastCash.setBounds(180, 400, 100, 25);
        fastCash.setBackground(new Color(103, 155, 104));
        fastCash.setBorder(null);
        fastCash.setBorderPainted(false);
        fastCash.setFocusPainted(false);
        fastCash.addActionListener(this);
        image.add(fastCash);

        statement = new JButton("Mini Statement");
        statement.setBounds(400, 400, 100, 25);
        statement.setBackground(new Color(103, 155, 104));
        statement.setBorder(null);
        statement.setBorderPainted(false);
        statement.setFocusPainted(false);
        statement.addActionListener(this);
        image.add(statement);

        pinChange = new JButton("Pin Change");
        pinChange.setBounds(180, 430, 100, 25);
        pinChange.setBackground(new Color(103, 155, 104));
        pinChange.setBorder(null);
        pinChange.setBorderPainted(false);
        pinChange.setFocusPainted(false);
        pinChange.addActionListener(this);
        image.add(pinChange);

        balance = new JButton("Balance Enquiry");
        balance.setBounds(400, 430, 100, 25);
        balance.setBackground(new Color(103, 155, 104));
        balance.setBorder(null);
        balance.setBorderPainted(false);
        balance.setFocusPainted(false);
        balance.addActionListener(this);
        image.add(balance);

        exit = new JButton("Exit");
        exit.setBounds(400, 460, 100, 25);
        exit.setBackground(new Color(103, 155, 104));
        exit.setBorder(null);
        exit.setBorderPainted(false);
        exit.setFocusPainted(false);
        exit.addActionListener(this);
        image.add(exit);

        setSize(900, 800);
        setLocation(300, 50);
        // setDefaultCloseOperation(EXIT_ON_CLOSE);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == exit) {
            System.exit(0);
        } else if (ae.getSource() == deposit) {
            setVisible(false);
            new deposit(pin).setVisible(true);
        } else if (ae.getSource() == withdraw) {
            setVisible(false);
            new withdraw(pin).setVisible(true);
        } else if (ae.getSource() == fastCash) {
            setVisible(false);
            new FastCash(pin).setVisible(true);
        }else if(ae.getSource() == pinChange){
            setVisible(false);
            new PinChange(pin).setVisible(true);
        }else if(ae.getSource() == balance){
            setVisible(false);
            new BalanceEnq(pin).setVisible(true);
        }else if(ae.getSource() == statement){
            // setVisible(true);
            new MiniStatement(pin).setVisible(true);
        }

    }

    public static void main(String args[]) {
        new transaction("");
    }

}
