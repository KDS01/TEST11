package c230907;

public class Main {
	public static void main(String[] args) {
		//Exception e;// => 예외 처리
		//	error => 문제 발생 시 해당 문제를 다른 방식으로 처리한다.=> 멈추지 않고 게속해서 처리할 수 있게.(오류가 떠도 멈추지 않고 계속 돌아가게)
		//	인덱스 버퍼 없음 , 로그인 할 때 아이디 비밀번호 틀림, 전화번호 입력할 때 8개 숫자만 입력 등등..
		//	if else // 
		//	Exception => 컴파일, 런타임을 진행하면서 에러가 발생했다 또는, 발생할 확률이 있다.
		//	Runtime => 실행 환경,
		try {
			ExceptionTest.test();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try {
			throw new Exception("예외 처리중");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
