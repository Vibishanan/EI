package Factory_Method_Pattern;

public class WordDocument implements Document {
    private String filePath;

    public WordDocument(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void open() {
        System.out.println("Opening Word document: " + filePath);
        // Add code to open the Word document
    }
}