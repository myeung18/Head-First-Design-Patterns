package lang.generic.ch1.yt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Printer<T extends Animal & Serializable> { //bound generic
    private T value;

    public Printer(T value) {
        this.value = value;
    }

    public void printVal() {
        value.eat();
        System.out.println(this.value);
    }

}

class Animal {

    public void eat() {
        System.out.println("Animal is eating -- munch munch.");
    }

    private static <K, V> V shout(K shoutVal, V msg) {
        System.out.println(shoutVal + ", " + msg);

        return msg;
    }

    private static void tester() {
        List<Integer> lst = new ArrayList<>();
        lst.add(3);

        printList(lst);
    }

    private static void printList(List<?> myList) { //List<Object> lst -> wrong!
        System.out.println();
    }

}
