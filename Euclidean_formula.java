//Euclidean formula:
//LCM(a, b) = [(a x b)/HCF(a,b)]

import java.util.*;

class Euclidean_formula {
    int a;
    int b;
    public int hcf(int a,int b){
            while (b != 0 ){
            int temp = b;
            b = a % b;
            a = temp;
        }
    return a;
    }
    public int lcm(int a , int b){
        return ((a*b)/hcf(a,b));
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        Euclidean_formula obj = new Euclidean_formula();
        System.out.println("HCF = " + obj.hcf(x,y));
        System.out.println("LCM = " + obj.lcm(x,y));
        sc.close();
    }
}