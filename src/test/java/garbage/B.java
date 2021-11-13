package garbage;

public class B {
    public void b(){
        System.out.println("b");
    }
    public B bB(){
        System.out.println("bB");
        return new B();
    }
    public C bC(){
        System.out.println("bC");
        return new C();
    }

}
