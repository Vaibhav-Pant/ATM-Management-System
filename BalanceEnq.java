import java.awt.*;
import java.sql.ResultSet;
import java.awt.event.*;
import javax.swing.*;   

class BalanceEnq extends JFrame implements ActionListener{

    String pin;
    JButton back;
    BalanceEnq(String pin)
    {
        this.pin = pin;
        setLayout(null);

        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("images/atm.jpg"));
        Image i1 = img.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i1);

        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,800);
        add(image); 

        int balance = 0;

        mysql c = new mysql();
        try{
            ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pin+"'");
            while(rs.next()){
                if(rs.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));    
                }else{
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }

        JLabel balance_money = new JLabel("Your current account balance is:");
        balance_money.setBounds(160, 250, 600, 30);
        balance_money.setFont(new Font("Times New Roman", Font.BOLD, 18));
        balance_money.setForeground(new Color(103, 155, 104));
        image.add(balance_money);
        
        JLabel moneyDisplay = new JLabel("Rs. "+balance+" ");
        moneyDisplay.setBounds(200, 260, 600, 100);
        moneyDisplay.setFont(new Font("Times New Roman", Font.BOLD, 18));
        moneyDisplay.setForeground(new Color(103, 155, 104));
        image.add(moneyDisplay);

        // Back button
        back = new JButton("Back");
        back.setBounds(400, 460, 100, 25);
        back.setBackground(new Color(103, 155, 104));
        back.setBorder(null);
        back.setBorderPainted(false);
        back.setFocusPainted(false);
        back.addActionListener(this);
        image.add(back);

        setSize(900,800);
        setLocation(300,50);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new transaction(pin).setVisible(true);
    }

    public static void main(String args[]){
        new BalanceEnq("");
    }
    
}
