package com.MiniProject_PensionManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PensionerDetailsService {
	@Autowired
	
	PensionerDetailsService repo;
	Iterable<PensionerDetails> getAllPensionerDetails(){
		return repo.findAll();
		
}

	Iterable<PensionerDetails> getPensionerDetailsById(Integer Id) {
	return repo.findAll();}


	private Iterable<PensionerDetails> findAll() {
		// TODO Auto-generated method stubS
		return null;
	}
}