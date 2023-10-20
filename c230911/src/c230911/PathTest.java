package c230911;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
	public static void test() {
		PathTest.class.getResource("").getPath();
		Path path = Paths.get("C:\\Users\\KGA\\eclipse-workspace\\workspace2\\c230908\\src\\c230908\\Main1.java");//os마다 디폴트 저장위치가 다른데, 해당 저장위치의 차이로 인해 생길 수 있는 오류를 자동으로 방지해준다.
		System.out.println(path.toAbsolutePath().normalize());
		
		File file = new File(path.toString()+ "\\Main1.java");
		System.out.println(file.exists());
		try {
			file.createNewFile();
			file.mkdir();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

