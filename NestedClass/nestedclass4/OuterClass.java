package learning.nestedclass4;

public class OuterClass {
    static int staticField;
    int instanceField;

    static void staticMethod(){}
    void instanceMethod(){}

    class InnerClass {
        int instanceField;
        void instanceMethod(){}

        void method(){
            OuterClass.staticField = 1;
            instanceField = 1;
            OuterClass.this.instanceField = 1;
            OuterClass.staticMethod();
            instanceMethod();
            OuterClass.this.instanceMethod();
        }
    }
}
