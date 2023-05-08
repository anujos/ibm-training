import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.DatabaseMetaData;
import com.mysql.cj.jdbc.Driver;


public class ConnectionDemo {
public static void main(String[] args) {
	
	String url = "jdbc:mysql://localhost:3306/ibm";
	try {
		DriverManager.registerDriver(new Driver());
		Connection conn =DriverManager.getConnection(url,"root", "pass@word1");
		System.out.println("connected successfully");
		
		java.sql.DatabaseMetaData meta = conn.getMetaData();
		System.out.println("DB NAME: " +meta.getDatabaseProductName());
		System.out.println("DB var: " +meta.getDatabaseProductVersion());
		System.out.println("DB NAME: " +meta.getDriverName());
		System.out.println("DB NAME: " +meta.getDriverVersion());

	} catch (SQLException e) {
		System.out.println("connection failed");// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
