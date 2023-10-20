package c230907;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class FIFOFILO {
	public static void main(String[] args) {
	//FIFO => Queue
	//FILO => Stack 
	//
	Queue<Integer> qqq = new LinkedList<>();// Array, linkedlist, arrayList
	qqq.offer(1); // => q에 데이터를 추가할 땐 offer() 명령어를 사용함.
	qqq.offer(2);
	qqq.offer(3);
	qqq.offer(4);
	qqq.offer(5);
	System.out.println(qqq);
	qqq.poll(); //하나를 빼낸다 => queue이기 때문에 제일 앞에 있는 것이 빠진다.
	System.out.println(qqq.poll());// poll은 빼낸 데이터를 리턴해준다.
	System.out.println(qqq); 
	System.out.println(qqq.isEmpty());
	
	Stack<Integer> sss = new Stack<>();// Array, linkedlist, arrayList
	sss.push(1); // => sss에 데이터를 추가할 땐 push() 명령어를 사용함.
	sss.push(2);
	sss.push(3);
	sss.push(4);
	sss.push(5);
	System.out.println(sss);
	sss.pop(); //하나를 빼낸다 => Stack이기 때문에 제일 뒤에 있는 것이 빠진다.
	System.out.println(sss.pop());// pop은 빼낸 데이터를 리턴해준다. => 맨 뒤에 값을 빼내고 리턴한다
	System.out.println(sss); 
	System.out.println(sss.isEmpty());
	
	//데이터를 효율적으로 저장하기 위해서

	}
}
