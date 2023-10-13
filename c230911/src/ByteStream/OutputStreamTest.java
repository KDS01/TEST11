package ByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class OutputStreamTest {
	// 통신이란 뭘까
	// 		-데이터를 주고 받는 것
	//		-언제 통신한다고 얘기할 수 있을까?
	//		-단적인 예로 키보드 입력 시 데이터가 메인보드를 통해 CPU에 전달된다.
	//		-통신은 시작을 했으면 끝을 반드시 지어줘야 한다.
	public static void test() {
		//C:\Users\KGA\eclipse-workspace\workspace2\c230911\src\ByteStream
		String path = "C:\\Users\\KGA\\eclipse-workspace\\workspace2\\c230911\\src\\ByteStream\\test.db";
		try {
		OutputStream os = new FileOutputStream(path);
		//파일을 file로 output하는 Stream.
		os.write(10);
		os.write(20);
		os.write(30);
		os.write(40);
		os.flush();//flush => 메모리에 담아 둔 것을 비운다.(강제로 파일로 저장을 한다(HHD와 통신한다))(메모리가 가득 차지 않은 상태에서도)
		os.close(); //==> 요청 받았으면 반드시 close로 닫아줘야 함
		
		InputStream is = new FileInputStream(path);// 바이트 단위로 파일을 가져와라
		
		is.read();//파일을 읽어라
		System.out.println(is.read());
		System.out.println(is.read());
		System.out.println(is.read());
		
		while(true) {
			int data = is.read();
			System.out.println("data : " + data);
			if(data ==-1) break;
		}
		is.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			OutputStream os = new FileOutputStream(path);
			byte[] arr = {10,20,30,40};
			os.write(arr);
			os.flush();
			os.close();
			InputStream is = new FileInputStream(path);
			byte[] arr1 = new byte[100];//최대 몇바이트까지 가져올 지 배열로 생성한다
			int count = is.read(arr1);
			for(int i =0; i<count; i++) {
				System.out.println("arr1 [" + i + "] : "+arr1[i]);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
