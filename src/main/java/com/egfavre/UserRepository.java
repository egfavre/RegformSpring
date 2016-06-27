package com.egfavre;

import com.egfavre.entitites.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by User on 6/27/16.
 */
public interface UserRepository extends CrudRepository<User, Integer>{
}
