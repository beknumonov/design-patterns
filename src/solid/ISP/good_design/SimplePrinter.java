package solid.ISP.good_design;

public class SimplePrinter implements Printer{

    @Override
    public void print(Document doc) {
        System.out.println("Printing document...");
    }
}
