import model.Account;
import model.CreditAccount;
import model.SavingAccount;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        Account savingAccount = new SavingAccount("Somnang");
        savingAccount.deposit(30.0);
        savingAccount.withdraw(10);
        savingAccount.showBalance();
        Account creditCardAccount = new CreditAccount("527-998-098-440-8225",
                LocalDateTime.of(2026,1,1,1,1),
                "333");
        creditCardAccount.deposit(10);
        creditCardAccount.withdraw(11);
        creditCardAccount.showBalance();
    }
}
