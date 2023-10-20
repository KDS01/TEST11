package c230901;

public class Main {
	public static void main(String[] args) throws Exception {
//	week Week = week.sunday;
//	switch(Week) {
//	case sunday:
//		System.out.println("일요일이다. 일찍 자라");
//		break;
//	}
		int num =1;
		int studentNum =1;// 	카멜형
		int StudentNum =1;//	파스칼형= 카멜형 + 첫 문자 대문자
		int student_num = 1;// 	스네이크형
		// int student-num =1 ; => 케밥형
		// int IntstudentNum =1 ; => 헝가리안 표기법
		System.out.println(num);
		StringTest stringtest =new StringTest();
		stringtest.stringTest();
		StrBuilderTest sb =new StrBuilderTest();
		sb.strBuilderTest();
		MathTest MT =new MathTest();
		MT.Test();
		Wrapper WR =new Wrapper();
		WR.test();
		DateTest DT =new DateTest();
		DT.test();
		
}
}
