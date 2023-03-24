package generic;

public class GenMethod {

    public static <T> OuterBox<T> makeBox(T o) {
        OuterBox<T> box = new OuterBox<T>();
        box.setObj(o);
        return box;
    }

    public static void main(String[] args) {
        // static 맨 처음에 올라가고 -> main 찾아서 실행하려고 하니, 필드 분야에서 static을 활용하는게 불가능하다

        OuterBox<String> stringOuterBox = GenMethod.<String>makeBox("Sweet");
        OuterBox<Double> doubleOuterBox = GenMethod.<Double>makeBox(1.8);

        OuterBox<String> stringOuterBox2 = GenMethod.makeBox("Salty");
        OuterBox<Double> doubleOuterBox2 = GenMethod.makeBox(3.5);

        System.out.println(stringOuterBox.getObj());
        System.out.println(doubleOuterBox.getObj());
    }

}
