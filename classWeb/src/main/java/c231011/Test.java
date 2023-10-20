package c231011;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args)throws Exception {//테스트
		ApplicationContext context=new AnnotationConfigApplicationContext(DAOFactory.class);
		UserDAO dao =context.getBean("userDAO", UserDAO.class);
//		ConnectionMaker maker = new OracleConnectionMaker();
//		UserDAO dao1 =context.getBean("userDAO", UserDAO.class);
//		UserDAO dao2 =context.getBean("userDAO", UserDAO.class);
//		System.out.println(dao1);
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
