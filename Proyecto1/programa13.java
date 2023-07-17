public class programa13 {
    public static void main(String[] args) {
        double dinero = 0;
        for(int anios = 1; anios < 20; anios++){
            dinero = dinero + 10000; 
            double rendimiento = dinero * 0.05;
            dinero = dinero + rendimiento;
        }
        System.out.println(dinero);
    }
}
