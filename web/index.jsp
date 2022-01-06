<%-- 
    Document   : index
    Created on : Apr 14, 2019, 1:20:51 PM
    Author     : khadi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta http-equiv="x-ua-compatible" content="ie=edge">

        <title>Silver Marine</title>
        <!-- Font Awesome -->
        <link href="css/font-awesome.css" rel="stylesheet"> 
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <!-- Material Design Bootstrap -->
        <link href="css/mdb.min.css" rel="stylesheet">

        <!-- Owl Stylesheets -->
        <link rel="stylesheet" href="css/owl.carousel.css">
        <link rel="stylesheet" href="css/owl.theme.css">
        <link rel="stylesheet" type="text/css" href="css/owl.transitions.css">
        <!-- Your custom styles (optional) -->
        <link href="css/style.css" rel="stylesheet">
        <!-- fonts -->
        <link href="https://fonts.googleapis.com/css?family=Federo|Lobster|Shrikhand" rel="stylesheet">

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script src="js/parallax.js"></script>
    </head>
    <body>
        <header>
            <div class="banner-top bg-light">
                <div class="container-fluid">
                    <div class="d-flex">
                        <div class="p-2">
                            <img src="img/f1.png" height="30"> 
                        </div>
                        <div class="p-2">
                            <img src="img/if_google_plus_986946.png" height="30">
                        </div>
                        <div class="p-2">
                            <img src="img/if_twitter_252077.png" height="30">
                        </div>
                        <div class="ml-auto p-2 bug">
                            <img src="img/if_mail-24_103176.png" class="px-2" height="20">
                            info@SilverMarine.com
                        </div>
                        <div class=" p-2 bug">
                            <img src="img/if_call_326500.png" class="px-2" height="20">
                            (+880) 1675 222 445
                        </div>
                    </div>
                </div>


                <nav class="navbar navbar-expand-lg navbar-dark main-nav">
                    <div class="container">
                        <div class="navbar-header">  
                            <h1><a class="navbar-brand" href="index.php">Silver <span>Marine</span><p class="logo_caption">Your Dreamy Resort</p></a></h1>
                        </div>
                        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false"
                                aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon ">
                                <i class="fa fa-bars text-danger" aria-hidden="true"></i>
                            </span>
                        </button>

                        <div class="collapse navbar-collapse" id="navbarNav">
                            <ul class="navbar-nav">
                                <li class="nav-item active">
                                    <a class="nav-link" href="#">Home</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link scroll" href="#about">About</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link scroll" href="#team">Team</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link scroll" href="#gallery">Gallery</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link scroll" href="#rates">Rooms</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link scroll" href="#contact">Contact Us</a>
                                </li>
                                <li class="nav-item">
                                    <!--                <a class="nav-link" href="Admin/register.html"></a>-->
                                </li>
                            </ul>
                        </div>
                    </div>
                </nav>
        </header>  

        <div id="banner">
            <!--Carousel Wrapper-->
            <div id="carousel-example-2" class="carousel slide carousel-fade" data-ride="carousel">
                <!--Indicators-->
                <ol class="carousel-indicators">
                    <li data-target="#carousel-example-2" data-slide-to="0" class="active"></li>
                    <li data-target="#carousel-example-2" data-slide-to="1"></li>
                    <li data-target="#carousel-example-2" data-slide-to="2"></li>
                </ol>
                <!--/.Indicators-->
                <!--Slides-->
                <div class="carousel-inner" role="listbox">
                    <div class="carousel-item active">
                        <div class="view hm-black-light">
                            <img class="d-block w-100 img-fluid" src="img/c3.jpg" alt="First slide">
                            <div class="mask"></div>
                        </div>
                        <div class="carousel-caption d-none d-md-block text">
                            <h1>Silver Marine</h1>
                            <h3>We Know What You Love</h3>
                            <p>Welcome to our hotel</p>
                            <button type="button" class="btn bg-btn" data-toggle="modal" data-target="#myModal">Learn More</button>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <!--Mask color-->
                        <div class="view hm-black-light">
                            <img class="d-block w-100 img-fluid" src="img/c2.jpg" alt="Second slide">
                            <div class="mask"></div>
                        </div>
                        <div class="carousel-caption d-none d-md-block text">
                            <h1>Silver Marine</h1>
                            <h3>Best Place for rest</h3>
                            <p>Get Accomodation today</p>
                            <button type="button" class="btn bg-btn" data-toggle="modal" data-target="#myModal">Learn More</button>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <!--Mask color-->
                        <div class="view hm-black-light">
                            <img class="d-block w-100 img-fluid" src="img/c1.jpg" alt="Third slide">
                            <div class="mask"></div>
                        </div>
                        <div class="carousel-caption d-none d-md-block text">
                            <h1>Silver Marine</h1>
                            <h3>Eat! Drink! &amp; Enjoy!</h3>
                            <p>In the most luxious hotel</p>
                            <button type="button" class="btn bg-btn" data-toggle="modal" data-target="#myModal">Learn More</button>
                        </div>
                    </div>

                </div>
                <!--/.Slides-->
                <!--Controls-->
                <a class="carousel-control-prev" href="#carousel-example-2" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#carousel-example-2" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
                <!--/.Controls-->
            </div>
            <!--/.Carousel Wrapper-->
            <div class="clearfix"> </div>
        </div>                

        <!-- Modal -->
        <div class="modal fade" id="myModal"  role="dialog">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4>SILVER  <span>MARINE</span></h4>
                        <img src="img/ji.jpg" alt=" " class="img-responsive">
                        <h5>We know what you love</h5>
                        <p>Providing guests unique and enchanting views from their rooms with its exceptional amenities, makes Star Hotel one of bests in its kind.Try our food menu, awesome services and friendly staff while you are here.</p>
                    </div>
                </div>
            </div>
        </div>


        
        
        

        <div class="reserve">
            <a href="http://localhost:8084/Hotel_Management/pages/register.jsp">
                <button type="button" id="book" class="btn btn-lg btn-block">
                    <h2 class="justify-content-center font-weight-bold">Room Reservation</h2>
                </button>
            </a>
            <div class="clearfix"> </div>
        </div>

        
        
        
        
        
        
        <div id="carosuel_bottom">
            <div class="container-fluid pb-5">
                <h2 class="d-flex justify-content-center pt-5 p-2">EXPERIENCE A GOOD STAY, ENJOY FANTASTIC OFFERS</h2>
                <h6 class="d-flex justify-content-center pb-2">FIND OUR FRIENDLY WELCOMING RECEPTION</h6>
            </div>
        </div>

        <div id="offers">
            <div class="container">
                <div class="row">
                    <div class="col-md-3 p-5 text-center example hoverable">
                        <i class="fa fa-bed fa-5x icon" aria-hidden="true"></i>
                        <h4 class="pt-3 font-weight-bold">Master Bedrooms</h4>
                        <p class="p-2 pg">SILVER MARINE</p>
                    </div>
                    <div class="col-md-3 p-5 text-center example hoverable">
                        <i class="fa fa-building fa-5x icon" aria-hidden="true"></i>
                        <h4 class="pt-3 font-weight-bold">Sea View Balcony</h4>
                        <p class="p-2 pg">SILVER MARINE</p>
                    </div>
                    <div class="col-md-3 p-5 text-center example hoverable">
                        <i class="fa fa-coffee fa-5x icon" aria-hidden="true"></i>
                        <h4 class="pt-3 font-weight-bold">Large Caffe</h4>
                        <p class="p-2 pg">SILVER MARINE</p>
                    </div>
                    <div class="col-md-3 p-5 text-center example hoverable">
                        <i class="fa fa-wifi fa-5x icon" aria-hidden="true"></i>
                        <h4 class="pt-3 font-weight-bold">Wifi Coverage</h4>
                        <p class="p-2 pg">SILVER MARINE</p>
                    </div>
                </div>
            </div>
        </div>

        <div id="about">
            <h1 class="text-center">ABOUT</h1>
            <h5 class="text-center p-4">Lorem Ipsum is simply dummy text of the printing and typesetting industry.Sed tempus vestibulum lacus blandit faucibus. Nunc imperdiet, diam nec rhoncus ullamcorper, nisl nulla suscipit ligula, at imperdiet urna</h5>
            <!-- <div class="parallax-window" id="parallax" data-parallax="scroll" data-image-src="img/ji.jpg" alt="car"> -->

            <div class="view hm-black-light">
                <img src="img/pk.png" class="img-fluid w-100">
                <div class="mask"></div>
            </div>
            <div class="container-fluid" style="height: 100px;">
                <div class="row about_text pb-5">
                    <div class="col-md-6 pt-4 mr-5 ">
                        <h2 class="text-center ">WELCOME TO SILVER MARINE</h2>
                        <h5 class="text-center">The pride of all beach resorts and the epitome of true hospitality with exemplary dining and award-winning service, that pampers you to the core at one of the best restaurants.Sed tempus vestibulum lacus blandit faucibus. Nunc imperdiet, diam nec rhoncus ullamcorper, nisl nulla suscipit ligula, at imperdiet urna</h5>
                    </div>
                    <div class="col-md-4 ml-5 mr-5 pb-5">
                        <img src="img/1.jpg" class="img-fluid rounded-circle hoverable" alt="hoverable">
                    </div>
                </div>
            </div>
        </div>
    </div>



    <div id="rates">
        <div class="container">
            <h1 class="text-center">ROOMS &amp; RATES</h1>

            <div class="card-deck pt-5 mb-5">
                <div class="card">
                    <img class="card-img-top" src="img/r1.jpg" alt="Card image cap">
                    <div class="card-body">
                        <h4 class="card-title d-flex justify-content-end">Deluxe Room</h4>
                        <div class="price-gd-bottom">
                            <div class="stars">
                                <ul>
                                    <li><i class="fa fa-star" aria-hidden="true"></i></li>
                                    <li><i class="fa fa-star" aria-hidden="true"></i></li>
                                    <li><i class="fa fa-star" aria-hidden="true"></i></li>
                                    <li><i class="fa fa-star" aria-hidden="true"></i></li>
                                    <li><i class="fa fa-star-o" aria-hidden="true"></i></li>

                                </ul>
                            </div>
                            <div class="price-selet"> 
                                <h3 class="text-center"><span>$</span>320</h3>            

                            </div>
                            <a href="register.html">
                                <button type="button" class="btn btn-amber"> Book Now</button>
                            </a>
                        </div>
                    </div>

                </div>
                <div class="card">
                    <img class="card-img-top" src="img/r2.jpg" alt="Card image cap">
                    <div class="card-body">
                        <h4 class="card-title d-flex justify-content-end">Luxury Room</h4>
                        <div class="price-gd-bottom">
                            <div class="stars">
                                <ul>
                                    <li><i class="fa fa-star" aria-hidden="true"></i></li>
                                    <li><i class="fa fa-star" aria-hidden="true"></i></li>
                                    <li><i class="fa fa-star" aria-hidden="true"></i></li>
                                    <li><i class="fa fa-star" aria-hidden="true"></i></li>
                                    <li><i class="fa fa-star-o" aria-hidden="true"></i></li>
                                </ul>
                            </div>
                            <div class="price-selet"> 
                                <h3 class="text-center"><span>$</span>220</h3>            

                            </div>
                            <a href=register.html">
                                <button type="button" class="btn btn-amber"> Book Now</button>
                            </a>
                        </div>
                    </div>
                </div>

                <div class="card">
                    <img class="card-img-top" src="img/r3.jpg" alt="Card image cap">
                    <div class="card-body">
                        <h4 class="card-title d-flex justify-content-end">Guest House</h4>
                        <div class="price-gd-bottom">
                            <div class="stars">
                                <ul>
                                    <li><i class="fa fa-star" aria-hidden="true"></i></li>
                                    <li><i class="fa fa-star" aria-hidden="true"></i></li>
                                    <li><i class="fa fa-star" aria-hidden="true"></i></li>
                                    <li><i class="fa fa-star-o" aria-hidden="true"></i></li>
                                    <li><i class="fa fa-star-o" aria-hidden="true"></i></li>
                                </ul>
                            </div>
                            <div class="price-selet"> 
                                <h3 class="text-center"><span>$</span>180</h3>            

                            </div>
                            <a href="register.html">
                                <button type="button" class="btn btn-amber"> Book Now</button>
                            </a>
                        </div>
                    </div>
                </div>

                <div class="card">
                    <img class="card-img-top" src="img/r4.jpg" alt="Card image cap">
                    <div class="card-body">
                        <h4 class="card-title d-flex justify-content-end">Single Room</h4>
                        <div class="price-gd-bottom">
                            <div class="stars">
                                <ul>
                                    <li><i class="fa fa-star" aria-hidden="true"></i></li>
                                    <li><i class="fa fa-star" aria-hidden="true"></i></li>
                                    <li><i class="fa fa-star-o" aria-hidden="true"></i></li>
                                    <li><i class="fa fa-star-o" aria-hidden="true"></i></li>
                                    <li><i class="fa fa-star-o" aria-hidden="true"></i></li>
                                </ul>
                            </div>
                            <div class="price-selet"> 
                                <h3 class="text-center"><span>$</span>150</h3>            
                            </div>
                            <a href="register.html">
                                <button type="button" class="btn btn-amber"> Book Now</button>
                            </a>
                        </div>
                    </div>
                </div>
            </div><!-- card deck -->

        </div><!-- container -->
    </div>


    <!--sevices-->
    <div id="services" style="height: 650px">
        <div class="view hm-black-strong service-img">

            <div class="mask"></div>
        </div>
        <div class="service-text">
            <div class="container">
                <h1 class="text-center pb-5">Our Services</h1>
                <div class="row">
                    <div class="col-md-6 col-sm-12 col">
                        <div class="service-block ">
                            <div class="text-center  mb-5"><i class="fa fa-credit-card fa-2x " aria-hidden="true"></i></div>
                            <h4>Stay First, Pay After! </h4>
                            <p>Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet ut et voluptates.</p>
                            <p><i class="fa fa-check" aria-hidden="true"></i>Decorated room, proper air conditioned</p>
                            <p><i class="fa fa-check" aria-hidden="true"></i>Private balcony</p>

                        </div>
                    </div>

                    <div class="col-md-6 col-sm-12">
                        <div class="service-block">
                            <div class="text-center mb-5"><i class="fa fa-clock-o fa-2x " aria-hidden="true"></i></div>
                            <h4 class="pl-5">24 Hour Restaurant</h4>
                            <p class="pl-5">Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet ut et voluptates.</p>
                            <p class="pl-5"><i class="fa fa-check" aria-hidden="true"></i>24 hours room service</p>
                            <p class="pl-5"><i class="fa fa-check" aria-hidden="true"></i>24-hour Concierge service</p>
                        </div>
                    </div>
                    <div class="clearfix"> </div>
                </div>
            </div>
        </div>
    </div>
    <!--//sevices-->

    <section id="team">
        <div class="container">
            <div class="row flex-center sm-no-flex">

                <div class="pull-right sm-no-float col-md-8">
                    <ul class="team-members">
                        <!-- single member row starts -->
                        <li class="clearfix">
                            <div class="member-details">
                                <div>
                                    <img src="https://www.ardenestates.co.uk/resource/team-photos/andy-lansbury-headshot.png" alt="UI Designer">
                                    <div class="member-info">
                                        <h3>John Doe</h3>
                                        <p>Manager</p>
                                    </div>
                                </div>
                            </div>

                            <div class="member-details">
                                <div>
                                    <img src="https://www.ardenestates.co.uk/resource/team-photos/ben-rooney-headshot.png" alt="UI Designer">
                                    <div class="member-info">
                                        <h3>Mayh Drew</h3>
                                        <p>Manager</p>
                                    </div>
                                </div>
                            </div>

                            <div class="member-details">
                                <div>
                                    <img src="https://axis.org/wp-content/uploads/2014/10/chris-headshot.png" alt="UI Designer">
                                    <div class="member-info">
                                        <h3>Dyan Fox</h3>
                                        <p>Manager</p>
                                    </div>
                                </div>
                            </div>
                        </li><!-- /single member row ends -->

                        <!-- single member row starts -->
                        <li class="clearfix">
                            <div class="member-details">
                                <div>
                                    <img src="https://axis.org/wp-content/uploads/2015/05/evan-headshot.png" alt="UI Designer">
                                    <div class="member-info">
                                        <h3>Tom Jew</h3>
                                        <p>Receptionist</p>
                                    </div>
                                </div>
                            </div>

                            <div class="member-details">
                                <div>
                                    <img src="http://gocheckers.com/images/roster/andrew_poturalski_headshot_1718.png" alt="UI Designer">
                                    <div class="member-info">
                                        <h3>John Sew</h3>
                                        <p>Receptionist</p>
                                    </div>
                                </div>
                            </div>

                            <div class="member-details">
                                <div>
                                    <img src="https://axis.org/wp-content/uploads/2015/12/2015-Dougie-Headshot.png" alt="UI Designer">
                                    <div class="member-info">
                                        <h3>Cavin Wane</h3>
                                        <p>Receptionist</p>
                                    </div>
                                </div>
                            </div>
                        </li><!-- /single member row ends -->

                        <!-- single member row starts -->
                        <li class="clearfix">
                            <div class="member-details">
                                <div>
                                    <img src="https://www.ardenestates.co.uk/resource/team-photos/ben-rooney-headshot.png" alt="UI Designer">
                                    <div class="member-info">
                                        <h3>Sevan Noir</h3>
                                        <p>Admin</p>
                                    </div>
                                </div>
                            </div>

                            <div class="member-details">
                                <div>
                                    <img src="https://axis.org/wp-content/uploads/2014/12/jeremiah-e1418073411753.png" alt="UI Designer">
                                    <div class="member-info">
                                        <h3>Wann Doice</h3>
                                        <p>Admin</p>
                                    </div>
                                </div>
                            </div>

                            <div class="member-details">
                                <div>
                                    <img src="http://gocheckers.com/images/roster/josh_wesley_headshot_1718.png" alt="UI Designer">
                                    <div class="member-info">
                                        <h3>Evan Rek</h3>
                                        <p>Admin</p>
                                    </div>
                                </div>
                            </div>
                        </li><!-- /single member row ends -->

                    </ul><!-- /end team-photos -->
                </div><!-- /end col-md-8 -->

                <div class="pull-left col-md-4 sm-text-center">
                    <div class="team-overview">
                        <h2>Who Are We?</h2>
                        <a href="#">Meet the Entire Team</a>
                        <p><div>Our hotel is one of the most reknowned hotels in Cox's Bazar.Our responsible team is working very hard from years which made us reach the success peak where we are standing today.</div></p>
                    </div>
                </div><!-- /end col-md-4 -->
            </div><!-- /end row -->
        </div><!-- /end container -->
    </section>








    <section class="portfolio-w3ls" id="gallery">
        <h1 class="text-center pb-3">Our Gallery</h1>
        <div class="row">
            <div class="col-md-3 gallery-grid gallery1">
                <a href="img/g1.jpg" class="swipebox"><img src="img/g1.jpg" class="img-responsive" alt="/">
                    <div class="textbox">
                        <h4>SILVER MARINE</h4>
                        <p><i class="fa fa-picture-o" aria-hidden="true"></i></p>
                    </div>
                </a>
            </div>
            <div class="col-md-3 gallery-grid gallery1">
                <a href="img/g2.jpg" class="swipebox"><img src="img/g2.jpg" class="img-responsive" alt="/">
                    <div class="textbox">
                        <h4>SILVER MARINE</h4>
                        <p><i class="fa fa-picture-o" aria-hidden="true"></i></p>
                    </div>
                </a>
            </div>
            <div class="col-md-3 gallery-grid gallery1">
                <a href="img/g3.jpg" class="swipebox"><img src="img/g3.jpg" class="img-responsive" alt="/">
                    <div class="textbox">
                        <h4>SILVER MARINE</h4>
                        <p><i class="fa fa-picture-o" aria-hidden="true"></i></p>
                    </div>
                </a>
            </div>
            <div class="col-md-3 gallery-grid gallery1">
                <a href="img/g4.jpg" class="swipebox"><img src="img/g4.jpg" class="img-responsive" alt="/">
                    <div class="textbox">
                        <h4>SILVER MARINE</h4>
                        <p><i class="fa fa-picture-o" aria-hidden="true"></i></p>
                    </div>
                </a>
            </div>
        </div>

        <div class="row">
            <div class="col-md-3 gallery-grid gallery1">
                <a href="img/g5.jpg" class="swipebox"><img src="img/g5.jpg" class="img-responsive" alt="/">
                    <div class="textbox">
                        <h4>SILVER MARINE</h4>
                        <p><i class="fa fa-picture-o" aria-hidden="true"></i></p>
                    </div>
                </a>
            </div>
            <div class="col-md-3 gallery-grid gallery1">
                <a href="img/g6.jpg" class="swipebox"><img src="img/g6.jpg" class="img-responsive" alt="/">
                    <div class="textbox">
                        <h4>SILVER MARINE</h4>
                        <p><i class="fa fa-picture-o" aria-hidden="true"></i></p>
                    </div>
                </a>
            </div>
            <div class="col-md-3 gallery-grid gallery1">
                <a href="img/g6.jpg" class="swipebox"><img src="img/g7.jpg" class="img-responsive" alt="/">
                    <div class="textbox">
                        <h4>SILVER MARINE</h4>
                        <p><i class="fa fa-picture-o" aria-hidden="true"></i></p>
                    </div>
                </a>
            </div>
            <div class="col-md-3 gallery-grid gallery1">
                <a href="img/g6.jpg" class="swipebox"><img src="img/g8.jpg" class="img-responsive" alt="/">
                    <div class="textbox">
                        <h4>SILVER MARINE</h4>
                        <p><i class="fa fa-picture-o" aria-hidden="true"></i></p>
                    </div>
                </a>
            </div>
        </div>
        <div class="row">
            <div class="col-md-3 gallery-grid gallery1">
                <a href="img/g9.jpg" class="swipebox"><img src="img/g9.jpg" class="img-responsive" alt="/">
                    <div class="textbox">
                        <h4>SILVER MARINE</h4>
                        <p><i class="fa fa-picture-o" aria-hidden="true"></i></p>
                    </div>
                </a>
            </div>
            <div class="col-md-3 gallery-grid gallery1">
                <a href="img/g10.jpg" class="swipebox"><img src="img/g10.jpg" class="img-responsive" alt="/">
                    <div class="textbox">
                        <h4>SILVER MARINE</h4>
                        <p><i class="fa fa-picture-o" aria-hidden="true"></i></p>
                    </div>
                </a>
            </div>
            <div class="col-md-3 gallery-grid gallery1">
                <a href="img/g4.jpg" class="swipebox"><img src="img/g4.jpg" class="img-responsive" alt="/">
                    <div class="textbox">
                        <h4>SILVER MARINE</h4>
                        <p><i class="fa fa-picture-o" aria-hidden="true"></i></p>
                    </div>
                </a>
            </div>
            <div class="col-md-3 gallery-grid gallery1">
                <a href="img/g2.jpg" class="swipebox"><img src="img/g2.jpg" class="img-responsive" alt="/">
                    <div class="textbox">
                        <h4>SILVER MARINE</h4>
                        <p><i class="fa fa-picture-o" aria-hidden="true"></i></p>
                    </div>
                </a>
            </div>
        </div>
        <div class="clearfix"> </div>
    </section>
    <!-- //gallery -->


    <section id="notice" class="pt-5 pb-5">
        <div class="container">
            <div class="row">
                <div class="col-md-6 col-sm-12">

                    <h2 class="mt-4 pt-3 pb-3">News &amp; Updates</h2>
                    <div id="news">
                        <ul class="list-unstyled">
                            <li class="media my-4">
                                <img class="mr-3" src="img/n1.png" alt="Generic placeholder image">
                                <div class="media-body">
                                    <p class="mt-0 mb-1">Leslie Thng joins Vistara as Chief Executive Officer</p>
                                </div>
                            </li>
                            <li class="media  my-4">
                                <img class="mr-3" src="img/n2.jpg" alt="Generic placeholder image">
                                <div class="media-body">
                                    <p class="mt-0 mb-1">Vistara and Avis India join hands to provide premium car rental services to Vistara customers</p>
                                </div>
                            </li>
                            <li class="media my-4">
                                <img class="mr-3" src="img/n3.jpg" alt="Generic placeholder image">
                                <div class="media-body">
                                    <p class="mt-0 mb-1">Vistara announces its Diwali Special ‘Festival of Flights’ Sale:all-in fares starting INR 1,149 in Economy and INR 2,099 in Premium Economy</p>
                                </div>
                            </li>

                            <li class="media my-4">
                                <img class="mr-3" src="img/n4.png" alt="Generic placeholder image">
                                <div class="media-body">
                                    <p class="mt-0 mb-1">Vistara announces its Diwali Special ‘Festival of Flights’ Sale:all-in fares starting INR 1,149 in Economy and INR 2,099 in Premium Economy</p>
                                </div>
                            </li>


                            <li class="media my-4">
                                <img class="mr-3" src="img/n5.png" alt="Generic placeholder image">
                                <div class="media-body">
                                    <p class="mt-0 mb-1">Vistara announces its Diwali Special ‘Festival of Flights’ Sale:all-in fares starting INR 1,149 in Economy and INR 2,099 in Premium Economy</p>
                                </div>
                            </li>

                            <li class="media my-4">
                                <img class="mr-3" src="img/n6.jpg" alt="Generic placeholder image">
                                <div class="media-body">
                                    <p class="mt-0 mb-1">Vistara announces its Diwali Special ‘Festival of Flights’ Sale:all-in fares starting INR 1,149 in Economy and INR 2,099 in Premium Economy</p>
                                </div>
                            </li>
                        </ul>
                    </div>         
                </div>


                <div class="col-md-6 col-sm-12 px-5">
                    <h2 class="mt-4 pt-3 pb-3">Deals &amp; Offers</h2>
                    <ul class="list-unstyled">
                        <li class="media">
                            <img class="mr-3" src="img/n7.jpg" alt="Generic placeholder image">
                            <div class="media-body">
                                <p class="mt-0 mb-1">Trip Offers</p>
                                <a href="register.html" class="btn btn-amber">Book Now</a>
                            </div>
                        </li>
                        <li class="media my-4">
                            <img class="mr-3" src="img/n8.jpg" alt="Generic placeholder image">
                            <div class="media-body">
                                <p class="mt-0 mb-1">Club Deals</p>
                                <a href="register.html" class="btn btn-amber">Book Now</a>
                            </div>
                        </li>
                        <li class="media">
                            <img class="mr-3" src="img/n9.png" alt="Generic placeholder image">
                            <div class="media-body">
                                <p class="mt-0 mb-1">Black Friday Offers</p>
                                <a href="register.html" class="btn btn-amber">Book Now</a>
                            </div>
                        </li>
                    </ul>  
                </div>
            </div>
        </div>
    </section>



    <!-- contact -->
    <section class="contact-w3ls" id="contact">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 col-md-6 col-sm-6 contact-w3-agile2 " data-aos="flip-left">
                    <div class="contact-agileits">
                        <h4>Contact Us</h4>
                        <p class="contact-agile2">Sign Up For Our News Letters</p>
                        <form  method="post" name="sentMessage" id="contactForm" >
                            <div class="control-group form-group">

                                <label class="contact-p1">Full Name:</label>
                                <input type="text" class="form-control" name="name" id="name" required >
                                <p class="help-block"></p>

                            </div>  
                            <div class="control-group form-group">

                                <label class="contact-p1">Phone Number:</label>
                                <input type="tel" class="form-control" name="phone" id="phone" required >
                                <p class="help-block"></p>

                            </div>
                            <div class="control-group form-group">

                                <label class="contact-p1">Email Address:</label>
                                <input type="email" class="form-control" name="email" id="email" required >
                                <p class="help-block"></p>

                            </div>


                            <input type="submit" name="sub" value="Send Now" class="btn btn-amber"> 
                        </form>
