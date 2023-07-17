import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class programa23 {
    public static void main(String[] args) {

        String cadenas[] = new String[100];
        int contador = 0;

        try {
            Scanner leer = new Scanner(new File("./archivo.txt"));
            while (leer.hasNextLine()) {
                String line = leer.nextLine();
                if(contador % 2 == 0){
                    cadenas[contador] = line;
                }        
                contador++;
            }
            for (int i = 0; i < cadenas.length; i++) {
                if(cadenas[i] != null){
                    try {
                        FileWriter escribir = new FileWriter("./archivo2.txt", true);
                        escribir.write(cadenas[i] + "\n");
                        escribir.close();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }


            leer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
