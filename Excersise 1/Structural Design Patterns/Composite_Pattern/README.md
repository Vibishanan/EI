# Composite Pattern Implementation

## Overview
The Composite Pattern is a structural design pattern that lets you compose objects into tree structures to represent part-whole hierarchies. This pattern allows clients to treat individual objects and compositions of objects uniformly.

## Use Case
In this implementation, we create a file system structure where files and directories are treated uniformly. Directories can contain files or other directories, forming a tree structure.

## Class Diagram
```plaintext
+-------------------------------+
|      FileSystemComponent      |
|-------------------------------|
| + add(FileSystemComponent)    |
| + remove(FileSystemComponent) |
| + getChildren(): List<FileSystemComponent> |
| + display()                   |
+-------------------------------+
          ^
          |
+-------------------------------+
|            File               |
|-------------------------------|
| - name: String                |
| + display()                   |
+-------------------------------+
          ^
          |
+-------------------------------+
|           Directory           |
|-------------------------------|
| - name: String                |
| - children: List<FileSystemComponent> |
| + add(FileSystemComponent)    |
| + remove(FileSystemComponent) |
| + getChildren(): List<FileSystemComponent> |
| + display()                   |
+-------------------------------+
Components
FileSystemComponent (abstract class): Declares common operations for both files and directories.
File (class): Represents a file in the file system.
Directory (class): Represents a directory that can contain files or other directories.

How to Run
Clone the repository.
Navigate to the Composite_Pattern directory.


Compile the Java files:
javac *.java

Run the Main class:
java Main

Conclusion
The Composite Pattern is effective in scenarios where you need to treat individual objects and compositions of objects uniformly. This implementation demonstrates how the pattern can be used to create a file system structure with files and directories.

