package eOlymp;

import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int c=a%10;
        a/=10;
        int b=a%10;
        a/=10;
        if (a == b && a==c && b==c) {
            System.out.println(3);
        } else if (a==b || a==c || b==c) {
            System.out.println(2);
        }else{
            System.out.println(1);
        }
    }
}
