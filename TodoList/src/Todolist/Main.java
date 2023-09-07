package Todolist;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.TreeMap;



public class Main {
	public static void main(String[] args) {
		TreeMap<Integer,String> treemap = new TreeMap<>(Collections.reverseOrder());
		TodoList a = new TodoList();
		HashSet<String> set = new HashSet<>();
		TreeSet<Integer> intset = new TreeSet<>();
		String input;
		Integer priority;
		String Explanation;
		TodoList[] todolist = new TodoList[12];
		int idx=0;
		
		while(true) {
		TodoList inlist = new TodoList();
		Scanner scr= new Scanner(System.in);
		System.out.println("내가 해야 할 일을 입력하자." + "그만두려면 끝을 입력하시오");
		input = scr.nextLine();
		if(input.equals("끝")) 
		{
			break;
		}
		System.out.println("그 일의 우선 순위를 입력하자");
		priority=scr.nextInt();
		
		System.out.println("그 일에 대한 설명은?");
		Scanner ex= new Scanner(System.in);
		Explanation=ex.nextLine();
		
		inlist.setName(input);
		inlist.setExplanation(Explanation);
		inlist.setPriority(priority);
		treemap.put(priority, inlist.getName());
		System.out.println(treemap);
		}
		
	}
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		todolist[idx++]= inlist;
//		set.add(inlist.ListName());
//		intset.add(priority);
//		for(TodoList temp : todolist) {
//			if(temp !=null)
//			System.out.println(temp.ListName());
//		}
//		for(int i=0; i<set.size(); i++) {
//			Integer[] arr= intset.toArray(new Integer[set.size()]
//					);
//			Arrays.sort(arr);
//			if(arr[i]==inlist.getPriority()) {
//				System.out.println(inlist.ListName());
//			}
//			



