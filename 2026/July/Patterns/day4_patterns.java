/* Boundary pattern
public class day4_patterns {
    public static void main(String[] args) {
        int i,j,n=9;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if (i==1 || i==9 || j==1||j==9) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

*********
*       *
*       *
*       *
*       *
*       *
*       *
*       *
*********

*/


/* Normal Diagonal
public class day4_patterns {
    public static void main(String[] args) {
        int i,j,n=9;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if (i==1 || i==9 || j==1||j==9||i==j) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
*********
**      *
* *     *
*  *    *
*   *   *
*    *  *
*     * *
*      **
*********
*/
/* Cross diagonal
public class day4_patterns {
    public static void main(String[] args) {
        int i,j,n=9;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if (i==1 || i==9 || j==1||j==9||i+j==n+1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
*********
*      **
*     * *
*    *  *
*   *   *
*  *    *
* *     *
**      *
*********
*/

/*
public class day4_patterns {
    public static void main(String[] args) {
        int i,j,n=9;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if (i==1 || i==9 || j==1||j==9||i+j==n+1||i==j) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

*********
**     **
* *   * *
*  * *  *
*   *   *
*  * *  *
* *   * *
**     **
*********

 */

/* 
public class day4_patterns {
    public static void main(String[] args) {
        int i,j,n=9;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if (i==9 || j==1||i==j) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

*        
**       
* *      
*  *     
*   *    
*    *   
*     *  
*      * 
*********

*/

/*
public class day4_patterns {
    public static void main(String[] args) {
        int i,j,n=9;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if (i==1 || j==1||i+j==n+1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


*********
*      * 
*     *  
*    *   
*   *    
*  *     
* *      
**       
* 
 */
/* 
public class day4_patterns {
    public static void main(String[] args) {
        int i,j,n=9;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if (i==9 || j==9||i+j==n+1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

        *
       **
      * *
     *  *
    *   *
   *    *
  *     *
 *      *
*********

*/

/*
public class day4_patterns {
    public static void main(String[] args) {
        int i,j,n=9;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if (i==1 || i==9||i+j==n+1||i==j) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

*********
 *     * 
  *   *  
   * *   
    *    
   * *   
  *   *  
 *     * 
*********
 */
/* 

public class day4_patterns {
    public static void main(String[] args) {
        int i,j,n=9;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if (j==1 || j==9||i+j==n+1||i==j) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

*       *
**     **
* *   * *
*  * *  *
*   *   *
*  * *  *
* *   * *
**     **
 */

public class day4_patterns {
    public static void main(String[] args) {
        int i,j,n=9;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if (i+j==n+1-4 || i+j==n+1+4||i==j-4 ||i==j+4) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}