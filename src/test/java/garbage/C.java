package garbage;

public class C {
    public void c(){
        System.out.println("c");
    }
    public C cc(){
        System.out.println("cc");
        return new C();
    }
}
