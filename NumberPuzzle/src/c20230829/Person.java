package c20230829;
//	인터페이스란, 극한까지 추상화를 한 것.
//	API, UI 등
//	프로그램과 프로그램 사이의 데이터를 전달해주는 녀석(API),
//	Web API/API 문서(프론트엔드와 백엔드 사이의 통신 규칙을 적어놓은 것)
//	Interface => 어떠한 무언가와 어떠한 무언가를 연결하여 중간 과정에서 통신을 처리한다.
//	서로간의 대화를 가능하게 해 준다.
//	

//interface => 'abstract class'와 비슷하다.
interface Human	{
	void move();
}
interface Animal{
	void eat();
}
public sealed class Person
	implements Human,Animal 
	permits YellowRace,whiteRace 
	{// sealed => 봉인된 => permits 키워드를 사용해서 한정적으로 상속할 수 있음,
	 //상속받은 자식도 봉인되는데, 자식은 non-sealed 키워드를 사용하여 해제 가능
	String species;
	Person(){
		species = "human";
	}
	//추상화 되었어도 밑에서 public을 다시 적어줘야 함.(위의 추상 메서드와 같은 메서드라는 것을 적어줘야 함)
	public void move() {
		System.out.println("사람이 이동한다");
	}
	public void eat() {	
	}

}
