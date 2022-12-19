package lang.lambda.basic;

public class CreatingLambdas {
    interface Greeting {
        String sayHi(String msg);
    }

    public void printGreeting(String msg, Greeting g) {
        String res = g.sayHi(msg);
        System.out.println("res: " + res);
    }

    public static void main(String[] args) {
        new CreatingLambdas().printGreeting("Harry", (String msg) -> " Hello " + msg);
    }

    interface Tradable<Trade> {
        boolean check(Trade t);
//        int getName();
    }

    void testTradable() {
        Tradable<Trade> big = (trade) -> trade.isBigTrade();
        //big is a lambda variable
    }
}
