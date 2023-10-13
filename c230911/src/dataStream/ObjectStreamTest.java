package dataStream;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamTest {
	public static void test() {
		try {
			String path = DataStreamTest.class.getResource("").getPath() + "test.dt";
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			Student s1= new Student(1,"kwon",90);
			Student s2= new Student(2,"leem",93.5);
			Student s3= new Student(3,"kds",100);
			
			
			oos.writeObject(s1);
			oos.writeObject(s2);
			oos.writeObject(s3);
			
			oos.flush();
			oos.close();
			fos.close();
			
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Student sr1 =(Student)ois.readObject();
			System.out.println(sr1.num);
			System.out.println(sr1.name);
			System.out.println(sr1.score);
			ois.close();
			fis.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
