package learning.nestedclass2;


public class OuterClass2 {
    class InnerClass { }

    static class StaticNestedClass {
    } // static Class 로 부터 생성되는 애들은 static 여부 상관하지 않음

    StaticNestedClass snc = new StaticNestedClass();
    static StaticNestedClass snc2 = new StaticNestedClass();
    InnerClass ic = new InnerClass(); // static이 아닌 Class 로부터 생성되는 애들은 static 붙이지를 못 한다.
    //static InnerClass ic = new InnerClass();

    void instanceMethod() {
        InnerClass g = new InnerClass();
        StaticNestedClass h = new StaticNestedClass();
    }

    static void staticinstanceMethod() {
        // InnerClass g = new InnerClass();
        // learning.nestedclass2.OuterClass2.this' cannot be referenced from a static context
        StaticNestedClass h = new StaticNestedClass();
    }
}
