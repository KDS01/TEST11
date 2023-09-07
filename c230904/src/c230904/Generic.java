package c230904;
class Apple{}
class Goods1{}
//	private Apple apple = new Apple();
//	
//	public Apple GetApple() {
//		return apple;
//	}
//	public void SetApple(Apple apple) {
//		this.apple = apple;
//	}
//}
//class Pencil{}
//class Goods{
//	private Pencil pencil = new Pencil();
//	public Pencil Getpencil() {
//		return pencil;
//	}
//	public void SetPencil(Pencil pencil) {
//		this.pencil = pencil;
//	}
//}

//위 코드를 봤을 때, 새로운 상품이 추가될떄마다 새로운 클래스를 만들어야 한다. 귀찮음...
// 첫번쨰 해결 방법은 최상위 클래스인 Object 타입으로 선언하는것
//Object 객체를 저장하고 관리하는 클래스를 생성하면, 과일이든, 학용품이든, 저장하거나 읽어내릴 수 있다.
//제네릭 타입 접근 지정자 class 클래스명<T>{}
//제네릭 타입 접근 지정자 class 클래스명<k,T>{} 복수가 될 수도 있음.

//제네릭 타입 접근 지정자 interface 클래스명<T>{}
//제네릭 타입 접근 지정자 interface 클래스명<k,T>{} 복수가 될 수도 있음.
//제네릭 클래스의 객체 생성.
//객체 생성 과정은 일반 클래스의 객체 생성과 비슷
//단, 클래스명 다음에<실제 제네릭 타입>을 삽입한다.
//즉, 객체를 생성할 때 제네릭 타입 변수에 실제 타입을 대입한다.

//클래스명<실제 제네릭 타입> 참조변수 명 = new 클래스명<실제 제네릭 타입>();
//클래스명<실제 제네릭 타입> 참조변수 명 = new 클래스명<>();


//생성 연습
class MyClass<T> {
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t=t;
	}
}

class Goods{
	private Object object = new Object();
	public Object get() {
		return object;
	}
	public void set(Object object) {
		this.object = object;
	}
}
class CharacterFactory<T>{
	private T character;
	public CharacterFactory(T character) {
		this.character=character;
	}
	public void Introduce() {
		System.out.println("나는 " +character.getClass().getSimpleName()+"character");
		// =>getsimpleName => 캐릭터 클래스의 객체 이름을 문자열로 반환하겠다
		// 메서드 체이닝 기법 => 객체의 메서드를 연속적으로 표현해서, 여러 작업을 한 줄로 표헌
		//String reString=inputString.trim().toUpperCase().substring(0.5); 
		// => 앞뒤 공백 제거하고, 대문자로 변환한 다음, 처음 5글자만 추출한다.
	}
	public T getCharater() {
		return character;
	}
}
class Knight{
	private String name;
	public Knight(String name) {
		this.name=name;
	}
	public void Attack() {
		System.out.println(name + "칼을 휘두름!!!");
	}
	
}
class Wizard{
	private String name;
	public Wizard(String name) {
		this.name=name;
	}
	public void Skill() {
		System.out.println(name + "파이어 볼 발사!");
	}
}

// 제네릭 타입 변수가 2개인 경우
class KeyValue<K,V>{
	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key =key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value=value;
	}
}
public class Generic {
	public static void main(String[] args) {
		//generic = > 일반화 프로그래밍
		//
		Goods goods3= new Goods();
		goods3.set(new Apple());
		//Apple apple =goods3.get(); // => 타입으로 꺼내 가져올 때는(get) 내가 set을 한 형태로 형변환을 해 줘야 가능하다 에러.(필드 자체가 오브젝트 타입이기 때문)
		Apple apple =(Apple)goods3.get(); // => set으로 선언한 타입으로 형변환을 해줄시 오류가 뜨지 않는다
		
		
		
		//제네릭 클래스인 myclass 사용해보자
		MyClass<String> mc1= new MyClass<>();// 스트링 타입이 필요할 때 저장하거나 꺼내올 수 있는 객체 생성
		mc1.set("ㅎㅇ요");
		System.out.println(mc1.get());
		
		MyClass<Integer> mc2 = new MyClass<>();// 인티저 타입이 필요할 때 저장하거나 꺼내올 수 있는 객체 생성
		mc2.set(123435);
		System.out.println(mc2.get());
		
		
		KeyValue<String, Integer> kv1 = new KeyValue<>();
		kv1.setKey("원숭이");
		kv1.setValue(12345);
		String key1 = kv1.getKey();
		int value1 = kv1.getValue();
		System.out.println("key : "+ key1 + " value : " + value1);
		KeyValue<String, Void> kv2 = new KeyValue<>();// => 해당 제네릭 타입의 변수를 사용하지 않는다면, Void 입력.
		
		kv2.setKey("키 값만 사용하겠음");
		//kv2.setValue(12345); ==> Void 이므로 컴파일 오류가 뜨게 됨.
		//===========================================================================================================================================================
		CharacterFactory<Knight> knightFactory = new CharacterFactory<>(new Knight("홍길동"));
		CharacterFactory<Wizard> WizardFactory = new CharacterFactory<>(new Wizard("전우치"));
		
		knightFactory.Introduce();
		Knight knight =knightFactory.getCharater();
		knight.Attack();
	}
}
