
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecordsDemo {

	public static void main(String[] args) {
		
		
		String mySqlDriverClassName 
		= ApplicationConstants.DRIVER_CLASS_NAME;
		
		try {
			Class.forName(mySqlDriverClassName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String connectionUrl = ApplicationConstants.CONNECTION_URL;
		
		Connection connection = null;
		Statement statement = null;

		try {
			
			connection = DriverManager.getConnection(
					connectionUrl,
					ApplicationConstants.USERNAME,
					ApplicationConstants.PASSWORD);

			System.out.println("Database Connection DONE");		
						
			statement = connection.createStatement();
			
			String insertQuery = 
			"insert into book (Book_Id, Book_Name, Category, Total_Quantity) "
		  + "values (100, 'Harry Potter', 'Fantasy', 1000) ";
			
			int noOfRowsAffected = statement.executeUpdate(insertQuery);
			
			System.out.println("No of row affected " + noOfRowsAffected);
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
					
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (connection != null) {
				
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}			
		}
	}
}
