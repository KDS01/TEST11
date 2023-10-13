package c230911.Stream;

import java.util.Arrays;
import java.util.OptionalDouble;

public class OptionTest {
	public static void test() {
		int[] arr = {1,3,5,7};
		int[] arr2 = {2,4,6,8,9};
		String[] str =new String []{"경","일","게","임","아"};
		
		
		System.out.println(Arrays.stream(arr).filter(item->item%3==0).count());// 3의 배수 갯수
		System.out.println(Arrays.stream(arr2).filter(item->item%3==0).count());
		
		System.out.println(Arrays.stream(arr).sum());
		System.out.println(Arrays.stream(arr2).sum());
		
		System.out.println(Arrays.stream(arr).average().getAsDouble());
		System.out.println(Arrays.stream(arr2).average().getAsDouble());
		
		System.out.println(Arrays.stream(arr).max().getAsInt());
		System.out.println(Arrays.stream(arr).min().getAsInt());
		
		int[] arr3 = {};
		try {
//			System.out.println(Arrays.stream(arr3).average().getAsDouble());
			OptionalDouble od = Arrays.stream(arr3).average();
			if(od.isPresent()) {
				System.out.println(od.getAsDouble());
			}
			else {
				System.out.println("없어");
			}
			System.out.println(Arrays.stream(arr3).average().orElse(0.0));// 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		Arrays.stream(arr).average().ifPresent(item -> System.out.println("예외" + item));
		Arrays.stream(arr2).average().ifPresent(item -> System.out.println("예외" + item));
		Arrays.stream(arr3).average().ifPresent(item -> System.out.println("예외" + item));		// ifPresent => 문제가 없다면 출력을 해준다
		
		System.out.println(Arrays.stream(arr).reduce(0,(a,b) -> a+b/2+1));
//		System.out.println(Arrays.stream(str).reduce("",(a,b) ->"학원이름 : "+ a+b));// (0은 시작점이다. 다른 타입도 가능 ex(String 등), 나중에 string 등을 넣어서 문자열로 바꾼다던가 시도해봐야 함.
	}

}
