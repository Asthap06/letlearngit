import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number:");
        int n=scanner.nextInt();
        scanner.close();
        int a = 0;
        int b=1;
        for(int i=0; i<n; i++){
            System.out.print(a + " ");
            int temp=a;
            a=b;
            b=temp+b;
        }

    }
}
