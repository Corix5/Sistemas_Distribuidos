import java.io.FileReader;

public class programa24 {
    public static void main(String[] args) {
        String alfabeto[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String archivo = "./archivo.txt";
        int contador = 0;

        for(int j = 0; j < alfabeto.length; j++){
            try {
                FileReader leer = new FileReader(archivo);
                    int caracter;
                    while ((caracter = leer.read()) != -1) {
                        char letra = (char) caracter;
                        if(letra == alfabeto[j].charAt(0)){
                                contador = contador + 1;
                            }
                    }
                    System.out.print("La letra " + alfabeto[j] + " se repite " + contador + " veces\n");
                    contador = 0;
                    leer.close();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }


    }
}
