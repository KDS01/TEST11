package c20230829.calculator;

public interface CalcInterface extends AddInterface, MinusInterface,MultifleInterface,DivisionInterface {
	public default int add(int...nums) {// => 받은 매개변수들을 한번에 처리한다...? 몇개를 받을지 모른다.
		int temp = 0;
		for(int num : nums) {
			temp= AddInterface.super.add(temp, num);//=> 몇 개의 숫자가 더해질지 모르니까 add...을 쓴다.
		}
		return temp;
	}
	public default int minus(int...nums) {// => 받은 매개변수들을 한번에 처리한다...? 몇개를 받을지 모른다.
		int temp = nums[0];
		for(int i =1; i<nums.length;i++) {
			temp= MinusInterface.super.minus(temp, nums[i]);//=> 몇 개의 숫자가 더해질지 모르니까 add...을 쓴다.
		}
		return temp;
	}
	public default int multi(int...nums) {// => 받은 매개변수들을 한번에 처리한다...? 몇개를 받을지 모른다.
		int temp =nums[0];
		for(int i =0; i<nums.length; i++) {
			temp= MultifleInterface.super.multi(temp, nums[i]);//=> 몇 개의 숫자가 더해질지 모르니까 add...을 쓴다.
		}
		return temp;
	}
	public default double div(double...nums) {// => 받은 매개변수들을 한번에 처리한다 (...==몇개를 받을지 모른다.)
		double temp =nums[0];
		for(int i =1; i<nums.length; i++) {
			temp= DivisionInterface.super.division(temp, nums[i]);//=> 몇 개의 숫자가 더해질지 모르니까 add...을 쓴다.
		}
		return temp;
	}
}
