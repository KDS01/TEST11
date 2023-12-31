package FileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class SubTest {
	public static void test() {
		try {
			write("테스트중", "test.txt");
			String str = read("test.txt");
			System.out.println("str : "+str);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void write(String str, String fileName) throws Exception {
		OutputStream os = new FileOutputStream("C:\\Users\\KGA\\eclipse-workspace\\workspace2\\c230911\\src\\FileIO\\" + fileName);
		Writer writer = new OutputStreamWriter(os, "UTF-8");// 유니코드 포맷 설정
		
		writer.write(str);
		writer.flush();
		writer.close();
	}
	private static String read(String fileName) throws Exception {
		InputStream is = new FileInputStream("C:\\Users\\KGA\\eclipse-workspace\\workspace2\\c230911\\src\\FileIO\\" + fileName);
		Reader reader = new InputStreamReader(is,"UTF-8");
		
		char[] arr = new char[100];
		int count =reader.read(arr);
		reader.close();
		return new String(arr, 0, count);
	}

}
