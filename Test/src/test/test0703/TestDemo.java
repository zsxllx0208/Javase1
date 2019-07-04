package test.test0703;

import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("点击回车生成下一个数：");
        for (int i = 0; ; i++) {
            int a = (int) Math.round(Math.random()*10);
            System.out.println(a);
           sc.nextLine();
        }

    }
}
