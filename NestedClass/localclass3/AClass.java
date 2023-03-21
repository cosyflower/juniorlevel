package learning.localclass3;




// Inner Class- local variable needs to be final
public class AClass {
    void method(final int arg) {
        int localVariable = 0;
        class LocalClass {
            void method() {
                int a = arg;
                int b = localVariable;
                // localVariable = 1;
                // Variable 'localVariable' is accessed from within inner class, needs to be final or effectively final
                // InnerClass Variable은 final 형태로 이뤄져야 한다.
            }
        }
    }
}
