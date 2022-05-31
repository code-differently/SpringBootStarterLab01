Creating custom exceptions to handle business condition failures.

# The Exceptions

The samples for this chapter cater to business conditions such as
invalid id, invalid assignee, invalid length of assignee parameter, and
a todo not found use case, common in `GET`s, `PUT`s and `DELETE`s.

1.  Invalid ID  
    ⇒
    [WidgetNotFoundException.java](../src/main/java/com/codedifferently/phonebook/domain/widgets/exceptions/WidgetNotFoundException.java)

# Exercise Lab

![Lab](images/labtime.png)

1.  In the `com.codedifferently.phonebook.domain.phonebook.exceptions` complete the lab exception(s):

    1.  `PhoneNumberNotFoundException` - when searching for a non-existing
        account id.

| Prev                                                 | TOC                       | Next                                                 |
|------------------------------------------------------|---------------------------|------------------------------------------------------|
| [Working with the Persistence Layer](05_DAOLayer.md) | [TOC](TableOfContents.md) | [Working with the Service Layer](07_ServiceLayer.md) |
