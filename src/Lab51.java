public class Lab51 {
    public static void main(String[] args) {

        double a = 14000;
        a = ((a + (a * 0.4))-1500)+(((a + (a * 0.4))-1500)*0.12);
        System.out.println("Wartość inwestycji po trzecim roku wynosi " + a + " zł");

    }
}
