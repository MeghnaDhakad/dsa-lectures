import java.util.Scanner;

public class Set_unset {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input Number
        System.out.print("Enter Number (N): ");
        int N = sc.nextInt();

        // Input Bit Position
        System.out.print("Enter Position (k): ");
        int k = sc.nextInt();

        /*
         * SET BIT   = 1
         * UNSET BIT = 0
         *
         * Example:
         * N = 11
         * Binary = 1011
         *
         * Positions from right:
         * 1011
         * 4321
         *
         * Position 1 = 1 (Set)
         * Position 2 = 1 (Set)
         * Position 3 = 0 (Unset)
         * Position 4 = 1 (Set)
         */

        /*
         * Formula to check kth bit from right:
         *
         * N & (1 << (k-1))
         *
         * 1 << (k-1) creates a mask.
         *
         * Example:
         * k = 2
         *
         * 1 << (2-1)
         * = 1 << 1
         * = 0010
         */

        /*
         * Example:
         * N = 11 = 1011
         *
         * Mask = 0010
         *
         * 1011
         * 0010
         * ----
         * 0010
         *
         * Result is non-zero
         * Therefore bit is SET.
         */

        if ((N & (1 << (k - 1))) == 0) {
            System.out.println("Bit is Unset");
        } else {
            System.out.println("Bit is Set");
        }

        sc.close();
    }
}