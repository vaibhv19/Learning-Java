# Java - Learning Repository

A comprehensive Java learning project covering fundamental concepts in backend development, organized into key topic areas with practical examples.

## 📚 Project Structure

```
Basics/
├── src/com/javabasics/
│   ├── collectionframework/    # Java Collections API examples
│   ├── Datatypes/              # Primitive and wrapper data types
│   ├── multithreading/         # Threading and concurrent programming
│   └── oops/                   # Object-Oriented Programming principles
└── README.md
```

## 🎯 Topics Covered

### 1. **Collection Framework** (`collectionframework/`)
Exploring Java's Collections API with practical examples:
- **ArrayList** - Dynamic array implementation allowing duplicates
- **LinkedList** - Doubly-linked list implementation
- List operations and performance characteristics
- Comparing different collection implementations

**Key Files:**
- `CF.java` - ArrayList and LinkedList basics
- `CF2.java` - Additional collection operations
- `CF3.java` - Advanced collection concepts

### 2. **Data Types** (`Datatypes/`)
Understanding Java's type system:
- Primitive data types (int, float, double, boolean, etc.)
- Wrapper classes
- Type conversions and casting

**Key Files:**
- `test.java` - Data type examples and operations

### 3. **Multithreading** (`multithreading/`)
Concurrent programming and threading concepts:
- **Thread Creation** - Extending Thread class vs Implementing Runnable
- **Thread Synchronization** - Using join() for thread coordination
- **Performance Comparison** - Sequential vs concurrent execution
- Real-world examples with Number Counting and Sum Calculation

**Key Files:**
- `withmultithreading.java` - Multithreading implementation with timing
- `WithoutMultiThreading.java` - Sequential execution baseline
- `NumberCounter.java` - Thread extending implementation
- `SumCalculator.java` - Runnable interface implementation

### 4. **Object-Oriented Programming** (`oops/`)
Core OOP principles in Java:
- **Polymorphism** - Method overloading with different parameters and types
- **Encapsulation** - Data hiding and abstraction
- **Inheritance** - Class hierarchies and code reuse
- **Real-world Examples** - Car, Smartphone, and Zoo simulations

**Key Files:**
- `main.java` - Polymorphism examples (method overloading)
- `main2.java` - Additional OOP concepts
- `car.java` - Vehicle class example
- `smartphone.java` - Electronics class example
- `zoo.java` - Animal hierarchy example
- `test.java` - OOP testing and validation

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code, etc.) or command line

### Compilation
```bash
javac src/com/javabasics/**/*.java
```

### Running Examples
Each file contains a `main()` method and can be run directly:

```bash
# Collection Framework
java -cp src com.javabasics.collectionframework.CF

# OOP Concepts
java -cp src com.javabasics.oops.main

# Multithreading
java -cp src com.javabasics.multithreading.withmultithreading
```

## 📖 Learning Path

1. **Start with Data Types** - Understand Java's type system
2. **Learn OOP Fundamentals** - Master classes, methods, and polymorphism
3. **Explore Collections** - Work with built-in data structures
4. **Study Multithreading** - Understand concurrent programming
5. **Compare Approaches** - See performance differences (with vs without multithreading)

## 🔑 Key Concepts

### Collections
- Understand the difference between ArrayList (array-backed) and LinkedList (node-based)
- Performance implications for different operations
- When to use each collection type

### Multithreading
- Two ways to create threads: extend Thread class or implement Runnable
- Thread lifecycle and synchronization
- Measuring performance improvements with concurrent execution
- Using `join()` to wait for thread completion

### OOP Principles
- **Method Overloading** - Same method name, different parameters
- **Polymorphism** - Different forms of objects behaving differently
- **Encapsulation** - Bundling data and methods
- **Real-world Modeling** - Objects representing real entities

## 💡 Best Practices Demonstrated

- ✅ Proper package organization (`com.javabasics.*`)
- ✅ Clear method naming and structure
- ✅ Exception handling in multithreaded code
- ✅ Performance measurement and comparison
- ✅ Multiple implementation approaches (inheritance vs composition)

## 🎓 Exercises & Extensions

Try these to deepen your understanding:

1. **Collections**
   - Implement a Set-based example
   - Compare performance between ArrayList and LinkedList

2. **Multithreading**
   - Add thread-safe counters using synchronization
   - Implement producer-consumer pattern
   - Use thread pools (ExecutorService)

3. **OOP**
   - Add abstract base classes
   - Implement interfaces for different types
   - Create a more complex inheritance hierarchy

4. **Data Types**
   - Explore Generics with collections
   - Test null and type safety

## 📝 Notes

- Each class includes comments explaining the concepts
- Compare sequential vs concurrent execution in multithreading module
- The project structure follows Java naming conventions (package structure = folder structure)

## 🛠️ IDE Setup

### IntelliJ IDEA
1. Open project → Select root folder
2. Project Structure → Mark `src` as Sources Root
3. Run any file with right-click → Run

### VS Code
1. Install "Extension Pack for Java" by Microsoft
2. Open workspace folder
3. Run with CodeLens or Ctrl+F5

### Eclipse
1. File → New → Java Project
2. Link to existing source in `src` directory
3. Build Path → Add source folder

## 📄 License

Educational purposes - Learning repository

---

**Happy Learning!** 🎉
