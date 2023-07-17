public class programa20 {
    public static void main(String[] args) {
        int arreglo[] = {1,2,3,4,5,6,7,8,9,10};
        int ultimo = arreglo[9];

        for(int i = 0; i<10; i++)
        System.out.println(arreglo[i]);

        for(int i = 8; i>=0; i--){
            arreglo[i + 1] = arreglo[i];
        }

        arreglo[0] = ultimo;

        System.out.println("\narreglo recorrido:");
        for(int i = 0; i<10; i++){
            System.out.println(arreglo[i]);
        }
        
    }
}
