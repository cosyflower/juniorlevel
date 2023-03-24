package generic;

public class BoxInBox {
    // Box 안에 또 다른 박스를 넣어주는 것입니다.
    // Type에 집중해야 이해가 간다

    public static void main(String[] args) {
        OuterBox<String> ob = new OuterBox<>();
        OuterBox<OuterBox<String>> obob = new OuterBox<>();
        OuterBox<OuterBox<OuterBox<String>>> obobob = new OuterBox<>();

        ob.setObj("Hello");
        obob.setObj(ob);
        obobob.setObj(obob);

        System.out.println(obobob.getObj().getObj().getObj());
    }
}
