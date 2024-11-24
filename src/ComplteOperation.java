public class ComplteOperation {
    public void operationOnString(){
//        this is the string object reference type operation
        String [] names={"Binaya","Raju","khanna"};
        for(String nm:names){
            System.out.println(nm);
        }
    }

}
class CustomObject{
//    this is mainly demonstrate about the custom obejct store in the array
    String name;
    int age;
    public void messageDisplay(String name, int age){
        this.name=name;
        this.age=age;
        System.out.println("Hi! "+name+ ". Is your age is "+age+"?");
    }
}