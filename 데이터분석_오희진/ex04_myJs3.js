let count = document.getElementById("pp");
let like = document.getElementById("like");
let dislike = document.getElementById("dislike");

like.addEventListener("click", () => {

    let sum = Number(count.textContent) + 1;
    count.textContent = `${sum}`;
})

dislike.addEventListener("click", () => {
    let sum = Number(count.textContent) - 1;
    if (sum >= 0) {
        count.textContent = `${sum}`;
    }
})

reset.addEventListener("click", () => {
    count.innerHTML = 0;
})