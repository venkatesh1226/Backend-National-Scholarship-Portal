package com.lti.nsp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.nsp.models.InstitutionEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin(origins ="*")
public interface InstitutionRegistrationReopsitory extends JpaRepository<InstitutionEntity, String> {

}
