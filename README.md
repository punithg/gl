# Great Learning Hackathon Assignment


Gl Hackathon Demo is a **Spring application** using **MySql** as the datasource. The application has mainly 2 APIS
* To accept submission of a hackathon
* To get Leader board for a particular hackathon

All the required **Entities, Dtos', Services, Controllers, Enums and Unit tests** are carefully defined in a proper project structure.

I have deployed the application for easier viewing of the project on an **AWS ec2** server, below is the link to the live application
link
http://ec2-52-39-77-93.us-west-2.compute.amazonaws.com:8080

APIs postman collection link (Import in postman using the below link and steps)
https://www.getpostman.com/collections/52321b02aacd50bc8296

###### Steps : 
* open **Postman**
* Click on **Import** on the Top-Left corner
* Select **Link**
* Paste the link (https://www.getpostman.com/collections/52321b02aacd50bc8296)





<ins> **To Setup the project on local machine, follow below steps**</ins>

###### Environment Requirements (Install the following on your local machine) :
* Java 8
* Maven 3.6.0

###### Steps :
* After setting up the environment
* Clone the repository
* Navigate to the root of the project
* Run using ```mvn spring-boot:run```  (If port 8080 is occupied by other app, clear the port using ```fuser -k 8080/tcp```)
* Once the application has started, use the above postman link to import the API collection
* Change the server IP to ```http://localhost:8080```
* Run the APis with the test body added

