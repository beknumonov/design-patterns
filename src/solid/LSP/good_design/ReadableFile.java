package solid.LSP.good_design;

public class ReadableFile implements Readable {

    @Override
    public void read() {
        System.out.println("Reading from file.");
    }
}
