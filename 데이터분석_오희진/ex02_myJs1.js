
let for_btn = document.getElementById("for_btn");
let while_btn = document.getElementById("while_btn");
let ipt = document.getElementById("ipt");
let area = document.getElementById("area");

let dan = ipt.value;


for_btn.addEventListener("click", function () {
    area.innerHTML += "for문을 이용한 구구단" +"<br>";
    for (let i = 1; i <= 9; i++) {
        let dan = ipt.value
        area.innerHTML += dan + " x " + i + " = " + (dan * i) + "<br>";

    }
})
