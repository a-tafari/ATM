package AtmLab;

import java.util.ArrayList;

/**
 * Created by abijah on 9/17/16.
 */
public class Atm {
    private ArrayList <User> listOfUsers;//we create instance variables in the user class


    public Atm() {
        this.listOfUsers = new ArrayList<User>();//this listOfUsers is equal to new list of Users
    }

    public Boolean authenticateUser(String username, String password ){// method returns true or false it passes two strings
        for(User user : listOfUsers){// we need a for loop called user that goes to the User class and goes through the list of users
            if(user.getUserName().equalsIgnoreCase(username)&& user.getPassword().equalsIgnoreCase(password)){
                return true;
            }
        }

                return false;
    }

    public User getUserFromList (String username, String password){
        for (User user : listOfUsers){
            if(user.getUserName().equalsIgnoreCase(username)&& user.getPassword().equalsIgnoreCase(password)){
                return user;
            }
        }
                return null;
    }
    public String createAccount (String username, String password, Type type){// we are creating an account that takes a string, password and an enum Type
        User user = getUserFromList(username, password);
        Account usertype = new Account(type);
        user.getAccountList().add(usertype);

        return "Affirmative";

    }

    public ArrayList<User> getListOfUsers() {
        return listOfUsers;
    }

    public void withdraw (String username, Type type, double amount){
        User user = ;
    }
}
