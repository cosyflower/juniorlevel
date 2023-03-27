package generic2;

class EmptyBoxFactory {
    // T - static에서 표시해줘야 한다
    public static <T> Box<T> makeBox(){ // <T extends Number> T
        Box<T> box = new Box<>();
        return box;
    }
}



public class TargetType {
    public static void main(String[] args) {
        Box<Integer> iBox = EmptyBoxFactory.<Integer>makeBox();//<Integer> 안써도 가능하다
        Box<Integer> iBox2 = EmptyBoxFactory.makeBox();
        iBox.set(25);
        iBox2.set(35);

        System.out.println(iBox.get());
        System.out.println(iBox2.get());
    }
}
