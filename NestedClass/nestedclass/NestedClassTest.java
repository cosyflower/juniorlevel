package learning.nestedclass;

public class NestedClassTest {
    public static void main(String[] args) {
        OuterAndInner oc = new OuterAndInner();

        // 외부의 관점에서 보면 현재 OuterAndInner 객체만 형성된 상황이다
        // 기본적으로 객체를 생성하려면 new 연산자를 활용해야 한다.
        // InnerClass()를 호출하기 위해서는 기본적으로 OuterAndInner. 참조를 우선 한 다음에 접근이 가능하다
        // 그래서 다음처럼 호출을 하는 것이다
        OuterAndInner.InnerClass ic = oc.new InnerClass();

        // static Class 생성하고 싶다면
        // Static 한 Nested Class 의 경우
        // Static 영역에 존재하는 애들은 엄연히, 객체 관리 대상이 아니라고 했다
        // 기본적으로 접근하고 싶다면 Type명으로 접근하라고 헀었다
        OuterAndInner.StaticNestedClass snc = new OuterAndInner.StaticNestedClass();
        // 필드는 기본적으로 생성된 객체를 통해서 접근이 가능하다고 했다
        snc.nonStaticField = 1;
        snc.nonStaticMethod();
        OuterAndInner.StaticNestedClass.staticMethod();
        OuterAndInner.StaticNestedClass.staticField = 5;
    }
}
