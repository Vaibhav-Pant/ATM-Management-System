import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

import javax.swing.*;   
import java.util.*;

class FastCash extends JFrame implements ActionListener{

    JButton rs100, rs500, rs1000, rs2000, rs5000, rs10000, back;
    String pin;
    FastCash(String pin)
    {
        this.pin = pin;
        setLayout(null);

        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("images/atm.jpg"));
        Image i1 = img.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i1);

        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,800);
        add(image); 

        JLabel heading = new JLabel("SELECT WITHDRAWL AMOUNT");
        heading.setBounds(190, 250, 400,50);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 20));
        heading.setForeground(new Color(103, 155, 104));
        image.add(heading);

        rs100 = new JButton("Rs. 100");
        rs100.setBounds(180, 370, 100, 25);
        rs100.setBackground(new Color(103, 155, 104));
        rs100.setBorder(null);
        rs100.setBorderPainted(false);
        rs100.setFocusPainted(false);
        rs100.addActionListener(this);
        image.add(rs100);

        rs500 = new JButton("Rs. 500");
        rs500.setBounds(400, 370, 100, 25);
        rs500.setBackground(new Color(103, 155, 104));
        rs500.setBorder(null);
        rs500.setBorderPainted(false);
        rs500.setFocusPainted(false);
        rs500.addActionListener(this);
        image.add(rs500);

        rs1000 = new JButton("Rs. 1000");
        rs1000.setBounds(180, 400, 100, 25);
        rs1000.setBackground(new Color(103, 155, 104));
        rs1000.setBorder(null);
        rs1000.setBorderPainted(false);
        rs1000.setFocusPainted(false);
        rs1000.addActionListener(this);
        image.add(rs1000);
        
        rs2000 = new JButton("Rs. 2000");
        rs2000.setBounds(400, 400, 100, 25);
        rs2000.setBackground(new Color(103, 155, 104));
        rs2000.setBorder(null);
        rs2000.setBorderPainted(false);
        rs2000.setFocusPainted(false);
        rs2000.addActionListener(this);        
        image.add(rs2000);

        rs5000 = new JButton("Rs. 5000");
        rs5000.setBounds(180, 430, 100, 25);
        rs5000.setBackground(new Color(103, 155, 104));
        rs5000.setBorder(null);
        rs5000.setBorderPainted(false);
        rs5000.setFocusPainted(false);
        rs5000.addActionListener(this);
        image.add(rs5000);

        rs10000 = new JButton("Rs. 10000");
        rs10000.setBounds(400, 430, 100, 25);
        rs10000.setBackground(new Color(103, 155, 104));
        rs10000.setBorder(null);
        rs10000.setBorderPainted(false);
        rs10000.setFocusPainted(false);
        rs10000.addActionListener(this);
        image.add(rs10000);


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
        }else{

            String money = ((JButton)ae.getSource()).getText().substring(4);
            Date date = new Date();
            mysql c = new mysql();
            try{
                ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pin+"'");
                int balance = 0;
                while(rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(rs.getString("amount"));    
                    }else{
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }

                System.out.println(balance);

                // Check if money asked is less thann balance and same time exit button is not clicked.
                if(Integer.parseInt(money) > balance  && ae.getSource() != back){
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    setVisible(false);
                    new transaction(pin).setVisible(true);
                    return;
                }

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

    public static void main(String args[]){
        new FastCash("");
    }
    
}
