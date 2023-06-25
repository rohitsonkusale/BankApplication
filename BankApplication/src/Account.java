public class Account {

    private String AccNumber;
    private double Balance;
    private String Name;
    private  String Email;
    private  String PhoneNumber;

    public Account(String AccNumber, double Balance, String Name, String Email, String PhoneNumber){
        this.AccNumber = AccNumber;
        this.Balance = Balance;
        this.Name = Name;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
    }

    public void DepositMoney(double DepositedMoney){
        this.Balance += DepositedMoney;
        System.out.println("Deposit is sucessful, new balance is: "+this.Balance);
    }

    public void withdrawMoney(double WithdrawalMoney){
        if (this.Balance - WithdrawalMoney < 0){
            System.out.println("Withdrawal unsecessful only "+this.Balance+" is left.");
        }
        else{
            this.Balance -= WithdrawalMoney;
            System.out.println("Withdrawal sucessful, current balance is: "+this.Balance);
        }
    }

    public String getAccNumber() {
        return AccNumber;
    }

    public void setAccNumber(String accNumber) {
        AccNumber = accNumber;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}


