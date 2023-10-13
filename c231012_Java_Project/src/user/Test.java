package user;

import connection.ConnectionMaker;

public class Test {
	public static void main(String[] args)throws Exception {//테스트
		ConnectionMaker maker = new OracleConnectionMaker();
		UserDAO dao=new UserDAO(maker);
		UserBean user= new UserBean();
		user.setName("임현규");
		user.setPassWord("486");
		user.setUserId("hk");
		dao.add(user);
		System.out.println("추가 성공");
		UserBean createdUser= dao.get("hk");
		System.out.println(createdUser.getId());
		System.out.println(createdUser.getUserId());
		System.out.println(createdUser.getPassWord());
		System.out.println(createdUser.getName());
		}

}
