
<jsp:include page="header.jsp" /> 
    
    <!-- Contact Section Begin -->
    <section class="contact-section spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-4">
                    <div class="contact-text">
                        <h2>Contact Info</h2>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut
                            labore et dolore magna aliqua.</p>
                        <table>
                            <tbody>
                                <tr>
                                    <td class="c-o">Address:</td>
                                    <td>856 Cordia Extension Apt. 356, Lake, US</td>
                                </tr>
                                <tr>
                                    <td class="c-o">Phone:</td>
                                    <td>(12) 345 67890</td>
                                </tr>
                                <tr>
                                    <td class="c-o">Email:</td>
                                    <td>info.colorlib@gmail.com</td>
                                </tr>
                                <tr>
                                    <td class="c-o">Fax:</td>
                                    <td>+(12) 345 67890</td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
                <div class="col-lg-7 offset-lg-1">
                    <form action="actioncontroller" class="contact-form">
                        <div class="row">
                            <div class="col-lg-6">
                                <input type="text" placeholder="Your Name" name="contact_name">
                            </div>
                            <div class="col-lg-6">
                                <input type="text" placeholder="Your Email" name="contact_email">
                            </div>
                            <div class="col-lg-12">
                                <textarea placeholder="Your Message" name="contact_message"></textarea>
                                <button type="submit" name="action" value="submitnow">Submit Now</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            <div class="map">
                <iframe
                    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBnbFBC1QRQ9EHbEUbsvcNP4VTe_oIFAbA&callback=initMap"
                    height="470" style="border:0;" allowfullscreen=""></iframe>
                               </div>
        </div>
    </section>
    <!-- Contact Section End -->

 <jsp:include page="footer.jsp" />
