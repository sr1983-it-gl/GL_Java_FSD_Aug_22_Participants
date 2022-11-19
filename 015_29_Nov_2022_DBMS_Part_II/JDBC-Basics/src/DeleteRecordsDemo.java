
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecordsDemo {

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
			
			String deleteQuery = 
				String.format(
				"delete from book where Category = '%s'", "Fantasy");
			int noOfRowsAffected = statement.executeUpdate(deleteQuery);
			
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
