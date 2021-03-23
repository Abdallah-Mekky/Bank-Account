
package bank_acc;
import java.util.ArrayList;
import java.util.List;


public class Person {
    String name;
String ID;
String Email;
ArrayList<Account> accounts=new ArrayList<Account>(); 


    public Person(String name, String ID, String Email) {
        this.name = name;
        this.ID = ID;
        this.Email = Email;
        this.accounts=accounts;
    }

    public void setName(String name) {
        this.name = name; 
        
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public String getEmail() {
        return Email;
    }
       public String toString(){
 return (getName()+" , Id  Is " +getID()+" , Email Is " +getEmail()+"");}
}


 