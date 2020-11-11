package mockitoexample.api.impl;

import mockitoexample.api.TodoService;

import java.util.List;
import java.util.stream.Collectors;

public class TodoServiceImpl{

    public TodoService todoService;

    public TodoServiceImpl(TodoService todoService){
        this.todoService = todoService;
    }

    public List<String> retrieveTodoRelatedToSpring(String user){
        List<String> list =todoService.retrieveTodos(user);
        return  list.stream().filter(x->x.contains("Spring")).collect(Collectors.toList());
    }

    public void deleteTodoNotRelatedWithSpring(String user){
        List<String> todoList = todoService.retrieveTodos("Dummy");
        for(String todo : todoList){
            if(!todo.contains("Spring")){
                todoService.deleteTodos(todo);
            }
        }
    }
}
