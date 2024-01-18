package lt.techin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @BeforeEach
    public void setUp() {
        bankAccount = new BankAccount("LT1234567891012", "Paulius");
    }

    @Test
    public void shouldBalanceIsCorrectTheBankAccountIsCreated() {
//given
        //then
        assertEquals(0.0, bankAccount.getBalance());
    }

    @Test
    public void shouldbalanceIsCorrectAfterDeposit() {
//given
        bankAccount.deposit(100);
        assertEquals(100.0, bankAccount.getBalance());
    }

    @Test
    public void shouldAccountOwnerNameReturnCorrectValue() {
        assertEquals("Paulius", bankAccount.getAccountOwner());
    }

    @Test
    public void shouldWithdrawAmountExceedingBalanceReturningFalse() {
        bankAccount.deposit(100);
        assertFalse(bankAccount.withdraw(500));
    }
    @Test
    public void shouldWithdrawValidAmountWhenDecreaseBalance(){
        bankAccount.deposit(1000);
        assertAll(
                () -> assertTrue(bankAccount.withdraw(500)),
                () -> assertEquals(500, bankAccount.getBalance())
        );
    }
}