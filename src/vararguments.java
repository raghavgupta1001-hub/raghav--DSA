import java.util.Arrays;

public class vararguments {
    static void main(String[] args) {
       // fun(2,3,4,5,6,34,67,87);
      //  multiple(1,2,"rahul","kunal");
        demo("rahul","Ram");

    }
    static void demo(int...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a,int b,String...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
   // static void fun(int...v){
     //   System.out.println(Arrays.toString(v));
    }





