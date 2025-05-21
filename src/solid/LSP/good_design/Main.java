package solid.LSP.good_design;

public class Main {
    public static void main(String[] args) {
        ReadableFile readableFile=new ReadableFile();
        readableFile.read();

        WritableFile writableFile=new WritableFile();
        writableFile.read();
        writableFile.write();
    }
}
