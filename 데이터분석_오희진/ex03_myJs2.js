
let margin_btn = document.getElementById("margin_btn");
let border_btn = document.getElementById("border_btn");

margin_btn.addEventListener("click", () => {
    box2.style.marginLeft ="100px";
    box3.style.marginLeft ="200px";
    box4.style.marginLeft ="300px";
})



border_btn.addEventListener("click",() => {
    box1.style.borderTopRightRadius ="50px";
    box1.style.borderEndStartRadius ="50px";
    box2.style.borderTopRightRadius ="50px";
    box2.style.borderEndStartRadius ="50px";
    box3.style.borderTopRightRadius ="50px";
    box3.style.borderEndStartRadius ="50px";
    box4.style.borderTopRightRadius ="50px";
    box4.style.borderEndStartRadius ="50px";
    box2.style.marginLeft ="100px";
    box3.style.marginLeft ="200px";
    box4.style.marginLeft ="300px";
  
})
