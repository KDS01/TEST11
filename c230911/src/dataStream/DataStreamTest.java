package dataStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamTest {
	public static void test() {
		try {
			String path = DataStreamTest.class.getResource("").getPath() + "test.dt";
			FileOutputStream fos = new FileOutputStream(path);
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeInt(1);
			dos.writeUTF("권원준");
			dos.writeDouble(90.0);
			
			dos.writeInt(2);
			dos.writeUTF("권현규");
			dos.writeDouble(93.5);
			
			dos.writeInt(3);
			dos.writeUTF("김동선");
			dos.writeDouble(100.0);
			
			
			dos.flush();
			dos.close();
			fos.close();
			
			FileInputStream fis = new FileInputStream(path);
			DataInputStream dis = new DataInputStream(fis);
			
			
			for(int i=0; i<3; i++) {
				int num = dis.readInt();
				String name = dis.readUTF();
				double score = dis.readDouble();
				System.out.println("이름은 : "+ name + "점수는 : "+score + " 번호는 : " + num);
			}
			
			fis.close();
			dis.close();
		}catch(Exception e) {
			
		}
	}

}
