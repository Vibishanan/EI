package Factory_Method_Pattern;

public class PDFDocumentFactory implements DocumentFactory {
    @Override
    public Document createDocument(String filePath) {
        return new PDFDocument(filePath);
    }
}