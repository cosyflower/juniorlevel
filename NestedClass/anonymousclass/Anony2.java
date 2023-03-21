package learning.anonymousclass;
class SupeClass {
    int param;
    SupeClass(int param) { this.param = param; }
    void method() {
        System.out.println("method() in SupeClass");
    }
}

public class Anony2 {
    private static void print(SupeClass obj) { obj.method(); }

    public static void main(String[] args) {
        print( new SupeClass(10) {
            @Override
            void method() {
                System.out.println("parm is " + super.param + ".");
            }
        });
    }
}
