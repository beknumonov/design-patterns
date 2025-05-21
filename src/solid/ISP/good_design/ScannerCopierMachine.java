package solid.ISP.good_design;

public class ScannerCopierMachine implements Scanner, Copier{
    @Override
    public void copy(Document doc) {
        System.out.println("Copying document...");
    }

    @Override
    public void scan(Document doc) {
        System.out.println("Scanning document...");
    }
}
