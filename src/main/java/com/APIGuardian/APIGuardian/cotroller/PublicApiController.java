package com.APIGuardian.APIGuardian.cotroller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/public/api/")
@RequiredArgsConstructor
public class PublicApiController {
	  @GetMapping("/test")
	    public ResponseEntity<String> sayHello() {
	        return ResponseEntity.ok("This is public API..");
	    }
}



