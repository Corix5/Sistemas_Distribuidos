public class programa18 {
    public static void main(String[] args) {
        String[] ciudades = {"CDMX", "Monterrey", "Nueva York", "Mendoza", "La Plata", "San Miguel de Tucuman", "Tampico", "San Juan", "San Luis", "Paris"};
        int aux = 0;
        for(int i = 0 ; i< 10; i++){

            int longitud = ciudades[i].length();

            if(longitud > aux){
                aux = longitud;
            }
        }

        for(int contador = 0; contador < 10; contador++){
            if(ciudades[contador].length() == aux){
                System.out.println("La ciudad con mayor longitud es: " + ciudades[contador]);
            }
        }
    }
}
