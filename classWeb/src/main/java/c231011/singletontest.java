package c231011;

public class singletontest {
	public static void main(String[] args)throws Exception {
		ConnectionMaker maker = new OracleConnectionMaker();
		SingletornDAO dao=SingletornDAO.getInstance(maker);
		SingletornDAO dao1=SingletornDAO.getInstance();
		SingletornDAO dao2=SingletornDAO.getInstance();
		System.out.println(dao);
		System.out.println(dao1);
		System.out.println(dao2);
//		UserBean user = new UserBean();
//		dao.add(user);
	}

}
