package notsinglemain;

// 메인 메서드는 하나의 자바 프로세스당 하나만 존재할 수 있다.
// 메인 메서드가 두 개라면 두 번 자바 프로그램을 실행 해야 합니다 (하나만 존재할 수 있기 때문.. )

public class MultipleMain {
}

class ClassA {
    public static void main(String[] args) {
        System.out.println("ClassA");
    }}

class ClassB {public static void main(String[] args) {
    System.out.println("ClassB\n");
}}

class ClassC {public static void main(String[] args) {
    System.out.println("ClassC\n");
}}
