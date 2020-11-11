package mockitoexample.api.stub;

import mockitoexample.api.TodoService;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService {

    @Override
    public List<String> retrieveTodos(String user) {
        return Arrays.asList("Learning Spring MVC", " Spring Boot", "Data Analytics");
    }

    @Override
    public void deleteTodos(String user) {

    }

}
