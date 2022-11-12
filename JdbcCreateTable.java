import java.sql.*;
class JdbcCreateTable
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","ismail@123");
		Statement s=con.createStatement();
		s.executeUpdate("create table employees(eno int(3),ename varchar(10),esal int(10),eadd varchar(10))");
		System.out.println("Table created successfully");
	}
}