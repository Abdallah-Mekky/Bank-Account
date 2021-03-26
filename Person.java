package bank_acc;

import java.util.ArrayList;

import java.util.List;

public class Person {

    private String name;
    private String ID;
    private String Email;
    private List<Account> accounts;

    public Person(String name, String ID, String Email) {
        this.setName(name);
        this.setID(ID);
        this.setEmail(Email);
        accounts = new ArrayList();
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

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
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

    public List<Account> getAccounts() {
        return accounts;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", ID=" + ID + ", Email=" + Email + ", accounts=" + accounts + '}';
    }
}
