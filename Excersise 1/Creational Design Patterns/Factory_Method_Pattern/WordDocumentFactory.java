package Factory_Method_Pattern;
public class WordDocumentFactory implements DocumentFactory {
    @Override
    public Document createDocument(String filePath) {
        return new WordDocument(filePath);
    }
}