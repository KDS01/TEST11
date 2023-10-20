package Stage1;

public class DoorLockProviso extends ChoiceObject {
	{
		this.choicename="도어락";
		this.choiceObjectLines= new String[] 
				{
				"\"혹시 배터리가 다 닳아서 안되는걸까?\"",
				"그럼 배터리만 가지고 있으면  간단히 해결할 수 있지 않은가?",
				"생각난김에 옆에 메고있던 에코백을 급하게 뒤져봤지만 배터리를 상시로 갖고 다니는 사람이 얼마나 있을까",
				"\"환장하겠네!! 진짜!!!!\"",
				"\'단서 : 도어락\' 을 획득하셨습니다."
				};
		this.addProviso("단서 : 도어락");
		
	}

}
