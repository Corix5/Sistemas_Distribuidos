import java.util.Scanner;

public class programa2 {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe el valor de a:");
        a = leer.nextInt();
        System.out.println("Escribe el valor de b:");
        b = leer.nextInt();
        System.out.println("Escribe el valor de c:");
        c = leer.nextInt();
        System.out.println("Escribe el valor de d:");
        d = leer.nextInt();
        leer.close();
        float resultado = (float)(a * c) / (float)(b * d);
        System.out.println("El resultado de la operación es: " + resultado );
        System.out.println("El resultado en forma de fracción es: " + (a * c) + "/" + (b * d));
    }
}
