package c230915;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class Main {
	public static void main(String[] args) {
		try {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521/xe",
				"java",
				"qwer"
				);
//		String query1 ="select * from student";
//		Statement stmt1 = con.createStatement();
//		ResultSet rs1 = stmt1.executeQuery(query1);
//		String insertQuery = "insert into student (idnumber,name, nickname, password,age,gitaddress) values (?,?,?,?,?,?)";
//		PreparedStatement pstmt = con.prepareStatement(insertQuery);
//		//준비된 statement, (?로써 정의함으로, 호출해서 추가할 수 있도록 함)
//		pstmt.setInt(1, 9);
//		pstmt.setString(2, "송성민");// setString(몇 번째 물음표, "들어갈 내용")
//		pstmt.setString(3, "ssm");// setString(몇 번째 물음표, "들어갈 내용")
//		pstmt.setString(4, "2631");// setString(몇 번째 물음표, "들어갈 내용")
//		pstmt.setInt(5, 23);// setString(몇 번째 물음표, "들어갈 내용")
//		pstmt.setString(6, "송성민.git");// setString(몇 번째 물음표, "들어갈 내용")
//		
//		pstmt.executeUpdate();//정보를 넣어준다.
		String query ="select * from student";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next()) {
			System.out.println(rs.getString("name")+ " : " + rs.getInt("age"));
		}
		con.close();
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
}
