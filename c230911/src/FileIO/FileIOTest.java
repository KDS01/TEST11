package FileIO;
import java.io.Writer;
import java.io.Reader;
import java.io.FileWriter;
import java.io.FileReader;


public class FileIOTest {
	public static void test() {
		String path = "C:\\Users\\KGA\\eclipse-workspace\\workspace2\\c230911\\src\\FileIO\\test.txt";
		//("C:/Users/KGA/eclipse-workspace/workspace2/c230911/src/FileIO/test.txt";) ==> 윈도우 외 나머지는 /를 쓰지 않으면 인식이 안됨.
		try {
			Writer writer = new FileWriter(path);

			Reader reader = new FileReader(path);
			
			writer.write('a');
			writer.write('b');
			writer.write('c');
			writer.write('d');
			writer.write('e');
			writer.flush();
			writer.close();
			
//			System.out.println((char)reader.read());
//			System.out.println((char)reader.read());
	
			char[] arr = new char[5];
			int count = reader.read(arr);
			for(int i =0; i<count; i++) {
				System.out.println((i+1)+ "번째 문자는 : "+ arr[i]);
			}
			writer.close();
			reader.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
