let themeBtn = document.getElementById("themeBtn");
let themeIcon = document.getElementById("themeIcon");

themeBtn.addEventListener("click", function() {

    document.body.classList.toggle("light-mode");

    if (document.body.classList.contains("light-mode")) {
        themeIcon.textContent = "☀";
    } else {
        themeIcon.textContent = "☾";
    }

});


let menuBtn = document.getElementById("menuBtn");
let navLinks = document.getElementById("navLinks");

menuBtn.addEventListener("click", function() {

    navLinks.classList.toggle("open");

});


let links = document.querySelectorAll(".nav-link");

links.forEach(function(link) {

    link.addEventListener("click", function() {
        navLinks.classList.remove("open");
    });

});


let greeting = document.getElementById("greeting");
let hour = new Date().getHours();

if (hour < 12) {

    greeting.textContent = "Good Morning 👋";

} else if (hour < 18) {

    greeting.textContent = "Good Afternoon 👋";

} else {

    greeting.textContent = "Good Evening 👋";

}


let topButton = document.getElementById("backToTop");

window.addEventListener("scroll", function() {

    if (window.scrollY > 500) {
        topButton.classList.add("show");
    } else {
        topButton.classList.remove("show");
    }

});


topButton.addEventListener("click", function() {

    window.scrollTo({
        top: 0,
        behavior: "smooth"
    });

});


let sections = document.querySelectorAll("section[id]");

window.addEventListener("scroll", function() {

    let current = "";

    sections.forEach(function(section) {

        let sectionTop = section.offsetTop - 150;
        let sectionHeight = section.offsetHeight;

        if (
            window.scrollY >= sectionTop &&
            window.scrollY < sectionTop + sectionHeight
        ) {
            current = section.getAttribute("id");
        }

    });


    links.forEach(function(link) {

        link.classList.remove("active");

        if (link.getAttribute("href") === "#" + current) {
            link.classList.add("active");
        }

    });

});


let form = document.getElementById("contactForm");

form.addEventListener("submit", function(event) {

    event.preventDefault();

    let name = document.getElementById("name").value.trim();
    let email = document.getElementById("email").value.trim();
    let message = document.getElementById("message").value.trim();

    let nameError = document.getElementById("nameError");
    let emailError = document.getElementById("emailError");
    let messageError = document.getElementById("messageError");

    nameError.textContent = "";
    emailError.textContent = "";
    messageError.textContent = "";

    document.getElementById("formSuccess").classList.remove("show");

    let valid = true;

    if (name === "") {
        nameError.textContent = "Please enter your name.";
        valid = false;
    } else if (name.length < 2) {
        nameError.textContent = "Name must contain at least 2 characters.";
        valid = false;
    }


    if (email === "") {
        emailError.textContent = "Please enter your email.";
        valid = false;
    } else if (!email.includes("@") || !email.includes(".")) {
        emailError.textContent = "Please enter a valid email.";
        valid = false;
    }


    if (message === "") {
        messageError.textContent = "Please enter a message.";
        valid = false;
    } else if (message.length < 10) {
        messageError.textContent = "Message should contain at least 10 characters.";
        valid = false;
    }


    if (valid) {

        document.getElementById("formSuccess").classList.add("show");

        form.reset();

    }

});


let inputs = document.querySelectorAll("input, textarea");

inputs.forEach(function(input) {

    input.addEventListener("input", function() {

        if (input.id === "name") {
            document.getElementById("nameError").textContent = "";
        }

        if (input.id === "email") {
            document.getElementById("emailError").textContent = "";
        }

        if (input.id === "message") {
            document.getElementById("messageError").textContent = "";
        }

    });

});