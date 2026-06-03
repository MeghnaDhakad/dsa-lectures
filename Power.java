import java.util.*;
public class Power{
    public static void main(){
        System.out.println("enter x:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("enter y");
        int y = sc.nextInt();

        if(y == 0){System.out.println("1");}
        if(y > 0){
            int count = 1;
            for(int i = 1; i <= y ; i++){
                count = count*x;
            }
            System.out.println(count);
        }
        sc.close();
    }
}
