package c20230829;
//

interface InterFaceTest	{
	/*public static final*/int NUMBER=1;//변수는 지정할 수 있지만, 정적인 상수로써 정의가 가능하다.(전부 대문자 = 상수)
	// 인터페이스는 왜 다중상속이 가능할까? << 이름밖에 없으니까
	void MethodTest();
	private static void privateStaticMethodTest() {// interface에서 private 를 사용하는 이유?? =>추상 메서드를 받아서 사용할 때 기본적으로 들어가는 편이 도움이 되는 자료들이 존재할 경우 
		
		System.out.println("private 정적 메서드 가능??");
		//priavate 메서드 호출 가능? 불가능?
	}
	static void methodTest() {
		System.out.println("이게 되네?");//static => 스태틱이 붙은 메서드는 클래스가 메모리에 저장이 될 때 같이 저장이 됨.(인스턴스가 저장되는 메모리가 아니라) 고로 인터페이스에서도 작성 가능
		privateStaticMethodTest();
	}
	default void defaultMethodTest() {
		privateStaticMethodTest();
	}
}
class ClassTest implements InterFaceTest{
	@Override
	public void defaultMethodTest() {
	}
	@Override
	public void MethodTest() {
		InterFaceTest.super.defaultMethodTest();
	}
}
public class Main {
	public static void main(String[] args) {
		YellowRace KDS = new YellowRace();
		KDS.move();
//		KDS.skinColor
		Person[] people = new Person[] {KDS, new whiteRace()};// 업캐스팅
		people[0].move();
		InterFaceTest.methodTest();
	}
}
