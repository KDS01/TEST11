package c231016;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.eclipse.jdt.internal.compiler.ast.ThrowStatement;

public class JdbcContextUserDAO {
	private DataSource dataSource;
	
	public JdbcContextUserDAO(DataSource dataSource) {
		this.dataSource=dataSource;
	}
	
	public void jdbcContextWithStatementStrategy(StatementStrategy stmt) throws SQLException {
		Connection conn=null;
		PreparedStatement pstmt =null;
		try {
			conn = dataSource.getConnection();
			pstmt = stmt.makePstmt(conn);
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
	public void add(UserBean user) throws SQLException{
		jdbcContextWithStatementStrategy(new StatementStrategy() {
			public PreparedStatement makePstmt(Connection con) throws SQLException {
				PreparedStatement pstmt = con.prepareStatement("insert into users (name, user_id, password) values (?, ?, ?)");
				pstmt.setString(1, user.getName());
				pstmt.setString(2, user.getUserId());
				pstmt.setString(3, user.getPassword());
				
				return pstmt;
				
			}
		});
	}
		
				
}


