// const cards = document.querySelectorAll("div .c-card");
// const input = document.querySelector('#myInput');
// const filter = input.value.toUpperCase();
// console.log(cards);
//
// function f() {
//     for(let i = 0; i < cards.length; i++) {
//         let title = cards[i].getElementsByTagName("h3")[0];
//         let txtValue = title.textContent || title.innerText;
//         if (txtValue.toUpperCase().indexOf(filter) > -1) {
//             cards[i].style.display = "";
//             console.log("1st one")
//         } else {
//             cards[i].style.display = "none";
//             console.log("2st one")
//         }
//     }
//
// }
//
// input.addEventListener('keyup', f);


// cards[1].style.display = 'none';




// function myFunction() {
//     // Declare variables
//     var input, filter, ul, li, a, i, txtValue;
//     input = document.getElementById('myInput');
//     filter = input.value.toUpperCase();
//     ul = document.getElementById("myUL");
//     li = ul.getElementsByTagName('li');
//
//     // Loop through all list items, and hide those who don't match the search query
//     for (i = 0; i < li.length; i++) {
//         a = li[i].getElementsByTagName("a")[0];
//         txtValue = a.textContent || a.innerText;
//         if (txtValue.toUpperCase().indexOf(filter) > -1) {
//             li[i].style.display = "";
//         } else {
//             li[i].style.display = "none";
//         }
//     }
// }