public class ParallelArrayComplete {
//    in simple way parallel array are those which have similar length but store in different memory location
//    like age group, marks, etc are related to each other in this case we can use with efficiently

    void parallelArray(){
        int[] age={23,24};
        int [] marks={234,455};
        for(int i=0;i<2;i++){
            System.out.println(age[i]+marks[i]);
        }
    }
}
