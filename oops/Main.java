

 class student {
    int rollno;
    String name;}
    public class Main{
    public static void main(String[] args) {
        student obj1=new student();
        obj1.rollno=1;
        obj1.name="akshita";
        System.out.println(obj1.rollno);
        System.out.println(obj1.name);
        student obj2=new student();
        obj2.rollno=2;
        obj2.name="dev";
        System.out.println(obj2.rollno);
        System.out.println(obj2.name);

    }

}
//a file can have more than one classes
// only one file can be refferred as main
// the main must contain the psvm part
// and the entire file should be named after the public class
