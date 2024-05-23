import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

import javax.swing.*;   
import java.util.*;

class withdraw extends JFrame implements ActionListener{

    JTextField amount;
    JButton back, withdraw;
    String pin;
    withdraw(String pin)
    {
        this.pin = pin;
        setLayout(null);

        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("images/atm.jpg"));
        Image i1 = img.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i1);

        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,800);
        add(image); 

        JLabel heading = new JLabel("Enter the amount to withdraw");
        heading.setBounds(220, 250, 400,50);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 20));
        heading.setForeground(new Color(103, 155, 104));
        image.add(heading);

        //  Amount textfield 
        amount = new JTextField();
        amount.setFont(new Font("Times New Roman", Font.BOLD, 18));
        amount.setBounds(200, 300, 280, 30);
        image.add(amount);



        //  withdraw button
        withdraw = new JButton("Withdraw");
        withdraw.setBounds(400, 430, 100, 25);
        withdraw.setBackground(new Color(103, 155, 104));
        withdraw.setBorder(null);
        withdraw.setBorderPainted(false);
        withdraw.setFocusPainted(false);
        withdraw.addActionListener(this);
        image.add(withdraw);

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
        }else if(ae.getSource() == withdraw){
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

            String money = amount.getText();
            Date date = new Date();
            if(money.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the Amount to withdraw.");
            }else if(Integer.parseInt(money) > balance){
                JOptionPane.showMessageDialog(null, "Invalid Amount, Check your balance.");
                amount.setText("");
            }
            else{
                try{
                    // mysql c = new mysql();
                    String query = "insert into bank values('"+pin+"', '"+date+"', 'withdraw', '"+money+"')";
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs. "+money+" withdraw succesfully.");
                    setVisible(false);
                    new transaction(pin).setVisible(true);
                }catch(Exception e){
                    System.out.println(e);
                }
            }
        }
    }

    public static void main(String args[]){
        new withdraw("");
    }
    
}
