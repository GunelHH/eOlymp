package eOlymp;

import java.util.Scanner;

public class BetweenInterval {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int check=scanner.nextInt();
        int startPoint=scanner.nextInt();
        int endPoint=scanner.nextInt();

       if(Between(check,startPoint,endPoint)){
           System.out.println("YES");
       }else{
           System.out.println("NO");
       }

        //Belədə yazmaq olar vəya methoda cixarmadan sadəcə sadə for ilə hər dəfə ekrana cap edir

//        for (int i = startPoint; i <=endPoint ; i++) {
//            if (check == i) {
//                System.out.println("YES");
//            } else {
//                System.out.println("NO");
//            }
//        }
    }
/*
Methodu yazma sebebim 2 yerde istifade etmeyimdi
* */
    public static boolean Between(int check, int startPoint, int endPoint) {
        if (check >= startPoint && check <= endPoint)
            return true;
        else
            return false;
    }

}
