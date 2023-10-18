const narratorElem = document.getElementById('linebox');
const toStage1_1=window.location.href=""
const toStage1_2=window.location.href=""
const toStage2_1=window.location.href=""
const toStage2_2=window.location.href=""
const toStage3_1=window.location.href=""
const toStage3_2=window.location.href=""


const narratorObj = {
   narratorLines: [],
   count: 0,
   getLine: function() {
      if (this.count < this.narratorLines.length)
         narratorElem.innerHTML = this.narratorLines[this.count++];
      else {
         this.toNextStage();
      }
   },
   toNextStage: () => { }
}

/*
function narrator(){
	
}
*/


function narration(lines,toStage){
	setLines(lines);
	setNextstage(toStage);
	narratorElem.onclick=narratorObj.getLine;
}
	


narratorObj.getLine = narratorObj.getLine.bind(narratorObj);




/*class narration{
	tostage;
	toNextStage();
	lines=[];
	stage;
	count=0;
	constructor(stage,lines){
		this.lines=lines;
		this.stage=stage;
	}
	constructor(stage,lines,tostage){
		this.lines=lines;
		this.stage=stage;
		this.tostage=tostage;
		}
	
}
*/