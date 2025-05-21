package solid.LSP.good_design;

public class WritableFile extends ReadableFile implements Writable{

    @Override
    public void write() {
        System.out.println("Writing to file");
    }
}
