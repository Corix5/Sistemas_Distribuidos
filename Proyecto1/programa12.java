public class programa12 {
    public static void main(String[] args) {
        for(int i=1; i<=10000; i++){
            int suma = 0;
            for(int j = 1; j<i; j++){
                int modulo = i%j;
                if(modulo == 0){
                    int aux = j + suma;
                    suma = aux;
                }        
            } 
            if(suma == i){
                System.out.println(i);
            }
        }
    }
}
