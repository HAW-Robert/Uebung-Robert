//Dieses Programm soll den Unterschied zwischen variablen und klassen zeigen . Aus C kennt man es als call by Value und call by reference 
public class ParamExample {
    public void example(double amount, Account account){ // amount = Zahl die ich der Funktion überreiche
        amount += 100;                                   // account = Speicheradresse des Objekts der Klasse Account übergeben
        account.payIn(amount);
    }
    public static void main(String[] args){
        ParamExample p = new ParamExample(); //Objekt der Klasse ParamExample erstellt 

        double value = 100.0; //variable die der example funktion übergeben wird
        Account account = new Account(); // neues Objekt der Klasse Account erstellt um es der Funktion zu übergeben.

        System.out.println("Before : Einzahlungsbetrag = " + value
                            + " Guthaben = " + account.getBalance()); // Betrag von value wird ausgegeben 
                                                                      // getBalance Funktion aus Account.java wird aufgerufen um das Guthaben des neu erstellten kontos zu checken 
        
        //Methoden aufruf 
        p.example(value, account); // amount wird um value geändert und aufs konto gezahlt . Das Konto verändert sich dauerhaft (änderung in adresse gespeichert)
                                    // value wird nur kopiert solange die funktion läuft danach wird es wieder gelöscht . deswegen bleibt value 100 und erhöt sich nicht 
        
        System.out.println("After : Einzahlungsbetrag = " + value 
                            + " Guthaben = " + account.getBalance());
        

    }

}
