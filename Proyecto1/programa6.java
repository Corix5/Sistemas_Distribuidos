import java.util.Scanner;

public class programa6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tipo de vehiculo");

        System.out.println("1. Motocicleta");
        System.out.println("2. Automovil");
        System.out.println("3. Camioneta");
        System.out.println("4. Camion de carga");
        System.out.println("5. Vehiculo de más de 6 ejes");

        int vehiculo = leer.nextInt();

        switch (vehiculo){
            case 1:
                System.out.println("La cuota es de $20");
                break;
            case 2:
                System.out.println("La cuota es de $40");
                break;
            case 3:
                System.out.println("La cuota es de $60");
                break;
            case 4:
                System.out.println("La cuota es de $250");
                break;
            case 5:
                System.out.println("Ingrese la cantidad de ejes del vehiculo");
                int ejes = leer.nextInt();
                if(ejes > 6){
                    System.out.println("La cuota es de $" + (250 + (ejes - 6) * 50));
                }

                if(ejes <= 6){
                    System.out.println("El vehiculo debe ser de al menos de 7 ejes");
                }
                break;
            default:
                System.out.println("El vehiculo no esta registrado");
                break;
        }
        leer.close();
    }
}
