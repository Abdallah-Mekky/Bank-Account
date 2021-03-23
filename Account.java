
package bank_acc;
public abstract class Account { 
    Person owner;
    String Password;
     
    public Account(){};

    public Account(Person owner, String Password) {
        this.owner = owner ;
        this.Password = Password;
    }
    
    public abstract void add_Acc_To_Owner(Person P1);

    public void setOwner_of_a_class(Person owner) {
        owner= owner;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public Person getOwner_of_a_class() {
        return owner;
    }

    public String getPassword() {
        return Password;
    }

    @Override
    public String toString() {
        return  "[Owner Is " + owner + " , Password Is " + Password + "" ;
    }
    }
 

