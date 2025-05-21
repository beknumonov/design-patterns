package solid.ISP.good_design;

public class MutifunctionPrinter implements Printer, Scanner, Copier{
    @Override
    public void copy(Document doc) {
        System.out.println("Copying document...");
    }

    @Override
    public void print(Document doc) {
        System.out.println("Printing document...");
    }

    @Override
    public void scan(Document doc) {
        System.out.println("Scanning document...");
    }
}
