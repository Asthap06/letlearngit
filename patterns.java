// code for the patterns in java:
import java.util.*;
public class patterns{
    public static void printpattern(int n){
        int i,j;
        for(i=1; i<=n; i++){
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n=5;
        printpattern(n);
    }
}
// next pattter
// public class patterns{
//     public static void printpattern(int n){
//         int x,y;
//         for(x=1 ;x<=n; x++){
//             for(y=1; y<=x; y++){
//                 System.out.print(y + " ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         int n=6;
//         printpattern(n);
//     }
// }