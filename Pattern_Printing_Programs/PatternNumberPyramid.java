// Number triangle pyramid (1 2 3...)
import java.util.Scanner;

public class PatternNumberPyramid {
    public static void main(String args[]) {
        int i, j, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Row value n:");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(" " + j);
            System.out.print("\n");
        }
    }
}
