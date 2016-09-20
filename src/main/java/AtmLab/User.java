package AtmLab;

import java.util.ArrayList;

/**
 * Created by abijah on 9/17/16.
 */
public class User {
    private String userName;//we create instance variables in the user class
    private String password;
    private ArrayList<Account> accountList;//Arraylist holds "objects of the Account class" called accountList

    public User(String userName, String password) {//When the object is created, Java calls the constructor first. Any code you have in your constructor will then get executed.
        this.userName = userName;
        this.password = password;
        this.accountList = new ArrayList<Account>();
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    public Account getAccount(Type type) {// in order to "getAccount" we have to got to the Account class... so get Acct returns an Account type
        for (Account account : accountList) {// we need a for loop called account that goes to the Account class and goes through the list of accounts
            if (account.getAcctType().equals(type)) {// made account call the get acctType method it checks to see if the account type is equal to the type that is entered. if it is .. return the account
                return account;
            }
        }
        return null;

    }
}
