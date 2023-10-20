package c230831;

public class Main {
	public static void main(String[] args) throws Exception {// => Exception은 에러에 대한 처리를 해준다
		// 클래스는 무조건 인스턴스를 만들어야 한다?
		// 클래스는 우리가 이름을 지을 때, 명명할때 어떻게 한다?
		// 첫 글자가 대문자로 시작한다.
		// String, System,Math 등등 => class
		// 위에처럼 알아서 가져다 사용하는 것들을 기본 모듈이라고 얘기할 수 있다.
		// java.lang에서 가져온다.
		// Scanner<< java.util에 포함되어있다.
		// 위와 같이 다운받거나 설치하지 않은 모듈을 표준 모듈이라고 한다.
		// java.lang<< 어떤 것들이 포함되어 있을까?
		// Object, String, StringBuilder, System, Math, Class
		// 우리는 항상 Object를 사용해왔다.(Class는 항상 자동으로 Object Class를 상속받고 있다)
		// Object는 최상위 클래스이다.	
		//		Object obj= new Object();
		//	Main main = new Main();
		//		main.
		EqualsTest et1= new EqualsTest(15,"Test");
		EqualsTest et2= new EqualsTest(18,"Test2");
		EqualsTest et3= et1;
		System.out.println(et1.equals(et2));
		System.out.println(et2.hashCode());
		System.out.println(et1.hashCode());
		System.out.println(et2.hashCode());
		System.out.println(et1.name.hashCode());
		System.out.println(et2.name.hashCode());
		System.out.println(et1.toString());
		System.out.println(et2.toString());
		RecordTest recordTest = new RecordTest(1,"Test");
		RecordTest recordTest2 = new RecordTest(1,"Test");
		System.out.println(recordTest.equals(recordTest2));
		System.out.println(recordTest2.toString());
		//위가 전부 Object
		// System
		System.out.print(" ");
		System.out.println(" ");
		//System.in; => 키보드를 입력받는다.
//		int keyInput = 0;
//		while(true) {
//			keyInput = System.in.read();
//			System.out.print(keyInput);
//			// input =7 => 55,13,10 => 
//			// input =8 => 56,13,10 => 13,10은 줄바꿈에 대한 내용
//			// input =a => 97,13,10
//		}
			//	System.currentTimeMillis() => 현재 시간을 ms단위로 받아온다
			//	System.nanoTime(); => 나노 단위의 현재 시간을 받아온다.
		//System.out.println(System.currentTimeMillis());
		// 0년이 아니라 1970년을 기준으로 시간을 체크한다.
		// UTC, ms 단위로 시간을 저장한다.
		// DB에 저장될때 Date type으로 
		//System.exit(); => 시스템 종료 System.exit(0); 정상적인 종료, System.exit(1); 문제가 있는 종료
		System.out.println("Java Version : "+ System.getProperty("java.specification.version"));
		System.out.println("JDK Directory : "+ System.getProperty("java.home"));
		System.out.println("OS : "+ System.getProperty("os.name"));
		System.out.println("user : "+ System.getProperty("user.name"));
		System.out.println("user Directory : "+ System.getProperty("user.home"));
		System.out.println("directory : "+ System.getProperty("user.dir"));
	}
	
	
}
//
//class EqualsTest2{
//	String name;
//	
//	EqualsTest2(String name)
//	{
//		this.name = name;
//	}
//}