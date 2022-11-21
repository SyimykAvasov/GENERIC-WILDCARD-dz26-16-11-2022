import javax.management.InstanceNotFoundException;

public class Main {
    public static void main(String[] args) {
    Box<String> box = new Box<>("Moscow-4");
        System.out.println(Box.method(box));

    }
}