package bank_acc;

import java.util.Scanner;

public class Bank_Acc {
  
    public static void main(String[] args) {
        int Chose;
        double Amount,Balance;
        String Name,Email,An,Id,Password;
        Person p1 =new Person("Ah", "123", "abd");
        BankAcc b1 =new BankAcc(7000, p1, "567");
        Person p2 =new Person("Ali", "567", "sham");
        BankAcc b2 =new BankAcc(1000, p2, "567");
      
        Scanner S = new Scanner(System.in);
        System.out.println("Enter The  Name ");
        Name=S.next();
        System.out.println("Enter The Id ");
        Id=S.next();
        System.out.println("Enter The Email ");
        Email=S.next();
        System.out.println("Enter The Password ");
        Password=S.next();
        
         if(Id.equals(p1.ID) && p1.name.equals(Name)){ 
          if (Password.equals(b1.Password) && p1.Email.equals(Email) ) {
              System.out.println("The Balance Is " + b1.Balance);
          }
            System.out.println("Do you want another process? ");
            An=S.next();
            if(An.equals("Yes")){
                System.out.println("Please Write \n 1 To Deposit \n 2 To Withdraw \n 3 To Transfer \n 0 To Exit ");
                Chose=S.nextInt();
                switch(Chose){
                case 1:
                    System.out.println("Please Enter The Amount ");
                    Amount=S.nextInt();
                    b1.Deposit(Amount);
                    System.out.println("The Balance Is " + b1.Balance);
                    System.out.println("Thanks For Using Bank Account Program  ");
                    break;
                case 2:
                    System.out.println("Please Enter The Amount ");
                    Amount=S.nextInt();
                    b1.Withdraw(Amount);
                    System.out.println("The Balance Is " + b1.Balance);
                    System.out.println("Thanks For Using Bank Account Program  ");
                    break;
                case 3:
                    System.out.println("Enter the name of the account you want to transfer to ");
                    String Name1=S.next();
                    System.out.println("Enter the id of the account you want to transfer to ");
                    String Id1=S.next();
                    System.out.println("Enter the email of the account you want to transfer to ");
                    String Email1=S.next();
                    if(Id1.equals(p2.ID) && p2.name.equals(Name1) &&p2.Email.equals(Email1)){
                        System.out.println("Enter the amount to be transferred");
                        double Amount1=S.nextDouble();
                        b1.transfer(Amount1, b2);
                        System.out.println("The Current Balance In The First Account Is " + b1.Balance);
                        System.out.println("The Current Balance In The Second Account Is " + b2.Balance);

                    System.out.println("Thanks For Using Bank Account Program  ");
                    }
                    else{
                        System.out.println("Sorry, the data does not match");
                    }
                    break;
                case 0:
                    System.out.println( b1.toString());
                    System.out.println( b2.toString());
                    System.out.println("Thanks For Using Bank Account Program  ");
                    break;
                       
                    
                default:
                    System.out.println("Invaild Process ");
                    System.out.println( b1.toString());
                    System.out.println( b2.toString());
                }
            }
            else{
                System.out.println( b1.toString());
                System.out.println( b2.toString());
                System.out.println("Thanks For Using Bank Account Program  ");
            }
        }
    }
    }

   

