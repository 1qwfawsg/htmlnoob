package Tooo;

import java.util.Random;

public class suijishu {
    public static void main(String[] args) {
        Random r = new Random(100);
        for (int i = 0;i <= 100;i++){
            int suijishu = r.nextInt(100);
            System.out.println(suijishu);
        }
    }
}
