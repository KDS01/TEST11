package c230908.Stream;

import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class StreamTest {
	public static void test() {
		Set<String> set = new HashSet<String>();
		set.add("권원준");
		set.add("임현규");
		set.add("김동선");
		set.add("이민규");
		set.add("김남균");
		set.add("송성민");
		set.add("박정완");
		set.add("한상윤");
		set.add("임주한");
		//set.toArray(); =>내부에 뭐가 있는지 모르기 때문에, 오브젝트로써 전부 상속받는데,
		//이러면 하위 클래스에서 정의한 메서드를 갖다 쓸 수가 없다. 그러므로, 스트림으로 조각조각 내서 하나씩 처리할 수 있게 만든다
		Stream<String> stream = set.stream();
		stream.forEach(item->System.out.println(item)); // => forEach문을 stream이 알아서 처리해준 뒤, 람다문으로 변형시켜서 출력한다.
		List<String> list = new ArrayList<String>();
		list.add("권원준");
		list.add("임현규");
		list.add("김동선");
		list.add("이민규");
		list.add("김남균");
		list.add("송성민");
		list.add("박정완");
		list.add("한상윤");
		list.add("임주한");
		Stream<String> stream1 = list.stream();
		stream1.forEach(item->System.out.println(item));
		//stream은  일회용이므로, 한번 사용하면 끝, 사용할때마다 새롭게 정의해줘야 함.
		//stream은 리스트 자체를 건드리지 않는다.

		Set<Student> students = new HashSet<Student>();
		students.add(new Student("권원준", 85));
		students.add(new Student("임현규", 98));
		students.add(new Student("김동선", 90));
		students.add(new Student("이민규", 80));
		students.add(new Student("김남균", 90));
		students.add(new Student("송성민", 70));
		students.add(new Student("박정완", 75));
		students.add(new Student("한상윤", 100));
		students.add(new Student("임주한", 80));
		
		Stream<Student> stream2 =students.stream();
		IntStream scores = stream2.mapToInt(item->item.getScore()).sorted();
		double avg = scores.average().getAsDouble();// double 형태로 변형 후 평균을 출력한다.
		System.out.println("avg : "+ avg);
		
		IntStream scoreDis = students.stream().mapToInt(item->item.getScore()).distinct();
		// 스튜던트에서 스코어를 뽑아온 후, 중복을 없애달라.
		scoreDis.forEach(item -> System.out.println(item + ", "));
		//scoreDis.toArray(); => 배열로 뽑아낼 수 있다.
		Stream<Student> stream3 =students.stream();// 점수만 받고 싶을떄, 람다식으로 점수만 뽑아와라.
		stream3.forEach(item->System.out.println(item.toString()));
		Stream<Student> stream4 =students.stream().filter(item -> item.getName().startsWith("임"));// 필터
		stream4.forEach(item->System.out.println(item.toString()));
//		IntStream scores4 = stream4.mapToInt(item->item.getScore()).sorted(Comparator.reverseOrder());
		//무작위로 뽑혀나오는 점수들을 역순으로 정렬하고 싶어
		
	}

}
