package mockitoexample.ListInterface;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mockito;

import java.util.List;


public class ListInterfaceTest {

    @Test
    public void listInterfaceTest(){
        List ls = Mockito.mock(List.class);
        Mockito.when(ls.size()).thenReturn(2);
        Assert.assertEquals(2, ls.size());
    }

    @Test
    public void listInterfaceTest2(){
        List<String> ls = Mockito.mock(List.class);
        Mockito.when(ls.get(Matchers.anyInt())).thenThrow(new RuntimeException("Something has Happend"));
    }


}
