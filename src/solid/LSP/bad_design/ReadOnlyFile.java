package solid.LSP.bad_design;

public class ReadOnlyFile extends File{

    @Override
    public void write() {
        throw new UnsupportedOperationException("Cannot write to a read-only file.");
    }
}
