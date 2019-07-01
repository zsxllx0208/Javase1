package test;

public class test {
    public static void main(String[] args) {

        int a = 100;
        int i = 0;
        int b, c, d;
        for (a = 100; a < 1000; a++) {
            b = (a / 100) % 10;
            c = (a / 10) % 10;
            d = a % 10;
            if (a == b * b * b + c * c * c + d * d * d) {
                System.out.println(a);
                System.out.println("百位" + b);
                System.out.println("十位" + c);
                System.out.println("个位" + d);
                i++;
            }
        }
            System.out.println("100-999水仙花数个数为" + i);

        }


    }


