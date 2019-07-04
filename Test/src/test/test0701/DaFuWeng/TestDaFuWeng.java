package test.test0701.DaFuWeng;

import java.util.Scanner;

public class TestDaFuWeng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入初始用户数量：");
        int size = sc.nextInt();
        Operation zsx = new Operation(size);

        for (int i = 0; i < zsx.user.length; i++) {
            Users a = new Users();
            System.out.println("请设置第" + (i + 1) + "位用户的用户名：");
            a.setName(sc.next());
            System.out.println("密码：");
            a.setPassword(sc.next());
            System.out.println("ID：");
            a.setVipId(sc.next());
            zsx.user[i] = a;
            Operation.count++;
        }
        for (; ; ) {
            System.out.println("请选择您的操作：");
            System.out.println("1.注册（添加成员）");
            System.out.println("2.登录（没啥用）");
            System.out.println("3.抽奖");
            System.out.println("4.修改密码");
            System.out.println("5.删除用户");
            switch (sc.nextInt()) {
                case 1:
                    Users b = new Users();
                    System.out.println("用户名：");
                    b.setName(sc.next());
                    System.out.println("密码");
                    b.setPassword(sc.next());
                    System.out.println("ID：");
                    b.setVipId(sc.next());
                    zsx.zhuCe(b);
                    break;
                case 2:
                    Users c = new Users();
                    System.out.println("用户名：");
                    c.setName(sc.next());
                    System.out.println("密码");
                    c.setPassword(sc.next());
                    System.out.println("ID：");
                    c.setVipId(sc.next());
                    zsx.dengLu(c);
                    break;
                case 3:
                    zsx.chouJiang();
                    System.out.println("点击回车返回主菜单！");
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case 4:
                    Users d = new Users();
                    System.out.println("用户名：");
                    d.setName(sc.next());
                    System.out.println("密码");
                    d.setPassword(sc.next());
                    System.out.println("ID：");
                    d.setVipId(sc.next());
                    System.out.println("新密码：");
                    zsx.xgPassword(d,sc.next());
                    break;
                case 5:
                    Users e = new Users();
                    System.out.println("用户名：");
                    e.setName(sc.next());
                    System.out.println("密码");
                    e.setPassword(sc.next());
                    System.out.println("ID：");
                    e.setVipId(sc.next());
                    System.out.println("新密码：");
                    zsx.scUser(e);
                    break;

            }
        }


    }
}
