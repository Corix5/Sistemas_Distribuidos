import java.util.Scanner;

public class programa4 {    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Sexo del estudiante");
        String sexo = leer.nextLine();
        System.out.println("Edad del estudiante");
        int edad = leer.nextInt();
        leer.close();

        if(sexo.equals("M") && edad == 18){
            System.out.println("El estudiante pertenece al edificio A");
        }

        if(sexo.equals("F") && edad == 18){
            System.out.println("El estudiante pertenece al edificio B");
        }

        if(sexo.equals("M") && edad >= 19 && edad <= 22){
            System.out.println("El estudiante pertenece al edificio C");
        }

        if(sexo.equals("F") && edad >= 19 && edad <= 22){
            System.out.println("El estudiante pertenece al edificio D");
        }

        if(sexo.equals("M") && edad > 22){
            System.out.println("El estudiante pertenece al edificio E1");
        }

        if(sexo.equals("F") && edad > 22){
            System.out.println("El estudiante pertenece al edificio E2");
        }
    }
}
