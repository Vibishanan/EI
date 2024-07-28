# Strategy Pattern Implementation

## Overview
The Strategy Pattern is a behavioral design pattern that enables selecting an algorithm's behavior at runtime. It defines a family of algorithms, encapsulates each one, and makes them interchangeable. This pattern allows the algorithm to vary independently from clients that use it.

## Use Case
In this implementation, we create a payment system that supports multiple payment methods (Credit Card, PayPal, Bitcoin). The payment method can be selected dynamically at runtime.

## Class Diagram
```plaintext
+-------------------------+
|     PaymentStrategy     |
|-------------------------|
| + pay(amount: double)   |
+-------------------------+
           ^
           |
+---------------------------+
|   CreditCardPayment       |
|---------------------------|
| - cardNumber: String      |
| - cardHolderName: String  |
| + pay(amount: double)     |
+---------------------------+
           ^
           |
+-------------------------+
|     PayPalPayment       |
|-------------------------|
| - email: String         |
| + pay(amount: double)   |
+-------------------------+
           ^
           |
+--------------------------+
|     BitcoinPayment       |
|--------------------------|
| - walletAddress: String  |
| + pay(amount: double)    |
+--------------------------+
           ^
           |
+-------------------------+
|    PaymentContext       |
|-------------------------|
| - strategy: PaymentStrategy|
| + setPaymentStrategy(strategy: PaymentStrategy) |
| + pay(amount: double)   |
+-------------------------+


Components
PaymentStrategy (interface): Defines the pay method for different payment strategies.
CreditCardPayment (class): Implements the pay method for credit card payments.
PayPalPayment (class): Implements the pay method for PayPal payments.
BitcoinPayment (class): Implements the pay method for Bitcoin payments.
PaymentContext (class): Uses a PaymentStrategy to execute the pay method.

How to Run
Clone the repository.
Navigate to the Strategy_Pattern directory.

Compile the Java files:
javac *.java

Run the Main class:
java Main

Conclusion
The Strategy Pattern is effective in scenarios where multiple algorithms can be selected at runtime. This implementation demonstrates how the pattern can be used to create a flexible payment system supporting various payment methods.
