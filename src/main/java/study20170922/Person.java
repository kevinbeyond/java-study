package study20170922;

/**
 * 初始化块在创建Java对象时隐式执行，且总是全部执行
 * 初始化块总是在构造器执行之前执行
 * 如果有一段初始化处理代码对所有对象完全相同，且无须接收任何参数，就可以把这段初始化处理代码提取到初始化块中
 * Created by Leo on 2017/9/22.
 */
public class Person {
    //定义初始化块
    {
        int a = 6;
        if (a>4) {
            System.out.println("Person初始化块，局部变量a大于4");
        }
        System.out.println("Person初始化块！");
    }

    private static int field = 100;
    int b = 0;

    //定义第二个初始化块
    {
        int b = 10;
        System.out.println("Person的第二个初始化块！");
    }

    /**
     * 静态初始化块，类初始化块
     * 静态成员不能访问非静态成员
     */
    static {
        field = 999;
        System.out.println("Person类的静态初始化块！");
    }

    //Person的无参构造函数
    public Person() {
        System.out.println("Person的无参构造函数！");
    }

    //Person的带参构造函数
    public Person(String s) {
        this();
        System.out.println("Person的带参构造函数！" + s);
    }

    public static void main(String[] args) {
        System.out.println(Person.field);
//        Person p = new Person();
//        System.out.println(p.b);
    }
}
