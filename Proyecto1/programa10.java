import java.util.Scanner;

public class programa10 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero");
        Scanner leer = new Scanner(System.in);
        int numero = leer.nextInt();
        leer.close();
        int cont = 0;

        for(int i = 1; i <= numero; i++) {
            cont = cont + i;
        }
        System.out.println(cont);
    }
}
