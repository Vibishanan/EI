package Factory_Method_Pattern;

public class ExcelDocumentFactory implements DocumentFactory {
    @Override
    public Document createDocument(String filePath) {
        return new ExcelDocument(filePath);
    }
}