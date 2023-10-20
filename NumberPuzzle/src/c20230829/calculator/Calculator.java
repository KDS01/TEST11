package c20230829.calculator;
import java.util.Scanner;

public class Calculator implements CalcInterface {
	public void calculate(String operator, int ...nums) {

		switch(operator) {
		case "+" :
			System.out.println(CalcInterface.super.add(nums));
			break;
		case "-" :
			System.out.println(CalcInterface.super.minus(nums));
			break;
		case "*" :
			System.out.println(CalcInterface.super.multi(nums));
			break;
		case "/" :

}
	}
	public int calculate(String formula) {
		return 0;
	}
}

