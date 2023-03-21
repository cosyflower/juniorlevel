package learning.localclasswithpackage;

// 외부 class.method() 내부에 inner class implements interface { override }
// 내부의 클래스를 외부에서도 활용이 가능합니다
// static scope를 적용해보자

public class AClass {
    AnInterface method() {
        class LocalClass implements AnInterface{
            @Override
            public void method() {}
        }
        return new LocalClass();
    }
}
