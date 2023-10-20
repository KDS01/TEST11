package c230926_student;

public class studentVO {
	private int id;
	private String name;
	private String studentId;
	private String studentPw;
	private int age;
	private String gitAddress;
	
	public studentVO(
			int id,
			String name,
			String studentId,
			String studentPw,
			int age,
			String gitAddress
		) {
		this.id=id;
		this.name=name;
		this.studentId=studentId;
		this.studentPw=studentPw;
		this.age=age;
		this.gitAddress=gitAddress;		
	}
	public studentVO(
			String studentId,
			String studentPw,
			int age,
			String gitAddress
		) {
		this.studentId=studentId;
		this.studentPw=studentPw;
		this.age=age;
		this.gitAddress=gitAddress;		
	}
	public int getId() {
		return id;
		}
	public String getName() {
		return name;
		}
	public  String getStudentId() {
		return studentId;
		}
	public  String getStudentPw() {
		return studentPw;
		}
	public  int getAge() {
		return age;
		}
	public  String getGitAddress() {
		return gitAddress;
		}
}
