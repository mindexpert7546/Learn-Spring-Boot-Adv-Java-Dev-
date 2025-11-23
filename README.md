# Notes 
Spring Boot is an open-source framework built on top of the Spring Framework, designed to simplify the development of standalone, production-grade Spring applications. It aims to reduce the effort and time required to set up and configure Spring projects, allowing developers to focus on writing application logic rather than dealing with extensive configuration.

- It is popular for the auto-configuration.

#### What is dependency Injection 
Dependency Injection (DI) in Spring Boot is a core principle and a design pattern that facilitates building loosely coupled, modular, and testable applications. It's an implementation of the Inversion of Control (IoC) principle, where the framework (Spring Boot) manages the dependencies of your application's components rather than the components managing their own dependencies.

#### Spring Initializr 
Spring Initializr is a website or web-based tool used to set up Spring Boot projects in an easier and efficient manner. Spring Boot projects can be set up manually, but the configuration might be time-consuming and confusing.

By default spring boot runing via Tomcat server on 8080 port. http://localhost:8080/

### Create first Hello World API 
```
package com.spring.learn.springbootintro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Hello world";
    }
}
```

@Controller - Tell us this is Controller 
@ResponseBody - It's defining how the response will be rather than creating any view.

#### Embedded Servers
Applicaiton -> war -> Server (Tomcat, Weblogic, Jboss)

But in Spring boot Application + Server running via jar file that's single jar file which containe server

in Spring boot there are three types of Server - Tomcat (default) , Jetty, Undertow..etc. 

#### How to run the server on other server apart from tomcat - 

```
Exclude first tomcat

<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-webmvc</artifactId>
	<exclusions>
		<exclusion>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-tomcat</artifactId>
		</exclusion>
	</exclusions>
</dependency>

Add the jetty

<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-jetty</artifactId>
	<version>4.0.0</version>
</dependency>
```

#### Spring boot Actuator 

In Spring Boot, an Actuator refers to a sub-project that provides production-ready features for monitoring and managing your application. It exposes operational information about the running application, making it easier to understand its health, performance, and internal state without requiring extensive custom development.

Dependency 
```
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```

Exposing 1 endpoint beneath base path '/actuator'

url - http://localhost:8080/actuator

#### Spring Boot DevTool
This is developer tool - It helps to inhenace the develeopment, whenever change any code no need to again build and run it will do authomatic. 

depdenency - 
```
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-devtools</artifactId>
  <scope>runtime</scope>
  <optional>true</optional>
</dependency>
```

#### How to create a Spring Boot Project?
- Spring CLI
- IDE Project templates
- Spring Initializr

#### Which is the default Spring Boot Server?
- Tomcat

### Web Services 
If any web application able to use other web application over the internet that is web service

Based on the contract between application data can be share between the app. this is how web services works. 

Using http protocol

HTTP Methods - GET, POST, PUT, DELETE

### REST API 
Web service - JSON or XML
Resource - URI
Method - GET, POST, PUT, DELETE
Request 
Response 

#### Request Mapping 
```
//  @RequestMapping(value = "/user", method = RequestMethod.POST)
    @GetMapping("/user")
```
#### Path Variables 

```
@GetMapping("/{id}")
public String pathVariable( @PathVariable String id){
	return "The path variable is : " + id;
}
```

#### Request Params 

```
@GetMapping("/requestParam")
public String requestParams(@RequestParam String name){
	return "The request params is : " + name;
}
```
```
@GetMapping("/requestParam")
public String requestParams(@RequestParam String name, @RequestParam(required = false) String email){
	return "The request params is : " + name + "email is : " + email;
}
```
Reference - https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-controller/ann-methods/requestparam.html





