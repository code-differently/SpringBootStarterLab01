Creating custom exceptions to handle business condition failures.

# The Exceptions

The samples for this chapter cater to business conditions such as
invalid id, invalid assignee, invalid length of assignee parameter, and
a todo not found use case, common in `GET`s, `PUT`s and `DELETE`s.

1.  Invalid ID  
    ⇒
    [WidgetNotFoundException.java](../../phonebook/src/test/java/com/codedifferently/phonebook/widgets/models/exceptions/WidgetNotFoundException.java)

# Exercise Lab

![Lab](images/labtime.png)

1.  Create the lab exception(s):

    1.  `PersonNotFoundException` - when searching for a non-existing
        account id.

| Prev                                                 | TOC                       | Next                                                 |
|------------------------------------------------------|---------------------------|------------------------------------------------------|
| [Working with the Persistence Layer](05_DAOLayer.md) | [TOC](TableOfContents.md) | [Working with the Service Layer](07_ServiceLayer.md) |
