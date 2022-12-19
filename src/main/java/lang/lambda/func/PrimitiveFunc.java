package lang.lambda.func;

import java.util.function.DoublePredicate;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PrimitiveFunc {
    ///boxing
    Predicate<Integer> evenNumPredicate = x -> x % 2 == 0;
    IntPredicate evenNumbPred2 = x -> x % 2 == 0;

    Predicate<Double> doublePredicate2 = x -> x > 10;
    DoublePredicate doublePredicate = x -> x > 10;

    IntConsumer intConsumer = x -> System.out.println("val: " + x);

    private void testPredicate(int i) {
        System.out.println("even ? " + evenNumbPred2.test(i));
        intConsumer.accept(10);
    }

    public static void main(String[] args) {
        new PrimitiveFunc().testPredicate(23 + 1);
    }
}
