# Java Beverage Order System

A command-line Java application that allows users to customize a coffee or tea order, validates their selections, saves the completed order to a text file, and reloads the saved order for display.

## Features

- Choose between coffee and tea
- Select from multiple beverage options
- Customize latte espresso shots
- Add extra heat or remove foam
- Add honey or sugar to tea
- Validate menu selections and incorrect inputs
- Save the completed order to `order.txt`
- Read and display the saved order using Java file I/O

## Technologies Used

- Java
- Arrays
- Methods
- Loops and conditional statements
- Exception handling
- File input and output
- Scanner-based user input

## Project Structure

```text
java-beverage-order-system/
├── src/
│   └── BeverageOrderSystem.java
├── .gitignore
└── README.md
```

The program creates `order.txt` automatically after a user completes an order.

## How to Run

### Requirements

- Java Development Kit (JDK)
- A terminal or Java-compatible IDE

### Compile

```bash
javac src/BeverageOrderSystem.java
```

### Run

```bash
java -cp src BeverageOrderSystem
```

## Example Interaction

```text
Welcome! Choose a drink:
1. Coffee
2. Tea
Enter choice: 1

Select your coffee:
1. Espresso (Short)
2. Espresso (Long)
3. Latte

3
How many shots of espresso? (1 or 2): 2
Would you like it extra hot? (yes/no): yes
Would you like foam? (yes/no): no

Order saved.
Previous Order: Beverage: Latte with 2 shots, Extra Hot, No Foam
```

## What I Practiced

This project helped me practice separating a program into smaller methods instead of placing all logic inside `main`. It also demonstrates how Java can collect user input, handle invalid selections, customize an order, and preserve information using text files.

## Possible Improvements

- Add stronger validation for espresso shots and sweetener quantities
- Support multiple items in one order
- Add beverage prices and calculate the total
- Allow users to edit or cancel an order
- Store order history instead of replacing the previous order
- Separate beverages into individual Java classes
- Add automated unit tests

## Author

**Ayad Abunab**

Finance and Management Information Systems student at the University of Washington Bothell.

[LinkedIn](https://www.linkedin.com/in/ayad-abunab/) | [GitHub](https://github.com/Ayad2077)
