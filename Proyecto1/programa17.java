import java.util.Scanner;

public class programa17 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] numeros = new int[10];
        
        for(int i = 0; i < 10; i++){
            System.out.println("Ingrese un numero: ");
            numeros[i] = leer.nextInt();
        }

        for(int i = 9; i >= 0; i--){
            System.out.println("El numero ingresado es: " + numeros[i]);
        }

        leer.close();
    }
}
