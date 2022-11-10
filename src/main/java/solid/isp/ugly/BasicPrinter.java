package solid.isp.ugly;

public class BasicPrinter implements Printer {
    @Override
    public void printDocument() {
        System.out.println("The basic printer prints a document.");
    }

    @Override
    public void sendFax() {
        throw new UnsupportedOperationException();
    }
}
