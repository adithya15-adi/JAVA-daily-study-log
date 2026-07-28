import java.util.*;
public class array1 {
    public static void main(String[] args) {
        ArrayList<Integer> a= new ArrayList<>();
        a.add(11);
        a.add(2);
        a.add(6);
        a.add(3);
        a.add(8);
        System.out.println(a);
        int x=Collections.max(a);
        System.out.println(x);
        int y=Collections.min(a);
        System.out.println(y);
        boolean z=a.contains(10);
        System.out.println(z);
        Collections.sort(a,Collections.reverseOrder());
        System.out.println(a);
    }
}

// [1, 1.1, Adi]