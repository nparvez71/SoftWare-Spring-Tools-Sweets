package another;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.example.demo.Contact;
import com.example.demo.ContactDao;

public class PlainContact  implements ContactDao{
	
	
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException ex) {
			// noop
		}
	}	
	

	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");
	}
	

	private void closeConnection(Connection connection) {
		if (connection == null) return;
		
		try {
			connection.close();
		} catch (SQLException ex) {
			// noop
		}
	}


	@Override
	public List<Contact> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void insert(Contact contact) {
	Connection connection=null;
	try {
		connection=getConnection();
		PreparedStatement pstm=connection.prepareStatement(
				"insert into contact (first_name, last_name, birth_date) values (?, ?, ?)");
		pstm.setString(1, contact.getFirstName());
		pstm.setString(2, contact.getLastName());
		pstm.setDate(3, contact.getBirthDate());
		pstm.execute();
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		
	} finally {
		closeConnection(connection);
	}	
		
	}


	@Override
	public void update(Contact contact) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void delete(Long contactId) {
		// TODO Auto-generated method stub
		
	}	



}
