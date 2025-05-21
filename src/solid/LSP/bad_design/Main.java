package solid.LSP.bad_design;

public class Main {
    public static void main(String[] args) {

        File file = new ReadOnlyFile();
        file.read(); // This works fine
        file.write(); // This throws an exception
    }
}
