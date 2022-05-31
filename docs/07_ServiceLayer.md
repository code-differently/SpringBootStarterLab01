Building the service layer and its unit tests

# The Service Layer

The service layer:

-   breaks down the incoming request from the controller

-   makes the necessary calls to the repository layers

-   stitches the response Java objects

-   sends them back to the API/Controller layer

-   performs business logic validations

-   throws the right exceptions when issues are encountered

We use an interface-implementation model here, so we have more
flexibility in autowiring and testing.

1.  Service Interface  
    ⇒
    [WidgetService.java](../src/main/java/com/codedifferently/phonebook/domain/widgets/services/WidgetService.java)  

    1.  This interface defines all the service methods that are publicly
        available.

2.  Service Implementation  
    ⇒
    [WidgetServiceImpl.java](../src/main/java/com/codedifferently/phonebook/domain/widgets/services/WidgetServiceImpl.java)  

    1.  The Service implementation implements all the methods listed in
        the Service interface.

    2.  The `constructor` autowires a `WidgetRepo` interface which is
        made available via a Spring context.

    3.  The Service implementation also includes validations of some
        constraints. These validations throw necessary custom exceptions
        (in this example, extending the RuntimeException).

# The Service unit test

The service is tested with `@SpringBootTest`.

1.  Test extending the abstract test setup  
    ⇒
    [WidgetServiceTest.java](../src/test/java/com/codedifferently/phonebook/domain/widgets/services/WidgetServiceTest.java)

    1.  The `setUp()` method runs ***before each test method*** and adds
        a Mock implementation of the repository.

    2.  A Mock object wraps around the actual one, and replaces certain
        method calls with other functionality.

    3.  In this example, the mock object replaces actual database calls
        with fake responses simulating a database access.

    4.  This test can thus run without a database.



>The mock mockWidgetRepo switches functionality ***when*** a matching
condition is met. The `thenReturn` or `thenAnswer` provides a response
that simulates the actual database action.



# Exercise Lab

![Lab](images/labtime.png)

In the `com.codedifferently.phonebook.domain.phonebook.services` package
1.  Complete the `PhoneNumberServiceImpl` service layer and unit test. Standard CRUD operations
    on Account plus methods for:

    1.  Find By lastName, should return a list.

| Prev                                        | TOC                       | Next                                                       |
|---------------------------------------------|---------------------------|------------------------------------------------------------|
| [Working with Exceptions](06_Exceptions.md) | [TOC](TableOfContents.md) | [Working with the Controller Layer](08_ControllerLayer.md) |
