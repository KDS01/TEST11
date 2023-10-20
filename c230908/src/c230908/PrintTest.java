package c230908;

@FunctionalInterface// => 함수형으로 사용할 인터페이스다.
public interface PrintTest {
	void print(String name);
	
	public default int test() {// default => 이미 정의가 되어있다. 
		return 1;
	}
	

}
