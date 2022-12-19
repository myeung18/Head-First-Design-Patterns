package fpinjava.ch1;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class TestOnly {
    public void method() {
        final List<BigDecimal> prices = Arrays.asList(new BigDecimal("10"),
                new BigDecimal("30"),
                new BigDecimal("17"),
                new BigDecimal("20")
        );

        final BigDecimal total = prices.stream()
                .filter((price) -> price.compareTo(BigDecimal.valueOf(20)) > 0)
                .map((price)-> price.multiply(BigDecimal.valueOf(0.9)))
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("Total " + total);
    }

    public static void main(String[] args) {
        new TestOnly().method();
    }
}