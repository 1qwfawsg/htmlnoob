package Tooo;

import java.util.Scanner;

public class jiou{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("a为偶数");
        }else{
            System.out.println("a为奇数");
        }
    }
}
