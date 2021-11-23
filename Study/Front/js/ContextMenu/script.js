var test = document.querySelector("#test");
var button = document.querySelector("#buttonClick");

if (test != null) {
  test.addEventListener("click", function (e) {
    alert("확인");
  });
  test.addEventListener('')
}

if (button != null) {
  button.addEventListener("click", (e) => {
    alert("확인");
  });
}

function checked() {
  alert("확인");
}
