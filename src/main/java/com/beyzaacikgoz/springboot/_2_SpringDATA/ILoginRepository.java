package com.beyzaacikgoz.springboot._2_SpringDATA;

import com.beyzaacikgoz.springboot._2_SpringDATA.LoginEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public class ILoginRepository {
}

/*@Repository
public interface ILoginRepository extends CrudRepository<LoginEntity,Long> {

    //Delivered Query
    LoginEntity findByEmail(String email);
}*/
