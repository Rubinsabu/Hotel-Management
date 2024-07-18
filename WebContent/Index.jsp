<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HOTEL S&P</title>
        <link rel="stylesheet" href="css/indexstyle.css">

        <link rel = "icon" href = "images/logo.png" type = "image/png">
	<script src="https://kit.fontawesome.com/b2675ac159.js" crossorigin="anonymous"></script>
</head>

<body>
		
		
		 <!-- header -->
        <header class = "header" id = "header">
            <div class = "head-top">
                <div class = "head-bottom flex">
                    <h2>Salt & Pepper</h2>
                    <p style="font-size:xx-large">One of the most popular Salt & Pepper Resort, offers a perfect blend of all modern luxuries and a comfortable companionship of nature. we have provided premium resort experience...</p>

                    <a  href="#services"><button type = "button" class = "head-btn">GET STARTED</button></a>
                </div>
                <div class = "site-nav">
                    <ul class = "navbar">
                        <li><a href = "#footer">About Us</a></li>
                        <li><a href = "#services">services</a></li>
                        <li><a href = "#rooms">rooms</a></li>
                        <li><a href = "login.jsp">Staff Login</a></li>
                        <li><a href = "login.jsp">Admin Login</a></li>
                        <li><a href = "booking.jsp">Booking</a></li>
                    </ul>
                </div>
            </div>

            
        </header>
        <!-- end of header -->

        <!-- body content  -->
        <section class = "services sec-width" id = "services">
            <div class = "title">
                <h2>services</h2>
            </div>
            <div class = "services-container">
                <!-- single service -->
                <article class = "service">
                    <div class = "service-icon">
                        <span>
                            <i class = "fas fa-utensils"></i>
                        </span>
                    </div>
                    <div class = "service-content">
                        <h2>Food Service/ Food Runner</h2>
                        <p>Two outstanding restaurants , one better than the other will satisfy every food lover who chooses to drop in. International standards are maintained, ingredients are chosen with highest care and the upkeep is meticulous. The décor in each of them is bettered only by the quality of the stuff that is dished out.</p>
                     <!--   <button type = "button" class = "btn">Know More</button>-->
                    </div>
                </article>
                <!-- end of single service -->
                <!-- single service -->
                <article class = "service">
                    <div class = "service-icon">
                        <span>
                            <i class="fa-solid fa-hand-sparkles"></i>
                        </span>
                    </div>
                    <div class = "service-content">
                        <h2>Spa</h2>
                        <p>Well being through the practice of Ayurveda is an age old tradition in India especially in the southern state of Kerala, known as the birth place of true Ayurveda. Various traditions and treatments associated with Ayurveda are inherently connected to this state and if anyone who wishes to have a complete feel of the process there isn’t another place to go to.</p>
                     <!--   <button type = "button" class = "btn">Know More</button> -->
                    </div>
                </article>
                <!-- end of single service -->
                <!-- single service -->
                <article class = "service">
                    <div class = "service-icon">
                        <span>
                            <i class="fa-solid fa-people-roof"></i>
                        </span>
                    </div>
                    <div class = "service-content">
                        <h2>Conference Hall</h2>
                        <p>Be it a business meeting, a conference, training program, seminar, or a family reunion, our conference hall equipped with all the necessary audio & video equipment is the ideal space for small get-togethers & celebrations.</p>
                    </div>
                </article>
                <!-- end of single service -->
                <!-- single service -->
                <article class = "service">
                    <div class = "service-icon">
                        <span>
                            <i class="fa-solid fa-person-swimming"></i>
                        </span>
                    </div>
                    <div class = "service-content">
                        <h2>Swimming Pool</h2>
                        <p>Although the temperatures in Vagamon linger around pleasantness all year round, a dip in the pool is always a good idea. Enjoy a swim at our infinity pool or spend a few moments relaxing in the cool, clear water.</p>
                    </div>
                </article>
                <article class = "service">
                    <div class = "service-icon">
                        <span>
                            <i class="fa-solid fa-mug-hot"></i>
                        </span>
                    </div>
                    <div class = "service-content">
                        <h2>Recreation Area</h2>
                        <p>For those who love walking in the rain, Vagamon is pure bliss. But for those who like to stay indoors when it pours, our recreation area is the place to be. Enjoy a game of carrom, or try your hands at table tennis, billiards or try your luck at a game of cards.</p>
                    </div>
                </article>
                <article class = "service">
                    <div class = "service-icon">
                        <span>
                            <i class="fa-solid fa-baseball-bat-ball"></i>
                        </span>
                    </div>
                    <div class = "service-content">
                        <h2>Kids Play Area</h2>
                        <p>Winter Vale has a dedicated play area meant for children. Equipped with a swing, merry-go-round, slide and trampoline, our play area is the perfect place for kids to engage in outdoor activities.</p>
                    </div>
                </article>
                <article class = "service">
                    <div class = "service-icon">
                        <span>
                            <i class="fa-solid fa-car"></i>
                        </span>
                    </div>
                    <div class = "service-content">
                        <h2>Jeep Safari</h2>
                        <p>If you desire to cherish and admire Vagamon’s mind-blowing beauty and charm of nature, you must experience this off-road jeep safari. A four-wheel jeep ride into the inland villages, misty emerald pastures and lush green bushes of Vagamon offers an indescribable intense set of experiences.</p>
                    </div>
                </article>
                <article class = "service">
                    <div class = "service-icon">
                        <span>
                            <i class="fa-solid fa-fire"></i>
                        </span>
                    </div>
                    <div class = "service-content">
                        <h2>Camp Fire</h2>
                        <p>Everyone remembers the cool winter nights snuggled around a campfire with his or her families. We provide campfire facility as per requirement.</p>
                    </div>
                </article>
                <!-- end of single service -->
            </div>
        </section>

        <div class = "book">
            <form class = "book-form">
             
                <div class = "form-item" id="form-item">
                    <a href="booking.jsp" target="=_blank">
                    <input style="font-size: 30px; width:200%;" type = "button" class = "btn" value = "Book Now"></a>
                </div>
            </form>
        </div>

        <section class = "rooms sec-width" id = "rooms">
            <div class = "title">
                <h2>rooms</h2>
            </div>
            <div class = "rooms-container">
                <!-- single room -->
                <article class = "room">
                    <div class = "room-image">
                        <img src = "images/capsule.jpg" alt = "room image">
                    </div>
                    <div class = "room-text">
                        <h3>Air Condition Capsule</h3>
                        <ul>
                            <li>
                                <i class = "fas fa-arrow-alt-circle-right"></i>
                                Hygienic Bed/Bathroom.
                            </li>
                            <li>
                                <i class = "fas fa-arrow-alt-circle-right"></i>
                                Single/Double Bed.
                            </li>
                            <li>
                                <i class = "fas fa-arrow-alt-circle-right"></i>
                                24x7 Hr CheckIn.
                            </li>
                        </ul>
                        <p>The air-conditioned capsules all come with their own sliding door for added privacy, reading lights and power sockets. It also has a clothes hanger and access to a personal locker operated by a electric key card. Guests have access to a shared bathroom and toilet.</p>
                        <p></p>
                        <p class = "rate">
                            <span>Rs 999.00 /</span> Per Night
                        </p>
                        <br>
                    </div>
                </article>

                <article class = "room">
                    <div class = "room-image">
                        <img src = "images/doublebed.jpg" alt = "room image">
                    </div>
                    <div class = "room-text">
                        <h3>Double Bed Rooms</h3>
                        <ul>
                            <li>
                                <i class = "fas fa-arrow-alt-circle-right"></i>
                                Free WiFi.
                            </li>
                            <li>
                                <i class = "fas fa-arrow-alt-circle-right"></i>
                                2 Adult.
                            </li>
                            <li>
                                <i class = "fas fa-arrow-alt-circle-right"></i>
                               Air Conditioned.
                            </li>
                        </ul>
                        <p>All our double rooms feature a double bed or two single beds, (depending on availability), fridge and microwave, tea and coffee facilities, LED TV, en-suite bathroom and toiletries. We offer free Breakfast in bed for the double rooms.</p>
                        
                        <p class = "rate">
                            <span>Rs 3000.00 /</span> Per Night
                        </p>
                        <br>
                    </div>
                </article>

                <article class = "room">
                    <div class = "room-image">
                        <img src = "images/Deluxe.jpg" alt = "room image">
                    </div>
                    <div class = "room-text">
                        <h3>Deluxe</h3>
                        <ul>
                            <li>
                                <i class = "fas fa-arrow-alt-circle-right"></i>
                                King size Bed.
                            </li>
                            <li>
                                <i class = "fas fa-arrow-alt-circle-right"></i>
                                Mini Wardrobe.
                            </li>
                            <li>
                                <i class = "fas fa-arrow-alt-circle-right"></i>
                                41 sqmtr.
                            </li>
                        </ul>
                        <p>The deluxe rooms are spacious and yet have a cozy and charming vintage vibe. Thoughtfully designed for a comfortable stay, these rooms boast of elegant wooden furniture complemented with warm upholstery, state of the art amenities and a spacious, fully equipped bathroom.</p>
                        <p class = "rate">
                            <span>RS 6000.00 /</span> Per Night
                        </p>
                        <br>
                    </div>
                </article>

                <article class = "room">
                    <div class = "room-image">
                        <img src = "images/suiteroom.jpg" alt = "room image">
                    </div>
                    <div class = "room-text">
                        <h3>Suite Rooms</h3>
                        <ul>
                            <li>
                                <i class = "fas fa-arrow-alt-circle-right"></i>
                                Guest Laundry facility.
                            </li>
                            <li>
                                <i class = "fas fa-arrow-alt-circle-right"></i>
                                Mini Bar.
                            </li>
                            <li>
                                <i class = "fas fa-arrow-alt-circle-right"></i>
                                jacuzzi.
                            </li>
                        </ul>
                        <p>The view of the Vagamon meadows can be admired from every room. Two spacious art deco rooms with King size four posture canopy bed & separate sitting and living room with stunning view- Recliner Chair Dining table for 2+ Vanity area- Carpet flooring bright natural light + treated fresh and cool air with individual controls for living room and bed room: 2 minibars Tea/Coffee maker- 
                             Hi-speed Wired/Wi-Fi internet : toilet with bath and jacuzzi superior bathroom amenities</p>
                        <p class = "rate">
                            <span>Rs 10000.00 /</span> Per Night
                        </p>
                       <br>
                    </div>
                </article>
                <!-- end of single room -->
            </div>
        </section>
        
        <!-- footer -->
        <footer class = "footer" id="footer">
            <div class = "footer-container">
                
                <div>
                    <h2>About Us </h2>
                    <p>The S&P Vagamon is one of the finest eco-friendly resorts in VAGAMON. It is not at all a surprise if you are embraced with the fog in Vagamon.The scenic views that you observe from our resort will be beyond your belief. Every minute of your stay in The  will be worthwhile, and you will cherish every moment of it throughout your life.</p>
                     
                </div>
                
                <div style="margin-left: 300px;">
                    <h2>Have A Question</h2>
                    <div class = "contact-item">
                        <span>
                            <i class = "fas fa-map-marker-alt"></i>
                        </span>
                        <span>
                            near Forest Check Post, Vazhikkadavu, Vagamon, Kerala 685503
                        </span>
                    </div>
                    <div class = "contact-item">
                        <span>
                            <i class = "fas fa-phone-alt"></i>
                        </span>
                        <span>
                            +91545 37534 48
                        </span>
                    </div>
                    <div class = "contact-item">
                        <span>
                            <i class = "fas fa-envelope"></i>
                        </span>
                        <span>
                            info@gmail.com
                        </span>
                    </div>
                </div>
            </div>
        </footer>
		
		
</body>
</html>