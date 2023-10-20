package c230908.Stream;

public class Student implements Comparable<Student> {
	private String name;
	private int score;
	
	Student(String name, int score){
		this.name=name;
		this.score=score;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	public void setName() {
		this.name=name;
	}
	public void setScore() {
		this.score=score;
	}
	@Override
	public int hashCode() {
		return name.hashCode();//이름을 hashcode로 변환해서 중복검사를 처리한다.
	}
	public String toString() {
		return name + ":" + score;
	}
	@Override
	public int compareTo(Student s) { 
		return score - s.getScore();
	}
	

}
