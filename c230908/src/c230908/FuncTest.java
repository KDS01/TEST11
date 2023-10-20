package c230908;

public class FuncTest {
	public static void test() {
//PrintTest printTest = new PrintTest();// 안됨, 인터페이스이기 떄문에 new로 선언할 수 없음. 그러나..
		
//		PrintTest t = new PrintTest() {
//		@Override
//		public void print() {
//			System.out.println("인터페이스로 클래스를 바로 생성할 수 있읐까?")
//		}
//		};
//			t.print();
		action(new FuncTest() :: print);
		action((name)->{
			System.out.println(name + "람다 테스트");
		});
		
		action1((name) ->{
			System.out.println("임현규");
		});
		}
	//
	private static void action(PrintTest printTest) {
		printTest.print("권원준");
		}
	private static void action1(PrintTest printTest) {
		printTest.print("권원준");
		}
	private static void print(String name) {
		System.out.println(name + "람다 테스트");
	}
}


