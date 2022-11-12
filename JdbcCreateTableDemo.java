import java.sql.*;

public class JdbcCreateTableDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
        Statement st= con.createStatement();
        st.executeUpdate("create table employee(eID int(20) primary key auto_increment, eName varchar(200) not null, eSal int(10) , eCity varchar(200))");
        System.out.println("Table Created Successfully");
        con.close();
    }
}