package c230904;
class GenericMethod{
	public <T> T method(T t) {
		return t;
	}
	public <T> boolean method2(T t1, T t2) {
		return t1.equals(t2);
	}
	public <K,V> void method3(K k, V v) {
		System.out.println(k+" : " +v);
	}
}

// 제네릭 메서드, 클래스는 어떠한 제약도 받지 않는 오브젝트 클래스 내의 내장 메서드만 사용이 가능하다.(정의 시점에서 딱히 타입을 지정하지 않으므로)
class A{
	public <T> void method(T t) {
		System.out.println(t.equals("안녕"));
//		System.out.println(t.lenght());// 불가능. => object
	}
}
public class Generic01 {	
	public static void main(String[] args) {
		//제네릭 메서드
		//클래스 전체를 제네릭으로 선언하지 않고, 일반 클래스 내에 특정 메서드만 제네릭으로 선언하고 싶을 경우,
		//제네릭 메서드는 호출되는 시점에 실제 제네릭 '타입' 을 지정한다
		//1. 제네릭 타입 변수명이 1개일 때
		//접근 제한 지정자 <T> T 메서드 이름(T t)
		//2. 2개일 경우
		//접근 제한 지정자 <T,V> T 메서드 이름(T t,V v)
		//3. 매개변수에만 제네릭이 사용되었을 때
		//접근 제한 지정자<T> void 메서드 이름(T t)
		//4. 리턴 타입에만 제네릭이 사용되는 경우
		//접근 지정자 <T> T 메서드 이름(int a){}
		
		//제네릭 클래스의 범위 제한
		//제네릭 클래스는 생성 시 타입을 지정하지 않으므로, object의 기본적인 메서드밖에 사용활 수 없다.
		//그렇지만 이를 구분해서 저장해야 할 필요가 있을 경우, 해당 클래스의 타입 종류를 제한할 필요가 있는데, 이를 제한하는 방법은 
		GenericMethod gm =new GenericMethod();
		String str1 = gm.<String>method("안녕"); // 입력 매개변수 값으로, 제네릭의 타입을 유추할 수 있다면,
		String str2 = gm.method("안녕2");// 이런식으로 생략도 가능하다.
		System.out.println(str1);
		System.out.println(str2);
		boolean b1 = gm.method2(2.5, 3);
		System.out.println(b1);
		
	}
}
