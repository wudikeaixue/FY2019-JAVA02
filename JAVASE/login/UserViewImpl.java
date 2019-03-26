package login;

import java.util.Scanner;

public class UserViewImpl implements UserView {
    Scanner sc = new Scanner(System.in);
    UserBizImpl a = new UserBizImpl();

    // 重写接口中的方法
    @Override

    //登录
    public void login() {
        //输入用户名和密码
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();
        //判断用户账号密码是否正确方法

        for (int i = 0; i < a.arr.length; i++) {
            if (a.arr[i] != null && username.equals(a.arr[i].getName()) && password.equals(a.arr[i].getPassword())) {
                System.out.println("您已成功登录");
            } else {
                System.out.println("您的输入有误");
                break;
            }
        }


        try {
            a.login(username, password);
        } catch (LoginException e) {
            System.out.println("登录出错请重试！");
        }
    }

    @Override

    //注册功能
    public void register() {


        //输入注册信息
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();
        System.out.println("请再次输入密码");
        String password2 = sc.nextLine();
        System.out.println("请输入用户名");
        String name = sc.nextLine();
        System.out.println("请输入邮箱");
        String email = sc.nextLine();


        try {
            a.register(username, password, password2, name, email);
        } catch (RegisterException e) {
            System.out.println("注册出错请重试！");
        }
        //写个判断

        if (password == password2) {


            User x = a.create(username, password, name, email);
            for (int i = 0; i < a.arr.length; i++) {
                if (a.arr[i] == null) {
                    a.arr[i] = new User();
                    a.arr[i] = x;
                } else {
                    System.out.println("您两次输入的用户密码不同，请重新注册");
                    register();
                }
            }


        }

    }

}
