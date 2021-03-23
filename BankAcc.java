package bank_acc;
public class BankAcc extends Account  implements Banking{
    double Balance;
    public BankAcc(double Balance, Person owner, String Password) {
        super(owner, Password);
        this.Balance = Balance;
        add_Acc_To_Owner(owner);
    }
    
     public  void add_Acc_To_Owner(Person P1){
        P1.accounts.add(this);
      
        
      }
     
    
   public void Deposit(double Amount){
if(Amount>0){
Balance +=Amount;
}else{
    System.out.println(" The Operation Is Canceled");
    System.out.println(" The Amount Should Be Positive");
    }
}
public void Withdraw(double Amount){
if(Amount>0 && Amount<=Balance){
Balance -=Amount;
}else{
  System.out.println(" The Operation Is Canceled");
  System.out.println(" The Amount Should Be less than Amount");
}
} 

    public void transfer(double Amount,BankAcc another){
    if(Amount<=0){
        System.out.println("Sorry, there is no balance in the account");
    }
    else if(Amount>Balance){
        System.out.println("We regret that the process cannot be completed because the transfer value is greater than the balance in the account");
    } 
    else{
    this.Balance -=Amount;
    another.Balance +=Amount;
    }
    }

    @Override
    public String toString() {
        return super.toString()+" , The Current Balance Is "+ Balance +"]";
    }
    }
 