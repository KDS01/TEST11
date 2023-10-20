package c231013;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import c231011.ConnectionMaker;
import c231011.OracleConnectionMaker;
import c231011.TomcatOracleConnectionMaker;
import oracle.jdbc.driver.OracleDriver;
import c231011.UserDAO;

public class DAOFactory {
		public UserDAO userDAO() {
			return new UserDAO(dataSource());
		}
		private UserDAO USERDAOINSTANCE;
		private ConnectionMaker CONNECTIONMAKERINSTANCE;
		@Bean
		public ConnectionMaker connectionMaker() {
			if(CONNECTIONMAKERINSTANCE==null) CONNECTIONMAKERINSTANCE = new OracleConnectionMaker();
			return CONNECTIONMAKERINSTANCE;
		}
		@Bean
		public UserDAO boardDAO() {
			return new OracleConnectionMaker();
		}
		@Bean
		public UserDAO productDAO() {
			return new OracleConnectionMaker();
		}
		@Bean
		public DataSource dataSource() {
			SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
			dataSource.setDriverClass(oracle.jdbc.OracleDriver.class);//오라클과 통신하기 위한 드라이버 데이터소스
			dataSource.setUrl("jdbc:oracle:thin:@localhost:1521/xe");
			dataSource.setUsername("java");
			dataSource.setPassword("qwer");
			return dataSource;
			
		}

	}


