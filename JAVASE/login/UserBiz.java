package login;

public interface UserBiz {

    //用户注册
    void register(String username, String password, String password2, String name, String email)throws RegisterException;

    //用户登录
    void login(String username, String password) throws LoginException;


}
