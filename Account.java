public class Account {
    private int accountnumber;
    private double balance;

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
}
public void payIn(double amount){
    balance += amount;

}

public void main(String[] args){
    Account myAccount = new Account();
    myAccount.setAccountnumber(420);
    myAccount.setBalance(300);
    myAccount.info();
}
}