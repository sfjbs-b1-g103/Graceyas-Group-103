package com.springsecurityjwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AuthenticationController {
@GetMapping("/")
String getPublicMessage()
{
	return "Hello Everyone";

}
@GetMapping("/users")
String getUserMessage() {
	return "Hi User,you are now logged in....";
	
}
}
