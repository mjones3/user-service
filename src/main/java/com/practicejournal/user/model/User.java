package com.practicejournal.user.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = 3896465416009735288L;

    public User(String userId, String firstName, String lastName, String emailAddress, String password, String roleId, boolean enabled) {
        super();
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.password = password;
        this.roleId = roleId;
        this.enabled = enabled;
    }
    
    public User() {
        super();
    }

    @Id
    @Column(name = "user_id", nullable = false)
    String userId;
    
    @Column(name = "email_address", nullable = false)
    String emailAddress;
    
    @Column(name = "first_name", nullable = false)
    String firstName;
    
    @Column(name = "last_name", nullable = false)
    String lastName;

    @Column(name = "password", nullable = false)
    String password;   
   
    @Column(name = "role_id", nullable = false)
    String roleId;   
    
    @Column(name = "enabled", nullable = false)
    boolean enabled;
    
    @Column(name = "created", nullable = false)
    Date createdDate;

    
    
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    
    public String getEmailAddress() {
        return emailAddress;
    }


    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    

    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
}
