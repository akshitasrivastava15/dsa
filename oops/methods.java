

import java.util.Scanner;

//funvtion-called by their name directly,eg-bark();
//methods-called via an object of a class,eg-fuffy.bark();
//to add two numbers using methods
class algebra{
    int a;
    int b;
    algebra(int x,int y){
        System.out.println("constructor of algebra class called");
        a=x;
        b=y;
    }
  int sum(){
    int s=a+b;
    return s;
    
 }
  int sub(){
    return a-b;

  }
  int multiple(){
    return a*b;
  }
 }
 public class methods {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        algebra obj1=new algebra(5,7);
        algebra obj2=new algebra(34,67);
        System.out.println("sum is:"+obj1.sum());
        System.out.println(obj1.sub());
        System.out.println(obj1.multiple());
    
        System.out.println("sum is:"+obj2.sum());
        System.out.println(obj2.sub());
        System.out.println(obj2.multiple());
    
    }
    
}
 
