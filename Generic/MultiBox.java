package generic;

// 단순한 테스트 용도
// 다음고 같은 코드의 활용은 사실상의 제네릭의 기능을 활용하지 못한 상황
// 정규적인 틀을 활용하기 위해서 태어난 제네릭과는 거리가 있는 코드이다
public class MultiBox<L, R> {
    private L left;
    private R right;

    public L getLeft() {
        return left;
    }

    public void setLeft(L left) {
        this.left = left;
    }

    public R getRight() {
        return right;
    }

    public void setRight(R right) {
        this.right = right;
    }

    public static void main(String[] args) {
        MultiBox<String, Integer> mb = new MultiBox<>();
        System.out.println("mb = " + mb);
    }

}
