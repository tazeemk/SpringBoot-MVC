<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Homepage</title>
 <link rel="stylesheet" href="cssfile/styles.css" >
</head>
<body>
  <header class="main-header">
    <div class="logo">DevangHub</div>
    <nav class="navbar">
      <ul>
        <li><a href="#home">Home</a></li>
        <li><a href="#about">About</a></li>
        <li><a href="#services">Services</a></li>
        <li><a href="#contact">Contact</a></li>
      </ul>
    </nav>
  </header>

  <section id="home" class="hero-section">
    <div class="hero-content">
      <h1>Welcome to DevangHub.com</h1>
      <p>Your one-stop solution for web development.</p>
      <a href="#services" class="cta-button">Explore Services</a>
    </div>
  </section>

  <section id="about" class="about-section">
    <h2>About Us</h2>
    <p>We specialize in creating modern and responsive web solutions for businesses and individuals.</p>
  </section>

  <section id="services" class="services-section">
    <h2>Our Services</h2>
    <div class="service-cards">
      <div class="card">
        <h3>Show Details</h3>
        <p><a href ="request">Click Here </a></p>
      </div>
      <div class="card">
        <h3>SEO Optimization</h3>
        <p>Boost your site's visibility on search engines.</p>
      </div>
      <div class="card">
        <h3>UI/UX Design</h3>
        <p>Design interfaces that users love.</p>
      </div>
    </div>
  </section>

  <section id="contact" class="contact-section">
    <h2>Contact Us</h2>
    <form>
      <label for="name">Name:</label>
      <input type="text" id="name" name="name" required>
      <label for="email">Email:</label>
      <input type="email" id="email" name="email" required>
      <label for="message">Message:</label>
      <textarea id="message" name="message" rows="4" required></textarea>
      <button type="submit">Send</button>
    </form>
  </section>

  <footer class="main-footer">
    <p>&copy; 2024 MyWebsite. All rights reserved.</p>
  </footer>
</body>
</html>