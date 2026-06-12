//length vs size function diffrence
    //arr.length → array size
    //list.size() → ArrayList size
    //str.length() → string character count

import java.util.*;
public class array {
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(1 ); //both index and value work, but index is prioritized, for value use -- valueOf

        Collections.sort(list); //TimSort -- merge+insertion
        System.out.println(list.contains(2)); 
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<3;i++){
            list.add(sc.nextInt());
        }
        sc.close();
    }
}

