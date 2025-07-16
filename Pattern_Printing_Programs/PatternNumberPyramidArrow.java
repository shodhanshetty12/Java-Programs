// Number pyramid arrow (up and down)
import java.util.Scanner;

public class PatternNumberPyramidArrow {
    public static void main(String args[]) {
        int i, j, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values:");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(" " + j);
            System.out.println();
        }
        for (i = n - 1; i >= 1; i--) {
            for (j = 1; j <= i; j++)
                System.out.print(" " + j);
            System.out.println();
        }
    }
}
