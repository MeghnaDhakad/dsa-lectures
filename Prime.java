import java.util.*;

public class Prime{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int a = sc.nextInt();
        int count = 0;
        for (int i = 2 ; i<=10000 ; i++){
            if(i != a){
                if (a%i == 0){
                    count += 1;
                }
            }
        }
        if(count == 0){
            System.out.println(a + " is a prime number");
        }
        else{
            System.out.println(a + " is not a prime number");
        }
        sc.close();
    }
}