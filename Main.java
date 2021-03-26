package bank_acc;

import java.util.Scanner;

public class Bank_Acc {

    public static void main(String[] args) {
        int Chose;
        double Amount, Balance;
        String Name, Email, An, Id, Password;
        Person p1 = new Person("Ah", "123", "abd@gmail.com");
        Person p2 = new Person("Ali", "567", "Hassan@gmail.com");
        BankAcc b1 = new BankAcc(7000, p1, "567");
        BankAcc b2 = new BankAcc(1000, p2, "567");

        Scanner S = new Scanner(System.in);
        System.out.println("Please Enter Your  Name ");
        Name = S.next();
        System.out.println("Please Enter Your Id ");
        Id = S.next();
        System.out.println("Please Enter Youe Email ");
        Email = S.next();
        System.out.println("Please Enter Your Password ");
        Password = S.next();

        if (Id.equals(p1.getID()) && p1.getName().equals(Name)) {
            if (Password.equals(b1.Password) && p1.getEmail().equals(Email)) {
                System.out.println("Welcom to our bank ");
                System.out.println("The Balance Is " + b1.getBalance());
            }
            System.out.println("Do you want another process ? ");
            An = S.next();
            if (An.equals("Yes") || An.equals("Y") || An.equals("y")) {
                System.out.println("Please Enter Your Choice: \n 1 To Create\n 2 To Deposit \n 3 To Withdraw \n 4 To Transfer \n 0 To Exit ");
                Chose = S.nextInt();
                switch (Chose) {
                    case 1:
                        System.out.println("Please Enter Your Name");
                        Name = S.next();
                        System.out.println("Please Enter Your Email");
                        Email = S.next();
                        Person C = new Person(Name, "1", Email);
                        System.out.println("Please Enter Your Password");
                        Password = S.next();
                        BankAcc B = new BankAcc(0, C, Password);
                        System.out.println("Created successfully, Mr " + B.getOwner_of_a_class().getName());

                        break;
                    case 2:
                        System.out.println("Please Enter The Amount ");
                        Amount = S.nextInt();
                        b1.Deposit(Amount);
                        System.out.println("The Balance Is " + b1.getBalance());
                        System.out.println("Thanks For Using Bank Account Program  ");
                        break;
                    case 3:
                        System.out.println("Please Enter The Amount ");
                        Amount = S.nextInt();
                        b1.Withdraw(Amount);
                        System.out.println("The Balance Is " + b1.getBalance());
                        System.out.println("Thanks For Using Bank Account Program  ");
                        break;
                    case 4:
                        System.out.println("Enter the name of the account you want to transfer to ");
                        String Name1 = S.next();
                        System.out.println("Enter the id of the account you want to transfer to ");
                        String Id1 = S.next();
                        System.out.println("Enter the email of the account you want to transfer to ");
                        String Email1 = S.next();
                        if (Id1.equals(p2.getID()) && p2.getName().equals(Name1) && p2.getEmail().equals(Email1)) {
                            System.out.println("Enter the amount to be transferred");
                            double Amount1 = S.nextDouble();
                            b1.transfer(Amount1, b2);
                            System.out.println("The Current Balance In The First Account Is " + b1.getBalance());
                            System.out.println("The Current Balance In The Second Account Is " + b2.getBalance());

                            System.out.println("Thanks For Using Bank Account Program  ");
                        } else {
                            System.out.println("Sorry, the data does not match");
                        }
                        break;
                    case 0:
                        System.out.println(b1.toString());
                        System.out.println(b2.toString());
                        System.out.println("Thanks For Using Our Bank ");
                        break;

                    default:
                        System.out.println("Invaild Process ");
                        System.out.println(b1.toString());
                        System.out.println(b2.toString());
                }
            } else {
                System.out.println(b1.toString());
                System.out.println(b2.toString());
                System.out.println("Thanks For Using Our Bank ");
            }
        }
    }
}
