# cs131-ostrta
Recipe Web App Project called:  "One String to Rule Them All"

### **Requirements:**
   **1. Java**
   
   **2. Maven**
    
Install JDK
If you don't have JDK installed on your machine, you can install it by clicking the download from [Oracle]. (https://www.oracle.com/java/technologies/downloads/) Get the up to date JDK.

To verify it's installed, create a new terminal and try running the following command:

    java -version

You should see something similar to the following:

    java version "1.8.0_311"
    Java(TM) SE Runtime Environment (build 1.8.0_311-b11)
    Java HotSpot(TM) 64-Bit Server VM (build 25.311-b11, mixed mode)

Install Maven
If you don't have Maven installed on your machine, you can install it by clicking the download from [Maven] (https://maven.apache.org/download.cgi)
Installation help can be found here, [Intall Maven] (https://maven.apache.org/install.html)

Add the ```bin``` directory of the created directory ```apache-maven-3.9.6``` to the ```PATH``` environment variable

Confirm with ```mvn -version``` in a new shell. The result should look similar to

    Apache Maven 3.9.6 (bc0240f3c744dd6b6ec2920b3cd08dcc295161ae)
    Maven home: /opt/apache-maven-3.9.6
    Java version: 1.8.0_45, vendor: Oracle Corporation
    Java home: /Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre
    Default locale: en_US, platform encoding: UTF-8
    OS name: "mac os x", version: "10.8.5", arch: "x86_64", family: "mac"


You may want to run a clean install of mvn before proceeding further. Do so by running the command:
    ```mvn clean install```

### How to run the app
To run the app run the following command in your CLI:

```myapp.bat``` 


### TGould changes
Run program through the terminal using the same command to ping the server.  

4/27/2024 
- can search recipes in spoonacular by query or id
- from individual spoonacular recipe, can save to MongoDB
- can view list of recipes saved in MongoDB
- from list in MongoDB, can view individual recipes saved in MongoDB by id or title
- from individual MongoDB recipe, can delete recipe from MongoDB by id or title
- can add comments, new ingredients, and new instructions to individual recipe in MongoDB
- can create recipe from scratch (creates blank recipe with only id and title, uses update function to add ingredients and instructions)
