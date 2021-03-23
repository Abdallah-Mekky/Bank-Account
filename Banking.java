package bank_acc;
public interface Banking {
     public void Deposit(double Amount);
    public void Withdraw(double Amount);
    public void transfer(double Amount,BankAcc another);
}
 