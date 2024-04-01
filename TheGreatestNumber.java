package eOlymp;

import java.util.Scanner;

public class TheGreatestNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int d=scanner.nextInt();
        int greatest;

        if (a>b && a>c && a>d) {
            greatest=a;
        } else if (b>a && b>c && b>d) {
            greatest=b;
        }else if (c>a && c>b && c>d) {
            greatest=c;
        }else{
            greatest=d;
        }
        System.out.println(greatest);
    }
}
