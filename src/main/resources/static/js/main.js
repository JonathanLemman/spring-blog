
// Google Map with Marker //
let map;
function initMap() {
    const sanAntonio = {lat: 29.424, lng: -98.4936}
    map = new google.maps.Map(document.getElementById('map'), {
        center: sanAntonio,
        zoom: 10
    });
    let marker = new google.maps.Marker({position: sanAntonio, map: map});
}