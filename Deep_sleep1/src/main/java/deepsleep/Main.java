package deepsleep;
import Stage1.*;
import Stage2.*;
import Stage3.*;
import Stage4.*;
import java.util.Scanner;
public class Main extends Stage1Flow {
	public static void main(String[] args) {
		Stage1Flow s1Flow = new Stage1Flow();
		Stage2Flow s2Flow = new Stage2Flow();
		Stage3Flow s3Flow = new Stage3Flow();
		Stage4Flow s4Flow = new Stage4Flow();
		System.out.println("Deep Sleep....");
		System.out.println("계속하려면 아무 키나 입력하세요.");
		s1Flow.s1flows();
		s2Flow.s2Flows();
		s3Flow.s3Flows(s2Flow);
		s4Flow.S4Flow(s2Flow);
	}

}
