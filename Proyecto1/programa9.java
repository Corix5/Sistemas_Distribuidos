import java.util.Scanner;

public class programa9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 0 y 9999 ");	
        int numero = leer.nextInt();
        leer.close();
        if(numero >= 0 && numero <= 9999) {
            if(numero >= 100 && numero <=999){
                int a = numero / 100;
                int b = numero % 10;
    
                if(a == b) {
                    System.out.println("El numero es capicua");
                } else {
                    System.out.println("El numero no es capicua");
                }
            } else if(numero >= 10 && numero <= 99) {
                int a = numero / 10;
                int b = numero % 10;
    
                if(a == b) {
                    System.out.println("El numero es capicua");
                } else {
                    System.out.println("El numero no es capicua");
                }
            } else if(numero >= 0 && numero <= 9) {
                System.out.println("El numero es capicua");


            } else if(numero >= 1000 && numero <= 9999) {
                int a = numero / 1000;
                int b = numero % 10;
    
                if(a == b) {
                    System.out.println("El numero es capicua");
                } else {
                    System.out.println("El numero no es capicua");
                }
            }
            else {
            System.out.println("El numero ingresado no esta entre 0 y 9999");
            }
        }
    }
}
