package com.practicejournal.user.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practicejournal.user.model.Invitation;
import com.practicejournal.user.model.User;

@Repository
public interface InvitationRepository extends CrudRepository<Invitation,String>  {
    
    
    public List<Invitation> findAll();
    
    public Invitation findInvitationByEmail(String email);
    
    public Invitation findInvitationById(String id);
}
