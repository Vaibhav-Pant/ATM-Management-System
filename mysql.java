import java.sql.*;

public class mysql {
    Connection c;
    Statement s;

    public mysql() {
        try {
            // Class.forName(com.mysql.cj.jdbc.Driver)
            c = DriverManager.getConnection("jdbc:mysql:///atm", "<Your Username>", "<Your>");
            s = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
