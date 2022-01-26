package it.com.user;

/**
 * @ClassName User
 * @Description TODO
 * @Author nikai
 * @Date 2022/1/26 14:47
 * @Version 1.0
 **/
public class User {
    private String name; //姓名
    private String addr; //地址

    public User() {
    }

    public User(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
