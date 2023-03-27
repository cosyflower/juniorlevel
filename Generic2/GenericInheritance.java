package generic2;

// 일반적인 제네릭 클래스를 하나 형성
class Box<T> {
    protected T ob;

    public void set(T o) {
        ob = o;
    }

    public T get() {
        return ob;
    }
}

// 제네릭 클래스 간의 상속에 대해서 이야기 해보자
class SteelBox<T> extends Box<T> {
    // 제네릭 클래스의 생성자라고 할 수 있겠다
    public SteelBox(T o){
        ob = o;
    }
}

// () 인자 안에 값은 T를 따라가야 한다 - 생성자를 위해서
// T - 매개변수화 타입 일종의 자료형이라고 할 수 있다
// 단, T는 공통이여야 한다

public class GenericInheritance {
    public static void main(String[] args) {
        Box<Integer> Box1 = new SteelBox<>(7959);
        Box<String> sBox = new SteelBox<>("Steel Box");

        System.out.println(Box1.get());
        System.out.println(sBox.get());
    }
}
