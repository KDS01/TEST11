package c230831;
// record는 기본적으로 priviate 이고, 해당 클래스에 저장된 매개변수를 불러오기 위해서는 해당 매개변수명() 의 형식으로 불러올 수 있다.
public record RecordTest(int num, String name) {// => 레코드에는 따로 오버라이딩을 하지 않아도 기존에 오버라이딩한 정보들이 자동으로 오버라이딩 된다.)
	

}
