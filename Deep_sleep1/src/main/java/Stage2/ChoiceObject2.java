package Stage2;
import java.util.ArrayList;

public class ChoiceObject2 {
	protected String choicename;
	public String[] arr;
	public String[] choiceObjectLines;
	public String[] CombchoiceObjectLines;
	private ArrayList<String>chosenProviso=new ArrayList<String>();
	private ArrayList<String>decisiveProviso=new ArrayList<String>();
	public ArrayList<String> getchosenProviso() {
		return chosenProviso;
	}
	public ArrayList<String> getdecisiveProviso() {
		return decisiveProviso;
	}
	public boolean setDecisiveProviso(String a) {
		return decisiveProviso.add(a);
	}
	public boolean setChosenProviso(String a) {
		ArrayList<String> temp = new ArrayList<String>();
		temp.add(a);
		chosenProviso.removeAll(temp);
		return chosenProviso.add(a);
	}
	public void getChosenProviso() {
		String[] arr = chosenProviso.toArray(new String[chosenProviso.size()]);
		for(String temp : arr) {
			System.out.println(temp);
		}
	}
}

 
