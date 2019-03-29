package com.practicejournal.user.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practicejournal.user.controllers.UserServiceController;
import com.practicejournal.user.model.Invitation;
import com.practicejournal.user.model.User;
import com.practicejournal.user.repository.InvitationRepository;
import com.practicejournal.user.repository.UserRepository;

@Service
public class UserService {
    
    private static final Logger logger = LoggerFactory.getLogger(UserServiceController.class);
    
    @Autowired
    private UserRepository userRepository;
    private InvitationRepository invitationRepository;


    
    
    public List<Invitation> getAllInvitations() {
        return invitationRepository.findAll();
    }

    public void saveUser(User user){
        user.setUserId( UUID.randomUUID().toString());

        userRepository.save(user);
    }

    public void updateUser(User user){
        userRepository.save(user);

    }

    public void deleteOrg(String userId){
        userRepository.delete( userId);
    }
    
    public List<User> findAll(){
        
        logger.info("in findAll()");
        
        ArrayList<User> userList = new ArrayList<>();
        userRepository.findAll().forEach((e) -> userList.add(e));
        
        return userList;
    }
}