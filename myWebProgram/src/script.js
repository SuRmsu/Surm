const nav = document.querySelector("#nav");
const navList = nav.querySelector(".nav-list");

window.addEventListener("scroll",e => {
    if(window.scrollY > nav.offsetHeight + 100) {
        nav.classList.add("active");
    }else{
        nav.classList.remove("active");
    }
})
