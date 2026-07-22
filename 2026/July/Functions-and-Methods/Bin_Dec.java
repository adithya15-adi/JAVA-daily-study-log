package Functions_methods;

public class Bin_Dec {
    static void  BinDec(int binNum){
        int MyNum=binNum;
        int pow=0;
        int dec=0;
        while (binNum>0) {
            int LastDigit=binNum%10;
            dec=dec+LastDigit*(int)Math.pow(2,pow);
            pow++;
            binNum=binNum/10;
        }
        System.out.println("The decimal number of "+ MyNum +" is = "+dec);
    }
    public static void main(String[] args) {
        BinDec(101);
    }
}
