package com.MiniProject_PensionManagement2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PensionProcessService {
@Autowired
	PensionProcessService repo;
	Iterable<PensionProcess> getAllPensionProcess(){
		return repo.findAll();
		
}
	Iterable<PensionProcess> getPensionerDetailsById(Integer Id) {
		return repo.findAll();
		}
	
	private Iterable<PensionProcess> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}