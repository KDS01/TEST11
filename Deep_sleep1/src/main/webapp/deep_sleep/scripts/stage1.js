let stage1Start=[
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
let stage1Organize =
		[
				"사회인답게 이성적으로 생각해보자…  사실 이 정도 문제야 열쇠공에게 부탁하면 간단하게 열 수 있잖아?",
				"생각이 미친 김에 휴대폰을 꺼냈지만 전화를 걸기도 전에 눈에 들어오는 숫자에 좌절하고 말았다",
				"'02시 58분'",
				"이 시간까지 일하고 있을 열정 넘치는 열쇠공분은 아마도 없겠지",
				"생각이 미치니 갑자기 화가 치솟았다.",
				"가뜩이나 피곤하고 지친 하루인데, 안 그래도 힘든데 세상 모든게 최선을 다해 날 방해하고 있는 느낌이다.",
				"그 순간 옆집 문 구석쪽에 놓여있던 작은 장도리가 눈에 들어왔다.",
				"\"저건 분명…\" ",
				"옆집 아저씨가 찌그러진 계단 난간을 펴보겠다고 망치질하다가 포기하고 던져버린 녀석이다.",
				"\'조사 대상 목록에 단서 : 장도리 가 추가되었습니다\'"
		];
let S1Ending=
		[
			"이미 머리 끝까지 화가 난 상태라 장도리를 집자 마자 이성이 반 정도 날아가는 걸 느꼈다.",
			"장도리를 천천히 고쳐잡으며 현관문으로 향했다",
			"이제 더 이상 방해하지마!",
			"...",
			".....",
			"쾅!!",
			"쾅!!!",
			"쾅!!!! 콰직!!!!",
			"도어락은 싱거울 정도로 쉽게 부서졌다.",
			"\"집에 오자마자 이게 뭐하는 짓인지...\" ",
			"그래도 문은 열었네... 이만 집에 들어가자...",
			"[Stage 1] CLEAR"
		];
let frontDoor=
			[
				"늘 보던 현관문이다.",
				" 이걸 빨리 열어야 집에 들어가서 쉴 수 있을텐데..."
			];   
let arr=[];
let count=0;


function frontDoor(){
    alert("늘 보던 현관문이다.");
}
function doorLock(){
    alert("도어락 대사")
}
function getLines(){
    return lines;
}
function narrator(arr1){
	let text=document.getElementById('linebox').innerHTML;
	
    const el=document.getElementsByClassName('linesbox')
    el.onclick=new function(){
        document.getElementById('linebox').innerHTML=arr1[count];
        }
    count++;
    if(arr1[count]==null){
		document.getElementById('linebox').innerHTML=text;
	}
	
}
function toNextStage(arr1){
    const el=document.getElementsByClassName('linesbox')
    el.onclick=new function(){
        document.getElementById('linebox').innerHTML=arr1[count];
        }
    count++;
    if(arr1[count]==null&&arr1==stage1Start){
		window.location.href="/Deep_sleep1/deep_sleep/stage1/stage1-1.jsp"
	}
	else if(arr1[count]==null&&arr1==stage1Organize){
		window.location.href="/Deep_sleep1/deep_sleep/stage1/stage1-2.jsp"
	}
	else if(arr1[count]==null&&arr1==S1Ending){
		window.location.href="/Deep_sleep1/deep_sleep/stage2/index.jsp"
	}
 }

function provisos(){
    let a=document.getElementById("submenu");

}
const modal = document.getElementById("modal");
const openModalBtn = document.getElementById("open-modal");
const closeModalBtn = document.getElementById("close-modal");
const modal2 = document.getElementById("modal2");
const openModalBtn2 = document.getElementById("open-modal2");
const closeModalBtn2 = document.getElementById("close-modal2");
openModalBtn.onclick = (e) => {
  e.stopPropagation();
  modal.style.display = "block";
  document.body.style.overflow = "hidden";
};
closeModalBtn.onclick=() => {
  modal.style.display = "none";
  document.body.style.overflow = "auto";
};
openModalBtn2.onclick = (e) => {
    e.stopPropagation();
    modal2.style.display = "block";
    document.body.style.overflow = "hidden";
  };
  closeModalBtn2.onclick=() => {
    modal2.style.display = "none";
    document.body.style.overflow = "auto";
  };






