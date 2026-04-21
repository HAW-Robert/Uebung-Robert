public class OverloadingExample {

    public int max(int a, int b) { // dieser Funktion werden zwei int werte gegeben und sie gibt einen int zurück ( den größeren)
        return a < b ? b: a;   // Hier steht übersetzt : return Bedingung ? Rückgabe wenn wahr : Rückgabe wenn falsch || Kurze form der if else schreibweise 
    }

    public double max(double a, double b){
        return a < b ? b: a;
    }

    public int max(int a, int b, int c){
        return max(max(a, b), c); // zuerst wird die max(int a, int b) Funktion aufgerufen und anschließend wird der gewinner davon mit int c verglichen 
    }
    public static void main(String[] args){
        OverloadingExample overExample = new OverloadingExample();
        System.out.println("Maximum aus 1 und 3 : " + overExample.max(1, 3)); // Print Funktion einen Text Übergeben . Die werte die gedruckt werden sollen kommen aus der Funktion die am ende übergeben wurde
        System.out.println("Maximum aus 1, 2, 3 : " + overExample.max(1, 2, 3)); // Java weiß genau welche methode genommen werden muss da die zu übergebenden parameter abgeglichen werden und es nur ewine methode mit drei parametern gibt 
        System.out.println("Maximum aus 2.5 und 3.5 : " + overExample.max(2.5f, 3.5f));// Auch hier weiß Java gleich bescheid da doubles übergeben werden und es nur eine passende funktion gibt 
    }
    // Jede Funktion heißt "max" und doch kann java sie anhand der parameter auseinander halten 
}   // Java entscheidet bei Methodenaufrufen ausschließlich anhand der Parameter welche übergeben werden , um welche Methode es sich handelt. Der Name ist nicht entscheident 
