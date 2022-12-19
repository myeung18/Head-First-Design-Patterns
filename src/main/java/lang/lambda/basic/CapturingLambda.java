package lang.lambda.basic;public class CapturingLambda {    Trade trade = new Trade("", 20000, "");    public interface ITrade {        boolean check(Trade t);    }    public boolean isOpenTrade() {        ITrade simple = (t) -> t.isOpen() ? true : false;        return false;    }    public boolean checkStatus(String status) {        ITrade statusLambda = (t) -> t.getStatus().equals(status) ? true : false;        return false;    }    //effective final example    public boolean isOpenAndBig(String status, int quantity) {        ITrade openandLarge = (t) -> {            return (t.getStatus().equals(status) && t.getQuantity() > quantity) ? true : false;        };        return false;    }    int count= 0;    public void instanceVariable(int localCount) {        for (int i = 0; i < count; i++) {            ITrade statusLambda = t -> {                count++;//                localCount++;                return t.isOpen();            };        }    }}