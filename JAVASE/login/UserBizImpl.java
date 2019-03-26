package login;

public class UserBizImpl implements UserBiz {
    //重写接口方法

    @Override
    public void register(String username, String password, String password2, String name, String email) throws RegisterException {

    }

    @Override
    public void login(String username, String password) throws LoginException {

    }

    //本类构造方法
    public UserBizImpl() {

    }

    //创建新注册用户的方法
    User create(String username, String password, String name, String email) {
        User x = new User(username, password, name, email);
        return x;
    }


    //定义User类型数组
    User[] arr = new User[100];
    //初始数组
    User u1 = new User("admin", "admin", "Administrator", "admin@123.com");
    User u2 = new User("tom", "cat", "tomcat", "tomcat@cat.com");


    public void csh() {
        arr[0] = u1;
        arr[1] = u2;


    }
}
