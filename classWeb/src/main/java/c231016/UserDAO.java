package c231016;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import c231016.ConnectionMaker;


public class UserDAO {
	private ConnectionMaker maker;
	private DataSource dataSource;
	
	public UserDAO(ConnectionMaker maker) {
		this.maker = maker;
//		new DAOFactory().userDAO();
//		ApplicationContext context = new AnnotationConfigApplicationContext(DAOFactory.class);
//		this.maker = context.getBean("connectionMaker", ConnectionMaker.class);
	}

	public UserDAO(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void add(UserBean user) throws SQLException {
		PreparedStatement pstmt=null;
		Connection conn=null;
		try {
			conn = dataSource.getConnection();
			String query = "insert into users (name, user_id, password) values (?, ?, ?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getUserId());
			pstmt.setString(3, user.getPassword());
			pstmt.executeUpdate();

		} catch (Exception e) {
			throw e;
			// TODO: handle exception
		}
		finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			if(conn!=null) {
				conn.close();	
			}

		}
	}

	public UserInterface get(String userId) throws Exception {
//		Connection conn = maker.makeConnection();
		Connection conn = dataSource.getConnection();
		
		String query = "select * from users where user_id=?";
		PreparedStatement pstmt = conn.prepareStatement(query);

		pstmt.setString(1, userId);
		ResultSet rs = pstmt.executeQuery();
		
		UserInterface user = null;
		
		if(rs.next()) {
			user = new UserBean();
			user.setId(rs.getInt("id"));
			user.setName(rs.getString("name"));
			user.setUserId(rs.getString("user_id"));
			user.setPassword(rs.getString("password"));
		}
		
		rs.close();
		pstmt.close();
		conn.close();
		return user;
	}

}