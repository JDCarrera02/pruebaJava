package ud1;

public class Constantes {
    //Fuerza de la gravedad
    public static final double G = 9.80665;
    public static void main(String[] args) {
        // Con que fuerza atrae la tierra a un balon de futbol
        // Formula: F = m * g;
        double m = .450;
        double f = m * G;
        System.out.println("La tierra atrae a un balon de futbol con una fuerza de " + f + " Newtons");
    }
    
}
