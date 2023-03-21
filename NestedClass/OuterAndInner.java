package learning;

public class OuterAndInner {

    class InnerClass {
        int nonStaticField;
        // static int staticField = 5; // 불가능
        InnerClass(){}
        void nonStaticMethod(){}
        // static void staticMethod(){} // 불가능한 경우
    }

    // Static 한 Nested Class 의 경우
    // static 여부 상관하지 않고 모든 유형이 가능하다
    static class StaticNestedClass{
        int nonStaticField;
        static int staticField;
        StaticNestedClass(){}
        void nonStaticMethod(){}
        static void staticMethod(){}
    }

    public static void main(String[] args) {

    }

}
