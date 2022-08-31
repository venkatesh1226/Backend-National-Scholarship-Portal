package com.lti.nsp.repositories;

import com.lti.nsp.models.login.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin(origins ="*")
public interface LoginRepository extends JpaRepository<Login,String> {
}
