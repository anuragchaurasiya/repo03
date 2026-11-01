# Java OOP Practice

<p align="center"><img src="assets/java-oop-banner.svg" alt="Java OOP Practice banner" width="100%" /></p>

<p align="center"><strong>Java examples for learning object-oriented programming and small console applications.</strong></p>

## Concepts

Classes and objects, constructors, inheritance, method overriding, abstraction, polymorphism, interfaces, packages and basic input validation.

## Example programs

| File | Concept |
|---|---|
| `Area12.java` | Methods and area calculations |
| `CurrncyConverter.java` | Scanner input and numeric validation |
| `Demo.java` | Runtime polymorphism |
| `Payment.java` | Method overriding |
| `PaymentSystem.java` | Abstract classes and payment subclasses |
| `Uber.java` | Inheritance and fare calculation |

## Requirements

- JDK 11 or newer
- Terminal or Java IDE

## Compile and run

All source files use the `MyProfile` package. From the repository root:

```bash
mkdir -p out
javac -d out *.java
java -cp out MyProfile.PaymentSystem
```

Run another example by replacing `MyProfile.PaymentSystem` with `MyProfile.Area12`, `MyProfile.Demo`, `MyProfile.Payment`, `MyProfile.Uber`, or `MyProfile.CurrncyConverter`.

The currency converter asks for a sample exchange rate; use a verified rate for real-world calculations. The ride fares are illustrative practice values.

## Project structure

```text
repo03/
├── assets/
│   └── java-oop-banner.svg
├── Area12.java
├── CurrncyConverter.java
├── Demo.java
├── Payment.java
├── PaymentSystem.java
├── Uber.java
└── README.md
```

## Maintainer

[Anurag Chaurasiya](https://github.com/anuragchaurasiya)