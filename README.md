# Beyond Boilerplate

Beyond Boilerplate is a Java framework designed to facilitate the creation of modular software architectures using the concept of components and ports. It provides abstract classes and interfaces to define components, their interfaces, and various types of communication ports, enabling flexible and decoupled system design.

## Features
- Abstract base classes for components and ports
- Support for standard, broadcast, and non-component ports
- Easy connection and disconnection between components
- Designed for extensibility and integration

## Project Structure
- `provided/`: Contains the main interfaces and abstract classes for components and ports
- `required/`: Contains abstract implementations for different types of output ports (standard, broadcast, non-component)

## Getting Started

### Prerequisites
- Java 17 or higher
- Maven

### Installation
Clone the repository and build the project using Maven:
```bash
mvn clean install
```

### Usage
Extend the provided abstract classes to define your own components and ports. Example:

```java
public class MyComponent extends ComponentInterface {
    @Override
    public void initialize() {
        // Initialize ports and component logic
    }
}
```

Connect ports between components using the provided methods:
```java
componentA.connect(componentB.getPort("portId"), "myPortId");
```

## Testing
JUnit Jupiter is included as a test dependency. You can add your own tests under `src/test/java`.

## License
This project is licensed under the MIT License.

## Repository
[https://github.com/tavinhossaur/beyond-boilerplate](https://github.com/tavinhossaur/beyond-boilerplate) 