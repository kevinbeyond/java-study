package study20170922;

/**
 * 先执行父类的初始化块，再执行父类的构造器；然后执行自己的初始化块，自己的构造器。。。
 * Created by Leo on 2017/9/22.
 */
public class Teacher extends Person {
    {
        System.out.println("我是一名教师！");
    }

    static {
        System.out.println("Teacher的静态初始化块！");
    }

    public Teacher() {
        super("尊师重教");
        System.out.println("我是一名小学教师！");
    }

    public static void main(String[] args) {
        new Teacher();
    }
}
