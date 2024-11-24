import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArrayComplete {
//    this is used to dynamically resizing the size of array which leads to more memory efficiency and so on.
//    ArrayList is type of class in java which act as the part of collection part in java
//    arraylist initially allocate as 10 size
//    this type of array is useful and fast in case of dealing with small size of array and does not requiring the inserction and deleteion
//    more inserction and deletion operation is more efficient in the linkedlist
    void dynamicComplete(){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(12);
        list.add(125);
        list.add(14);
        list.add(13);
//        dynamically value insertion
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the value: "+(i+1)+" ;");
            int value=sc.nextInt();
            list.add(value);
        }
        System.out.println(list.get(3));
        for(Integer ar:list){
            System.out.println(ar);
        }
    }
}
