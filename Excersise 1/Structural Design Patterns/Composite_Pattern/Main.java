package Composite_Pattern;
public class Main {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("File1.txt");
        FileSystemComponent file2 = new File("File2.txt");
        FileSystemComponent file3 = new File("File3.txt");

        FileSystemComponent directory1 = new Directory("Directory1");
        FileSystemComponent directory2 = new Directory("Directory2");

        directory1.add(file1);
        directory1.add(file2);
        directory2.add(file3);

        FileSystemComponent rootDirectory = new Directory("RootDirectory");
        rootDirectory.add(directory1);
        rootDirectory.add(directory2);

        rootDirectory.display();
    }
}
