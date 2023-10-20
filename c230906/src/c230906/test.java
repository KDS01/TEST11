package c230906;

public class test {
	public static void main(String[] args) {
		Main<String> t1 = new Main<>();
		t1.add(0,"0000");
		t1.add(1,"1111");
		t1.add(2,"2222");
		t1.add(3,"3333");
		t1.add(4,"4444");
		System.out.println(t1.size());
		for(int i =0; i<t1.size(); i++) {
			System.out.println(t1.searcher(i));
		}
		
	}

}
