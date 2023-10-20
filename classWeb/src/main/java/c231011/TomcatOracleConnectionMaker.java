package c231011;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class TomcatOracleConnectionMaker implements ConnectionMaker {
	public Connection makeConnection()throws Exception {
			Context ctx = new InitialContext();// 초기화된 컨텍스트
//			initialize => 초기화 함수
			Context envContext=(Context) ctx.lookup("java:/comp/env");
			DataSource dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
			return dataFactory.getConnection();
	}

}
