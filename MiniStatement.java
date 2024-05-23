import java.awt.*;
import java.sql.ResultSet;
import javax.swing.*;   
import java.util.*;
import java.text.*;  


class MiniStatement extends JFrame{

    String pin;
    JButton back;
    MiniStatement(String pin)
    {
        this.pin = pin;

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        String data= dateFormat.format(date);
        String str_date = data.substring(0,10);
        String str_time = data.substring(11);

        setLayout(null);

        JLabel bankName = new JLabel("King's Bank");
        bankName.setBounds(180,20,200,25);
        bankName.setFont(new Font("Times New Roman", Font.BOLD, 20));
        bankName.setForeground(new Color(156, 91, 194));
        add(bankName);

        //  Date heading
        JLabel d_date = new JLabel("DATE");
        d_date.setBounds(100,50,100,20);
        d_date.setFont(new Font("Times New Roman", Font.BOLD, 18));
        d_date.setForeground(new Color(156, 91, 194));
        add(d_date);

        //  Time heading
        JLabel d_time = new JLabel("TIME");
        d_time.setBounds(300,50,100,20);
        d_time.setFont(new Font("Times New Roman", Font.BOLD, 18));
        d_time.setForeground(new Color(156, 91, 194));
        add(d_time);
        
        //  date
        JLabel dis_date = new JLabel(" "+str_date+" ");
        dis_date.setBounds(80,80,200,20);
        dis_date.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(dis_date);

        // Time
        JLabel dis_time = new JLabel(""+str_time+"");
        dis_time.setBounds(280,80,100,20);
        dis_time.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(dis_time);

        //  Carnumber display
        JLabel cardNumDisp = new JLabel();
        cardNumDisp.setBounds(70,120,400,30);
        cardNumDisp.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(cardNumDisp);

        // Detials  label
        JLabel types = new JLabel("DATE                                         TYPE       AMOUNT");
        types.setBounds(60,220,400,30);
        types.setFont(new Font("Times New Roman", Font.BOLD, 16));
        types.setForeground(new Color(156, 91, 194));
        add(types);
        
        // label for bank detials
        JLabel details = new JLabel();
        details.setBounds(50,100,400,500);
        details.setFont(new Font("Times New Roman", Font.BOLD, 16));
        add(details);
        
        
        // Balance Amount
        JLabel amount = new JLabel();
        amount.setBounds(50,500,300,20);
        amount.setFont(new Font("Times New Roman", Font.BOLD, 20));
        amount.setForeground(new Color(156, 91, 194));
        add(amount);

        // Card Number
        try{
            mysql c = new mysql();
            ResultSet rs = c.s.executeQuery("select cardNumber from login where PinNumber = '"+pin+"' ");
            while (rs.next()) {   
                cardNumDisp.setText("CARD NO.  :     " + rs.getString("cardNumber").substring(0,4) + "XXXXXXXX" + rs.getString("cardNumber").substring(12) );
            }
        }catch(Exception e){
            System.out.println(e);
        }

        // Details last 5 
        try{
            int i = 0;
            mysql c = new mysql();
            ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pin+"' ");
            // rs.last();
            while (i < 5){   
                if(i == 0){
                    rs.last();
                }else if(i > 0){
                    rs.previous();
                }
                details.setText(details.getText() +  "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;" +  rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br></br><br></br> <html>");
                i++;
            }

        }catch(Exception e){
            System.out.println(e);
        }

        // Balance
        try{
            mysql c = new mysql();
            ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pin+"' ");
            int balance = 0;
            while(rs.next()){
                if(rs.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));    
                }else{
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
            
            amount.setText("Balance:        Rs." + " "+balance+" ");

        }catch(Exception e){
            System.out.println(e);
        }




        setSize(500,600);
        setLocation(300,50);
        // setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String args[]){
        new MiniStatement("");
    }
    
}
