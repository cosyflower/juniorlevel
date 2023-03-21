package learning.nestedclass5;

public class OuterClass {
    static int staticField;
    int instanceField;

    static void staticMethod(){}
    void instanceMethod(){}

    static class StaticNestedClass {
        static int staticField;
        int instanceField;

        static void staticMethod() {}
        void instanceMethod(){}

        void method(){
            OuterClass.StaticNestedClass.staticField = 1;
            instanceMethod();
            staticMethod();
            staticField = 4;
            instanceField = 6;
        }
    }
}
