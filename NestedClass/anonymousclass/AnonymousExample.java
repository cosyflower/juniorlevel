package learning.anonymousclass;


class SuperClass {
    void method() {
        System.out.println("method() in SuperClass");
    }
}
public class AnonymousExample { // shift f6
    private static void print(SuperClass obj) { obj.method(); }

    public static void main(String[] args) {
        print(new SuperClass() {
            @Override
            void method(){
                System.out.println("method in Anonymous Class");
            }

        });
    }
    // new 부모() { Override 관련 진행 } );
}
