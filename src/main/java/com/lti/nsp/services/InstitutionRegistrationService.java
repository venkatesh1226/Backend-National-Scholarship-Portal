package com.lti.nsp.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.nsp.models.InstitutionEntity;
import com.lti.nsp.repositories.InstitutionRegistrationReopsitory;
import org.springframework.web.bind.annotation.CrossOrigin;


@Service
@CrossOrigin(origins ="*")
public class InstitutionRegistrationService {
	
	@Autowired
	InstitutionRegistrationReopsitory institutionRegistrationReopsitory;
	
	public InstitutionEntity saveInstitution(InstitutionEntity institutionEntity)
	{
		return institutionRegistrationReopsitory.save(institutionEntity);
	}
}