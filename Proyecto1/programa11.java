public class programa11 {
    public static void main(String[] args) {
        for(int i=1; i<=5000; i++){
            double suma = 0;
            int num = i;
            while(num>0){
                int ultimoNumero = num%10;
                 num= num/10;
                double aux = Math.pow(ultimoNumero, 3);
                double aux2 = aux + suma;
                suma = aux2;
            }

            int resultado = (int)(suma);

            if(resultado == i){
                System.out.println(i);
            }

        }
    }
}
