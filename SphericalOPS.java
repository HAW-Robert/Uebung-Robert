
    
import static java.lang.Math.PI; // we can use PI now instead of 3.14159...

public class SphericalOPS {
 /**
     * A point in a 3D room can be described by
     * cartesian coordinates (x,y,z) or with
     * spherical (polar) coordinates:
     * dist : distance from origin
     * phi  : angle in the x-y-plane
     * psi  : angle perpendicular to x-y-plane
     */

    // construct the three PRIVATE fields with
    // names dist, phi, psi of type double


    // add getters and setters for all three fields
    // requirements for setters:

    // setDist must ensure that dist>=0. 
    // if dist<0, the setter has to negate all fields

    // setPhi must ensure that -PI < phi <=PI
    // if phi is not in this interval, it has to add
    // or subtract 2*PI until this interval is reached

    // setPsi must ensure that -PI/2 <= psi <=PI/2
    // if psi is not in this interval, it has to add
    // or subtract 2*PI until [-PI,PI] is reached.
    // If it is now >PI/2, set psi to PI-psi and add PI to phi (use setPhi!)
    // If it is now <-PI/2, set psi to -PI-psi and add PI to phi (use setPhi!)
    private double distance ;
    private double phiAngle;
    private double psiAngle;
    //Getters and Setters 
   
    public void setPhiAngle(double phiAngle){ // Erste Version der Methode , man könnte nur mit while schleifen arbeiten um den code zu vereinfachen . siehe andere Methoden
        if(phiAngle < -PI){
            while(phiAngle <= -PI){
                phiAngle += 2*PI ;
            }
        }else if(phiAngle > PI){
            while(phiAngle > PI){
                phiAngle -= 2*PI;
            }
        }
        this.phiAngle = phiAngle;
    }
    public void setPsiAngle(double psiAngle){ // Wert wird kontrolliert und modifiziert das er im intervall liegt 

        while(psiAngle <= -PI){
            psiAngle += 2*PI;
        }
        while(psiAngle > PI){
            psiAngle -= 2*PI;
        }
        if(psiAngle < -PI/2){
            psiAngle = - PI - psiAngle ;
            setPhiAngle(this.phiAngle + PI); // Sollte so Aussehen : setPhiAngle(this.phiANgle + PI);
        }
        else if(psiAngle > PI/2){
            psiAngle = PI - psiAngle;
            setPhiAngle(this.phiAngle + PI);
        }
        this.psiAngle = psiAngle;
    }
    public void setDistance(double distance){
        if(distance < 0){ // Einfachste Prüfung da alles größer als kleinmer null ja legal ist also reicht eine unterscheiudung 
            distance = -distance;
             setPhiAngle(-this.phiAngle);// Sehr wichtig an dieser steler den setter zu benutzen 
             setPsiAngle(-this.psiAngle);
        }
        this.distance = distance;
    }
    public double getDistance(){
        return distance;
    }
    public double getPhiAngle(){
        return phiAngle;
    }
    public double getPsiAngle(){
        return psiAngle;
    }
    public void info(){
         System.out.println("Distanz = " + getDistance());
         System.out.println(" Winkel PHI = " + getPhiAngle());
         System.out.println("Winkel PSI = " + getPsiAngle());
    }
    public static void main(String[] args){
    SphericalOPS mySphere = new SphericalOPS();
    mySphere.setPhiAngle(2.0f); // Wenn man die Distanz zuerst bestimmt werden die Winkel nicht mehr Negiert 
    mySphere.setPsiAngle(-0.5f);
    mySphere.setDistance(-3.0f);
    mySphere.info(); // Info Funktion erstellt und genutzt da man in der main nicht mehr auf die variablen zugreifen kann . Funktion aufrufen erscheint mir leichter 
    }
}


