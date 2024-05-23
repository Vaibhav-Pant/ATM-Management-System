import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class SignUp2 extends JFrame implements ActionListener {

    JTextField aadharfield,panfield;
    JRadioButton seniorYes, seniorNo, existYes, existNo;
    JButton next;
    JComboBox<String> religiondbox, categorydbox, incomedbox, qualdbox, occupationdbox;
    String formno;

    SignUp2(String formno) {
        this.formno = formno;
        setLayout(null);

        JLabel addDetails = new JLabel("Page 2: Additional Details");
        addDetails.setBounds(180, 30, 300, 40);
        addDetails.setFont(new Font("Times new Roman", Font.ROMAN_BASELINE, 20));
        add(addDetails);

        // Religion and Drop down
        JLabel religion = new JLabel("Religion:");
        religion.setBounds(60, 100, 200, 30);
        religion.setFont(new Font("Calibri", Font.ROMAN_BASELINE, 18));
        add(religion);

        String valReligion[] = { "Hindu", "Muslim", "Sikh", "Christian", "Others" };
        religiondbox = new JComboBox<>(valReligion);
        religiondbox.setBounds(200, 100, 300, 20);
        religiondbox.setBackground(Color.white);
        add(religiondbox);

        // Category and drop down box
        JLabel Category = new JLabel("Category:");
        Category.setBounds(60, 140, 200, 30);
        Category.setFont(new Font("Calibri", Font.ROMAN_BASELINE, 18));
        add(Category);

        String valCategory[] = { "General", "SC", "ST", "OBS", "Others" };
        categorydbox = new JComboBox<>(valCategory);
        categorydbox.setBounds(200, 140, 300, 20);
        categorydbox.setBackground(Color.white);
        add(categorydbox);

        // Income and text field
        JLabel Income = new JLabel("Income:");
        Income.setBounds(60, 180, 200, 30);
        Income.setFont(new Font("Calibri", Font.ROMAN_BASELINE, 18));
        add(Income);

        String valIncome[] = { "Null", "< 1,50,000>", "< 2,50,000>", "< 5,00,000", "Upto 10,00,000" };
        incomedbox = new JComboBox<>(valIncome);
        incomedbox.setBounds(200, 180, 300, 20);
        incomedbox.setBackground(Color.white);
        add(incomedbox);

        // Qualification and drop down box
        JLabel qualification = new JLabel("Qualification:");
        qualification.setBounds(60, 220, 200, 30);
        qualification.setFont(new Font("Calibri", Font.ROMAN_BASELINE, 18));
        add(qualification);

        String valQual[] = { "Non-Graduation", "Graduate", "Post-Graduate", "Doctrate", "Others" };
        qualdbox = new JComboBox<>(valQual);
        qualdbox.setBounds(200, 220, 300, 20);
        qualdbox.setBackground(Color.white);
        add(qualdbox);

        // Occupation and drop down box
        JLabel occupation = new JLabel("Occupation:");
        occupation.setBounds(60, 260, 200, 30);
        occupation.setFont(new Font("Calibri", Font.ROMAN_BASELINE, 18));
        add(occupation);

        String valOccup[] = { "Salaried", "Self-Employed", "Bussiness", "Student", "Retired", "Others" };
        occupationdbox = new JComboBox<>(valOccup);
        occupationdbox.setBounds(200, 260, 300, 20);
        occupationdbox.setBackground(Color.white);
        add(occupationdbox);

        // Pan number and text field
        JLabel pan = new JLabel("PAN Number:");
        pan.setBounds(60, 300, 200, 30);
        pan.setFont(new Font("Calibri", Font.ROMAN_BASELINE, 18));
        add(pan);

        panfield = new JTextField();
        panfield.setBounds(200, 300, 300, 20);
        add(panfield);

        // Address and textfield
        JLabel aadhar = new JLabel("Aadhar Number:");
        aadhar.setBounds(60, 340, 200, 30);
        aadhar.setFont(new Font("Calibri", Font.ROMAN_BASELINE, 18));
        add(aadhar);

        aadharfield = new JTextField();
        aadharfield.setBounds(200, 340, 300, 20);
        add(aadharfield);

        // Senior citizen and radio button
        JLabel senior = new JLabel("Senior Citizen:");
        senior.setBounds(60, 380, 200, 30);
        senior.setFont(new Font("Calibri", Font.ROMAN_BASELINE, 18));
        add(senior);

        seniorYes = new JRadioButton("Yes");
        seniorYes.setBounds(200, 380, 100, 30);
        seniorYes.setBackground(Color.white);
        add(seniorYes);

        seniorNo = new JRadioButton("No");
        seniorNo.setBounds(300, 380, 100, 30);
        seniorNo.setBackground(Color.white);
        add(seniorNo);

        ButtonGroup seniorgrp = new ButtonGroup();
        seniorgrp.add(seniorNo);
        seniorgrp.add(seniorYes);

        // Existing Accound and Radio button
        JLabel existing = new JLabel("Existing Account:");
        existing.setBounds(60, 420, 200, 30);
        existing.setFont(new Font("Calibri", Font.ROMAN_BASELINE, 18));
        add(existing);

        existYes = new JRadioButton("Yes");
        existYes.setBounds(200, 420, 100, 30);
        existYes.setBackground(Color.white);
        add(existYes);

        existNo = new JRadioButton("No");
        existNo.setBounds(300, 420, 100, 30);
        existNo.setBackground(Color.white);
        add(existNo);

        ButtonGroup existinggrp = new ButtonGroup();
        existinggrp.add(existNo);
        existinggrp.add(existYes);

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
        // getContentPane().setBackground(Color.decode("#344955"));
        setTitle("New Account Application form - Page 2");

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String religion = (String) religiondbox.getSelectedItem();
        String Category = (String) categorydbox.getSelectedItem();
        String Income = (String) incomedbox.getSelectedItem();
        String qualification = (String) qualdbox.getSelectedItem();
        String occupation = (String) occupationdbox.getSelectedItem();
        String panNumber = panfield.getText();
        String aadharNumber = aadharfield.getText();
        String senior = null;
        if (seniorYes.isSelected()) {
            senior = "Yes";
        } else if (seniorNo.isSelected()) {
            senior = "No";  
        }
        String existing = null;
        if (existYes.isSelected()) {
            existing = "Yes";
        } else if (existNo.isSelected()) {
            existing = "No";
        }

        try {
            mysql c = new mysql();
            String query = "insert into signuptwo values('" + formno + "', '" + religion + "', '" + Category + "', '"
                    + Income + "', '" + qualification + "', '" + occupation + "', '" + panNumber + "', '" + aadharNumber
                    + "', '" + senior + "', '" + existing + "')";
            c.s.executeUpdate(query);
            setVisible(false);
            new SignUp3(formno).setVisible(true);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        new SignUp2("");
    }
}