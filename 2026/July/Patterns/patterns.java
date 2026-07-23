// public class patterns {
//     public static void main(String[] args) {
//         int n=5;
//         int j;
//         for(int i=1;i<=5;i++){
//             for(j=1;j<=n;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// 2nd patterns

// public class patterns {
//     public static void main(String[] args) {
//         int n = 5;
//         int i;
//         int j;
//         for (i = 1; i <= 5; i++) {
//             for (j = 1; j <= n; j++) {
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }

// pattern no 3

// public class patterns {
//     public static void main(String[] args) {
//         int n = 5;
//         int i;
//         int j;
//         for (i = 1; i <= 5; i++) {
//             for (j = 1; j <= n; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// pattern no 4


// public class patterns {
//     public static void main(String[] args) {
//         int n = 5;
//         int i;
//         int j;
//         for (i = 1; i <= 5; i++) {
//             for (j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// pattern no 5

// public class patterns {
//     public static void main(String[] args) {
//         int n = 5;
//         int i;
//         int j;
//         for (i = 1; i <= 5; i++) {
//             for (j = 1; j <= i+(i-1); j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// pattern no 6
// public class patterns {
//     public static void main(String[] args) {
//         int n=5;
//         int i, j;
//         for(i=1;i<=n;i++){
//             for(j=1;j<=n-i+1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// pattern no 7

// public class patterns {
//     public static void main(String[] args) {
//         int n=5;
//         int i, j;
//         for(i=1;i<=n;i++){
//             for(j=1;j<=(n-i)+(n-i+1);j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// pattern no 8

public class patterns {
    public static void main(String[] args) {
        int n=5;
        int i, j;
        for(i=1;i<=n;i++){
            for(j=1;j<=2*(n-i)+2;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}