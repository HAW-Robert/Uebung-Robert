package User;
public class UserExample {
    public static void main(String[] args){
        //Objekt der Klasse "User" namens Mustermann wurde mit userId erstellt. Permissions fehlen noch
        User Mustermann = new User(420 );
        //Erstmal wird eine variable vom Typ Permissions erstellt WICHTIG => da sie unterklasse von User ist muss vorher das User. stehen.
        //Dann wird ganz normal die get FUnktion aufgerufen
        User.Permissions perm = Mustermann.getPermissions();
        //Jetzt können die Variablen der Klasse Permissions verändert werden
        perm.setWrite(true);
        perm.setDelete(false);
        perm.setRead(true);
        System.out.println("Write = "+ perm.canWrite());
        System.out.println("Delete = "+ perm.getDelete());
        System.out.println("Read = "+ perm.canRead());
    }
}
