package eOlymp;

import java.util.Scanner;

public class MonthsAndQuarters {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        if (n>=3 && n<6) {
            System.out.println("Second");
        } else if (n>=6 && n<9) {
            System.out.println("Third");
        } else if (n>=9 && n<12) {
            System.out.println("Fourth");
        }else{
            System.out.println("First");
        }
    }
}
