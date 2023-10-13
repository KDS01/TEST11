package c231013;

public class UserBean {
	private int id;
	private String name;
	private String userId;
	private String passWord;
public UserBean() {
		
	}
	public UserBean(String name,String userId, String passWord) {
		
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setUserId(String userId) {
		this.userId=userId;
	}
	public String getUserId() {
		return userId;
	}
	public void setPassWord(String passWord) {
		this.passWord=passWord;
	}
	public String getPassWord() {
		return passWord;
	}
}

