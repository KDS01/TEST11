package c231011;

public class UserBean {
	//bean => 사실상 vo랑 같은 개념
	//규칙이 정해져있다
	private int id;
	private String name;
	private String userId;
	private String passWord;
//	private String address;
//	private String phoneNumber;
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
