package c230901;

public class StrBuilderTest {
	public static void strBuilderTest() {
		String str1= "abc";
		str1 = str1+ "defg";
		// => 비효율적// 메모리를 새롭게 생성한 뒤 기존메모리 abc를 삭제해버림
		
		StringBuilder sb = new StringBuilder();
		//스트링을 조정함에 있어 메모리적으로 효율적인 작업을 할 수 있도록
		str1.replace("b", "z");//=> 바꾸면서 메모리를 새로 만들고 기존 메모리를 지움
//		String str2 = sb.append("글자를 추가한다.");// ==> 타입이 안맞으므로 타입변환이 필요함
		String str2 = sb.append("글자를 추가한다.").toString();//=> 타입변환을 위해 toString();을 추가함
		System.out.println(str2);
		System.out.println(sb.delete(4, 6).toString()); // => 4번째 자리부터 6번째 자리까지 삭제한다
		// 0글1자2를3 4추5가6한7다8.9
		System.out.println(sb.replace(4, 4, "수정").toString());
		System.out.println(sb.replace(4, 6, "치환").toString());
		System.out.println(sb.append("글자를 추가한다").toString());// append => 뒤에다가 원하는 글자를 추가한다.
		str1.substring(5);
		
		
	}

}
