import java.awt.*;
import java.awt.event.*;
import javax.swing.*;   
import java.util.*;

class deposit extends JFrame implements ActionListener{

    JTextField amount;
    JButton back, deposit;
    String pin;
    deposit(String pin)
    {
        this.pin = pin;
        setLayout(null);

        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("images/atm.jpg"));
        Image i1 = img.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i1);

        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,800);
        add(image); 

        JLabel heading = new JLabel("Enter the amount to deposit");
        heading.setBounds(220, 250, 400,50);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 20));
        heading.setForeground(new Color(103, 155, 104));
        image.add(heading);

        //  Amount textfield 
        amount = new JTextField();
        amount.setFont(new Font("Times New Roman", Font.BOLD, 18));
        amount.setBounds(200, 300, 280, 30);
        image.add(amount);



        //  Deposit button
        deposit = new JButton("Deposit");
        deposit.setBounds(400, 430, 100, 25);
        deposit.setBackground(new Color(103, 155, 104));
        deposit.setBorder(null);
        deposit.setBorderPainted(false);
        deposit.setFocusPainted(false);
        deposit.addActionListener(this);
        image.add(deposit);

        // back button move to back page.
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
        if(ae.getSource() == back){
            setVisible(true);
            new transaction(pin).setVisible(true);
        }else if(ae.getSource() == deposit){
            String money = amount.getText();
            Date date = new Date();
            if(money.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the Amount to deposit.");
            }else{
                try{
                    mysql c = new mysql();
                    String query = "insert into bank values('"+pin+"', '"+date+"', 'Deposit', '"+money+"')";
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs. "+money+" deposited succesfully.");
                    setVisible(false);
                    new transaction(pin).setVisible(true);
                }catch(Exception e){
                    System.out.println(e);
                }
            }
        }
    }

    public static void main(String args[]){
        new deposit("");
    }
    
}
