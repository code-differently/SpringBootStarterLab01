package com.codedifferently.phonebook.domain.widgets.services;

import com.codedifferently.phonebook.domain.widgets.exceptions.WidgetNotFoundException;
import com.codedifferently.phonebook.domain.widgets.models.Widget;

import java.util.List;

public interface WidgetService {
    Widget create(Widget widget);
    Widget getWidgetById(Integer id) throws WidgetNotFoundException;
    List<Widget> getAllWidgets();
    Widget updateWidget(Integer id, Widget widget) throws WidgetNotFoundException;
    Boolean deleteWidget(Integer id) throws WidgetNotFoundException;
}
