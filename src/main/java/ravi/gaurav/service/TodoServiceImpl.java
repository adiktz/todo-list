package ravi.gaurav.service;

import org.springframework.stereotype.Service;
import ravi.gaurav.model.TodoData;
import ravi.gaurav.model.TodoItem;

@Service
public class TodoServiceImpl implements TodoItemService {

    private final TodoData todoData = new TodoData();

    @Override
    public void addItem(TodoItem todoItem) {
        todoData.addItem(todoItem);
    }

    @Override
    public void removeItem(int id) {
        todoData.removeItem(id);
    }

    @Override
    public TodoItem getItem(int id) {
        return todoData.getItem(id);
    }

    @Override
    public void updateItem(TodoItem todoItem) {
        todoData.updateItem(todoItem);
    }

    @Override
    public TodoData getData() {
        return todoData;
    }
}
