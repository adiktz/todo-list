package ravi.gaurav.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import ravi.gaurav.model.TodoData;
import ravi.gaurav.service.TodoService;
import ravi.gaurav.util.Mappings;
import ravi.gaurav.util.ViewNames;

@Controller
public class TodoItemController {

    private final TodoService todoService;

    @Autowired
    public TodoItemController(TodoService todoService) {
        this.todoService = todoService;
    }

    //Model attribute
    @ModelAttribute
    public TodoData todoData() {
        return todoService.getData();
    }

    // http://localhost:8080/todo/items
    @GetMapping(Mappings.ITEMS)
    public String items() {
        return ViewNames.ITEMS_LIST;
    }
}
