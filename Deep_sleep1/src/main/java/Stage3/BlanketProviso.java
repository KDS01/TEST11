package Stage3;

import Stage2.ChoiceObject2;

public class BlanketProviso extends ChoiceObject2 {
	BlanketProviso() {
		this.choicename = "이불";
		this.choiceObjectLines = new String[] 
				{"침대 위에 있는 이불에 눈이 갔다.",
				"이불은 마치 한 가운데에 무언가가 들어있는 것처럼 가운데가 불룩 솟아나와 있었다.",
				"\"이건 아마도 내가 쓰던 이불일텐데.. 가운데에 들어가 있는 건 뭐지...?\"",
				"이불을 걷어올리자..",
				"새까맣게 탄 잿더미가 드러났다.",
				"잿더미는 마치 무언가가 웅크리고 있던 것처럼, 형태를 유지한 채로 이불 아래에 깔려 있었다.",
				"\"이건...이건....\"",
				"갑자기 참을 수 없을 만큼 강한 두통이 몰려왔다.",
				"\'단서 : 잿더미\' 을 획득하셨습니다."
				};
//		this.addProviso("단서 :잿더미");
		this.CombchoiceObjectLines= new String[] {
				"이불 안에 곱게 모여있는 잿더미.",
				"마치 무언가가 웅크리고 있는 듯한 형태는..",
				"내가 잘 아는 모양과 너무나도 흡사했다",
				"상상하기조차 싫을 정도로",
				"......."
		};
	}

	

}
