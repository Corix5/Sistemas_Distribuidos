public class programa3 {
    public static void main (String[] args) {
        System.out.println("Formula: radio = (area * 2) / perimetro");
        int base, lado1, lado2;
        double altura;
        base = 6;
        lado1 = 5;
        lado2 = 5;
        double base2 = Math.pow(base/2,2);
        double lado12 = Math.pow(lado1,2);
        altura = Math.sqrt(lado12-base2);
        int perimetro = base + lado1 + lado2;
        double area = (int) (base * altura / 2);
        double radio = (area * 2) / perimetro;
        System.out.println("El radio del circulo es: " + radio);
    }
}
