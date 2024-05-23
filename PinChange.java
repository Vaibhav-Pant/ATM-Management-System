import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class PinChange extends JFrame implements ActionListener {

    JPasswordField newPin, rePin;
    JButton change, back;
    String pin;

    PinChange(String pin) {
        this.pin = pin;
        setLayout(null);

        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("images/atm.jpg"));
        Image i1 = img.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i1);

        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 800);
        add(image);

        JLabel heading = new JLabel("CHANGE PIN NUMBER");
        heading.setBounds(220, 220, 400, 50);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 20));
        heading.setForeground(new Color(103, 155, 104));
        image.add(heading);

        JLabel newpin = new JLabel("New PIN: ");
        newpin.setBounds(180, 300, 200, 20);
        newpin.setFont(new Font("Times New Roman", Font.BOLD, 18));
        newpin.setForeground(new Color(103, 155, 104));
        image.add(newpin);

        // Enter the new pin
        newPin = new JPasswordField();
        newPin.setFont(new Font("Times New Roman", Font.BOLD, 18));
        newPin.setBounds(350, 300, 150, 20);
        image.add(newPin);

        JLabel pinconfirm = new JLabel("Re-Enter New PIN: ");
        pinconfirm.setBounds(180, 350, 200, 20);
        pinconfirm.setFont(new Font("Times New Roman", Font.BOLD, 18));
        pinconfirm.setForeground(new Color(103, 155, 104));
        image.add(pinconfirm);

        // Confirm pin
        rePin = new JPasswordField();
        rePin.setFont(new Font("Times New Roman", Font.BOLD, 18));
        rePin.setBounds(350, 350, 150, 20);
        image.add(rePin);

        // Change pin button
        change = new JButton("Change");
        change.setBounds(400, 430, 100, 25);
        change.setBackground(new Color(103, 155, 104));
        change.setBorder(null);
        change.setBorderPainted(false);
        change.setFocusPainted(false);
        change.addActionListener(this);
        image.add(change);

        // back button move to back page.
        back = new JButton("Back");
        back.setBounds(400, 460, 100, 25);
        back.setBackground(new Color(103, 155, 104));
        back.setBorder(null);
        back.setBorderPainted(false);
        back.setFocusPainted(false);
        back.addActionListener(this);
        image.add(back);

        setSize(900, 800);
        setLocation(300, 50);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            setVisible(true);
            new transaction(pin).setVisible(true);
        } else {
            try {
                String num1 = String.valueOf(newPin.getPassword());
                String num2 = String.valueOf(rePin.getPassword());

                if (!num1.equals(num2)) {
                    JOptionPane.showMessageDialog(null, "PIN does not match");
                    newPin.setText("");
                    rePin.setText("");
                    return;
                } else if (num1.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter New PIN");
                    return;
                }else if (num2.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please re-enter New PIN");
                    return;
                }else{
                    mysql c = new mysql();
                    String query1 = "update bank set pin = '"+num1+"' where pin = '"+pin+"' ";
                    String query2 = "update login set PinNumber =  '"+num1+"' where PinNumber = '"+pin+"' ";
                    String query3 = "update signupthree set pin_number =  '"+num1+"' where pin_number = '"+pin+"' ";
                    c.s.executeUpdate(query1);
                    System.out.println("1");
                    c.s.executeUpdate(query2);
                    System.out.println("2");
                    c.s.executeUpdate(query3);
                    System.out.println("3");
                    JOptionPane.showMessageDialog(null, "PIN changed Succesfully");
                    JOptionPane.showMessageDialog(null, "Login again with New Pin");
                    setVisible(false);
                    new LoginPage().setVisible(true);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String args[]) {
        new PinChange("");
    }

}