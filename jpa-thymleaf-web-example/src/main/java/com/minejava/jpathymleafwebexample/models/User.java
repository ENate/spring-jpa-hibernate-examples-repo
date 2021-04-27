package com.minejava.jpathymleafwebexample.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Name field is mandatory")
    private String name;

    @NotBlank(message = "Email field is mandatory")
    private String email;

    public User(){
        // Empty constructor used to initialize fields.
    }



    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }



    public User(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User [email=" + email + ", id=" + id + ", name=" + name + "]";
    }

}
