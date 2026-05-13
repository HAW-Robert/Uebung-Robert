package Account;
public class Account {
    private int accountnumber;
    private double balance;
    private Transaction last;

public class Transaction{
    private String name;
    private double amount;

public Transaction(String name, double amount){
    this.name = name;
    this.amount = amount;
}
//Funktion kann ein Objekt bzw den Inhalt als String wiedergeben 
public String toString(){
    return "Transaction : "+ name +" : "+ amount;
}
public Transaction getLast(){
    return last;
}
}
//getters setters
public void setAccountnumber(int newNumber){
      accountnumber = newNumber;
}
public int getAccountnumber(){
    return  accountnumber;
}
public void setBalance(double newBalance){
    balance = newBalance;
}
public double getBalance(){
    return balance;
}
public void info(){
    System.out.println("Accountnumber :" + accountnumber);
    System.out.println("Balance :" + balance);
    System.out.println("Letzte Kontobewegung :"+ last);
}
public void payIn(double amount){
    balance += amount;
    last =new Transaction(" Kindergeld", amount);
}

public void main(String[] args){
    Account myAccount = new Account();
    myAccount.setAccountnumber(420);
    myAccount.setBalance(300);
    myAccount.payIn(420);
    myAccount.info();
}
}