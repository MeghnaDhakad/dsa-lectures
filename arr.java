import java.util.*;

public class arr {
    public static void main(String[] args){
    ArrayList<Integer> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
        for(int i = 0;i<5;i++){
            list.add(sc.nextInt());
        }
        int mid = list.get(3);
        System.out.println("mid" + mid);
        Collections.sort(list);
        System.out.println("sorted list" + list);
        
        System.out.println("enter elemnt to find:");
        int a = sc.nextInt();
        if (list.contains(a)) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
    }
    sc.close();
}}
