package com.practicejournal.user.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "invitations")
public class Invitation implements Serializable {

    private String id;
    private String email;
    private String invitedBy;
    private String instrumentId;
    private Date sent;
    private boolean accepted;
    
        
    public Invitation() {

    }

    public Invitation(String id, String email, String invitedBy, String instrumentId, Date sentDate, boolean accepted) {
        super();
        this.id = id;
        this.email = email;
        this.invitedBy = invitedBy;
        this.instrumentId = instrumentId;
        this.sent = sentDate;
        this.accepted = accepted;
    }
    
    @Id
    @Column(name = "id", nullable = false)
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    
    @Column(name = "email", nullable = false)
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Column(name = "invited_by", nullable = false)
    public String getInvitedBy() {
        return invitedBy;
    }
    public void setInvitedBy(String invitedBy) {
        this.invitedBy = invitedBy;
    }
    
    @Column(name = "instrument_id", nullable = false)
    public String getInstrumentId() {
        return instrumentId;
    }
    public void setInstrumentId(String instrumentId) {
        this.instrumentId = instrumentId;
    }
    
    @Column(name = "sent", nullable = false)
    public Date getSentDate() {
        return sent;
    }
    public void setSentDate(Date sent) {
        this.sent = sent;
    }
    
    @Column(name = "accepted", nullable = false)
    public boolean isAccepted() {
        return accepted;
    }
    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }
    
    
    
}

