package c230901;

public class Wrapper {
	public static void test() {
		//String, System, StringBuilder, Math, Record들은 클래스가 있다.
		// Wrapper는 클래스들의 통칭이다.
		// Integer, Byte, float, short ,Long, Boolean 등의 원시 타입을 클래스로 묶어준다. 클래스로 감싸준다.
		Integer wrappedInt = 1000;
		System.out.println(wrappedInt);
		int unWrappedInt = wrappedInt; // 자동 타입 변환
		int unWrappedInt2 = wrappedInt.intValue();	
		Integer wrappedInt2 = 1000;
		System.out.println(wrappedInt.equals(wrappedInt2));
		
		// == 를 사용하여 비교할 경우, 일정한 범위 내에서는 같다고 결과가 나온다.
		// 하지만 그 범위를 벗어날 경우 다르다 라고 나오게 된다.
		// 그 범위란?
		//	boolean = > true, false
		//	byte, short, int => 공통되는 범위인 -128 ~ 127
		// 	byte 최솟값 : -128~ 127
		//	short 최솟값 : -32768 ~ 32767
		//	int 최솟값 : -21억 ~ 21억
		byte temp = 127;
		System.out.println(++temp);
		System.out.println(--temp);
		//unsigned? unsigned int = > uInt
		//1byte = 8bit => 2진수로 1111 1111이 최댓값
		//byte temp => 숫자를 몇까지? => 255 => -128 ~ 127
	}
	

}
