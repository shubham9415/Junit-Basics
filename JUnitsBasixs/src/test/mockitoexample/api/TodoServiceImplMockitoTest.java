package mockitoexample.api;

import mockitoexample.api.impl.TodoServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TodoServiceImplMockitoTest {

    @Mock
    TodoService todoServiceMock;

    @InjectMocks
    TodoServiceImpl todoService;

    @Test
    public void retrieveTodoRelatedToSpringUsingMockito(){


        List<String> todoList = Arrays.asList("Spring MVC", "Spring Data JPA", "Spring Boot", "Data Analytics");
        when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todoList);
        Assert.assertEquals(3,todoService.retrieveTodoRelatedToSpring("Dummy").size());
    }


    @Test
    public void deleteTodoNotRelatedToSpringTest(){
        //Given
        List<String> todoList = Arrays.asList("Spring MVC", "Spring Data JPA", "Spring Boot", "Data Analytics");
        BDDMockito.given(todoServiceMock.retrieveTodos("Dummy")).willReturn(todoList);

        //When
        todoService.deleteTodoNotRelatedWithSpring("Dummy");

        //then
        verify(todoServiceMock).deleteTodos("Data Analytics");
    }
}
