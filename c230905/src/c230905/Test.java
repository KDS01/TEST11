package c230905;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Test<T> {
	private T t;
	List<T> arr;
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t=t;
	}
}
 class StackTest{	
	public void String() {
		Scanner scr= new Scanner(System.in);
		Test test =new Test();
		test.arr =new ArrayList<String>();
		String input;
		String[] temp;
		while(true) {
			System.out.println("문자열 입력 : "+ " 입력을 마치려면 '끝'을 입력하시오");
			input=scr.nextLine();
			switch(input) {
			case "끝" :
				for(int i = test.arr.size(); i<=0; i--)
				{
					temp=(String[])test.arr.toArray();
					System.out.println(temp[i]);
				}
				break;
			default : test.arr.add(input);
			}
			if(input.equals("끝")) break;
		}
	}
 }
		
				