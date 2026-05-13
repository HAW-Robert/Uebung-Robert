package User;
public class User {
    private int userId;
    //Variable permissions erstellt, welche später auf ein Permissions Objekt zeigen kann.
    //Arrays werden von Java selbst befüllt. Objekte nicht, deswegen muss im Konstruktor der Klasse User ein Objekt erstellt werden.
    //Wird kein Objekt erstellt kommt es bei "UserExample" zu Fehlern, da Funktionen versuchen ein nicht existentes Objekt zu füllen.
    private Permissions permissions;
    

public User(int userId){
    this.userId = userId;
    //Objekt wird erstellt und wartet darauf von Funktionen angesprochen zu werden
    this.permissions = new Permissions();
    
}
//Ohne diese get Funktion könnte man nicht außerhalb dieser klasse auf permissions zugreifen
public Permissions getPermissions(){
    return permissions;
}
public int getUserId(){
    return userId;
}
//Unterklasse der Klasse User (Keine Vererbung / nicht Verwand)
//Soll woanders Permissions aufgerufen werden muss erst "User" aufgerufen werden
//User.Permissions.....
public static class Permissions {
    private boolean write;
    private boolean read;
    private boolean delete;

//Setters => ohne die setter könnte ich bei UserExample nicht auf die Permissions zugreifen da alles privat
//Setters sind meine möglichkeit auf private felder an anderen orten zuzugreifen
public void setWrite(boolean write){
    this.write = write;
}
public void setRead(boolean read){
    this.read = read;
}
public void setDelete(boolean delete){
    this.delete = delete;
}
//Getters => ohne die (return ...) würde die fehlermeldung 
// das die entsprechenden  felder nicht genutzt werden angezeigt
public boolean canWrite(){
    return write;
}
public boolean canRead(){
    return read;
}
public boolean getDelete(){
    return delete;
}
}
}