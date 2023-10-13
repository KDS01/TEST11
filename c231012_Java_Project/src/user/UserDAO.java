package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import connection.ConnectionMaker;
import connection.OracleCM;
import user.UserBean;
import user.UserDAO;

public class UserDAO {
	private ConnectionMaker maker;//오로지 커넥션만을 위한 커넥션메이커 클래스를 새로 만들어서, 기능을 분리한다.
	private Connection con;
	public UserBean getUserinfo(int id) throws Exception {
		UserBean temp=null;
		String query="select * from users where id=?";
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			temp=new UserBean(
					rs.getString("name"),
					rs.getString("userId"),
					rs.getString("passWord")
					);
		}
		return temp;
	}
	public UserDAO(ConnectionMaker maker) {
		this.maker=maker;//
	}
	public void add(UserBean user)throws Exception {//유저의 정보를 입력하는 메서드
		Connection con=maker.makeConnection();
		String query="insert into users(name,user_id,password) values (?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setString(1, user.getName());
		pstmt.setString(2, user.getUserId());
		pstmt.setString(3, user.getPassWord());
		pstmt.executeUpdate();//업데이트해줌
		pstmt.close();
		con.close();
		}
	public UserBean get(String userId) throws Exception {//id를 이용해서 유저의 정보를 가져오는 메서드
		Connection con=maker.makeConnection();
		String query="select * from users where user_id=?";
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setString(1, userId);
		ResultSet rs =pstmt.executeQuery();
		UserBean user=null;//return이 close보다 아래에 있어야 초기화되지 않으므로,
		//result셋을 먼저 한 다음에 리턴값인 user를 설정하여 if문 안에서 값을 넣은 후 리턴
		if(rs.next()){
			user=new UserBean();
			user.setId(rs.getInt("id"));
			user.setName(rs.getString("name"));
			user.setUserId(rs.getString("user_Id"));
			user.setPassWord(rs.getString("passWord"));
		}
		pstmt.close();
		con.close();
		return user;
	}

	private void connect() throws Exception {
		Context ctx = new InitialContext();// 초기화된 컨텍스트
//		initialize => 초기화 함수
		Context envContext=(Context) ctx.lookup("java:/comp/env");
		DataSource dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
		con=dataFactory.getConnection();
		
		}
	

}
