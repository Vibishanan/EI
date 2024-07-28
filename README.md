# EI
EI-2024-25: Coding exercises
# Design Patterns and Mini-Projects Exercise

## Overview
This project demonstrates the application of various software design patterns through six different use cases and one mini-project. The project includes two examples each for behavioral, creational, and structural design patterns in Java. Additionally, it includes a mini-project based on one of the provided problem statements, focusing on logic and code quality.

## Table of Contents
1. [Exercise 1: Design Patterns](#exercise-1-design-patterns)
   - [Behavioral Design Patterns](#behavioral-design-patterns)
     - [Observer Pattern](#observer-pattern)
     - [Strategy Pattern](#strategy-pattern)
   - [Creational Design Patterns](#creational-design-patterns)
     - [Builder Pattern](#builder-pattern)
     - [Factory Method Pattern](#factory-method-pattern)
   - [Structural Design Patterns](#structural-design-patterns)
     - [Adapter Pattern](#adapter-pattern)
     - [Composite Pattern](#composite-pattern)
2. [Exercise 2: Mini-Projects](#exercise-2-mini-projects)
   - [Mini-Project](#mini-project)

## Exercise 1: Design Patterns

### Behavioral Design Patterns

#### Observer Pattern
**Use Case:** Stock price monitoring system where multiple investors are notified whenever the stock price changes.

**Code Structure:**
- **Stock (interface):** Defines methods for registering, removing, and notifying investors.
- **ConcreteStock (class):** Implements the Stock interface and maintains a list of investors. Notifies them of price changes.
- **Investor (interface):** Defines the update method for investors.
- **ConcreteInvestor (class):** Implements the Investor interface and updates the investor with the new stock price.

**Run Instructions:**
1. Navigate to the `Observer_Pattern` directory.
2. Compile and run the Java files.

#### Strategy Pattern
**Use Case:** Payment system that supports multiple payment methods (Credit Card, PayPal, Bitcoin).

**Code Structure:**
- **PaymentStrategy (interface):** Defines the `pay` method for different payment strategies.
- **CreditCardPayment, PayPalPayment, BitcoinPayment (classes):** Implement the `pay` method for specific payment methods.
- **PaymentContext (class):** Uses a `PaymentStrategy` to execute the `pay` method.

**Run Instructions:**
1. Navigate to the `Strategy_Pattern` directory.
2. Compile and run the Java files.

### Creational Design Patterns

#### Builder Pattern
**Use Case:** Building complex objects such as a `Computer` with optional components.

**Code Structure:**
- **Computer (class):** Represents the complex object to be built.
- **ComputerBuilder (class):** Provides a builder interface to construct a `Computer` with optional components.
- **ComputerDirector (class):** Directs the building process using a `ComputerBuilder`.

**Run Instructions:**
1. Navigate to the `Builder_Pattern` directory.
2. Compile and run the Java files.

#### Factory Method Pattern
**Use Case:** Document editor that can create different types of documents (Word, PDF, Excel).

**Code Structure:**
- **Document (interface):** Defines the `open` method for different types of documents.
- **WordDocument, PDFDocument, ExcelDocument (classes):** Implement the `open` method for specific document types.
- **DocumentFactory (abstract class):** Declares the factory method `createDocument`.
- **WordDocumentFactory, PDFDocumentFactory, ExcelDocumentFactory (classes):** Implement the `createDocument` method to create specific document types.

**Run Instructions:**
1. Navigate to the `Factory_Method_Pattern` directory.
2. Compile and run the Java files.

### Structural Design Patterns

#### Adapter Pattern
**Use Case:** Adapting an existing `LegacyPrinter` class to work with a new `Printer` interface.

**Code Structure:**
- **Printer (interface):** Defines the `print` method.
- **LegacyPrinter (class):** Existing class with a `printData` method.
- **LegacyPrinterAdapter (class):** Adapts the `LegacyPrinter` to the `Printer` interface.

**Run Instructions:**
1. Navigate to the `Adapter_Pattern` directory.
2. Compile and run the Java files.

#### Composite Pattern
**Use Case:** File system structure where files and directories are treated uniformly.

**Code Structure:**
- **FileSystemComponent (abstract class):** Declares common operations for both files and directories.
- **File (class):** Represents a file in the file system.
- **Directory (class):** Represents a directory that can contain files or other directories.

**Run Instructions:**
1. Navigate to the `Composite_Pattern` directory.
2. Compile and run the Java files.

## Exercise 2: Mini-Projects

### Mini-Project
**Requirements:**
- A simple console/terminal-based application focusing on logic and code quality.
- Adherence to best practices: Design patterns, SOLID principles, OOP, and language of choice.
- Choose one of the provided problem statements and solve it creatively.

**Note:** Feel free to assume unknowns and enhance the problem statement to demonstrate your excellence.

**Run Instructions:**
1. Navigate to the `Mini_Project` directory.
2. Compile and run the Java files.

## How to Run
1. Clone the repository.
2. Navigate to the respective pattern or mini-project directory.
3. Compile the Java files:
   javac *.java

Conclusion
This project showcases the practical use of various design patterns in software development. Each example demonstrates how the pattern can be implemented to solve specific problems, promoting code reusability, flexibility, and maintainability.
