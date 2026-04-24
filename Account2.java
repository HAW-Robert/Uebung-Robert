public class Account2 {
    private int accountnumber;
    private double balance;
//Konstruktor
public Account2(int accountnumber, double balance){ //Der Konstruktor muss klar definiert sein  ( wenn nur ein konstruktor wo a und b einen wert haben muss man auch beim erstellen a und b eintragen)
    this.accountnumber = accountnumber;// Es ist gewollt das der Parameter und die Variable den selben namen haben . "this.name" ist die zu verändernde variable "name" ist der Parameter
    this.balance = balance;
}
public Account2(Account2 other){}
//getters setters
// Setters sind eigentlich überflüssig wenn man konstruktoren hat . Jedenfalls bei diesem beispiel
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
public void payOut(double amount){
    balance -= amount;
    setBalance(balance);
}
public static void main(String[] args){
    Account2 myAccount = new Account2(420,300); // Dank dem Konstruktor kann ich einfach werrte in die klammer eintragen und diese Werden direkt für den neuen Account übernommen 
    myAccount.info();
}
}

