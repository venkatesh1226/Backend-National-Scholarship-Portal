package com.lti.nsp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lti.nsp.models.InstitutionEntity;
import com.lti.nsp.services.InstitutionRegistrationService;



@RestController
@CrossOrigin(origins ="*")
public class InstituteRegistrationController {
	
	@Autowired
	InstitutionRegistrationService institutionRegistrationService;
	
	//@RequestMapping(value="/institution", method = RequestMethod.POST)
	@PostMapping("/institution")
	public InstitutionEntity getInstitutionData(@RequestBody InstitutionEntity institution)
	{
		System.out.println(institution);
		
		return institutionRegistrationService.saveInstitution(institution);
	}


	
}
