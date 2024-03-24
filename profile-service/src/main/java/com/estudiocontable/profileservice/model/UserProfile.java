package com.estudiocontable.profileservice.model;

//@Entity
public class UserProfile {
  //  @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String lastName;
    private String cuit;
    private String email;
    private String phoneNumer;
    private String password;
    private Role role;

    public UserProfile(){}

    public UserProfile(String name, String lastName, String cuit,String email, String phoneNumer, String password){
        this.name = name;
        this.lastName = lastName;
        this.cuit = cuit;
        this.email = email;
        this.phoneNumer = phoneNumer;
        this.password = password;
        this.role = Role.CLIENT;
    }

    public Long getId(){
        return getId();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumer() {
        return phoneNumer;
    }

    public void setPhoneNumer(String phoneNumer) {
        this.phoneNumer = phoneNumer;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
