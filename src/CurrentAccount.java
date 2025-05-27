public class CurrentAccount extends BankAccount{
    private double overdraftlimit= 10000;

    public CurrentAccount(String AccountHolderName, String AccountNumber, double balance) {
        super(AccountHolderName, AccountNumber, balance);


    }
    public void deposit(double amount) {
        if (amount >= 0) {
            increaseBalance(amount);
            System.out.println("Deposit Successful!!");
            System.out.println("new balance"+getBalance());
        }
        else{
            System.out.println("balance must be positive ");
        }
    }
    public void  withdraw (double amount) throws InsufficientBalanceException{
        if (amount>getBalance()+overdraftlimit){
            throw new InsufficientBalanceException("overdraft limit reached");
        }else{
decreaseBalance(amount);
            System.out.println("Withdrawl Successful!");
        }
    }


}

