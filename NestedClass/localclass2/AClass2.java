package learning.localclass2;

public class AClass2 {
    static int staticField;
    int instanceField;

    static void staticMethod(){}
    void instanceMethod(){}

    void method(){
        class LocalClass{
            int instanceField;
            void instanceMethod() {}
            void method() {
                staticField = 1;
                instanceField = 1;
                AClass2.this.instanceField = 1;
                staticMethod();
                instanceMethod();
                AClass2.this.instanceMethod();
            }
            // 내부에서 자기 자신을 가리키니까 this..

        }
    }
}
