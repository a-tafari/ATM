package AtmLab;

import java.util.ArrayList;

/**
 * Created by abijah on 9/17/16.
 */
public class Account {

    private double balance;
    private int acctNumber;
    private ArrayList <String> acctHistory ;
    private Type acctType;


    public Account (Type type){//When the object is created, Java calls the constructor first. Any code you have in your constructor will then get executed.

        this.acctType= type;
        this.balance= 0.00;
        this.acctHistory= new ArrayList<String>();
    }

    public void addToHistory(String toAdd){
        this.acctHistory.add(toAdd);
    }

    public double getBalance() {
        return balance;
    }

    public int getAcctNumber() {
        return acctNumber;
    }

    public ArrayList<String> getAcctHistory() {
        return acctHistory;
    }

    public Type getAcctType() {
        return acctType;
    }


}
 enum Type{CHECKING, SAVINGS, INVESTMENT};
