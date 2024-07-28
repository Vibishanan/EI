package Composite_Pattern;

import java.util.ArrayList;
import java.util.List;

class Directory extends FileSystemComponent {
    private String name;
    private List<FileSystemComponent> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public void add(FileSystemComponent component) {
        children.add(component);
    }

    @Override
    public void remove(FileSystemComponent component) {
        children.remove(component);
    }

    @Override
    public List<FileSystemComponent> getChildren() {
        return children;
    }

    @Override
    public void display() {
        System.out.println("Directory: " + name);
        for (FileSystemComponent child : children) {
            child.display();
        }
    }
}
