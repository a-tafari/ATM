package AtmLab;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by abijah on 9/17/16.
 */
public class UserTest {
    @Test

    public void getAcctTest(){
        User userAccount = new User("Tom", "Jerry");// create a new User named useraccount/ user takes and argument of two strings
        Account account = new Account(Type.CHECKING);//create a new Account object called account because the get account method returns an Account type
        userAccount.getAccountList().add(account);//"hey new useraccount, go get the account list and add the new account we just made....."

        assertEquals("the account should be of the CHECKING Type", account, userAccount.getAccount(Type.CHECKING) );


    }
}


