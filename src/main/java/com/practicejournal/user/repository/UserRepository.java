package com.practicejournal.user.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practicejournal.user.model.User;

@Repository
public interface UserRepository extends CrudRepository<User,String>  {
    
    
    public User findByUserId(String userId);
    
    public List<User> findAll();
   
}
