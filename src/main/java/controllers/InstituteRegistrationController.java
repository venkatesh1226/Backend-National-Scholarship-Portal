package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import entity.InstitutionEntity;
import services.InstitutionRegistrationService;



@RestController
@CrossOrigin("*")
public class InstituteRegistrationController {
	
	@Autowired
	InstitutionRegistrationService institutionRegistrationService;
	
	//@RequestMapping(value="/institution", method = RequestMethod.POST)
	@PostMapping("/institution")
	public void getInstitutionData(@RequestBody InstitutionEntity institution)
	{
		System.out.println(institution);
		
		institutionRegistrationService.saveInstitution(institution);
	}
	
}
