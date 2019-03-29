package com.practicejournal.user.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practicejournal.user.model.Email;
import com.practicejournal.user.model.Invitation;
import com.practicejournal.user.services.InvitationService;

@RestController
//@RequestMapping(value = "v1/users")
public class UserServiceController {
    @Autowired
    private InvitationService invitationService;

    private static final Logger logger = LoggerFactory.getLogger(UserServiceController.class);

    @RequestMapping(value = "/invitations", method = RequestMethod.GET)
    public List<Invitation> getAllInvitations() {
        List<Invitation> invitations = invitationService.getAllInvitations();
        return invitations;
    }

    @RequestMapping(value = "/invitation", method = RequestMethod.POST)
    public Invitation getInvitationsByEmail(@RequestBody Email email) {

        Invitation invitation = invitationService.getInvitationsByEmail(email.getEmailAddress());
        return invitation;
    }
    
    @RequestMapping(value = "/acceptInvitation/{invitationId}", method = RequestMethod.GET)
    public void acceptInvitation(@PathVariable("invitationId") String invitationId) {

        invitationService.acceptInvitation(invitationId);
    }
    
    @RequestMapping(value = "/rejectInvitation/{invitationId}", method = RequestMethod.GET)
    public void rejectInvitation(@PathVariable("invitationId") String invitationId) {
       
        invitationService.rejectInvitation(invitationId);
    }
    
    //TODO: Sends duplicates. Restrict on email,invitedBy,instrument combo 
    
    @RequestMapping(value = "/sendInvitation", method = RequestMethod.POST)
    public void sendInvitation(@RequestBody Invitation invitation) {
       
        invitationService.sendInvitation(invitation);
    }

}
