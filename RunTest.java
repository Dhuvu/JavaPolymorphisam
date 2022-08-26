package JavaPolymorphisam;

import java.awt.*;

public class RunTest {

    public static void main(String[] args) {

        BarclaysBank bank=new BarclaysBank();
        bank.typesOfAccount("Saving Account","Current Account");
        bank.savingAccount();
        bank.CurrentAccount();

    }
}
