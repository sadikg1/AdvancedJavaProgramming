import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Database {
	Connection con;
	public Database() throws ClassNotFoundException, SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String server="//SADIK";
		String database="JavaDatabase";
		int port= 1433;
		String constring="jdbc:sqlserver:"+server+":"+port+";databaseName="+database+
				";integratedSecurity=true;encrypt=true;trustServerCertificate=true";
		con=DriverManager.getConnection(constring);
		System.out.println("Connection Obtained");
		
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new Database();
		// TODO Auto-generated method stub

	}

}
