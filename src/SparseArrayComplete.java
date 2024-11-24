public class SparseArrayComplete {
//sparse array is type of array which is memory efficient and can be used for when default value of zero value is stored,
//    this type is simple that contains index of all none zero values in array

    void sparseArrayComplete(){
        int []arr={1,0,0,0,0,0,0,0,0,0,0,0,0,4,5,6,5};// in this way you can simply store indexes of each none zero values
//displaying in the form of sparse array
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                System.out.print("index ["+i+"]=");
                System.out.print("value="+arr[i]);
            }
            System.out.println();
        }
    }
}
