# Adapter Pattern Implementation

## Overview
The Adapter Pattern is a structural design pattern that allows objects with incompatible interfaces to collaborate. It works as a bridge between two incompatible interfaces by converting the interface of a class into another interface that clients expect.

## Use Case
In this implementation, we have an existing `LegacyPrinter` class with a method that prints data. We want to adapt it to work with the new `Printer` interface which expects a different method signature for printing data.

## Class Diagram
```plaintext
+-------------------------+
|        Printer          |
|-------------------------|
| + print(String data)    |
+-------------------------+
           ^
           |
+-------------------------+
|    LegacyPrinterAdapter |
|-------------------------|
| - legacyPrinter: LegacyPrinter |
| + print(String data)    |
+-------------------------+

+-------------------------+
|    LegacyPrinter        |
|-------------------------|
| + printData(String data)|
+-------------------------+

Components
Printer (interface): Defines the print method.
LegacyPrinter (class): Existing class with a printData method.
LegacyPrinterAdapter (class): Adapts the LegacyPrinter to the Printer interface.

How to Run
Clone the repository.
Navigate to the Adapter_Pattern directory.

Compile the Java files:
javac *.java

Run the Main class:
java Main


Conclusion
The Adapter Pattern is effective in scenarios where an existing class needs to be used but its interface is incompatible with the code that needs to use it. This implementation demonstrates how the pattern can be used to adapt a LegacyPrinter class to work with a new Printer interface.
