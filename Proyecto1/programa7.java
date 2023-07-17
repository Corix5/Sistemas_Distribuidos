import java.util.Scanner;

public class programa7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tipo de contrato que tiene:");

        System.out.println("1. Hogar");
        System.out.println("2. Negocio");

        int contrato = leer.nextInt();

        switch(contrato){
            case 1:
                System.out.println("ingrese la cantidad de KW que consumió");
                float kw = leer.nextFloat();
                float aux = kw / 250;

                if(aux <= 1){
                    System.out.println("El valor a pagar es de: " + (kw * 0.65));
                }

                if(aux > 1 && aux <= 2){
                    System.out.println("El valor a pagar es de: " + ((250 * 0.65) + ((kw - 250) * 0.85)));
                }

                if(aux > 2 && aux <= 4.8){
                    System.out.println("El valor a pagar es de: " + ((250 * 0.65) + (250 * 0.85) + ((kw - 500) * 1.5)));
                }

                if(aux > 4.8 && aux <= 8.4){
                    System.out.println("El valor a pagar es de: " + ((250 * 0.65) + (250 * 0.85) + (250 * 1.5) + ((kw - 750) * 2.5)));
                }

                if(aux > 8.4){
                    System.out.println("El valor a pagar es de: " + ((250 * 0.65) + (250 * 0.85) + (250 * 1.5) + (250 * 2.5) + ((kw - 2100)*3)));
                } 
                break;

            case 2:
                System.out.println("ingrese la cantidad de KW que consumió");
                int kw2 = leer.nextInt();
                System.out.println("El valor a pagar es de: " + (kw2 * 5));
                break;

            default:
                System.out.println("Opción no válida");
                break;
        }
            

        leer.close();
    }
}
