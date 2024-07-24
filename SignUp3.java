import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

class SignUp3 extends JFrame implements ActionListener {

    JButton submit, cancel;
    JRadioButton savingAcc, currentAcc, fdAcc, reccAcc;
    JCheckBox atmCard, internetBanking, mobileBanking, alerts, checqueBook, Estatement, declaration;
    String formno;

    SignUp3(String formno) {
        this.formno = formno;
        setLayout(null);

        JLabel addDetails = new JLabel("Page 3: Additional Details");
        addDetails.setBounds(180, 30, 300, 40);
        addDetails.setFont(new Font("Times new Roman", Font.BOLD, 20));
        add(addDetails);

        // Account type and 4 radio buttons
        JLabel accType = new JLabel("Account Type:");
        accType.setBounds(60, 80, 200, 30);
        accType.setFont(new Font("Calibri", Font.BOLD, 18));
        add(accType);

        savingAcc = new JRadioButton("Saving Account");
        savingAcc.setBounds(60, 120, 200, 30);
        savingAcc.setBackground(Color.white);
        savingAcc.setFont(new Font("Calibri", Font.ROMAN_BASELINE, 14));
        add(savingAcc);

        fdAcc = new JRadioButton("Fixed Deposit Account");
        fdAcc.setBackground(Color.white);
        fdAcc.setBounds(300, 120, 200, 30);
        fdAcc.setFont(new Font("Calibri", Font.ROMAN_BASELINE, 14));
        add(fdAcc);

        currentAcc = new JRadioButton("CurrentAccount");
        currentAcc.setBackground(Color.white);
        currentAcc.setBounds(60, 150, 200, 30);
        currentAcc.setFont(new Font("Calibri", Font.ROMAN_BASELINE, 14));
        add(currentAcc);

        reccAcc = new JRadioButton("Recurring Deposit Account");
        reccAcc.setBackground(Color.white);
        reccAcc.setBounds(300, 150, 300, 30);
        reccAcc.setFont(new Font("Calibri", Font.ROMAN_BASELINE, 14));
        add(reccAcc);

        ButtonGroup accTypegrp = new ButtonGroup();
        accTypegrp.add(savingAcc);
        accTypegrp.add(currentAcc);
        accTypegrp.add(fdAcc);
        accTypegrp.add(reccAcc);

        // Card Number and dummy number and 16 digit
        JLabel cardNumeber = new JLabel("Card Number:");
        cardNumeber.setBounds(60, 190, 200, 30);
        cardNumeber.setFont(new Font("Calibri", Font.BOLD, 18));
        add(cardNumeber);

        JLabel dummyCardNum = new JLabel("XXXX-XXXX-XXXX-4563");
        dummyCardNum.setBounds(300, 190, 300, 30);
        dummyCardNum.setFont(new Font("Calibri", Font.BOLD, 18));
        add(dummyCardNum);

        JLabel digitCardNum = new JLabel("Your 16 digit Card Number");
        digitCardNum.setBounds(60, 210, 200, 30);
        digitCardNum.setFont(new Font("Calibri", Font.ROMAN_BASELINE, 10));
        add(digitCardNum);

        // Pin and dummy pin and 4 digit
        JLabel pinNumber = new JLabel("PIN:");
        pinNumber.setBounds(60, 250, 200, 30);
        pinNumber.setFont(new Font("Calibri", Font.BOLD, 18));
        add(pinNumber);

        JLabel dummypinNum = new JLabel("XXXX");
        dummypinNum.setBounds(300, 250, 300, 30);
        dummypinNum.setFont(new Font("Calibri", Font.BOLD, 18));
        add(dummypinNum);

        JLabel digitPinNum = new JLabel("Your 4 digit Pin Number");
        digitPinNum.setBounds(60, 270, 200, 30);
        digitPinNum.setFont(new Font("Calibri", Font.ROMAN_BASELINE, 10));
        add(digitPinNum);

        // Service Required and 6 check box
        JLabel services = new JLabel("Services Required:");
        services.setBounds(60, 300, 200, 30);
        services.setFont(new Font("Calibri", Font.BOLD, 18));
        add(services);

        atmCard = new JCheckBox("ATM CARD");
        atmCard.setBounds(60, 340, 200, 30);
        atmCard.setFont(new Font("Calibri", Font.ROMAN_BASELINE, 18));
        atmCard.setBackground(Color.white);
        add(atmCard);

        internetBanking = new JCheckBox("Internet Banking");
        internetBanking.setBounds(300, 340, 200, 30);
        internetBanking.setFont(new Font("Calibri", Font.ROMAN_BASELINE, 18));
        internetBanking.setBackground(Color.white);
        add(internetBanking);

        mobileBanking = new JCheckBox("Mobile Banking");
        mobileBanking.setBounds(60, 380, 200, 30);
        mobileBanking.setFont(new Font("Calibri", Font.ROMAN_BASELINE, 18));
        mobileBanking.setBackground(Color.white);
        add(mobileBanking);

        alerts = new JCheckBox("EMAIL & SMS Alerts");
        alerts.setBounds(300, 380, 200, 30);
        alerts.setFont(new Font("Calibri", Font.ROMAN_BASELINE, 18));
        alerts.setBackground(Color.white);
        add(alerts);

        checqueBook = new JCheckBox("Cheque Book");
        checqueBook.setBounds(60, 420, 200, 30);
        checqueBook.setFont(new Font("Calibri", Font.ROMAN_BASELINE, 18));
        checqueBook.setBackground(Color.white);
        add(checqueBook);

        Estatement = new JCheckBox("E-Statement");
        Estatement.setBounds(300, 420, 200, 30);
        Estatement.setBackground(Color.white);
        Estatement.setFont(new Font("Calibri", Font.ROMAN_BASELINE, 18));
        add(Estatement);

        // declaration / condition
        declaration = new JCheckBox(
                "I hereby declares that the above entered details are correct to the best of my knowledge");
        declaration.setBounds(20, 480, 600, 30);
        declaration.setFont(new Font("Calibri", Font.ROMAN_BASELINE, 14));
        declaration.setBackground(Color.white);
        add(declaration);

        // Submit and cancel button
        submit = new JButton("Submit");
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.setBounds(150, 520, 100, 30);
        submit.setBorder(null);
        submit.setBorderPainted(false);
        submit.setFocusPainted(false);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.setBounds(300, 520, 100, 30);
        cancel.setBorder(null);
        cancel.setBorderPainted(false);
        cancel.setFocusPainted(false);
        cancel.addActionListener(this);
        add(cancel);

        setSize(600, 600);
        setVisible(true);
        setResizable(false);
        setLocation(400, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);
        setTitle("New Account Application form - Page 3");

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String accountType = null;
            if (savingAcc.isSelected()) {
                accountType = "Saving Account";
            } else if (currentAcc.isSelected()) {
                accountType = "Current Account";
            } else if (fdAcc.isSelected()) {
                accountType = "Fixed Deposit Account";
            } else if (reccAcc.isSelected()) {
                accountType = "Recurring Deposit Account";
            }

            Random random = new Random();
            String CardNumber = "" + Math.abs((random.nextLong() % 90000000L) + 5729209300000000L);
            String PinNumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);

