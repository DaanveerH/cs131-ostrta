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


### How to ping the server
To ping the server with "Hello World" you should run the following command in your terminal.

```mvn compile exec:java -Dexec.mainClass="com.mongodb.quickstart.HelloMongoDB"``` This should prompt the following response:

    Hello MongoDB!
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time:  0.634 s
    [INFO] Finished at: 2024-02-19T18:12:22+01:00
    [INFO] ------------------------------------------------------------------------
