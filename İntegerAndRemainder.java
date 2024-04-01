package eOlymp;

import java.util.Scanner;

public class İntegerAndRemainder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();

        if (a%b == 0) {
            System.out.println("Divisible");
        }else{
            int integer=a/b;
            int remainder=a%b;
            System.out.println(integer + " " + remainder);
        }
    }
}
