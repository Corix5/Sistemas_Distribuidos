import java.util.Scanner;

public class programa1 {
    public static void main(String[] args) {
        int centigrados;
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe en grados centigrados:");
        centigrados = leer.nextInt();
        System.out.println("La temperatura en grados Fahrenheit es: " + (centigrados * 9 / 5 + 32));
        leer.close(); 
    }
}
