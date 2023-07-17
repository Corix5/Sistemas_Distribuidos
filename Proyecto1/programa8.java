import java.util.Scanner;

public class programa8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 3 números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int num3 = leer.nextInt();
        leer.close();

        if(num1 > num2 && num1 > num3){
            if(num2 > num3)
                System.out.println(num1 + ", " + num2 + ", " + num3);
            else
                System.out.println(num1 + ", " + num3 + ", " + num2);
        }

        if(num2 > num1 && num2 > num3){
            if(num1 > num3)
                System.out.println(num2 + ", " + num1 + ", " + num3);
            else
                System.out.println(num2 + ", " + num3 + ", " + num1);
        }

        if(num3 > num1 && num3 > num2){
            if(num1 > num2)
                System.out.println(num3 + ", " + num1 + ", " + num2);
            else
                System.out.println(num3 + ", " + num2 + ", " + num1);
        }
    }
   
}
