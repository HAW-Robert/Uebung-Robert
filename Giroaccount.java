//Giroaccount ist Subklasse von Account2: dadurch erbt Giroaccount die public Attribute und public Methoden von Account2. In diesem Programm sieht man worauf man achten muss beim vererben. Um die Privaten Attribute von Account2 zu erhalten hat man den Konstruktor von Acc2 aufgerufen.
public class Giroaccount extends Account2 { //durch das extend wird Giroaccount eine subklasse von Account2 
    private double limit ;                  //Subklassen erben die eigenschaften ihrer superklasse 

    //Konstruktor 

    public Giroaccount(int accountnumber, double balance, double limit){
        super(accountnumber, balance);// Konstruktor von Account2 wird aufgerufen ( dadurch wird accountnumber und balance gesettet)
        this.limit = limit; // Nur das Limit muss von diesem Konstruktor gemacht werden den rest macht der Konstruktor von Account2
        // Super baut erstmal ein Konto, durch das Limit wird es zu einem Giroaccount . Superklasse => Subklasse 
    }

    public void setLimit(double limit) { 
        if(limit > 0.0){ // Kontrollstruktur : Limit soll größer als 0 sein.
            this.limit = limit;
        }else{
            limit = 0.0;
        }
        
    }
    @Override
    public void payOut(double amount){
       double balance = getBalance(); // Kontostand muss per Methode abgefragt werden da das private feld balance von Account2 verwaltet wird und Giroaccount kein zugriff hat.
       if(balance - amount >= - limit){            // Möchte man aus der subklasse auf private informationen der superklasse zugreifen muss man entsprechende methoden verwenden 
        balance -= amount; 
        setBalance(balance);             // Limit beschreibt wie wei man ins negative gehen darf. Beispiel ; Limit = 1000€ Kontostand = 500€ Amount=2000€ => Kontostand - Amount = -1500€ || Amount >= -Limit? || -1500 > -1000 => Limit überzogen, da -1500 nicht größer gleich -1000 ist.
       }else{
        System.out.println("Auszahlung nicht möglich, Limit überzogen");
       }
        
       
    }
    public double getLimit(){
        return limit;
        
    }
    public void info(){
        System.out.println("Accountnumber = " + getAccountnumber()); // Da wir in einer subklasse sind muss ich über Methioden auf Variablen zugreifen
        System.out.println("Kontostand = " + getBalance());
        System.out.println("Limit = " + getLimit());
    }
    public static void main(String[] args){
        Giroaccount myGiroaccount = new Giroaccount(420,700, 1000);
        myGiroaccount.payIn(300);
        myGiroaccount.payOut(1000);
        myGiroaccount.info();
    }
}
