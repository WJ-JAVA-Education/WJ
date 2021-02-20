var color1 = document.querySelector(".color1");
var color2 = document.querySelector(".color2");
var h3 = document.querySelector("h3");
var body = document.getElementById("gradient");

//addEventListner (a: 이벤트타입 , b: 실행함수)
color1.addEventListener("input", setGradient);
color2.addEventListener("input", setGradient);

function setGradient() {
  body.style.background = `linear-gradient(to right, ${color1.value} , ${color2.value})`;
  h3.textContent = body.style.background + ";"; // 화면에 색깔및 사용방법 표시
}
