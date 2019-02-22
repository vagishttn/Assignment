package session2.ConstructorQuestion;

public class CloneObjectDemo implements Cloneable {

    private String name;
    private int age;

    public CloneObjectDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "CloneObjectDemo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        CloneObjectDemo cloneObjectDemo = new CloneObjectDemo("Vagish", 23);
        System.out.println(cloneObjectDemo);
        CloneObjectDemo cloneObjectDemo1 = (CloneObjectDemo) cloneObjectDemo.clone();
        System.out.println(cloneObjectDemo1);
        System.out.println("--------------");
        cloneObjectDemo1.age = 25;
        System.out.println(cloneObjectDemo1);
        System.out.println(cloneObjectDemo1);

    }
}
