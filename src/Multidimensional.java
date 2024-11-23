import java.util.Scanner;

public class Multidimensional {
    public void multiDarray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
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
        sc.close();
    }
}
