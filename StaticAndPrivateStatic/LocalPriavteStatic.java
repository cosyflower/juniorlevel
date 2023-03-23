package StaticAndNonStatic;

import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;

public class LocalPriavteStatic {
    public int a;
    public int b;
    private int c;

    // Text 영역에서 static 영역에 미리 올려준다. 따로 관리를 한다고 생각하고
    // static 변수는 클래스가 관리한다고 생각하면 되겠습니다.
    // static 영역은 객체 관리가 아닌 클래스 관리기 이기 때문에 new를 필드에 선언해도 문제가 되지 않습니다
    static final LocalPriavteStatic lps = new LocalPriavteStatic(1, 2, 3);

    //Constructor
    public LocalPriavteStatic(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        System.out.println("a " + lps.a);
        OuterClass outerClass = new OuterClass();
        System.out.println("OuterClass() 객체 만들기");
        outerClass.test_method();
        System.out.println("OuterClass() 내부 test_method() 호출");
    }

}


class OuterClass{

    // static 변수의 참조를 non-static 변수가 활용하는 꼴
    // static 변수의 참조를 non-static 으로 받아도 된다.
    // 반면, non-static 변수 참조를 static에 넣을 수 없다. 이는 당연하다. non-static은 객체 생성이 우선되어야 하는데
    // 이는 static과 상반되는 이야기 입니다.
    LocalPriavteStatic ex_lps = LocalPriavteStatic.lps;

    // static을 활용해서 new 해도 문제가 생기지 않음
    static OuterClass oc2 = new OuterClass();

    // 오류 #1 (new 필드 선언 관련)
    // 무한 객체 생성왼다. 계속 new -> new -> new -> new 하는 방식으로
    // OuterClass oc = new OuterClass(); 필드상에서 이야기하면 무한 증식시키는 것과 같은 현상

    void test_method(){
        // 객체를 형성합니다
        OuterClass oc = new OuterClass();
        // non-static 변수로 가서 ex_lps는 static 영역으로 미리 올라가있는 객체를 참조합니다
        System.out.println(oc.ex_lps.b);
        // 2가 출력
        // static 영역에 있는 값을 non-static 화 한 셈입니다. 이를 필드화 한 것이라고 할 수 있습니다.
        oc.ex_lps.b = 5;
        System.out.println(oc.ex_lps.b);
    }

}
