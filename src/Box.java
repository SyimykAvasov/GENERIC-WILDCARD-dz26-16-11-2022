public class Box <T>{
     T polya;

    public Box(T a) {
        this.polya = a;
    }

    public T getA() {
        return polya;
    }

    public void setA(T a) {
        this.polya = a;
    }

    public static <T> T method(T a){
        return  a;
    }

    @Override
    public String toString() {
        return "Box{" +
                "a=" + polya +
                '}';
    }
}
