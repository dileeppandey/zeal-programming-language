## Tools

* ANTLR
* JAVA
* MAVEN

## Instructions

### Installation
* Install the latest version of JDK 1.8
* Install Maven version 3.x.x
* Add java and maven to system path variable

### Build and Run

        1. git clone https://github.com/dileeppandey/SER502-Spring2018-Team-6.git
        2. cd SER502-Spring2018-Team-6/zeal
        3. mvn clean install
        4. java -jar target/team6-1-jar-with-dependencies.jar sample/0_HelloWorld

In the 4th step, DO NOT add the extension **".zl"** to the filename.

## Features Supported

### Data Types

* NUM
* BOOL

### Operations

* Assignment
* Arithmetic (Addition, Subtraction, Multiplication, Divide, Remainder)
* Relations (Equal to, Not Equal to, Greater Than, Less Than, Greater Than Equal to, Less Than Equal to)

### Language Constructs

* If
* If-Else
* While

### Grammar
Handles

* Associativity (Left-Associative)
* Precedence

### Video Demonstration

[Here](https://youtu.be/czM4T8RZrzI) is a link to the video.

### Still in Progress

* Nested while (intermediate code is correctly generated, need to work on run time execution).
* Function (Grammar complete, intermediate code is correctly generated for void return type, need more work).
