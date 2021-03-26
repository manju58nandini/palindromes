# Save and Fetch Longest Palindromes Code Challenge API

**Problem 1:**
Given a string _s_, find the longest palindromic substring in _s_. You may assume that the maximum length of _s_ is 1000.

**Solution?:**
Write a Spring Boot micro-service that completes the following:

1. Receives string input over an API
2. Stores the longest palindrome in provided database
3. Retrieves the stored palindrome over an API

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes

### Prerequisites

JDk 1.8 or higher, Eclipse or any IDE, Postman to test APIs

### Tech Stack

Java, Maven, SpringBoot, h2 database

### Running

if you run application as Java Application or SpringBoot App, its going to deployed on default port 8080 in embeded tomcat server

You can change the port number by configuring the value for server.port in application.properties file.

Once started , you can see that the 2 APIs are created with  following requests and responses
 /getPalindromeById and /storePalindrome 
that are used to fetch all, fetch by id and store respectively.
 
Save Long Palindrome  Example

Request:
http://localhost:8080/insertLongPalindrome?value=AIEEE
 
Response:
{"givenValue":"AIEEE","longestValue":"EEE"}
 
 get All Palindromes Example

Request:
http://localhost:8080/getAllPalindromes
 

Response: 
[{"givenValue":"abbbbbbbbbbbacdadda","longestValue":"abbbbbbbbbbba"},{"givenValue":"windows","longestValue":"s"},{"givenValue":"AIEEE","longestValue":"EEE"}]
 


```sh
Postman Api Request for savePalindrome
```
![reuest-save-palindrome](https://user-images.githubusercontent.com/81376669/112574413-3192bb80-8dbc-11eb-9335-76b90574c519.JPG)
```sh
Postman Api Response for savePalindrome
```

![response-save-palindrome](https://user-images.githubusercontent.com/81376669/112574368-1c1d9180-8dbc-11eb-83c6-61a3ba57199d.JPG)

```sh
Postman Api Request for getAllPalindromes
```
![request-get-palindromes](https://user-images.githubusercontent.com/81376669/112574316-060fd100-8dbc-11eb-8f85-19fbc03df476.JPG)

```sh
Postman Api Response for getAllPalindromes
```
![response-get-palindrome](https://user-images.githubusercontent.com/81376669/112574453-453e2200-8dbc-11eb-98d1-0a2d04c34028.JPG)

```sh



