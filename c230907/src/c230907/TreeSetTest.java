package c230907;
import java.util.TreeSet;
import java.util.NavigableSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(6);
		treeSet.add(9);
		treeSet.add(12);
		treeSet.add(4);
		treeSet.add(7);
		treeSet.add(1);
		System.out.println(treeSet.size());
		
		for(Integer i : treeSet) {
			System.out.println(i);
			//tree 는 기본적으로 순서대로 정렬 기능이 내장되어있다.
		}
		System.out.println("처음은 :  " +treeSet.first());
		System.out.println("마지막은 :  " +treeSet.last());
		System.out.println("7 미만은 :  " +treeSet.lower(7));// 7 바로 전 값을 1개 가져옴
		System.out.println("7 초과는 :  " +treeSet.higher(7));// 7 바로 다음 값을 1개 가져옴
		System.out.println("7 이하는 :  " +treeSet.floor(7));// 
		System.out.println("7 이상은 :  " +treeSet.ceiling(7));
		
		NavigableSet<Integer> descendingTreeSet = treeSet.descendingSet();//descendingSet 오름차순으로 변경
		for(Integer i : descendingTreeSet) {
			System.out.println(i);// 오름차순으로 변경
		}
		NavigableSet<Integer> rangeTreeSet = treeSet.tailSet(7, false);
		//NavigableSet<Integer> rangeTreeSet = treeSet.tailSet(7, true);// 마지막 값(얘보다 큰것만 뽑을거다) true => 이상, false 는 초과
		for(Integer i : rangeTreeSet) {
			System.out.println(i);
		}
		NavigableSet<Integer> rangeTreeSet2 = treeSet.headSet(7, true);// 이하, 미만
		for(Integer i : rangeTreeSet2) {
			System.out.println(i);
	}
		NavigableSet<Integer> rangeTreeSet3 = treeSet.subSet(1,false,12, false);// 사잇값 1~12 true면 이상,이하 false면 미만 초과
		for(Integer i : rangeTreeSet3) {
			System.out.println(i);
		
		}

	}
}

