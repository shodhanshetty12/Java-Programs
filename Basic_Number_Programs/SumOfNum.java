// Sum of odd numbers between 1–100
class SumOfNum {
    public static void main(String args[]) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("The Sum Of 100 Odd Numbers are: " + sum);
    }
}
