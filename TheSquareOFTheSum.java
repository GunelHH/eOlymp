package eOlymp;

import java.util.Scanner;

public class TheSquareOFTheSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=0;

        while (n>9){
            sum+=n%10;
            n/=10;
        }
        sum+=n;
        System.out.println(sum*sum);
    }
}
