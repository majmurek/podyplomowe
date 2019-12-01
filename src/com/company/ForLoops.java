import java.math.BigInteger;
import java.util.Scanner;

public class ForLoops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (n = 0;  n < 10; n++) {
            System.out.printf("%d", n);
        }
        System.out.println();

        int number = 5; //silnia 1*2*3*4*5
        BigInteger factorial = BigInteger.ONE;

        for (int i = 1; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("%d! = %s%n", number, factorial );

        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i<100);
    }
}
