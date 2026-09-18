import java.util.Scanner;

public class mylord {


    static void main(String[] args) {
      //  String message = greet();
        //System.out.println(message);
        Scanner in = new Scanner (System.in);
        System.out.print("Enter you name:");
        String name = in.next();

        String personalized = myGreet(name);
        System.out.println(personalized);


    }

    private static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static String greet(){
        String greeting = "How are you";
        return greeting;

    }
}
