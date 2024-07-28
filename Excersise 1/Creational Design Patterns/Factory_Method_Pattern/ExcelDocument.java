package Factory_Method_Pattern;

public class ExcelDocument implements Document {
    private String filePath;

    public ExcelDocument(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void open() {
        System.out.println("Opening Excel document: " + filePath);
        // Add code to open the Excel document
    }
}