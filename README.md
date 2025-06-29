# Beyond Boilerplate

Beyond Boilerplate is a simple "framework" designed to facilitate the creation of modular software architectures using the concept of components and ports. It provides abstract classes and interfaces to define components, their interfaces, and various types of communication ports, enabling flexible and decoupled system design.

## Project Structure

- `provided/`: Contains the main interfaces and abstract classes for components and ports
- `required/`: Contains abstract implementations for different types of output ports (standard, broadcast, non-component)

## Getting Started

### Prerequisites

- Java 17+
- Maven 3.6+

### Installation

To use this component in your own Maven project, add the following to your `pom.xml`:

- Add the GitHub Packages repository:

```xml
<repositories>
  <repository>
    <id>beyond-boilerplate</id>
    <url>https://maven.pkg.github.com/tavinhossaur/beyond-boilerplate</url>
  </repository>
</repositories>
```

- Add the dependency:

```xml
<dependency>
  <groupId>com.ifsp.tavinho</groupId>
  <artifactId>beyond-boilerplate</artifactId>
  <version>1.0.0</version>
</dependency>
```

### Build

```bash
mvn clean install
```

### Run Tests

```bash
mvn test
```

## License

This project is licensed under the MIT License.
