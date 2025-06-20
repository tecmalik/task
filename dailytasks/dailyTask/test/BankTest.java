import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    @Test
    public void BankAndCreateAnAccountTest() {
        Bank bank = new Bank();
        assertEquals(0, bank.getNumberOfAccount());
        assertEquals ("Thank You" , bank.createAccount("String", "phoneNumber"));
//        assertEquals( 1 , bank.getNumberOfAccount());


    }


}
