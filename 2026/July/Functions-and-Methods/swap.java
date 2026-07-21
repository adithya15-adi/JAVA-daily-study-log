import java.util.logging.SocketHandler;

public class swap {
    public static void main(String[] args){
        swap(4,5);
    }
    static void swap(int a, int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
