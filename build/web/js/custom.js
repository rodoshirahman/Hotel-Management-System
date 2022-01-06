

// owlCarousel
$(document).ready(function() {
 
  $("#owl-demo").owlCarousel({
 
      autoPlay: 3000, //Set AutoPlay to 3 seconds
      pagination:false,
      items : 4,
      itemsDesktop : [1199,3],
      itemsDesktopSmall : [979,3]
 
  });
 
     $(".our_team").owlCarousel({
 
      autoPlay: 3000, //Set AutoPlay to 3 seconds
      pagination:false,
      items : 1,
      itemsDesktop : [1199,3],
      itemsDesktopSmall : [979,3]
 
  });
 
});








// news
 var i = 0;

$(document).ready(function(){
  var interval = setInterval(function () {
    i += 4; // speed
    $('#news').animate({ scrollTop: i }, 1);
    if (i >= $('#news').prop('scrollHeight') - $('#news').height()) {
      i = 0;
    }
  }, 100);
});



 // scroll up js

 
// ===== Scroll to Top ==== 
      $(window).scroll(function() {
          if ($(this).scrollTop() >= 50) {        // If page is scrolled more than 50px
              $('#return-to-top').fadeIn(200);    // Fade in the arrow
          } else {
              $('#return-to-top').fadeOut(200);   // Else fade out the arrow
          }
      });
      $('#return-to-top').click(function() {      // When arrow is clicked
          $('body,html').animate({
              scrollTop : 0                       // Scroll to top of body
          }, 500);
      });


      