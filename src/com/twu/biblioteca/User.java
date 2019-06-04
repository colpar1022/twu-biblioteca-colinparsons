package com.twu.biblioteca;

public class User {
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private String libNumber;

    public User(){ }

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public String getLibNumber(){
        return libNumber;
    }
    public String getPhoneNumber(){ return phoneNumber; }

    public void setName(String newName){
        if(newName.length() < 1){
            System.out.println("Name field was left empty, please enter the name properly.");
        }else{
            name = newName;
        }
    }
    public void setEmail(String newEmail){
        if(newEmail.length() < 1){
            System.out.println("Email field was left empty, please enter the email properly.");
        }else{
            email = newEmail;
        }
    }
    public void setPassword(String newPassword){
        if(newPassword.length() < 1){
            System.out.println("Password field was left empty, please enter the email properly.");
        }else{
            password = newPassword;
        }
    }
    public void setLibNumber(String newLibNumber){
        if(newLibNumber.length() != 8){
            System.out.println("Library number was not proper length, make sure to include the hyphen after the first three numbers.");
        }else{
            libNumber = newLibNumber;
        }
    }
    public void setPhoneNumber(String newPhoneNumber){
        if(newPhoneNumber.length() < 8){
            System.out.println("Phone number is not proper length, please make sure to include any hyphens.");
        }else {
            phoneNumber = newPhoneNumber;
        }
    }
}
