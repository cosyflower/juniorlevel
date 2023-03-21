package learning.localclass;

public class AClass {
    void method(){
        class LocalClass{
            int nonStaticField;
            //static int staticField;
            LocalClass(){}
            void nonStaticMethod(){}
            //static void staticMethod(){}
        }

        LocalClass lc = new LocalClass();
        lc.nonStaticMethod();
        lc.nonStaticField =1;
    }
}
