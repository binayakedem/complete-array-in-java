import java.util.Scanner;

public class Multidimensional {
    public void multiDarray(){
        Scanner sc=new Scanner(System.in);
//        multidimensional array can hold multiple dimension like 3D and so on , but its size is fixed, array declaration can hold only memory reference in static memory
//        the actual array value is store in the heap memory when it is needed then directly access using reference store in static memory

        System.out.println("Enter the size of the array for multidimensional array::");
        int s=sc.nextInt();
        int [][] arr=new int[s][s];
        System.out.println("Enter the array values in the heap:");
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Displaying the two dimenstional array:");
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                System.out.print (arr[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }


    }
}
