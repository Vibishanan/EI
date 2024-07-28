package Factory_Method_Pattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file type (Word, PDF, Excel): ");
        String fileType = scanner.nextLine();

        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        DocumentFactory factory = null;

        switch (fileType.toLowerCase()) {
            case "word":
                factory = new WordDocumentFactory();
                break;
            case "pdf":
                factory = new PDFDocumentFactory();
                break;
            case "excel":
                factory = new ExcelDocumentFactory();
                break;
            default:
                System.out.println("Unsupported file type.");
                return;
        }

        Document doc = factory.createDocument(filePath);
        doc.open();

        scanner.close();
    }
}
