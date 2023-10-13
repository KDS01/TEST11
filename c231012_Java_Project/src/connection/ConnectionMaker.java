package connection;

import java.sql.Connection;

public interface ConnectionMaker {
	public abstract Connection makeConnection() throws Exception;

}

