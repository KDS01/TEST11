package c230907;
import java.util.Set;
import java.util.HashSet;
		import java.util.Iterator;

public class SetTest {
	//set class => 자료 구조에서 중복 체크를 해준다
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();// hash => 값을 넣었을 때 같은 값이면 같은 데이터로 처리할 수 있게..
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(5);
		set.add(8);
		set.add(1);
		set.add(2);
		set.remove(2);
		System.out.println(set.size());
		
		Iterator<Integer> iterator = set.iterator();//포인터 주소	}
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.hasNext());//다음이 있는지 없는지 확인해야 한다 ==>
		System.out.println(iterator.next());
		System.out.println(iterator.hasNext());
		set.clear();
		System.out.println(set.size());
		
		//Hash
	}

}
