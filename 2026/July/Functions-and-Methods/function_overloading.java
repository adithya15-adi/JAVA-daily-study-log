package Functions_methods;

public class function_overloading {
    static int area(int side){
        int areaa=side*side;
        return areaa;
    }
    static int area(int length,int breadth){
        int rect=length*breadth;
        return rect;
    }
}
public static void main(String args[]){
    System.out.println(area(5));
    System.out.println(area(5, 10));
}