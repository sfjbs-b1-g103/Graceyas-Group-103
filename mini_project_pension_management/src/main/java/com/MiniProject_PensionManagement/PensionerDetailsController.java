package com.MiniProject_PensionManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/PensionerDetails")
public class PensionerDetailsController {
	@Autowired
PensionerDetailsService service;
	@GetMapping("/All")
	Iterable<PensionerDetails> getAllPensionerDetails(){
	return service.getAllPensionerDetails();
	}
	@GetMapping("/{Id}")
	Iterable<PensionerDetails> getpensionerDetilsById(@PathVariable Integer Id){
	return service.getAllPensionerDetails();
}
}