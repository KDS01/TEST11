package c230907;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class MapTest {
	public static void main(String[] args)
	{
		Map<String, Integer> map = new HashMap<>();
		// key와 값 => key가 중복됬는지 체크한다.(중복을 체크하는 주체(String)와 데이터(int)가 다르다
		map.put("A", 7);
		map.put("B", 8);
		map.put("C", 23);
		map.put("D", 3);
		map.put("E", 7);// 값에 대한 중복은 있음, key는 겹치지 않음
		System.out.println(map.size());// 값이 같음에도 키가 다르기에 중복처리 하지 않음.
		
		
		map.get("A");
		System.out.println(map.get("A"));
		map.put("A", 13);
		System.out.println(map.get("A"));
		
		Set<String> keySet = map.keySet(); //Key들을 set한다.(iterator를 사용하기 위해서,
		//									 key들은 딱히 배열처럼 되어있지 않기떄문에 구체적인 위치 지정이 불가능하다. 그러므로 set해서 위치들을 지정해준다면, iterator를 사용할 수 있게된다.
		Iterator<String> iterator = keySet.iterator();
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		
	}
}
