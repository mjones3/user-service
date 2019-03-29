package com.practicejournal.user.services;

import java.sql.Date;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.practicejournal.user.model.Invitation;
import com.practicejournal.user.repository.InvitationRepository;

@Service
public class InvitationService {
    
    private static final Logger logger = LoggerFactory.getLogger(InvitationService.class);
    
    @Autowired
    private InvitationRepository invitationRepository;

    
    public List<Invitation> getAllInvitations() {
        return invitationRepository.findAll();
    }
    
    public Invitation getInvitationsByEmail(String email) {
        return invitationRepository.findInvitationByEmail(email);
    }

    public void acceptInvitation(String invitationId) {
        Invitation invitation  = invitationRepository.findInvitationById(invitationId);
        Assert.notNull(invitation);
        logger.debug("Found invitation with ID = " + invitationId);
        
        invitation.setAccepted(true);
        invitationRepository.save(invitation);
    }
    
    public void rejectInvitation(String invitationId) {
        Invitation invitation  = invitationRepository.findInvitationById(invitationId);
        invitationRepository.delete(invitation);
    }
    
    public void sendInvitation(Invitation invitation) {
        invitation.setId(UUID.randomUUID().toString());
        invitation.setSentDate(new Date(System.currentTimeMillis()));
        invitationRepository.save(invitation);
    }
}