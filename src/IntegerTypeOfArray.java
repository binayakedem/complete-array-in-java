public class IntegerTypeOfArray {
//    this type directly doesnot store any value instead it contains pointer to each value
//    when you declare it ,i directly converts int to INTEGER object pointer and object contains the value
//    it is usefull when we required the null value in different index(4th index may contain only null value)
//    it needs more memory , due to this reason it is slower than that of regular
//    it also holds extra information about the data
    public void integerTypeOfArray(){
        Integer [] arr=new Integer[3];
        arr[0]=10;
        arr[1]=30;// this is the object of Integer, which points by 1 index, (in simple word, it points to object INTeger(1) and this object is reside in  any heap memory)
        arr[2]=null;// this is valid only in this type of integer
        for(Integer arrayd:arr){
            System.out.println(arrayd);
        }
    }
}
