package c230906;
import java.util.List;
import java.util.LinkedList;

public class LinkedListTest {
	// LinkedList => 하나의 node에는 데이터와, 다음 노드를 가리키는 포인터가 들어감
	//		single => 단방향 => 다음 데이터를 가리키는 한 개의 포인터를 가짐
	//		double => 양방향 => 이전과 다음 데이터를 가리키는 두 개의 포인터를 가짐
	//		java에서는 내부적으로 더블 링크드리스트로 구현이 되어있음.
	//		중간에 데이터를 insert, delete 하기에 유용하다.
	//		하지만, 특정 위치에 엑세스하려면, 순차적으로 탐색해야 한다. (단점)
	//  	ArrayList와 결정적으로 중간 데이터 삽입 속도가 빠르다 라는 차이점을 지님
	//  	but, 인덱스를 가지지 않으므로, 데이터 서칭 속도가 느림(무조건 첫번째부터 시작해야 하니까)
	public static void main(String[] args) {
		List<String> linkedList = new LinkedList<>();
		linkedList.add("사과");
		linkedList.add("바나나");
		linkedList.add("체리");
		System.out.println("링크드 리스트 순회하기");
		for(String fruit : linkedList) {
			System.out.println(fruit);
		}
		linkedList.add(1, "오렌지");// <=== 특정 위치 포인터
		linkedList.remove("바나나");
		
		String elem =linkedList.get(2);
		System.out.println("2번쨰 : "+ elem);
		System.out.println("사이즈 : "+linkedList.size());
		
		boolean isApple=linkedList.contains("사과");
		System.out.println(isApple);
		
		Object[] array= linkedList.toArray();
		for(Object object : array) {
			System.out.println(object);
		}
		linkedList.clear();
		System.out.println("비어있냐? : "+linkedList.isEmpty());
	}
}
