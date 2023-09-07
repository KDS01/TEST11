package c230901;

import java.util.Random;
public class MathTest {
	public static void Test( ) {
		System.out.println(Math.abs(-5));
		System.out.println(Math.abs(-5.5));// abs => 절대값
		System.out.println(Math.ceil(0.125));
		System.out.println(Math.ceil(5.0000001));	// =>실수(올림)
		System.out.println(Math.floor(5.1));
		System.out.println(Math.floor(5.9)); 		// => 실수(내림)
		
		System.out.println(Math.max(4,7));			// => 최댓값
		System.out.println(Math.min(4,7));			// => 최솟값
		
		System.out.println(Math.round(5.9));		// => 반올림
		
		Random rd= new Random(1);//() 소괄호 안에 매개변수로 랜덤에 대한 참조값을 전달할 수 있다.
		//이런 참조값을 종자값(seed)라고 한다.
		// =>rd와 rd1 : 새로운 랜덤으로 지정되었으므로 다른 값이 출력된다
		//종잣값을 넣어서 rd와 rd1이 같은 수가 출력되게 만든다.
		Random rd1= new Random(1);
		System.out.println(rd.nextInt(9)+1);
		System.out.println(rd1.nextInt(9)+1);
		System.out.println(rd.nextInt(9)+1);
		System.out.println(rd1.nextInt(9)+1);
		System.out.println(rd1.nextInt(9)+1);
		System.out.println(rd.nextInt(9)+1);
		System.out.println(rd1.nextInt(9)+1);
		System.out.println(rd.nextInt(9)+1);
		
		
		

		
	}
}
