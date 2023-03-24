package generic;

public class PigImpl<T extends Pig> {
    T ob;

    public T get(){
        System.out.println(ob.eat());
        return ob;
    }

}

class EatingPig implements Pig {
    @Override
    public String eat() {
        System.out.println("Eating is really fun!!");
        return "eat() called in EatingPig Class";
    }
}

