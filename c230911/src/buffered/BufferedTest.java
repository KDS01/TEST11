package buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedTest {
	public static void test() {
		System.out.println("BufferedTest");
		try {
			String path = BufferedTest.class.getResource("").getPath();
			System.out.println(path +"09e904cb8f26f.png");
			FileInputStream fis = new FileInputStream(path +"09e904cb8f26f.png");
			FileOutputStream fos = new FileOutputStream(path +"output1.png");
			
			FileInputStream fis2 = new FileInputStream(path +"09e904cb8f26f.png");
			FileOutputStream fos2 = new FileOutputStream(path +"output1.png");
			BufferedInputStream bis = new BufferedInputStream(fis2);
			BufferedOutputStream bos = new BufferedOutputStream(fos2);// 버퍼로 강제로 처리해라. 단순 복붙보다 얼마나 빨라지는지
			
			System.out.println(copy(fis,fos));
			System.out.println(copy(bis,bos));
			fis.close();
			fos.close();
			bis.close();
			bos.close();
			fis2.close();
			fos2.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	private static long copy(InputStream is, OutputStream os)throws Exception {
		long start = System.nanoTime();
		while(true) {
			int data= is.read();
			if(data==-1) break;
			os.write(data);
		}
		long end =System.nanoTime();
		return end - start;
	}

}
