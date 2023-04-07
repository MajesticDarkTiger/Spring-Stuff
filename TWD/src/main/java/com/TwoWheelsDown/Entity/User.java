package com.TwoWheelsDown.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity

@Table(name="user")

public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "email", nullable = false, unique = true)
    private String email;

    
    @Column(name = "password", nullable = false)
    private String password;

    
    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "isAdmin")
    private Boolean isAdmin;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Bike> bikes;


    public User() {
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
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

    

    @Override
    public String toString() {
        return "User [id=" + id + ", email=" + email + ", password=" + password + ", firstName=" + firstName
                + ", lastName=" + lastName + ", isAdmin=" + isAdmin + ", bikes=" + bikes + "]";
    }


    public Boolean getIsAdmin() {
        return isAdmin;
    }


    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }


    public List<Bike> getBikes() {
        return bikes;
    }


    public void setBikes(List<Bike> bikes) {
        this.bikes = bikes;
    }

    

}
