//using time-space trade off

//for eg, we need to find composite numbers from 0 to 25(n), take root of last number(n), here 25 which is 5, 
//take all composite numbers <= 5, leave 0 and 1, in this case we will get 2,3 and 5.
//now all composite numbers from 2 to 24 (n-1) will be divisible by 2,3 or 5

import java.util.*;

public class Optimised_prime {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter value of n:");
    int n = sc.nextInt();
    ArrayList<Boolean> list = new ArrayList<>(n+1);
    for (int k =0;k<=n;k++){
        list.add(true);
    }
    list.set(0,false);
    list.set(1,false);
    for(int i = 2; i <= Math.sqrt(n);i++ ){
        if(list.get(i)){
            for(int j = i*i ; j <= n; j = j + i){
                list.set(j,false);
                }
            }
        }
        int count = 0;
        for(int i = 0 ; i <= n ; i++){
            if(list.get(i)){
                count += 1;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