            String facilities = "";
            if (atmCard.isSelected()) {
                facilities = facilities + " ATM Card";
            }
            if (internetBanking.isSelected()) {
                facilities = facilities + " Internet Banking";
            }
            if (mobileBanking.isSelected()) {
                facilities = facilities + " Mobile Banking";
            }
            if (alerts.isSelected()) {
                facilities = facilities + " Email & SMS Alerts";
            }
            if (checqueBook.isSelected()) {
                facilities = facilities + " Cheque Book";
            }
            if (Estatement.isSelected()) {
                facilities = facilities + " E-Statement";
            }

            try {
                if (!declaration.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Sign the Declaration.");
                } else {
                    mysql c = new mysql();
                    String query = "insert into signupthree values('" + formno + "', '" + accountType + "', '"
                            + CardNumber + "', '" + PinNumber + "', '" + facilities + "')";
                    String login = "insert into login values('" + formno + "','" + CardNumber + "', '" + PinNumber
                            + "')";
                    c.s.executeUpdate(query);
                    c.s.executeUpdate(login);
                    JOptionPane.showMessageDialog(null, "Card Number: " + CardNumber + "\n Pin: " + PinNumber);
                    setVisible(false);
                    new deposit(PinNumber).setVisible(true);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            // Cancle button
            JOptionPane.showMessageDialog(null, "Going back to Login page.");
            setVisible(false);
            new LoginPage().setVisible(true);
        }

    }

    public static void main(String args[]) {
        new SignUp3("");
    }
}