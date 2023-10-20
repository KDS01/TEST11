package c230904;
class Pencil{}

//class Goods<T extends Fruit> {
//	// => Fruit으로 제한을 걸어버린다(pencil을 제한한다)
//	//여기서의 extends는 상속을 한다는 의미가 아니라, 최상위 클래스or 인터페이스로 그 범위를 제한한다는 뜻.
//	
//}
//class A{};
//class B extends A{}
//class C extends B{}
//class D<T extends B>{
//	private T t;
//	public T get() {
//		return t;
//	}
//	public void set(T t) {
//		this.t=t;
//	}
//}
class GenericMethod01{
//	public<T> void test(T t) {
//		char c= t.charAt();// 안됨, 최상위 클래스가 지정되지 않았기 때문에 object의 기본 메서드밖에 호출이 되지 않음
//	}
	public <T extends Number>void method2(T t){// 최상위 클래스를 Number으로 제한했기 때문에, Num에 대한 method 사용 가능
		System.out.println(t.intValue());
	}
}
interface MyInterface{
	public abstract void print();
}
class B{
	public <T extends MyInterface> void Method01(T t) {
		t.print();
	}
}
public class Generic03 {
	public static void main(String [] args) {
		//제네릭 클래스의 타입 제한
		//제네릭 클래스는 생성 시 타입을 지정하지 않으므로, object의 기본적인 메서드밖에 사용활 수 없다.
		//그렇지만 이를 구분할 필요가 있을 경우, 해당 클래스의 타입 종류를 제한할 필요가 있는데, 이를 제한하는 방법은
		//접근 지정자 class 클래스명<T> extends 최상위 클래스/ 인터페이스 {} == > extends를 사용하여 해당 접근 범위를 그 클래스로 제한.
		//제네릭 메서드의 타입 제한
		//접근 지정자<T extends 최상위 클래스/인터페이스> T 메서드(T t){}
//		D<B> d2 =new D<>();
//		D<C> d3=new D<>();
//		D<A> d4 =new D<>(); // => D의 최상위 클래스는 B로 제한이 걸렸기 때문에, 가장 최상위 클래스인 A까지는 접근이 제한된다.(오류)
		GenericMethod01 g = new GenericMethod01();
		g.method2(5.5);
		
		B b= new B();
		b.Method01(new MyInterface() {
			public void print() {
				System.out.println("print()구현");
			}
		});
		
	}

}
