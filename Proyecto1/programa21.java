public class programa21 {
    public static void main(String[] args) {
        int arreglo[][] = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
        int arregloAux[] = new int[5];

        for(int i = 0; i<5; i++){
           int suma = arreglo[i][0] + arreglo[i][1] + arreglo[i][2] + arreglo[i][3] + arreglo[i][4]; 
           arregloAux[i] = suma;       
        }

        int sumaTotal = arregloAux[0] + arregloAux[1] + arregloAux[2] + arregloAux[3] + arregloAux[4];
        System.out.println("La suma total es: " + sumaTotal);
        
    }
}
