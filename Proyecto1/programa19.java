public class programa19 {
    public static void main(String[] args) {
        int numeros[] = {10,9,9,7,6,5,4,3,2,1};
        int mayor = numeros[0];
        boolean bandera = true;
        for(int i = 1; i<10; i++){
            if(numeros[i] > mayor){
                bandera = false;
            }
            else{
                mayor = numeros[i];
            }
        }
        if(bandera){
            System.out.println("Los numeros están ordenados en forma descendente");
        }
        else{
            System.out.println("Los numeros no están ordenados en forma descendente");
        }
    }
}
