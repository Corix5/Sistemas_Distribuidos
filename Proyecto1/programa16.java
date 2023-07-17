import java.util.Scanner;

public class programa16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = -1;
        int suma = 0;
        int contador = -1;
        System.out.println("Ingrese un números diferentes de 0 hasta que desee finalizar");
        while(num != 0){
            num = leer.nextInt();
            suma = suma + num;
            contador++;
        }
        System.out.println(contador);
        System.out.println("El promedio fue de: " + (suma/contador));
        leer.close();
        
    }
}
