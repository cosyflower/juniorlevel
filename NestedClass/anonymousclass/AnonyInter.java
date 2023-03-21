package learning.anonymousclass;
interface Interface { void method3(); }

public class AnonyInter {
    private static void print(Interface obj) { obj.method3(); }

    public static void main(String[] args) {
        print(new Interface() {
            @Override
            public void method3() {
               System.out.println("Interface Implementation");
           }
        });
    }
}
