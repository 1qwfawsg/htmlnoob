package Tooo;

import java.util.Scanner;

public class xaioming {
    public static void main(String[] args){
        Scanner xm=new Scanner(System.in);
        int cj=xm.nextInt();
        if(cj>=0&&cj<60){
            System.out.println("一个巴掌");
        }
        else if(cj>=60&&cj<80){
            System.out.println("一套卷子");
        }
        else if(cj>=80&&cj<100){
            System.out.println("一个玩具");
        }
        else if(cj==100){
            System.out.println("一个手机");
        }
        else {
            System.out.println("无效成绩");
        }
    }
}
