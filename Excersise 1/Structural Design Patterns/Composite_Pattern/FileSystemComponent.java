package Composite_Pattern;

import java.util.List;

abstract class FileSystemComponent {
    public void add(FileSystemComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(FileSystemComponent component) {
        throw new UnsupportedOperationException();
    }

    public List<FileSystemComponent> getChildren() {
        throw new UnsupportedOperationException();
    }

    public abstract void display();
}
