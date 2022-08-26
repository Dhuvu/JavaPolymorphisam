package JavaPolymorphisam;

public class RunTest {

    public static void main(String[] args) {

        BarclaysBank bank=new BarclaysBank();
        System.out.println(bank.typesOfAccount("Barclays"));
        bank.savingAccount();
        bank.CurrentAccount();

    }
}
