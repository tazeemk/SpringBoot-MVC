<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome to Spring Boot MVC</title>
    <style>
        /* Reset some basic styles */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        /* Basic layout styles */
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            background-color: #f9f9f9;
        }

        /* Header styles */
        header {
            background-color: #333;
            color: white;
            padding: 1rem;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        header .logo h1 {
            margin: 0;
        }

        header nav ul {
            list-style-type: none;
            display: flex;
            gap: 1rem;
        }

        header nav ul li {
            display: inline;
        }

        header nav ul li a {
            color: white;
            text-decoration: none;
            font-weight: bold;
        }

        /* Hero section styles */
        .hero {
            background-color: #4CAF50;
            color: white;
            padding: 3rem 1rem;
            text-align: center;
        }

        .hero h2 {
            font-size: 2rem;
            margin-bottom: 1rem;
        }

        .hero p {
            font-size: 1.2rem;
            margin-bottom: 2rem;
        }

        .hero .btn {
            background-color: #fff;
            color: #333;
            padding: 1rem 2rem;
            text-decoration: none;
            font-size: 1rem;
            border-radius: 5px;
            font-weight: bold;
            transition: background-color 0.3s;
        }

        .hero .btn:hover {
            background-color: #ccc;
        }

        /* Footer styles */
        footer {
            text-align: center;
            padding: 1rem;
            background-color: #333;
            color: white;
        }
    </style>
</head>
<body>

    <header>
        <div class="logo">
            <h1>Welcome to Spring Boot MVC</h1>
        </div>
        <nav>
            <ul>
                <li><a href="/">Home</a></li>
                <li><a href="/about">About</a></li>
                <li><a href="/contact">Contact</a></li>
            </ul>
        </nav>
    </header>

    <section class="hero">
        <h2>Spring Boot MVC Made Easy</h2>
        <p>This is a simple MVC web application built with Spring Boot.</p>
        <a href="/about" class="btn">Learn More</a>
    </section>

    <footer>
        <p>&copy; 2025 Spring Boot MVC Application</p>
    </footer>

</body>
</html>
