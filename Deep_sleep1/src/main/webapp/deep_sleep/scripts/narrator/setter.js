const narratorElem = document.getElementById('linebox');
const toStage1_1=window.location.href="Deep_sleep1/deep_sleep/stage1/stage1-1.jsp"
const toStage1_2=window.location.href=""
const toStage2_1=window.location.href=""
const toStage2_2=window.location.href=""
const toStage3_1=window.location.href=""
const toStage3_2=window.location.href=""


function setLines(lines){
	narratorObj.narratorLines=lines;
}
function setNextstage(toStage){
	narratorObj.toNextStage=toStage;
}