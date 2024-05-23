import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;

class SignUp1 extends JFrame implements ActionListener {

    JTextField namefield, fnamefield, emailfield, addressfield, cityfield, statefield, pincodefield;
    JButton next;
    JRadioButton malebtn, femalebtn, othersbtn, married, notMarried, otherMarried;
    JDateChooser dobfield;
    String formNo = "2912";  // A fixed number,, you can take a random number also

    SignUp1() {
        setLayout(null);

        JLabel heading = new JLabel("Application Forn No. 2912");
        heading.setBounds(120, 20, 500, 40);
        heading.setFont(new Font("Times new Roman", Font.BOLD, 26));
        add(heading);

        JLabel pageno = new JLabel("Page 1: Personal Details");
        pageno.setBounds(180, 50, 300, 40);
        pageno.setFont(new Font("Times new Roman", Font.ROMAN_BASELINE, 20));
        add(pageno);

        // Name and text field
        JLabel name = new JLabel("Name:");
        name.setBounds(60, 100, 200, 30);
        name.setFont(new Font("Calibri", Font.ROMAN_BASELINE, 18));
        add(name);

        namefield = new JTextField();
        namefield.setBounds(200, 100, 300, 20);
        add(namefield);

        // Father name andd field
        JLabel fname = new JLabel("Father's Name:");
        fname.setBounds(60, 140, 200, 30);
        fname.setFont(new Font("Calibri", Font.ROMAN_BASELINE, 18));
        add(fname);

        fnamefield = new JTextField();
        fnamefield.setBounds(200, 140, 300, 20);
        add(fnamefield);

        // Date of birth and Calendar
        JLabel dob = new JLabel("Date of Birth:");
        dob.setBounds(60, 180, 200, 30);
        dob.setFont(new Font("Calibri", Font.ROMAN_BASELINE, 18));
        add(dob);

        dobfield = new JDateChooser();
        dobfield.setBounds(200, 180, 300, 20);
        dobfield.setForeground(Color.black);
        add(dobfield);

        // Gender and radio button
        JLabel gender = new JLabel("Gender:");
        gender.setBounds(60, 220, 200, 30);
        gender.setFont(new Font("Calibri", Font.ROMAN_BASELINE, 18));

        malebtn = new JRadioButton("Male");
        malebtn.setBounds(200, 220, 100, 20);
        malebtn.setBackground(Color.white);

        femalebtn = new JRadioButton("Female");
        femalebtn.setBounds(300, 220, 100, 20);
        femalebtn.setBackground(Color.white);

        othersbtn = new JRadioButton("Others");
        othersbtn.setBounds(400, 220, 100, 20);
        othersbtn.setBackground(Color.white);

        ButtonGroup gendergrp = new ButtonGroup();
        gendergrp.add(malebtn);
        gendergrp.add(femalebtn);
        gendergrp.add(othersbtn);

        add(gender);
        add(malebtn);
        add(femalebtn);
        add(othersbtn);

        // Email address and textfield
        JLabel email = new JLabel("Email Address:");
        email.setBounds(60, 260, 200, 30);
        email.setFont(new Font("Calibri", Font.ROMAN_BASELINE, 18));
        add(email);

        emailfield = new JTextField();
        emailfield.setBounds(200, 260, 300, 20);
        add(emailfield);

        // Marital status and radio button
        JLabel marital = new JLabel("Marital Status:");
        marital.setBounds(60, 300, 200, 30);
        marital.setFont(new Font("Calibri", Font.ROMAN_BASELINE, 18));
        add(marital);

        married = new JRadioButton("Married");
        married.setBounds(200, 300, 100, 20);
        married.setBackground(Color.white);

        notMarried = new JRadioButton("Unmarried");
        notMarried.setBounds(300, 300, 100, 20);
        notMarried.setBackground(Color.white);

        otherMarried = new JRadioButton("Others");
        otherMarried.setBounds(400, 300, 100, 20);
        otherMarried.setBackground(Color.white);

        ButtonGroup marriedgrp = new ButtonGroup();
        marriedgrp.add(married);
        marriedgrp.add(notMarried);
        marriedgrp.add(otherMarried);

        add(married);
        add(notMarried);
        add(otherMarried);

        // Address and textfield
        JLabel address = new JLabel("Address:");
        address.setBounds(60, 340, 200, 30);
        address.setFont(new Font("Calibri", Font.ROMAN_BASELINE, 18));
        add(address);

        addressfield = new JTextField();
        addressfield.setBounds(200, 340, 300, 20);
        add(addressfield);

        // City and field
        JLabel city = new JLabel("City:");
        city.setBounds(60, 380, 200, 30);   
        city.setFont(new Font("Calibri", Font.ROMAN_BASELINE, 18));
        add(city);

        cityfield = new JTextField();
        cityfield.setBounds(200, 380, 300, 20);
        add(cityfield);

        // State and field
        JLabel state = new JLabel("State:");
        state.setBounds(60, 420, 200, 30);
        state.setFont(new Font("Calibri", Font.ROMAN_BASELINE, 18));
        add(state);

        statefield = new JTextField();
        statefield.setBounds(200, 420, 300, 20);
        add(statefield);

        // Pin code and field
        JLabel pincode = new JLabel("Pin Code:");
        pincode.setBounds(60, 460, 200, 30);
        pincode.setFont(new Font("Calibri", Font.ROMAN_BASELINE, 18));
        add(pincode);

        pincodefield = new JTextField();
        pincodefield.setBounds(200, 460, 300, 20);
        add(pincodefield);

        // Next page
        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(400, 500, 100, 30);
        next.setBorder(null);
        next.setBorderPainted(false);
        next.setFocusPainted(false);
        next.addActionListener(this);
        add(next);

        setSize(600, 600);
        setVisible(true);
        setResizable(false);
        setLocation(400,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);
        setTitle("Sign Up page");

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String formno = formNo;
        String name = namefield.getText();
        String fname = fnamefield.getText();
        String dob = ((JTextField) dobfield.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (malebtn.isSelected()) {
            gender = "Male";
        } else if (femalebtn.isSelected()) {
            gender = "Female";
        } else if (othersbtn.isSelected()) {
            gender = "Others";
        }

        String email = emailfield.getText();
        String marital = null;
        if (married.isSelected()) {
            marital = "Married";
        } else if (notMarried.isSelected()) {
            marital = "UnMarried";
        } else if (otherMarried.isSelected()) {
            marital = "Other";
        }

        String address = addressfield.getText();
        String city = cityfield.getText();
        String state = statefield.getText();
        String pincode = pincodefield.getText();

        try {
            mysql c = new mysql();
            String query = "insert into signup values('" + formno + "', '" + name + "', '" + fname + "', '" + dob
                    + "', '" + gender + "', '" + email + "', '" + marital + "', '" + address + "', '" + city + "', '"
                    + state + "', '" + pincode + "')";

            c.s.executeUpdate(query);

            setVisible(false);
            new SignUp2(formNo);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        new SignUp1();
    }
}