<!--                        <?php
                        if(isset($_POST['sub']))
                        {
                        $name =$_POST['name'];
                        $phone = $_POST['phone'];
                        $email = $_POST['email'];
                        $approval = "Not Allowed";
                        $sql = "INSERT INTO `contact`(`fullname`, `phoneno`, `email`,`cdate`,`approval`) VALUES ('$name','$phone','$email',now(),'$approval')" ;


                        if(mysqli_query($con,$sql))
                        echo"OK";

                        }
                        ?> -->
                    </div>
                </div>
                <div class="col-lg-6 col-md-6 col-sm-6 contact-w3-agile1 " data-aos="flip-right">
                    <h4>Connect With Us</h4>
                    <p class="contact-agile1"><strong>Phone :</strong>+880 1918875321</p>
                    <p class="contact-agile1"><strong>Email :</strong> <a href="mailto:name@example.com">INFO@SILVER_MARINE.COM</a></p>
                    <p class="contact-agile1"><strong>Address :</strong>  29, Cox's Bazar, Bangladesh</p>

                    <div class="social-bnr-agileits footer-icons-agileinfo">
                        <div class="d-flex">
                            <div class="p-2">
                                <img src="img/f1.png" height="30"> 
                            </div>
                            <div class="p-2">
                                <img src="img/if_google_plus_986946.png" height="30">
                            </div>
                            <div class="p-2">
                                <img src="img/if_twitter_252077.png" height="30">
                            </div>
                        </div>
                        <!-- <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3074.7905052320443!2d-77.84987248482734!3d39.586871613613056!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x89c9f6a80ccf0661%3A0x7210426c67abc40!2sVirginia+Welcome+Center%2FSafety+Rest+Area!5e0!3m2!1sen!2sin!4v1485760915662" ></iframe> -->
                    </div>
                </div>
                <div class="clearfix"></div>
            </div>
    </section>
    <!-- /contact -->






    <div class="copy">
        <p>© 2018 Silver Marine . All Rights Reserved | Design by <a href="index.jsp">SILVER MARINE</a> </p>
    </div>
    <!--/footer -->

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="js/jquery-3.2.1.slim.min.js"</script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>

    <!-- MDB core JavaScript -->
    <script type="text/javascript" src="js/mdb.min.js"></script>
    <!-- gallery popup -->
    <link rel="stylesheet" href="css/swipebox.css">
    <script src="js/jquery.swipebox.min.js"></script> 



    <!-- <script type="text/javascript">
      jQuery(function($) {
        $(".swipebox").swipebox();
      });
    </script> -->
    <!-- //gallery popup -->
    <!--  owl js -->
    <script src="js/owl.carousel.min.js"></script>
    <!-- custom js -->
    <script type="text/javascript" src="js/custom.js"></script>

</body>
</html>
