package com.tempedge.TempEdge.Domain.SecurityEntities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class UserSecurity extends BaseEntity {
    private String username;
    private String password;
    @OneToMany(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
    private List<Role> roles;
    private boolean active ;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    public UserSecurity(){}
    public UserSecurity(String username, String password, List<Role> roles, boolean active) {
        this.username = username;
        this.password = password;
        this.roles = roles;
        this.active = active;
    }
}
