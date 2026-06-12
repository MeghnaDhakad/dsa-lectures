//if a number n is in the power of two, then n AND (n-1) will be 0
import java.util.Scanner;

public class Power_of_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n>0 && (n & (n - 1)) == 0) {
            System.out.println(n + "is power of 2");
        } else {
            System.out.println(n + " is not a Power of 2");
        }
        sc.close();
    }
}