package Stage1;
import java.util.ArrayList;

public class ChoiceObject {
	protected String choicename;
	protected String[] choiceObjectLines;
	protected ArrayList<String>chosenProviso =new ArrayList<>();
	protected ArrayList<String>decisiveProviso =new ArrayList<>();

	public boolean addProviso(String a) {
		return chosenProviso.add(a);
	}
}
 
