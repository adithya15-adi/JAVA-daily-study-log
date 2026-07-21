import java.util.Scanner;

public class greet {
    public static void main(String[] args){
//       String message=greeting();
//       System.out.print(message);
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=sc.next();
        String personalized=myGreet(name);
        System.out.print(personalized);
    }
    static String myGreet(String name){
        String message="Hello "+name;
        return message;
    }
//    static String greeting(){
//        return "How are you";
//    }
}
