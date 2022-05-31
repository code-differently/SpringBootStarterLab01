How the Spring Boot tutorial is split.

# The domain for the chapters

The next few chapters will cover a Widget module in Spring Boot.

The Widget module creates a RESTful service to provide access to the C.R.U.D. methods expected:
* Create 
* Read 
* Update
* Delete 

We are going to use this as an example to create a PhoneBook module. Each Widget instance has a:

-   id: the generated ID of the Widget

-   name: the name of the Widget

-   widgetParts: list of WidgetParts that make the Widget

# Tutorial Path

The flow of the new few sections:

-   **maven** dependencies.

-   **model layer** and its unit test cases.

-   **repository layer** and its unit test cases.

-   **exception layer** and its unit test cases.

-   **service layer** and its unit test cases.

-   **controller layer** and its unit test cases.

# Recommended package hierarchy for layers

It is important to layer out a spring application properly to easily
test and refactor code.

The recommended approach for package hierarchy from any application /
user using the Spring Boot application:

    (controller or api) ⇛ service ⇛ (dao or repository) + model + config.

The logical way to code these layers will thus take a reverse approach:

-   Code and unit-test the model layer.

-   Code and unit-test the dao or repository layer.

-   Code and unit-test the service layer.

-   Code and unit-test the controller or api layer.

-   Code the config layer as needed by each of the above.

| Prev                                                                              | TOC                       | Next                                               |
|-----------------------------------------------------------------------------------|---------------------------|----------------------------------------------------|
| [How to create a new Spring Boot Project](01_HowToCreateANewSpringBootProject.md) | [TOC](TableOfContents.md) | [Maven Dependencies used](03_MavenDependencies.md) |
