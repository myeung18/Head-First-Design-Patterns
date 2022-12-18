package jdp3e.solid.isp.ugly;

public class Client {
    public static void main(String[] args) {
        Client c = new Client();
        c.action();
    }
    void action() {
        System.out.println("a demo without ISP");

        Printer printer = new AdvancedPrinter();
        printer.printDocument();;
        printer.sendFax();

        printer = new BasicPrinter();
        printer.printDocument();
//        printer.sendFax();
    }
}
