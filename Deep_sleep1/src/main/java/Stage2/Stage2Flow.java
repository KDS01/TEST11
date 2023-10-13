
package Stage2;
import java.util.Scanner;
import deepsleep.Narrator;
import deepsleep.STAGE;
import deepsleep.STAGESTATUS;
import deepsleep.SUBSTATUS;
import deepsleep.StageMaker;

public class Stage2Flow {
		STAGE s2;
		STAGESTATUS s2stt;
		SUBSTATUS s2sub;
		public ChoiceObject2 COB = new ChoiceObject2();
		Narrator nar =new Narrator();
		StageMaker s2maker = new StageMaker(s2, s2stt, s2sub);
		public void s2Flows() {
			s2maker.setStage(s2);
			S1Start();
			S2provisoInput1();
			S2provisoInput2();
			S2provisoInput3();
			S2ORG();
			S2IdentityLines();
			S2END();
		}
		public void S1Start() {
			s2maker.setStatus(STAGESTATUS.START);
			Stage2Lines S2Lines = new Stage2Lines();
			nar.Narration(S2Lines.stage2Start);	
		}
		public void S2provisoInput1() {
			s2maker.setStatus(STAGESTATUS.FIRST);
			s2maker.setSub(SUBSTATUS.INPUT);
			Scanner scr =new Scanner(System.in);
			Stage2Lines S2Lines = new Stage2Lines();
			int provisocount =0;
			while(true)
			{
				System.out.print(S2Lines.Stage2Proviso1 + "\r\n"+"무엇을 조사해볼까? :");
				System.out.println("모은 단서들 목록을 보려면" +" 단서"+"를 입력하세요");
				String input;
				input=scr.nextLine();
				switch(input) {
					case "신발장" :
						nar.Narration((new ShoesRackProviso().choiceObjectLines));
						break;
					case "소파":
						nar.Narration((new SofaProviso().choiceObjectLines));
						break;
					case "냉장고":
						nar.Narration((new RefregeratorProviso().choiceObjectLines));
						break;
					case "현관문":
						nar.Narration((new FrontDoorProviso2().choiceObjectLines));
						break;
					case "바닥에 내던져진 에코백":
						nar.Narration((new AbandonEcobagProviso().choiceObjectLines));
						COB.setChosenProviso("단서 : 에코백");
						provisocount++;
						break;
					case "단서":
						COB.getChosenProviso();
						break;
					default :
						System.out.println("일단 눈에 띄는 것들에서 방법을 찾아보자.");
				}
				if(provisocount>=1) {
					break;
				}
			}
			nar.Narration(S2Lines.stage2Ecobag);
		}
		public void S2provisoInput2() {
			s2maker.setStatus(STAGESTATUS.SECOND);
			s2maker.setSub(SUBSTATUS.INPUT);
			Scanner scr =new Scanner(System.in);
			Stage2Lines S2Lines = new Stage2Lines();
			int Pcount =0;
			int Pcount2 = 0;
			while(true)
			{
				System.out.print(S2Lines.Stage2EcobagList+ "\r\n"+"무엇을 조사해볼까? :");
				System.out.println("모은 단서들 목록을 보려면" +" 단서"+"를 입력하세요");
				String input;
				input=scr.nextLine();
				switch(input) {
				case "휴대폰" :
					nar.Narration(new CellphoneProviso().choiceObjectLines);
					COB.setChosenProviso("단서 : 휴대폰");
					Pcount++;
					break;
				case "작은 봉투":
					nar.Narration(new SmallenvelopProviso().choiceObjectLines);
					COB.setChosenProviso("단서 : 티오필렌나트륨");
					break;
				case "지갑":
					nar.Narration(new WalletProviso().choiceObjectLines);
					COB.setChosenProviso("단서 : 지갑");
					Pcount2++;
					break;
				case "단서":
					COB.getChosenProviso();
					break;
				default :
					System.out.println("지금은 다른 것보단 저 세 가지 단서가 우선이야.");
				}
				if(Pcount>=1&&Pcount2>=1)
				{
					break;
				}
			}
		}
		public void S2provisoInput3() {
			s2maker.setStatus(STAGESTATUS.THIRD);
			s2maker.setSub(SUBSTATUS.INPUT);
			Scanner scr =new Scanner(System.in);
			Stage2Lines S2Lines = new Stage2Lines();
			int Pcount =0;
			while(true)
			{
				System.out.print(S2Lines.Stage2EcobagList2+ "\r\n"+"무엇을 조사해볼까? :");
				System.out.println("모은 단서들 목록을 보려면" +" 단서"+"를 입력하세요");
				String input;
				input=scr.nextLine();
				switch(input) {
				case "휴대폰" :
					nar.Narration(new CellphoneProviso().choiceObjectLines);
					break;
				case "작은 봉투":
					nar.Narration(new SmallenvelopProviso().choiceObjectLines);
					break;
				case "지갑":
					nar.Narration(new WalletProviso().choiceObjectLines);
					break;
				case "원격 조종 장난감":
					nar.Narration(new RemoconToyProviso().choiceObjectLines);
					COB.setChosenProviso("단서 : 원격 조종 장난감");
					Pcount++;
					break;
				case "단서":
					COB.getChosenProviso();
					break;
				default :
					System.out.println("저 장난감이 자꾸만 신경쓰이는데...");
				}
				if(Pcount>=1)
				{
					break;
				}
			}
		}
		public void S2ORG() {
			s2maker.setStatus(STAGESTATUS.FIRST);
			s2maker.setSub(SUBSTATUS.ORG);
			Stage2Lines S2Lines = new Stage2Lines();
			for(int i=0; i<3; i++)
			{
				System.out.println(S2Lines.orgbase[i]);
			}
			nar.Narration(S2Lines.stage2Organize);
		}
		public void S2ProvisoCombination() {
			s2maker.setStatus(STAGESTATUS.FIRST);
			s2maker.setSub(SUBSTATUS.COMBINATION);
			Scanner scr =new Scanner(System.in);
			Stage2Lines S2Lines = new Stage2Lines();
			int Pcount=0;
			int Pcount2=0;
			nar.Narration(S2Lines.stage2CombinationLines);
			System.out.println("내가 누군지 생각나게 해 줄 단서를 입력해보자.");
			while(true) {
				System.out.print(S2Lines.Stage2ProvisoComb+ "\r\n"+"어떤 단서가 도움이 될까...:");
				System.out.println("모은 단서들 목록을 보려면" +" 단서"+"를 입력하세요");
				String input;
				input=scr.nextLine();
				switch(input) {
				case "에코백" :
					nar.Narration(new AbandonEcobagProviso().CombchoiceObjectLines);
					break;
				case "휴대폰":
					nar.Narration(new CellphoneProviso().CombchoiceObjectLines);
					break;
				case "원격 조종 장난감":
					nar.Narration(new RemoconToyProviso().CombchoiceObjectLines);
					Pcount++;
					break;
				case "지갑" :
					nar.Narration(new WalletProviso().CombchoiceObjectLines);
					Pcount2++;
					break;
				case "단서":
					COB.getChosenProviso();
					break;
				default :
					System.out.println("이건 아니야... 다시 생각해보자...");
				}
				if(Pcount>=1&&Pcount2>=1)
				{
					break;
				}
				else if(Pcount==1||Pcount2==1)
				{
					System.out.println("아직 조금 부족한 느낌이 들어. 조금 더 샅샅히 찾아보자.");
				}
			}
		}
		public void S2IdentityLines() {
			s2maker.setStatus(STAGESTATUS.FIRST);
			s2maker.setSub(SUBSTATUS.IDENTITY);
			COB.setDecisiveProviso("결정적인 단서 : 정체성");
			Stage2Lines S2Lines = new Stage2Lines();
			nar.NameNarration(S2Lines.stage2identityLines);
		}
		public void S2END() {
			s2maker.setStatus(STAGESTATUS.END);
			Scanner scr =new Scanner(System.in);
			Stage2Lines S2Lines = new Stage2Lines();
			while(true) {
				int Pcount=0;
				System.out.println(S2Lines.Stage2DoorOption + "안방 문 앞에서 뭘 해볼까...");
				System.out.println("모은 단서들 목록을 보려면" +" 단서"+"를 입력하세요");
				String input;
				input=scr.nextLine();
				switch(input) {
				case "문을 열어본다" :
					nar.NameNarration(S2Lines.stage2DoorHandleLines);
					break;
				case "문을 두드린다":
					nar.NameNarration(S2Lines.stage2DoorKnockLines);
					Pcount++;
					break;
				case "단서":
					COB.getChosenProviso();
					break;
				default :
					System.out.println("지금은 어서 안방에 들어가봐야 해.");
				}
				if(Pcount>=1) {
					break;
				}
			}
			nar.Narration(S2Lines.stage2DoorKnockLines2);
			COB.setDecisiveProviso("결정적인 단서 : 화재");
			}
		}
	
	
		
		

	
