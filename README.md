Spring Core is the foundational module of the Spring Framework, providing essential features like Inversion of Control (IoC) and Dependency Injection (DI). 
These features allow developers to manage object creation and dependencies more efficiently, promoting loose coupling and easier testing.

Key components of Spring Core:
  -IoC Container: Manages the lifecycle and configuration of application objects.
  - Dependency Injection: Allows objects to define their dependencies, which the container then injects at runtime.
  - BeanFactory: A sophisticated implementation of the factory pattern, used for managing beans.
  - ApplicationContext: Extends BeanFactory to provide more enterprise-specific functionality.

Annotations:
  - @Autowired: Used for automatic dependency injection. It can be applied to constructors, fields, and setter methods.
  - @Bean: Indicates that a method produces a bean to be managed by the Spring container.
  - @Component: Marks a Java class as a bean. It is a generic stereotype for any Spring-managed component.
  - @Configuration: Indicates that a class declares one or more @Bean methods and may be processed by the Spring container to generate bean definitions.
  - @Qualifier: Used alongside @Autowired to specify which bean should be injected when multiple beans of the same type exist.
  - @Value: Used to inject property values,static methods/variables,objects into beans.
  - @Scope: Specifies the scope of a bean (e.g., singleton, prototype).
  - @Primary: Indicates that a bean should be given preference when multiple candidates are qualified to autowire a single-valued dependency.
