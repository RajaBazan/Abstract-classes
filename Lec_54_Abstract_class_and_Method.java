package hello.com;
abstract class Parent{
    public Parent(){
        System.out.println("I'm the constructor of parent");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet1();
}
class Child extends Parent{
    @Override
    public void greet() {
        System.out.println("Good morning");
    }

    @Override
    public void greet1() {
        System.out.println("Good Afternoon");
    }
}
abstract class Child1 extends Child{
    public void th(){
        System.out.println("I'm good");
    }
}
public class Lec_54_Abstract_class_and_Method {
    public static void main(String[] args) {
//        Parent p = new Parent();
        Child ch = new Child();

    }
}
