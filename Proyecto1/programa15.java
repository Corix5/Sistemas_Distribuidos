import java.util.Scanner;

public class programa15 {
    public static void main(String[] args) {
        int aleatorio = (int)(Math.random()*100+1);
        Scanner leer = new Scanner(System.in);

        int num = -1;

        while(num != aleatorio){
            System.out.println("Adivine el numero");
            int num2 = leer.nextInt();
            num = num2;

            if(num == aleatorio){
                System.out.println("Felicidades, ganaste");
            }

            if(num == 0){
                System.out.println("Saliendo...");
                break;
            }
        }
        leer.close(); 
    }
}
