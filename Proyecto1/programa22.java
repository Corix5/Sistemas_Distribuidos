import java.util.Scanner;

public class programa22 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el numero de filas de la matriz");
        int filas = leer.nextInt();

        System.out.println("Ingrese el numero de columnas de la matriz");
        int columnas = leer.nextInt();
        int matriz[][] = new int[filas][columnas];

        System.out.println( "Ingrese los valores de la matriz" );
        for(int i = 0; i<filas; i++){
            for(int j = 0; j<columnas; j++){
                matriz[i][j] = leer.nextInt();
            }
        }
        
        System.out.println("Ingrese el numero de filas de la segunda matriz");
        int filas2 = leer.nextInt();

        System.out.println("Ingrese el numero de columnas de la segunda matriz");
        int columnas2 = leer.nextInt();
        int matriz2[][] = new int[filas2][columnas2];

        System.out.println( "Ingrese los valores de la matriz" );
        for(int i = 0; i<filas2; i++){
            for(int j = 0; j<columnas2; j++){
                matriz2[i][j] = leer.nextInt();
            }
        }
        leer.close();

        int matriz3[][] = new int[filas][columnas2];

        int suma = 0;
        int aux = 0;

        for(int k = 0; k<filas; k++){
            for(int i = 0; i<columnas2; i++){
                for(int j = 0; j<columnas2; j++){
                    suma = matriz[k][j] * matriz2[j][i];
                    aux = suma + aux;     
                }
                matriz3[k][i] = aux;
                suma = 0;
                aux = 0;
            }

        }

        for(int i = 0; i<filas; i++){
            for(int j = 0; j<columnas2; j++){
                System.out.print(matriz3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
