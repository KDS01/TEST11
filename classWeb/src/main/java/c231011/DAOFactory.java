package c231011;

import org.springframework.context.annotation.Bean;

public class DAOFactory {
	private UserDAO USERDAOINSTANCE;
	private ConnectionMaker CONNECTIONMAKERINSTANCE;
	@Bean
	public UserDAO userDAO() {
		if(USERDAOINSTANCE==null) USERDAOINSTANCE = new UserDAO(connectionMaker());
		return USERDAOINSTANCE;
	}
	public ConnectionMaker connectionMaker() {
		if(CONNECTIONMAKERINSTANCE==null) CONNECTIONMAKERINSTANCE = new OracleConnectionMaker();
		return CONNECTIONMAKERINSTANCE;
	}
	public UserDAO boardDAO() {
		return new UserDAO(new TomcatOracleConnectionMaker());
	}
	public UserDAO productDAO() {
		return new UserDAO(new TomcatOracleConnectionMaker());
	}

}
