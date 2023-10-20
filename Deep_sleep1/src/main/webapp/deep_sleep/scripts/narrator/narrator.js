let narratorLines= [];
let count= 0;
function getLine() {
    if (this.count < this.narratorLines.length)
         narratorElem.innerHTML = this.narratorLines[this.count++];
    else {
         this.toNextStage();
      }
   }
function toNextStage(){
	
 }

document.getElementById('linebox').onclick= ()=>{
	narratorLines=
				[
				"현관에 다가서자, 형광등이 밝아지며 평범한 빌라의 현관문이 드러난다.",
				"퀴퀴한 곰팡이 냄새, 습기를 잔뜩 먹은 먼지 냄새, 천장의 희미한 등빛에 모인 이름 모를 날벌레들. 징그럽도록 익숙한 풍경이다.",
				"익숙한 풍경, 익숙한 냄새에 반쯤 포기한 듯 한숨을 쉬면서 집 문의 도어락에 손을 갖다댔다.",
				"\"오늘은 너무 힘들었어…  이만 들어가서 쉬자…\"",
				"덜컥 덜컥",
				"다른 걸 생각할 겨를조차 없다. 뭔가에 쫒기듯이 도어락을 위로 제꼈지만 뭐가 문제인지 반응이 없다.",
				"\"뭐야?\"",
				"덜컥 덜컥 덜컥",
				"설마 도어락이 고장난거야?",
				"\"아니 왜\"",
				"덜컥 덜컥 덜컥 덜컥",
				"\"아니 왜!!\"",
				"덜컥 덜컥 덜컥 덜컥 덜컥",
				"쾅!",
				"\"아니 왜 하필 오늘 난리야!!!!\"",
				""
				];
	getLine();
	toNextStage=()=>{
		window.location.href=""
	}
}
document.getElementById('frontDoor').onclick = ()=>{
	narratorObj.count=0;
	narratorObj.narratorLines=[
				"늘 보던 현관문이다.",
				" 이걸 빨리 열어야 집에 들어가서 쉴 수 있을텐데...",
				""
				];
	getLine();
}

/*
function narrator(){
	
}
*/


/*function narration(lines,toStage){
	setLines(lines);
	setNextstage(toStage);
	narratorElem.onclick=narratorObj.getLine;
}*/
	


narratorObj.getLine = narratorObj.getLine.bind(narratorObj);




/*class narration{
	tostage;
	toNextStage();
	lines=[];
	stage;
	count=0;
	constructor(stage,lines,tostage){
		this.lines=lines;
		this.stage=stage;
		this.tostage=tostage;
		};
	getLines(){
		return this.lines;
	}
	getToStage(){
		return this.tostage;
	}
	getLines(){
		 if (this.count < this.narratorLines.length)
         return narratorElem.innerHTML = this.narratorLines[this.count++];
	}
	
	
}
*/