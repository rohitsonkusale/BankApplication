
public class Main {
    public static void main(String[] args) {
        Account RohitAccount = new Account("12345",500,"Rohit","rohit@xyz","99887766");

        RohitAccount.DepositMoney(100);
        RohitAccount.withdrawMoney(300);
        RohitAccount.withdrawMoney(800);
    }
}