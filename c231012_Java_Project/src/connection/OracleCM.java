package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleCM {
	protected  Connection connect() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe",
				"java",
				"qwer"
				);
	}

}
