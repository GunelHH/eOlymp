package eOlymp;

import java.util.Scanner;

public class OutsideTheInterval {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int check=scanner.nextInt();
        int startPoint=scanner.nextInt();
        int endPoint=scanner.nextInt();

        if (BetweenInterval.Between(check,startPoint,endPoint)) {
            System.out.println("IN");
        }else{
            System.out.println("OUT");
        }
    }
}
