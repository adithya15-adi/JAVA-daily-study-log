/*
public class day3_patterns {
    public static void main(String[] args) {
        int i,j;
        int n=5;
        int x=1;
        for(i=1;i<=n;i++){
            x=i;
            for(j=1;j<=i;j++){
                System.out.print(x);
            }
            System.out.println();
        }
    }
}

 */

// pattern no 2

/*
public class day3_patterns {
    public static void main(String[] args) {
        int i,j;
        int n=5;
        int x=1;
        for(i=1;i<=n;i++){
            x=1;
            for(j=1;j<=i;j++){
                System.out.print(x);
                x++;
            }
            System.out.println();
        }
    }
} 
*/

// pattern no 3

/* public class day3_patterns {
    public static void main(String[] args) {
        int i,j;
        int n=5;
        int x=1;
        for(i=1;i<=n;i++){
            x=5;
            for(j=1;j<=i;j++){
                System.out.print(x);
                x--;
            }
            System.out.println();
        }
    }
} */


// pattern no 4

/*public class day3_patterns {
    public static void main(String[] args) {
        int i,j;
        int n=5;
        int x=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(x);
                x++;
            }
            System.out.println();
        }
    }
} */

// pattern no 5

/*
public class day3_patterns {
    public static void main(String[] args) {
        int i,j;
        int n=5;
        int x=15;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(x);
                x--;
            }
            System.out.println();
        }
    }
} */

// pattern no6

/*
public class day3_patterns {
    public static void main(String[] args) {
        int i,j;
        int n=5;
        int y;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            y=1;
            for(j=1;j<=i;j++){
                System.out.print(y);
                y++;
            }

            y=i-1;
            for(j=1;j<=i-1;j++){
                System.out.print(y);
                y--;
            }
            System.out.println();
        }
    }
}

    1
   121
  12321
 1234321
123454321

 */


// pattern no 7

public class day3_patterns {
    public static void main(String[] args) {
        int i,j;
        int n=5;
        int y;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            y=i;
            for(j=1;j<=i;j++){
                System.out.print(y);
                y--;
            }

            y=2;
            for(j=1;j<=i-1;j++){
                System.out.print(y);
                y++;
            }
            System.out.println();
        }
    }
}


// pattern no 8

/* 
public class day3_patterns {
    public static void main(String[] args) {
        int i,j,y,n;
        n=5;
        for(i=1;i<=n;i++){
            y=1;
            for(j=1;j<=i-1;j++){
                System.out.print(" "+y);
                y++;
            }
            for(j=1;j<=n-i+n-i+1;j++){
                System.out.print(" "+i);
            }
            y=i-1;
            for(j=1;j<=i-1;j++){
                System.out.print(" "+y);
                y--;
            }
            System.out.println();
        }

        n=4;
        for(i=1;i<=n;i++){
            y=1;
            for(j=1;j<=n-i;j++){
                System.out.print(" "+y);
                y++;
            }
            y=n-i+1;
            for(j=1;j<=i+i+1;j++){
                System.out.print(" "+y);
            }
            y=n-i;
            for(j=1;j<=n-i;j++){
                System.out.print(" "+y);
                y--;
            }
            System.out.println();
        }

    }
}

 1 1 1 1 1 1 1 1 1
 1 2 2 2 2 2 2 2 1
 1 2 3 3 3 3 3 2 1
 1 2 3 4 4 4 3 2 1
 1 2 3 4 5 4 3 2 1
 1 2 3 4 4 4 3 2 1
 1 2 3 3 3 3 3 2 1
 1 2 2 2 2 2 2 2 1
 1 1 1 1 1 1 1 1 1
 */