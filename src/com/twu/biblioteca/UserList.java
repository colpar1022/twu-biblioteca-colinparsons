package com.twu.biblioteca;

import java.util.LinkedList;
import java.util.Scanner;

public class UserList implements ItemList{
    Scanner gord = new Scanner(System.in);
    SecurityGuard blart = new SecurityGuard();  //This security guard is used to ensure proper input.
    private LinkedList<User> UList = new LinkedList<>();
    private User a = new User();
    private User b = new User();

    public UserList(){
        a.setName("Colin Parsons"); a.setEmail("scoobysnack@email.com"); a.setPassword("1"); a.setLibNumber("123-4567");
        a.setPhoneNumber("555-5555");
        b.setName("Mel Brooks"); b.setEmail("moviemaker@email.com"); b.setPassword("2"); b.setLibNumber("765-4321");
        b.setPhoneNumber("666-6666");

        UList.add(a);
        UList.add(b);
    }

    public void displayList() {
        //stuff
    }
    public void listOptions(){
        //more stuff
    }

    public void checkUser(){
        Boolean inList = false;
        System.out.println("Please enter your Library number to continue.");
        String userLibNumber = gord.nextLine();
        for(int i = 0; i < UList.size(); i++){
            User checkIn = UList.get(i);

            if(userLibNumber.equals(checkIn.getLibNumber())) {
                inList = true;
                System.out.println("Hello " + checkIn.getName() + " please enter your password: ");

                for (int g = 0; g < 3; g++) {
                    String userPW = gord.nextLine();

                    if (userPW.equals(checkIn.getPassword())) {
                        System.out.println("User authorized.");
                        g = 3;
                        i = UList.size();
                    } else {
                        System.out.println("Incorrect password, please try again: ");
                        if(g == 2){
                            System.out.println("Max number of password attempts reached. Aborting program.");
                            System.exit(0);
                        }
                    }
                }
            }
            if(!inList){
                System.out.println("System did not find the Library Number, please make sure to include the hyphen.");
                System.out.println("Program aborting.");
                System.exit(0);
            }
        }
    }
}
