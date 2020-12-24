//테스트

var img1 = document.querySelector(".img1");
var img2 = document.querySelector(".img2");
var h1 = document.querySelector("h1");

var randomNumber1 = Math.floor(Math.random() * 6) + 1;
var randomNumber2 = Math.floor(Math.random() * 6) + 1;

img1.setAttribute("src", "images/dice" + randomNumber1 + ".png");
img2.setAttribute("src", "images/dice" + randomNumber2 + ".png");

Math.floor(Math.random() * 6) + 1;

if (randomNumber1 > randomNumber2) {
  h1.textContent = "🍭Player 1 Wins!";
} else if (randomNumber1 < randomNumber2) {
  h1.textContent = "Player 2 Wins!🍭";
} else {
  h1.textContent = "Draw!";
}

function reBtn() {
  var img1 = document.querySelector(".img1");
  var img2 = document.querySelector(".img2");
  var h1 = document.querySelector("h1");

  var randomNumber1 = Math.floor(Math.random() * 6) + 1;
  var randomNumber2 = Math.floor(Math.random() * 6) + 1;

  img1.setAttribute("src", "images/dice" + randomNumber1 + ".png");
  img2.setAttribute("src", "images/dice" + randomNumber2 + ".png");

  Math.floor(Math.random() * 6) + 1;

  if (randomNumber1 > randomNumber2) {
    h1.textContent = "🍭Player 1 Wins!";
  } else if (randomNumber1 < randomNumber2) {
    h1.textContent = "Player 2 Wins!🍭";
  } else {
    h1.textContent = "Draw!";
  }
}
