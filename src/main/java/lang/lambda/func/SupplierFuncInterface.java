package lang.lambda.func;

import lang.lambda.domain.Trade;
import lang.lambda.util.TradeUtil;

import java.util.List;
import java.util.function.Supplier;

public class SupplierFuncInterface {
    Supplier<String[]> allFruits = () -> new String[]{"applie", "Orange"};

    Supplier<List<Trade>> allTrades = () -> TradeUtil.createTrades();

    private void testSupplier() {
        String[] fruits = allFruits.get();

        for (String f : fruits) {
            System.out.println("Fruits is " + f);
        }

        List<Trade> trades = allTrades.get();
        for (Trade t : trades) {
            System.out.println("Trade is " + t);
        }
    }

    public static void main(String[] args) {
        new SupplierFuncInterface().testSupplier();
    }
}
