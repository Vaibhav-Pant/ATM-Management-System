import java.awt.*;
import java.awt.event.*;
import javax.swing.*;   
import java.sql.*;

class LoginPage extends JFrame implements ActionListener{

    JButton signin, signup, clear;
    JTextField cardfield;
    JPasswordField pinfield;


    LoginPage()
    {
        setLayout(null);
        try{

            // bank icon
            ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("images/bank1.png"));
            Image i2 = img.getImage().getScaledInstance(80,80, Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel label = new JLabel(i3);
            // Coordinates of bank icon
            label.setBounds(100,40,80,80);
            add(label);

        } catch(Exception e){
            System.out.println("Image not found!");
        }


        // Text after bank icon.
        JLabel text  = new JLabel("Welcome to King_ATM");
        text.setBounds(250,60,1000, 60);
        text.setFont(new Font("Times new Roman", Font.BOLD, 30));
        add(text);

        // Card number
        JLabel card  = new JLabel("Card Number:");
        card.setBounds(170,200,400, 30);
        card.setFont(new Font("Times new Roman", Font.BOLD, 26));
        add(card);

        // card number textx field
        cardfield = new JTextField();
        cardfield.setBounds(400, 200, 200, 30);
        add(cardfield);



        // Pin number
        JLabel pin  = new JLabel("Pin: ");
        pin.setBounds(170,250,400, 30);
        pin.setFont(new Font("Times new Roman", Font.BOLD, 26));
        add(pin);

        // pin number text field
        pinfield = new JPasswordField();
        pinfield.setBounds(400, 250, 200, 30);
        add(pinfield);




        // Signin, clear, sign up buttons
        signin = new JButton("SIGN IN");
        signin.setBounds(300, 350, 80, 30);
        signin.setBackground(Color.black);
        signin.setForeground(Color.white);
        signin.setBorderPainted(false);
        signin.setFocusPainted(false);
        signin.addActionListener(this);
        add(signin);


        clear = new JButton("CLEAR");
        clear.setBounds(420, 350, 80, 30);
        clear.setBackground(Color.black);
        clear.setForeground(Color.white);
        clear.setBorderPainted(false);
        clear.setFocusPainted(false);
        clear.addActionListener(this);
        // clear.setContentAreaFilled(false);
        add(clear);

        signup = new JButton("SIGN UP");
        signup.setBounds(300, 400, 200, 30);
        signup.setBackground(Color.black);
        signup.setForeground(Color.white);
        signup.setBorderPainted(false);
        signup.setFocusPainted(false);
        signup.addActionListener(this);
        add(signup);


        setSize(800, 600);
        setVisible(true);
        setResizable(false);
        setLocation(400,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);
        setTitle("ATM Management System");
        
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == signin){
            mysql c = new mysql();
            String cardnumber = cardfield.getText();
            String pinnumber = String.valueOf(pinfield.getPassword());
            String query = "select * from login where cardNumber = '"+cardnumber+"' and PinNumber = '"+pinnumber+"'";
            try{
                ResultSet res = c.s.executeQuery(query);
                if(res.next()){
                    setVisible(false);
                    new transaction(pinnumber).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Cardnumber or Pin");
                    cardfield.setText("");
                    pinfield.setText("");
                }   
            }catch(Exception e){
                System.out.println(e);
            }
        }
        else if(ae.getSource() == clear){
            cardfield.setText("");
            pinfield.setText("");
        }
        else if(ae.getSource() == signup){
            setVisible(false);
            new SignUp1().setVisible(true);
        }
    }


    public static void main(String args[])
    {
        new LoginPage();
    }

}