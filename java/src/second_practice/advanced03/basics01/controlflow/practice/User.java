package second_practice.advanced03.basics01.controlflow.practice;

import java.util.List;

public class User {
    private String name;
    private boolean isActive;
    private List<String> roles;

    public User(String name, boolean isActive, List<String> roles) {
        this.name = name;
        this.isActive = isActive;
        this.roles = roles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}