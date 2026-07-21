import java.util.*;

public class functions {

    public static void PrintHello() {
        System.out.println("Hello world");
    }

    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int result=sum(num1, num2);
        System.out.println("The sum is = " + result);
        PrintHello();
    }
}