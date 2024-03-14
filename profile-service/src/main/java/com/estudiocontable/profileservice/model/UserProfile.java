package com.estudiocontable.profileservice.model;

//@Entity
public class UserProfile {
  //  @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String lastName;
    private String cuit;
    private String password;
    private Role role;

    public UserProfile(){}

    public UserProfile(String name, String lastName, String cuit, String password){
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
