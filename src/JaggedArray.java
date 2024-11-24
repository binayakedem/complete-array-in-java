import java.util.Scanner;

public class JaggedArray {
    public void jaggedArray(){
        Scanner sc=new Scanner(System.in);
        int [][]arr=new int[3][];
//jagged array is more adventagous in case of memory efficiency, because can hold various size of sub-array
//        it is useful when array size or sub-array value varies
        for(int i=0;i< arr.length;i++){
            System.out.println("Enter the size of each columns:");
            int cols=sc.nextInt();
            arr[i]=new int[cols];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the values for row " + i + ":");
            for (int j = 0; j < arr[i].length; j++) { // Use arr[i].length for column size
                arr[i][j] = sc.nextInt(); // Read valid value for the cell
            }
        }

//        displaying the jagged array:
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
//                System.out.println("["+i+"]"+"["+j+"]"+"="+arr[i][j]);
                System.out.print(arr[i][j]);
                System.out.print("\t");
            }
            System.out.println();

        }
    }
}
