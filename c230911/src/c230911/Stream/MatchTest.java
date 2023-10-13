package c230911.Stream;

import java.util.Arrays;

public class MatchTest {
	public static void test() {
		int[] arr = {1,3,5,7};
		int[] arr2 = {2,4,6,8,9};
		
		System.out.println(Arrays.stream(arr).allMatch(item->item%2==0));
		System.out.println(Arrays.stream(arr2).allMatch(item->item%2==0));//다 맞을때만 true
		
		System.out.println(Arrays.stream(arr).anyMatch(item->item%2==0));
		System.out.println(Arrays.stream(arr2).anyMatch(item->item%2==0));// 하나라도 맞을떈 true
		
		System.out.println(Arrays.stream(arr).noneMatch(item->item%2==0));// 하나도 맞지 않을떄 true
		System.out.println(Arrays.stream(arr2).noneMatch(item->item%2==0));
		
		}

}
