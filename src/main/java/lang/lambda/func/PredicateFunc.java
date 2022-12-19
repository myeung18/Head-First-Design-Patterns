package lang.lambda.func;

import lang.lambda.domain.Employee;
import lang.lambda.domain.Trade;
import lang.lambda.util.TradeUtil;

import java.util.List;
import java.util.function.Predicate;

public class PredicateFunc {
    void testPredicates(Trade trade) {
        Predicate<Trade> newTrade = t -> t.getStatus().equals("NEW");
        Predicate<Trade> cancelledTrade = t -> t.getStatus().equals("CANCEL");
        Predicate<Trade> newOrCancelledTrade = newTrade.or(cancelledTrade);


        Predicate<Trade> bigAndCancelledTrade = t -> t.isBigTrade() && t.isCancelledTrade();

        List<Trade> trades = TradeUtil.createTrades();
        Trade t1 = new Trade("GOOG", 200_000, "CANCEL");
        Predicate<Trade> p1 = Predicate.isEqual(t1);

        for (Trade t : trades) {
            if (!p1.test(t)) continue;

            System.out.println("Matching trades: " + t);
        } //for


        Predicate<Employee> bonus = (emp) -> emp.getId() == 10;




    }
}