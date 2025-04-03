# Real-Estate-Management-System
this is the project that describe how the real estate management  works 
# Set-UP
Setting Up and Running the Real Estate Management System
This guide provides step-by-step instructions to set up and run the Real Estate Management System from the GitHub repository ssondhi2027/Real-Estate-Management-System.
Prerequisites
Before proceeding, ensure you have the following installed:
•	Java Development Kit (JDK 17 or later): Download from Oracle or OpenJDK.
•	Apache Maven: Download from Maven for build and dependency management.
•	Integrated Development Environment (IDE): Recommended options include IntelliJ IDEA, Eclipse, or VS Code with relevant extensions.
Cloning the Repository
1.	Clone the Repository: Open your terminal or command prompt and execute:
2.	git clone https://github.com/ssondhi2027/Real-Estate-Management-System.git
3.	Navigate to the Project Directory:
4.	cd Real-Estate-Management-System
Importing the Project into an IDE
•	IntelliJ IDEA:
1.	Open IntelliJ IDEA.
2.	Select Open and navigate to the cloned project directory.
3.	Choose the pom.xml file to import the project.
4.	IntelliJ will automatically download the necessary dependencies.
•	Eclipse:
1.	Open Eclipse.
2.	Navigate to File > Import > Existing Maven Projects.
3.	Select the cloned project directory.
4.	Eclipse will import the project and resolve dependencies.
•	VS Code:
1.	Open VS Code.
2.	Install the necessary extensions for Java and Spring Boot.
3.	Open the cloned project folder.
4.	VS Code will detect the project and suggest downloading dependencies.
**Running the Application**
1.	Using the IDE:
o	Locate the main application class annotated with @SpringBootApplication (typically found in src/main/java/com/example/demo/DemoApplication.java).
o	Right-click on the class and use the run option provided by your IDE.
Accessing the Application
Once the application is running, open a web browser and navigate to:
http://localhost:8080/
This should display the homepage of the Real Estate Management System.
**Common Issues & Troubleshooting**
•	Port Already in Use: If port 8080 is occupied, you can change the port by adding the following to application.properties:
•	server.port=9090
•	Dependency Issues: If there are missing dependencies, ensure that your Maven is updated and try running:
•	mvn clean install
**Conclusion**
By following these steps, you should be able to set up and run the Real Estate Management System successfully. 

