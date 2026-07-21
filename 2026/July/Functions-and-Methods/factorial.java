package Functions_methods;


public class factorial {
    public static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static int bincoeff(int n,int r){
        int ncr=fact(n)/(fact(r)*fact(n-r));
        return ncr;
    }
    public static void main(String[] args) {
        System.out.println(bincoeff(5, 2));
    }
    
}
