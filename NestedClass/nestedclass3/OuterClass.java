package learning.nestedclass3;

public class OuterClass {
    static int staticField;
    int instanceField;

    static void staticMethod() {}

    void instanceMethod() {}


    // non - static class 안에는 모두 사용 가능하다

    class InnerClass {
        // static field member;
        // field member;
        void method() {
            staticField = 1;
            instanceField = 1;
            staticMethod();
            instanceMethod();
        }
    }

    // static class 내부에는 non-static 변수
    static class StaticNestedClass {
        void method() {
            staticField = 1;
            staticMethod();
            // instanceField = 1;
            // instanceMethod();
        }
    }

}
