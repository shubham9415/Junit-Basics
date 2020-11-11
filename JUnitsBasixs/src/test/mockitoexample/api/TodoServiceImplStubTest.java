package mockitoexample.api;

import mockitoexample.api.impl.TodoServiceImpl;
import mockitoexample.api.stub.TodoServiceStub;
import org.junit.Assert;
import org.junit.Test;

public class TodoServiceImplStubTest {

    @Test
    public void retrieveTodoRelatedToSpringTest(){
        TodoService todoService = new TodoServiceStub();
        TodoServiceImpl todoServiceimpl =  new TodoServiceImpl(todoService);
        todoServiceimpl.retrieveTodoRelatedToSpring("ss").stream().forEach(x-> System.out.println(x));
        Assert.assertEquals(2,todoServiceimpl.retrieveTodoRelatedToSpring("shubhmah").size());
    }

}
