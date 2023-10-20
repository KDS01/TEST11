package Todolist;
import java.util.ArrayList;
class TodoList{
	private int priority;
	private String name;
	private String Explanation;
	
	public TodoList() {
		this.name=name;
		this.Explanation=Explanation;
		this.priority=priority;
	}
	@Override
	public String toString() {
		return "제목 : " + name + "\n우선도 : " + "\n내용 : " +Explanation;
	}
	public String toList() {
		return name + " = "+ priority;
	}
	public int getPriority() {
		return priority;
	}
	public String getName() {
		return name;
	}
	public String getExplanation() {
		return Explanation;
	}
	public String ListName() {
			return ( name+ "  " + "중요도는 : "+ priority).toString();
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setPriority(int priority) {
		this.priority=priority;
	}
	public void setExplanation(String Explanation) {
		this.Explanation=Explanation;
	}
	// public void add(int priority, String name, String explanation)
	//if(hashList.get(Name) != null)   => name의 해쉬코드가 비어있지 않다면,
	//system out println("중복이야");
	//throw new Exception("중복이얌);
	//StringBuilder sb = new StringBuilder() {
	//Iterator<Integer> treeIt => treeList.keySet().iterator
	//while(treeIt.hasNext()) {// treeIt의 다음이 있는 경우
	//		List<TodoList> tempList = treeList.get(treeIt.next)); =>
			//for(TodoList item : tempList) {
			// sb.append("\n");
			//sb.append(item.toList);
	
	//public TodoItem getItem(String title) {
				
	
}
//	private K key;
//	private V value;
//	private String Explanation;
//	
//	public K getKey() {
//		return key;
//	}
//	public void setKey(K key) {
//		this.key =key;
//	}
//	public V getValue() {
//		return value;
//	}
//	public void setValue(V value) {
//		this.value=value;
//	}
//	public void setExplanation(String Explanation) {
//		this.Explanation=Explanation;	
//	}
//	public String getExplanation() {
//		return Explanation;
//	}
//	public void getListName() {
//		System.out.println("이름은 : "+value + "중요도는 : "+ key);
//	}
//}
//public class ListMaker{
//	private String name;
//	private int priority;
//	private String Explanation;
//	public ListMaker(String name, int priority) {
//		this.name=name;
//		this.priority=priority;
//	}
//	public String getName() {
//		return name;
//	}
//	public int getPriority() {
//		return priority;
//	}
//	public String getExplanation() {
//		return Explanation;
//	}
//	public void setName(String name) {
//		this.name=name;
//	}
//	public void setpriority(int priority) {
//		this.priority=priority;
//	}
//	public void setExplanation(String Explanation) {
//		this.Explanation=Explanation;
//	}
//	public void setListName(String Name,int priority) {
//		System.out.println("이름은 : "+ Name + "중요도는 : "+priority);
//	}
//}
//
//class wash extends ListMaker{
//	public wash(String name, int priority)
//	{
//		super(name,priority);
//	}
//	@Override
//	public String getExplanation() {
//		return "위생 관리는 철저해야 해";
//	}
//}
//class Game extends ListMaker{
//	public Game(String name, int priority)
//	{
//		super(name,priority);
//	}
//	@Override
//	public String getExplanation() {
//		return "게임은 종합 예술이야";
//	}
//}
//class Dinner extends ListMaker{
//	public Dinner(String name, int priority)
//	{
//		super(name,priority);
//	}
//	@Override
//	public String getExplanation() {
//		return "저녁 식사는 조금만 먹자, 살찐다.";
//	}
//}
//class Cat extends ListMaker{
//	public Cat(String name, int priority)
//	{
//		super(name,priority);
//	}
//	@Override
//	public String getExplanation() {
//		return "고양이를 만지는 건 심신에 안정이 된다.";
//	}
//}
//class Dessert extends ListMaker{
//	public Dessert(String name, int priority)
//	{
//		super(name,priority);
//	}
//	@Override
//	public String getExplanation() {
//		return "달달한 간식은 집중력을 높여준다";
//	}
//}
//class Cola extends ListMaker{
//	public Cola(String name, int priority)
//	{
//		super(name,priority);
//	}
//	@Override
//	public String getExplanation() {
//		return "콜라는 역시 제로펩시 라임맛이지";
//	}
//}
//

	


	


