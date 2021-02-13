// var btnw = document.querySelector("button");
// btnw.addEventListener(`click`, handleClick);

var btns = document.querySelectorAll("button.drum");

for (var i = 0; i < btns.length; i++)
  btns[i].addEventListener("click", handleClick);

// for(var i=0; i<7; i++){
//     btns
// }

btns.addEventListener("click", handleClick);

var rn = Math.floor(Math.random() * 4) + 1;

function handleClick() {
  //   alert("클릭됨");
  var audio = new Audio(`sounds/tom-1.mp3`);
  audio.play();
}
