package ravi.gaurav.service;

import ravi.gaurav.model.TodoData;
import ravi.gaurav.model.TodoItem;

public interface TodoItemService {
    void addItem(TodoItem todoItem);

    void removeItem(int id);

    TodoItem getItem(int id);

    void updateItem(TodoItem todoItem);

    TodoData getData();
}
