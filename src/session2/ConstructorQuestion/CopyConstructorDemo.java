package session2.ConstructorQuestion;

public class CopyConstructorDemo {

    private String name;
    private int age;

    public CopyConstructorDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    CopyConstructorDemo(CopyConstructorDemo copyConstructorDemo) {
        System.out.println("Inside Copy Constructor");
        this.name = copyConstructorDemo.name;
        this.age = copyConstructorDemo.age;
    }

    @Override
    public String toString() {
        return "CopyConstructorDemo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {

        CopyConstructorDemo copyConstructorDemo = new CopyConstructorDemo("Vagish", 23);
        CopyConstructorDemo copyConstructorDemo1 = new CopyConstructorDemo(copyConstructorDemo);
        copyConstructorDemo1.age = 24;
        System.out.println(copyConstructorDemo.toString());
        System.out.println(copyConstructorDemo1.toString());
    }
}
