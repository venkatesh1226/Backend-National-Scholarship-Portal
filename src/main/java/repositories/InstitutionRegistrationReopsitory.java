package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.InstitutionEntity;

public interface InstitutionRegistrationReopsitory extends JpaRepository<InstitutionEntity, String> {

}
