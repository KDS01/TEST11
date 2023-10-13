package c231011;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServ
 */
@WebServlet("/UserServ")
public class UserServ extends HttpServlet {
	
       
    /**
	 * 
	 */
	private static final long serialVersionUID = -3482330689655623017L;


	/**
     * @see HttpServlet#HttpServlet()
     */
    public UserServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		try {
			response.setContentType("text/html;charset=utf-8");
			UserDAO dao=new DAOFactory().userDAO();
			UserBean user= new UserBean();
			user.setName("김동선");
			user.setPassWord("qwer");
			user.setUserId("kds");
			dao.add(user);
			
			System.out.println("추가 성공");
			response.getWriter().append("추가 성공");
		
			UserBean createdUser= dao.get("kds");
			System.out.println(createdUser.getId());
			System.out.println(createdUser.getUserId());
			System.out.println(createdUser.getPassWord());
			System.out.println(createdUser.getName());
			response.getWriter().append(""+createdUser.getId());
			response.getWriter().append(createdUser.getName());
			response.getWriter().append(createdUser.getUserId());
			response.getWriter().append(createdUser.getPassWord());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
