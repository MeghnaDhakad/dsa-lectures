//an unsorted array is given -- may contain negative numbers
//we are given that --- sum of three consecutive elemets is x
//if there exist a subarray of 3 elements whose sum is a given number x then return true else false
//subarray size <= to main array
// if array is [1,2,3]  -- [1,2] is a subarray but [1,3] is not a subarray
//array + consecutive is mentioned in question -- use sliding window
import java.util.*;

public class Sliding_window{
    public static void  main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        if(n<3){
            System.out.println("enter more than 3 elements");
        }
        else{

        System.out.println("enter elements of array:");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter sum:");
        int sum = sc.nextInt();

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i<(n-2);i++){
            int a = arr[i] + arr[i+1] + arr[i+2];
            if(a == sum){
                ans.add(arr[i]);
                ans.add(arr[i+1]);
                ans.add(arr[i+2]);
                System.out.println(ans);
            }
        }
        if(ans.size() < 2){
            System.out.println("no such subarray of size 3 exist");
        }
        sc.close();
    }}
}