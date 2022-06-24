package com.MiniProject_PensionManagement2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/PensionProcess")
public class PensionProcessController {
	@Autowired
	PensionProcessService service;
	@GetMapping("/All")
	Iterable<PensionProcess> getAllPensionProcess(){
		return service.getAllPensionProcess();

}
	@GetMapping("/{Id}")
	Iterable<PensionProcess> getpensionprocessById(@PathVariable Integer Id){
		return service.getAllPensionProcess();
}
}