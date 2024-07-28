# Factory Method Pattern Implementation

## Overview
The Factory Method Pattern is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. This pattern is useful for defining an interface for creating an object, but letting subclasses decide which class to instantiate.

## Use Case
In this implementation, we create a document editor that can create different types of documents (Word, PDF, Excel). The specific type of document is created by the corresponding factory class.

## Class Diagram
```plaintext
+-------------------------+
|      Document           |
|-------------------------|
| + open()                |
+-------------------------+
           ^
           |
+-------------------------+
|   WordDocument          |
|-------------------------|
| + open()                |
+-------------------------+
           ^
           |
+-------------------------+
|    PDFDocument          |
|-------------------------|
| + open()                |
+-------------------------+
           ^
           |
+-------------------------+
|   ExcelDocument         |
|-------------------------|
| + open()                |
+-------------------------+

+-------------------------+
|   DocumentFactory       |
|-------------------------|
| + createDocument(): Document|
+-------------------------+
           ^
           |
+-------------------------+
| WordDocumentFactory     |
|-------------------------|
| + createDocument()      |
+-------------------------+
           ^
           |
+-------------------------+
| PDFDocumentFactory      |
|-------------------------|
| + createDocument()      |
+-------------------------+
           ^
           |
+-------------------------+
| ExcelDocumentFactory    |
|-------------------------|
| + createDocument()      |
+-------------------------+


Sure! Here is a sample README.md file for the Factory Method Pattern implementation.

markdown
Copy code
# Factory Method Pattern Implementation

## Overview
The Factory Method Pattern is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. This pattern is useful for defining an interface for creating an object, but letting subclasses decide which class to instantiate.

## Use Case
In this implementation, we create a document editor that can create different types of documents (Word, PDF, Excel). The specific type of document is created by the corresponding factory class.

## Class Diagram
```plaintext
+-------------------------+
|      Document           |
|-------------------------|
| + open()                |
+-------------------------+
           ^
           |
+-------------------------+
|   WordDocument          |
|-------------------------|
| + open()                |
+-------------------------+
           ^
           |
+-------------------------+
|    PDFDocument          |
|-------------------------|
| + open()                |
+-------------------------+
           ^
           |
+-------------------------+
|   ExcelDocument         |
|-------------------------|
| + open()                |
+-------------------------+

+-------------------------+
|   DocumentFactory       |
|-------------------------|
| + createDocument(): Document|
+-------------------------+
           ^
           |
+-------------------------+
| WordDocumentFactory     |
|-------------------------|
| + createDocument()      |
+-------------------------+
           ^
           |
+-------------------------+
| PDFDocumentFactory      |
|-------------------------|
| + createDocument()      |
+-------------------------+
           ^
           |
+-------------------------+
| ExcelDocumentFactory    |
|-------------------------|
| + createDocument()      |
+-------------------------+
Components
Document (interface): Defines the open method for different types of documents.
WordDocument, PDFDocument, ExcelDocument (classes): Implement the open method for specific document types.
DocumentFactory (abstract class): Declares the factory method createDocument.
WordDocumentFactory, PDFDocumentFactory, ExcelDocumentFactory (classes): Implement the createDocument method to create specific document types.
How to Run
Clone the repository.
Navigate to the Factory_Method_Pattern directory.

Compile the Java files:
javac *.java

Run the Main class:
java Main

Conclusion
The Factory Method Pattern is effective in scenarios where the exact type of object to be created is determined by subclasses. This implementation demonstrates how the pattern can be used to create different types of documents dynamically.
