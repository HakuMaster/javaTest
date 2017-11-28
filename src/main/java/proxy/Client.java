package proxy;

public class Client {

    public static void main(String[] args){
        //UserManager userManager=new UserManagerImpl();
        UserManager userManager=new UserManagerImplProxy(new UserManagerImpl());
        userManager.delUser("1111");

        LogHandler logHandler=new LogHandler();
        UserManager userManager1=(UserManager)logHandler.newProxyInstance(new UserManagerImpl());
        //UserManager userManager=new UserManagerImpl();
        userManager1.addUser("1111", "张三");
    }
}
