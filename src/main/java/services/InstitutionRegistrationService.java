package services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.InstitutionEntity;
import repositories.InstitutionRegistrationReopsitory;





@Service
public class InstitutionRegistrationService {
	
	@Autowired
	InstitutionRegistrationReopsitory institutionRegistrationReopsitory;
	
	public void saveInstitution(InstitutionEntity institutionEntity)
	{
		institutionRegistrationReopsitory.save(institutionEntity);
	}
}