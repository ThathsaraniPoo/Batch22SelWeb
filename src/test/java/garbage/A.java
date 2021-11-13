package garbage;

public class A {
    public void a(){
        System.out.println("a");
    }
    public A aA(){
        System.out.println("aA");
    return new A();
    }
    public B aB(){
        System.out.println("bA");
        return new B();
    }

}
