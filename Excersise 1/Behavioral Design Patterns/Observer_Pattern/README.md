# Observer Pattern Implementation

## Overview
The Observer Pattern is a behavioral design pattern that allows an object, known as the subject, to maintain a list of its dependents, called observers, and notify them automatically of any state changes. This pattern is useful when an object needs to notify multiple other objects about changes in its state.

## Use Case
In this implementation, we create a simple stock price monitoring system where multiple investors are notified whenever the stock price changes.

## Class Diagram
```plaintext
+---------------------+
|      Stock          |
|---------------------|
| + registerInvestor()|
| + removeInvestor()  |
| + notifyInvestors() |
+---------------------+
          ^
          |
+----------------------+
|   ConcreteStock      |
|----------------------|
| - price: double      |
| - investors: List<>  |
| + setPrice()         |
+----------------------+
          ^
          |
+---------------------+
|      Investor      |
|---------------------|
| + update()          |
+---------------------+
          ^
          |
+-----------------------+
|   ConcreteInvestor    |
|-----------------------|
| - name: String        |
| + update()            |
+-----------------------+

Components
Stock (interface): Defines methods for registering, removing, and notifying investors.
ConcreteStock (class): Implements the Stock interface and maintains a list of investors. Notifies them of price changes.
Investor (interface): Defines the update method for investors.
ConcreteInvestor (class): Implements the Investor interface and updates the investor with the new stock price.


How to Run
Clone the repository.
Navigate to the Observer_Pattern directory.

Compile the Java files:
javac *.java

Run the Main class:
java Main

Conclusion
The Observer Pattern is effective in scenarios where multiple objects need to be notified about changes in another object's state. This implementation demonstrates how the pattern can be used to create a simple stock price monitoring system.
