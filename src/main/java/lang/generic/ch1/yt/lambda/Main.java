package lang.generic.ch1.yt.lambda;

public class Main {
    public static void main(String[] args) {

        Cat myCat = new Cat();
        myCat.print();

        printThing(() -> {
        });
    }

    static void printThing(Printable thing) {
        thing.print();
    }
}
