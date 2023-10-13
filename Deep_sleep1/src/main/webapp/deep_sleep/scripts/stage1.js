let arr=["나","레","이","션","테","스","트","용","임"];
let count=0;
function frontDoor(){
    alert("늘 보던 현관문이다.");
}
function doorLock(){
    alert("도어락 대사")
}
function SetLines(lines){
    this.lines=lines
}
function getLines(){
    return lines;
}
function narrator(arr1){
    this.arr=arr1;
    const el=document.getElementsByClassName('linesbox')
    el.onclick=new function(){
        document.getElementById('linebox').innerHTML=arr[count]
        }
    count++;
    if(arr[count]==null){
        window.location.href='stage1-1.html';
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



