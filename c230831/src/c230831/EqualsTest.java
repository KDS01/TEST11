package c230831;

public class EqualsTest {
	String name;
	int num;
	EqualsTest(int num,String name){
		this.name=name;
		this.num=num;
	}
	@Override
	public boolean equals(Object obj) {
//		if(obj instanceof EqualsTest){//( instanceof => (앞에 붙은게 뒤의 타입을 가졌는지 확인하는 연산자)
//		if(((EqualsTest)obj).name.equals(name)) {// => (안에 내용이 같느냐)
//			return true;
		if(!(obj instanceof EqualsTest)) return false;
		
		if(!((EqualsTest)obj).name.equals(name)) return false;
		
		if(num != ((EqualsTest)obj).num) return false;
		
		return true;
		}
//		if(obj instanceof EqualsTest&&//( instanceof => (앞에 붙은게 뒤의 타입을 가졌는지 확인하는 연산자) 그리고,
//		((EqualsTest)obj).name.equals(name)) {// => (안에 내용이 같느냐)
//			return true;
//		}


	@Override
	public int hashCode() {
		return num + name.hashCode();
		}
	@Override
	public String toString() {
		return "제 이름은 "+ name + "입니다. 나이는 " + num + "살 입니다";
	}
	}