package AtmLab;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by abijah on 9/17/16.
 */
public class AtmTest {

    @Test

    public void authenticateTest(){
        Atm atm = new Atm();
        User user = new User("Tom", "Jerry");
        atm.getListOfUsers().add(user);
        assertEquals("This test should return true", true, atm.authenticateUser("Tom", "Jerry")  );

    }
    @Test
    public  void getUserfromListTest(){
        Atm atm = new Atm();//create new atm object of the Atm Class because that is where the get user method is
        User user = new User("Tom", "Jerry");//create the a new user object in order to create users
        atm.getListOfUsers().add(user);// atm! go to the get list of user method and add the user object i just gave you.
        assertEquals("This test should return true", user, atm.getUserFromList("Tom", "Jerry") );
    }
    @Test
    public  void createAccountTest(){
        Atm atm = new Atm();//create new atm object of the Atm Class because that is where the createAccount method is
        User user = new User("Tom", "Jerry");//create the  new user object in order to create users
        Account account= new Account(Type.CHECKING);//create a new account object we will need to access Type of account
        atm.getListOfUsers().add(user);// atm! go to the get list of user method and add the user object i just gave you.
        atm.createAccount("Tom","Jerry", Type.CHECKING);//create
        assertEquals("This test should return true", account.getAcctType(), user.getAccount(Type.CHECKING).getAcctType() );
    }


}
