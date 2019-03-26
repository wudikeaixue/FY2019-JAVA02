package login;

import java.util.Scanner;

public class test {
    static Scanner sc = new Scanner(System.in);
    static UserBizImpl i = new UserBizImpl();
    static  UserViewImpl abc = new UserViewImpl();

    public static void main(String[] args) {

        //初始化数组数据
        i.csh();
        //使用导航功能
        dh();
        //使用控制功能
        kz();


    }

    //导航功能
    static void dh() {
        System.out.println("欢迎您，请输入您要执行的操作：");
        System.out.println("1:登录,2:注册");
    }

    //控制功能

    public static void kz() {
        int a = sc.nextInt();
        if (a == 1) {
            UserViewImpl abc = new UserViewImpl();
            abc.login();
        } else if (a == 2) {

            abc.register();
            pdsfdl();
        } else {
            System.out.println("您的输入有误,请重新输入");
            kz();
        }
    }

    //注册后是否登录功能
    static void pdsfdl() {
        System.out.println("您已成功注册，是否登录？");
        System.out.println("1.登录，2退出");
        int a = sc.nextInt();
        if (a == 1) {

            abc.login();
        } else if (a == 2) {
            return;
        } else {
            System.out.println("您的输入有误，请重新输入：");
            pdsfdl();
        }
    }
}

