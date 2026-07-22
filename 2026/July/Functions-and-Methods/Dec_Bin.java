package Functions_methods;

public class Dec_Bin {
    static void  DecBin(int Dec){
        int MyNum=Dec;
        int pow=0;
        int bin=0;
        while (Dec>0) {
            int rem=Dec%2;
            bin=bin+rem*(int)Math.pow(10,pow);
            pow++;
            Dec=Dec/2;
        }
        System.out.println("The binarry number of "+ MyNum +" is = "+bin);
    }
    public static void main(String[] args) {
        DecBin(5);
    }
}
