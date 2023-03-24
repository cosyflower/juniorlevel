package generic;

public class LimitationBox<T extends Number> {
    // 인스턴스 생성 시 타입 인자로 Number 또는 이를 상속하는 클래스만 가능
    // 상속 이라는 개념을 활용한 타입 인자 제한시키는 방법이 되겠습니다

    private T ob;

    public T getOb() {
        return ob;
    }

    public void setOb(T ob) {
        this.ob = ob;
    }

    public static void main(String[] args) {
        LimitationBox<Integer> lnInteger = new LimitationBox<>();
        lnInteger.setOb(10);
        LimitationBox<Double> doubleInteger = new LimitationBox<>();
        doubleInteger.setOb(1.9);
    }


}
