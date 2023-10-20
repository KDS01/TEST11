package c230906;
import java.util.List;
class Main<T> {
	private Node<T> head;
	private Node<T> tail;
	private int size;
	
	public Main() {
		this.head = null;
		this.tail= null;
		this.size=0;
	}
	private static class Node<T>{
		private T value;
		private Node<T> nextValue;
		Node(T value, Node<T> nextValue){
			this.value=value;
			this.nextValue=nextValue;
		}
	}
	public Node<T> searcher(int index){
		Node<T> a= head;
		for(int i = 0; i<index; i++) {
			a=a.nextValue;
		}
		return a;
	}
	public void addFirst(T t) {
		Node<T> temp=head;
		Node<T> newNode = new Node<T>(t, temp);
		size++;
		head=newNode;
		if(newNode==null) {
			tail=newNode;
		}
	}
	public void addLast(T t) {
		Node<T> temp= tail;
		Node<T> LastAdd= new Node<>(t, null);
		size++;
		tail=LastAdd;
		if(temp==null) {
			head=LastAdd;
		}
		else {
			temp.nextValue =LastAdd;
		}
	}
	public void add(int index, T value) {
		if(index<0|| index>size) {
			System.out.println("오류");
		}
		if(index==0) {
			addFirst(value);
			return;
		}
		if(index==size) {
			addLast(value);
			return;
		}
		Node<T>prevalue = searcher(index-1);
		Node<T>nextValue = prevalue.nextValue;
		Node<T>addValue=new Node<>(value,nextValue);
		size++;
		prevalue.nextValue=addValue;
	}
	public int size() {
		return size;
	}
	

		
		
	
}


		

		

		

	
	
	


