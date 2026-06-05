import java.util.*;
public class XOR_missing {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of elements");
        int n = sc.nextInt();
        System.out.println("enter "+ n + " elements");
        int[] nums = new int[n-1];
        for (int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
       int[] full = new int[n+1];
       int count = 0;
       for (int i = 0;i<n+1;i++){
        full[i] = i;
        count = count ^ full[i];
       }
       int count2 = 0;
       for (int i = 0;i<nums.length;i++){
        count2 = count2 ^ nums[i];
       }
       int missing = count ^ count2;
       System.out.println(missing);
       sc.close();
    }
}
