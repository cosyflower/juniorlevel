package generic;

// generic의 기초
// 타입만 우리가 지정한다
// 틀은 우리가 정의해놓고 인스턴스를 만들 때 우리가 그 때 타입을 지정하겠다라는 말

public class Box {

    public static void main(String[] args) {
        // 만든 Template에 의거해서
        // 타입만 우리가 지정해준 셈이다
        // 기존 타입안에 정의된 함수는 전혀 영향이 가지 않는다.
        OuterBox<Apple> ob = new OuterBox<Apple>();
        OuterBox<Orange> ob2 = new OuterBox<Orange>();


        System.out.println("ob = " + ob.toString());
        System.out.println("ob2 = " + ob2.toString());

        // 자신의 타입을 통한 직접적인 객체를 형성해야
        // 자신의 클래스의 영향을 받게 된다
        Apple apple = new Apple();
        Orange orange = new Orange();

        System.out.println("apple = " + apple);
        System.out.println("orange = " + orange);

    }
}

class OuterBox<T> {
    // T : 타입 매개 변수
    // OuterBox<Apple> 에서의 Apple : 타입 인자
    // OuterBox<Apple> 에서의 Box<Apple> 통틀어서 매개변수화 타입 이라고 한다 (새롭게 타입을 만들어 준 상황이 되겠다)
    private T obj;

    public void setObj(T obj) {
        this.obj = obj;
    }

    public T getObj(){
        return obj;
    }
}

class Apple{
    @Override
    public String toString(){
        return "toString() Called in Class Apple";
    }
}
class Orange {
    @Override
    public String toString(){
        return "toString() Called in Class Orange";
    }
}
