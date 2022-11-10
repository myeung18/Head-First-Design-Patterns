package lang.lambda;

import java.util.function.DoubleBinaryOperator;

/**
 * https://learning.oreilly.com/library/view/effective-java-3rd/9780134686097/ch7.xhtml
 */
public enum Operation {
    PLUS("+", (x, y) -> x + y);

    private final String symbol;
    private final DoubleBinaryOperator op;

    Operation(String symbol, DoubleBinaryOperator op) {
        this.symbol = symbol;
        this.op = op;
    }

    @Override
    public String toString() {
        return symbol;
    }

//    public double apply(double x, double y) {
//        return op.applyAsDouble(x, y);
//    }
}
