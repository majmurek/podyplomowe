public class Lab52 {
    public static void main(String[] args) {
        int  a , b, c;
        a = 35;
        b = a % 7;
        c = a % 5;

        boolean test = (b == 0) & (c == 0);
        System.out.println(test);

    }
}
