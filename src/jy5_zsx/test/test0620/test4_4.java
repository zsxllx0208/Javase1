package jy5_zsx.test.test0620;

public class test4_4 {
    public static void main(String[] args) {
        int score = 81 ;
        String sex = "男";

        String a = (score > 80) ? ((sex == "男") ? "进入男子组决赛" : "进入女子组决赛") : "未进入决赛";
        System.out.println(a);
    }
}
