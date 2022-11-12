import java.sql.*;
import java.io.*;
class JdbcDemo
{
	public static void main(String[] args)throws Exception{
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/youtube";
		String username="root";
		String password="ismail@123";
		
		Connection con=DriverManager.getConnection(url,username,password);//create a connection
		//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","ismail@123");
		//String q="create table table1(tID int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(200))";
		
		
		
		String yn;
		do{
		String q="insert into table1(tName,tCity) values(?,?)";  //create statement(Dynamic query)
		//get the PreparedStatement object
		PreparedStatement p=con.prepareStatement(q);
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name :");
		String name=br.readLine();
		
		System.out.println("Enter city :");
		String city=br.readLine();
		//set the values
		p.setString(1,name);
		p.setString(2,city);
		
	
		p.executeUpdate();
		System.out.println();
		System.out.println("Inserted...");
		System.out.println("Do u want to continue(Press y for Yes and no for No)");
    yn=br.readLine();
   }while(yn.equals("y")||yn.equals("Y"));
		
		con.close();
		
		/*Statement s=con.createStatement();
		s.executeUpdate(q);
		System.out.println("table created in database..");
		con.close();*/
		
		/*if(con.isClosed()){
			System.out.println("Connection is Closed");
		}
		else{
			System.out.println("Connection Created...");
		}*/
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
/*
1)load the driver:
	Class.forName("com.mysql.jdbc.Driver");

2)create connection:
	Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dbname","root","root");

3)Create query,Statement ,PreparedStatement,CallableStatement eg
	String q="select * from students";
	Statement st=con.createStatement();
	ResultSet set=st.executeQuery(q);

4)Process the data
	while(set.next())
{
	int id=set.getInt("studentId");
	String name=set.getString("studentName");
	System.out.println(id);
	System.out.println(name);
}

5)Close the connection:
    con.close();
	*/