import java.util.Scanner;

public class programa5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Años de trabajo del empleado");
        int anios = leer.nextInt();

        if(anios >= 1 && anios <= 5){
            System.out.println("Al empleado le corresponde 5 días de vacaciones");  
        }

        if(anios >= 6 && anios <= 10){
            System.out.println("Al empleado le corresponde 10 días de vacaciones");  
        }

        if(anios > 10 && anios <= 45){
            System.out.println("Al empleado le corresponde " + anios + " días de vacaciones");  
        }

        if(anios > 45){
            System.out.println("El empleado le corresponde 45 días de vacaciones");  
        }

        leer.close();
    }
    

}