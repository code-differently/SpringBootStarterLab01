Building the controller layer and its unit tests

# The Controller Layer

The controller layer breaks down the incoming HTTP request and makes the
necessary calls to the service layers, acts as a layer marshalling and
unmarshalling the request/response objects from/to JSON.

The controller layer also pads the relevant metadata as a part of
building out a response.

The controller package has an interface and an implementation. The
interface is covered in more detail in a subsequent chapter.

1.  Controller  
    ⇒
    [WidgetController.java](../src/main/java/com/codedifferently/phonebook/domain/widgets/controllers/WidgetController.java)

    1.  The controller implementation is marked with a `@RestController`
        stereotype.

    2.  The class has a `@RequestMapping` annotation which provides a
        context path for the web URLs.

    3.  The `constructor` autowires a `WidgetService` interface which is
        made available via a Spring context.

    4.  The Controller Implementation validates the request body upon
        invocation and also creates the response body to return the
        desired content.

    5.  The metadata information is baked into the responses built out
        from the service calls.

# The Controller unit test

The controller is tested with @SpringBootTest.

1.  Test extending the abstract test setup  
    ⇒
    [WidgetControllerTest.java](../src/main/java/com/codedifferently/phonebook/domain/widgets/controllers/WidgetControllerTest.java)

    1.  This test extends from the **abstract** test class which adds a
        **mock** implementation of the `WidgetService` with a `@MockBean`
        annotation.

    2.  The `@MockBean` is a mockito utility present in the
        `spring-boot-test.jar` that injects a bean into the Spring
        context after adding some mock responses.

2.  Abstract mock setup  
    ⇒
    [BaseControllerTest.java](../src/test/java/com/codedifferently/phonebook/BaseControllerTest.java)

    1.  Abstract mock class (re-used in other tests)

# Exercise Lab

In the `com.codedifferently.phonebook.domain.phonebook.controllers` package
![Lab](images/labtime.png)

1.  Complete the lab `PhoneNumberController` responses and controller layers and appropriate unit
    tests.

    1.  Cover the basic HTTP Error code responses shown in the sample.

2.  The following controller APIs should be created:

    1.  All CRUD related calls

    2.  Find By lastName, should return a list.
