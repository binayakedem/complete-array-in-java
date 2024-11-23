import java.util.Scanner;

public class SingleArray {
    public void singleArray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int s=sc.nextInt();
        int [] arr=new int[s];
        System.out.println("Enter the array value in index:");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<s;i++){
            System.out.print(arr[i]);
            System.out.print("\t");
        }
        System.out.println();
    }
}
