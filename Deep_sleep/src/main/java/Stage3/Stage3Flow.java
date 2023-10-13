package Stage3;

import java.util.Scanner;

import deepsleep.EndingLines;
import Stage2.ChoiceObject2;
import Stage2.Stage2Flow;
import deepsleep.Narrator;
import deepsleep.STAGE;
import deepsleep.STAGESTATUS;
import deepsleep.SUBSTATUS;
import deepsleep.StageMaker;
public class Stage3Flow {
		STAGE s3;
		STAGESTATUS s3stt;
		SUBSTATUS s3sub;
		StageMaker s3maker = new StageMaker(s3, s3stt, s3sub);
		Narrator nar = new Narrator();
		Scanner scr =new Scanner(System.in);
		public void s3Flows(Stage2Flow A) {
			s3maker.setStage(s3);
			S3Start();
			S3FirstChoice(A);
			S3provisoInput2(A);
			S3provisoInput3(A);
			S3ORG();
			S3End(A);
		}
		public void S3Start() {
			s3maker.setStatus(STAGESTATUS.START);
			Stage3Lines S3Lines = new Stage3Lines();
			nar.NameNarration(S3Lines.stage3Start);	
		}
		
		public void S3FirstChoice(Stage2Flow A) {
			ChoiceObject2 COB = A.COB;
			Stage3Lines S3Lines = new Stage3Lines();
			EndingLines Ed = new EndingLines();
			s3maker.setStatus(STAGESTATUS.FIRST);
			s3maker.setSub(SUBSTATUS.INPUT);
			while(true) {
				int Pcount=0;
				System.out.print("\r\n"+S3Lines.Stage3FirstChoice +"\r\n"+ "지금 내가 해야 할 일은...");
				System.out.println("모은 단서들 목록을 보려면" +" 단서"+"를 입력하세요");
				String input;
				input=scr.nextLine();
				switch(input) {
				case "조사한다" :
					nar.NameNarration(S3Lines.stage3Find);
					Pcount++;
					break;
				case "탈출한다":
					nar.Narration(Ed.NorMalEnding1);
					System.exit(0);
					break;
				case "단서":
					COB.getChosenProviso();
					break;
				default :
					System.out.println("지금 내가 할 수 있는 걸 찾아보자.");
				}
				if(Pcount>=1) {
					break;
				}
				
			}
		}
		
		
		public void S3provisoInput2(Stage2Flow A) {
			ChoiceObject2 COB = A.COB;
			s3maker.setStatus(STAGESTATUS.SECOND);
			s3maker.setSub(SUBSTATUS.INPUT);
			Stage3Lines S3Lines = new Stage3Lines();
			int provisocount =0;
			while(true)
			{
				System.out.print(S3Lines.Stage3Proviso1 + "\r\n"+"무엇을 조사해볼까? :");
				System.out.println("모은 단서들 목록을 보려면" +" 단서"+"를 입력하세요");
				String input;
				input=scr.nextLine();
				switch(input) {
					case "불길" :
						nar.NameNarration(new FireProviso().choiceObjectLines);
						break;
					case "현관문":
						nar.NameNarration((new Frontdoor3Proviso().choiceObjectLines));
						break;
					case "싱크대":
						nar.NameNarration((new SinkProviso().choiceObjectLines));
						break;
					case "화장실":
						nar.NameNarration((new ToiletProviso().choiceObjectLines));
						break;
					case "안방":
						nar.NameNarration((new MainRoomProviso().choiceObjectLines));
						COB.setChosenProviso("단서 : 안방");
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
			nar.NameNarration(S3Lines.stage3MainroomChoice);
		}
		
		public void S3provisoInput3(Stage2Flow A) {
			ChoiceObject2 COB = A.COB;
			s3maker.setStatus(STAGESTATUS.THIRD);
			s3maker.setSub(SUBSTATUS.INPUT);
			Stage3Lines S3Lines = new Stage3Lines();
			int Pcount =0;
			int Pcount2=0;
			nar.NameNarration(S3Lines.stage3MainRoomLines);
			while(true)
			{
				System.out.print(S3Lines.stage3Proviso2+ "\r\n"+"무엇을 조사해볼까? :");
				System.out.println("모은 단서들 목록을 보려면" +" 단서"+"를 입력하세요");
				String input;
				input=scr.nextLine();
				switch(input) {
				case "전기 스토브" :
					nar.NameNarration(new StoveProviso().choiceObjectLines);
					break;
				case "멀티탭":
					nar.NameNarration(new MultitapProviso().choiceObjectLines);
					COB.setChosenProviso("단서 : 멀티탭");
					Pcount++;
					break;
				case "전기 포트":
					nar.NameNarration(new PotProviso().choiceObjectLines);
					break;
				case "이불":
					nar.NameNarration(new BlanketProviso().choiceObjectLines);
					COB.setChosenProviso("단서 : 이불");
					Pcount2++;
					break;
				case "단서":
					COB.getChosenProviso();
					break;
				default :
					System.out.println("마루를 찾는 것이 먼저다.");
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
		
		
		public void S3ORG() {
			s3maker.setStatus(STAGESTATUS.FIRST);
			s3maker.setSub(SUBSTATUS.ORG);
			Stage3Lines S3Lines = new Stage3Lines();
			for(int i=0; i<3; i++)
			{
				System.out.println(S3Lines.orgbase[i]);
			}
			nar.PlayerNarration(S3Lines.stage3Org);
		}
		
		
		public void S3End(Stage2Flow A) {
			s3maker.setStatus(STAGESTATUS.END);
			ChoiceObject2 COB = A.COB;
			Stage3Lines S3Lines = new Stage3Lines();
			int Pcount =0;
			int Pcount2=0;
			while(true)
			{
				System.out.print("\r\n" + S3Lines.stage3Proviso2 + "마루는 어디에 있을까..? :");
				System.out.println("모은 단서들 목록을 보려면" +" 단서"+"를 입력하세요");
				String input;
				input=scr.nextLine();
				switch(input) {
				case "전기 스토브" :
					System.out.println("이건 아니야.... 다시 생각해보자..");
					break;
				case "전기 포트":
					System.out.println("이건 아니야.... 다시 생각해보자..");
					break;
				case "이불":
					nar.NameNarration(new BlanketProviso().CombchoiceObjectLines);
					Pcount++;
					break;
				case "멀티탭":
					nar.NameNarration(new MultitapProviso().CombchoiceObjectLines);
					Pcount2++;
					break;
				case "단서":
					COB.getChosenProviso();
					break;
				default :
					System.out.println("이건 아니야.... 다시 생각해보자..");
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
			nar.NameNarration(S3Lines.stage3identityLines);
			COB.setDecisiveProviso("결정적인 단서 : 고양이의 죽음");
		}

}