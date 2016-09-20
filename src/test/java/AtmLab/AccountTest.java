package AtmLab;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by abijah on 9/17/16.
 */
public class AccountTest {
@Test

    public void addHistoryTest(){
        Account account = new Account(Type.CHECKING);
        String deposit20 = "deposit20";
        account.addToHistory(deposit20);
        assertEquals("the expected value did not match", deposit20, account.getAcctHistory().get(0) );


    }
}
