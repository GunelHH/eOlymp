package eOlymp;

import java.util.Scanner;

public class PositiveOrNegativeOrZero {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        if (n==0) {
            System.out.println("Zero");
        } else if (n>0) {
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
    }
}
