package lang.lambda.func;

import lang.lambda.domain.Movie;
import lang.lambda.domain.Trade;
import lang.lambda.util.TradeUtil;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class FuncFunctionInterface {
    Function<String, Movie> createMovie = s -> new Movie(s);
    Supplier<List<Trade>> tradeSup = () -> TradeUtil.createTrades();


    List<Trade> trades = TradeUtil.createTrades();
    Function<Integer, Trade> tradeFinder = tid -> {
        for (Trade t : trades) {
            if (t.getId() == tid) {
                return t;
            }
        }
        return new Trade();
    };
    Function<Integer, Trade> tradeFinder2 = tid -> {
        List<Trade> trades = tradeSup.get();

        for (Trade t : trades) {
            if (t.getId() == tid) {
                return t;
            }
        }

        return trades.stream().filter(t -> t.getId() == tid)
                .findFirst().get();
    };

    private void testFunction(String name) {
        Movie m = createMovie.apply(name);
        System.out.println("Movie is " + name);
    }

}
