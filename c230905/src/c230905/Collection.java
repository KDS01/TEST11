package c230905;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collection {
	public static void main(String[] args) {
		//컬렉션
		//동일한 데이터 타입을 묶어 관리하는 자료 구조,
		//데이터 저장 공간의 크기가 동적으로 변함
		//1. List
		//  -arrayList, vector, linkedList
		// 자바에서 인터페이스로 구현되어 있음
		//1-1. arrayList
		//array와 비슷하게 생겼지만, 저장 공간이 동적으로 변함
		// 요소에 빠르게 접근 가능, 데이터를 추가하거나 제거할 때 자동으로 크기를 조절한다.
		//List는 인터페이스로써 리스트 동작을 정의,
		// add= 요소 추가 (기본값 맨뒤) 
		// remove= 요소 삭제
		// clear  = > 모든 데이터 삭제
		// get = > 내가 지정한 인덱스의 데이터를 리턴
		// indexOf : 첫번째 위치 리턴
		// lastIndexOf : 마지막 위치 리턴
		// contains : boolean 있냐 없냐?
		// size : 리스트 길이 확인
		// isEmpty : 비어있냐 채워져있냐
		// trimToSize => 현재 데이터 수에 맞게 용량을 줄인다.
		// sort : 정렬
		// reverse : 반전
		String[] arrayString = new String[] {"가","나","다","라","마"};
		arrayString[1] = null;
		arrayString[2] = null;
		for(int i =0 ; i<arrayString.length; i++) {
			System.out.println(arrayString[i]);
		}
		
		
		List<String> arrayList = new ArrayList<>();
		System.out.println(arrayList.size());
		arrayList.add("가");
		System.out.println(arrayList.size());
		arrayList.add("나");
		arrayList.add("다");
		arrayList.add("라");
		arrayList.add("마");
		arrayList.add("바");
		arrayList.add("사");
		System.out.println("데이터 추가 후 사이즈 : "+arrayList.size());
		for(String str :arrayList) {
			System.out.println(str);
		}
		arrayList.remove("바");
		arrayList.remove("다");
		System.out.println("================================================================================");
		for(String str :arrayList) {
			System.out.println(str);
		}
		arrayList.add("경일");
		int index =2;
		String element = arrayList.get(index);
		System.out.println("인덱스 :  "+ index + "요소 : "+ element);
		
		String target = "경일";
		boolean contains = arrayList.contains(target);
		if(contains) {
			System.out.println(target + "을 찾았다");
		}
		else {
			System.out.println("없음");
		}
		//List<String> myList = new ArrayList<>();
		List<String> myList = new LinkedList<>();
		// => List로써 정의한다면 이건 인터페이스를 오버라이딩해서 사용하는 것.
		// 조금 더 유연하게 데이터를 변경할수 있으므로 권장되는 방식이다.
		ArrayList<String> MyList2 = new ArrayList<>();
		//오늘의 과제
		//ArrayList를 활용해서, stack 구현
		
	}

}
