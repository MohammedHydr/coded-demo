# coded-demo

## Step-by-Step Guide to Create a Spring Boot RESTful Service
This guide provides detailed instructions on how to set up a simple Spring Boot application for managing a list of products. It covers everything from project initialization to running the application.

### Prerequisites
* Java Development Kit (JDK) installed (version 17 or higher)
* An IDE (like IntelliJ IDEA, Eclipse, or Spring Tool Suite)
* Basic knowledge of Java

### Step 1: Initialize the Project with Spring Initializr
1. Go to Spring Initializr: This is an online tool provided by the Spring team to bootstrap your Spring Boot applications.

2. Configure Your Project:
  * Select your preferred build tool (Maven/Gradle)
  * Choose the language (Java/Kotlin/Groovy)
  * Specify the Spring Boot version (usually the default is fine)
  * Fill in the project metadata like Group, Artifact, Name, and Description
  * Choose the packaging (Jar is recommended)
  * Select Java version

3. Add Dependencies:
  * For this demo, add the 'Spring Web' dependency. It's essential for creating web applications including RESTful services.

4. Generate the Project:
  * Click on 'Generate' to download the project template.

5. Extract and Open the Project:
  * Extract the downloaded ZIP file and open it in your IDE.
    
### Step 2: Create the Project Structure

1. Create Packages:
  * Inside the src/main/java directory, create three packages: model, service, and controller.
  * Why These Packages?:
    * model: To hold our data models/entities.
    * service: To contain business logic.
    * controller: To manage HTTP requests and responses.

### Step 3: Implement the Application

#### Model Class
1. Create the Product Class in the model Package:
  * Define fields like id, p_name, batch_no, price, no_of_product.
  * Add a default constructor and a parameterized constructor.
  * Generate getters and setters for each field.

#### Service Class
1. Create the ProductService Class in the service Package:
  * Annotate the class with @Service.
  * Implement a method findAll to return a list of products.

#### Controller Class
1. Create the ProductController Class in the controller Package:
  * Annotate the class with @RestController.
  * Use @Autowired to inject the ProductService.
  * Create a method getProduct annotated with @GetMapping to handle GET requests to /product.

### Step 4: Run the Application
1. Run the Application:
  * Locate the main application class (with @SpringBootApplication annotation).
  * Run this class as a Java application.

2.Access the Application:
  * Open a web browser or a REST client.
  * Navigate to http://localhost:8080/product to see the list of products.