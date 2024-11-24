public class CircularArrayComplete {
//    this type of array is used in queue and buffering and so on
    void circularArrayComplte(){
        int [] arr={1,3,5,6,7,8};
        int lengths=arr.length;

        int startIndex=1;
        int steps=7;
        System.out.println("Circular array traversal:");
        for(int i=0;i<steps;i++){
            int circularIndex=(startIndex+i)%lengths;
            System.out.println(arr[circularIndex]);
        }
    }
}
