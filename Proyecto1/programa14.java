import java.util.Scanner;

public class programa14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero X");
        int x = leer.nextInt();
        System.out.println("Ingrese un numero Y");
        int y = leer.nextInt();
        leer.close();

        while(x<200){
            x = x + y;
            System.out.print(x + ", ");
        }
    }
}
