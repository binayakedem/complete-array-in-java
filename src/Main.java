public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*
        * there are mainly six type of array
        * 1.single dimensional
        * 2.multi dimensional array
        * 3.jagged array
        * 4.arraylist
        * 5.array of object
        * 6.multi dimensional array of object
        *
        * */
//this is complete about the circular array
        CircularArrayComplete cac=new CircularArrayComplete();
        cac.circularArrayComplte();

//        this is the sparse array displaying
        SparseArrayComplete sac=new SparseArrayComplete();
        sac.sparseArrayComplete();

        // dealing with the single dimensional
        SingleArray sa=new SingleArray();
        sa.singleArray();
        Multidimensional ma=new Multidimensional();
        ma.multiDarray();

//        this is for jagged array
        JaggedArray ja=new JaggedArray();
        ja.jaggedArray();
    }
}