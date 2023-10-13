package c230908;

import c230908.Stream.StreamTest;

public class Main {
	public static void Main(String[] args) {
		//Lamda
		//	-람다식 : 메서드 그 자체
		//	-이름이 없다.
		//	-타입은? X
		//	-() -> {}
		//	위처럼 적는 형식을 람다식이라고 한다
		//	매개변수 받을 수 있다
		// 	어따 쓸까? 
		//	Functional Programming
		//	- 함수형 프로그래밍
		//	- main(()->{}) ex)) forEach
		// 		for(int i : arr) => i를 x2씩 해주고 싶은데...
		// 		for(int i : arr){ i *2};
		// 		람다식에서는..
		//		foreach((int i)->{i * 2})
		//	-람다식을 매개변수로 받는 메서드를 만들 수 있어야 한다.
		//	-interface를 사용해서 미리 내용을 선언해둔다
		//		-인터페이스에서 사용할 매개변수 int i를 미리 선언하고,
		//		-foreach((i)->{i * 2})
		//	Stream 
		//		유튜브 스트리밍 -> 동영상 파일을 다운받지 않고, 실시간으로 조각된 파일을 받아온다}
		//		어떠한 완성된 것을 조각조각 내서 따로 따로 처리를 한다
		//		스트림으로써 나눌 수 있는 것은 -> 배열,셋,맵
		StreamTest.test();
		
}
}
