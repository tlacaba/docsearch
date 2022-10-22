import static org.junit.Assert.*;

import java.net.URI;

import org.junit.*;

public class DocSearchTest {
    @Test
    public void testHandleURL() {
        // no idea why handler even is taking an argument now, it wasn't like this in the lecture.
        Handler testHandler = new Handler("");
        URI basePath = new URI("http://localhost/");
        assertEquals("Don't know how to handle that path!", testHandler.handleRequest(basePath));
    }
}
/*
public class ListTests {
    @Test
    public void testFilter() {
        List<String> input1 = new ArrayList<String>();
        List<String> expected = new ArrayList<String>();
        assertEquals(expected, ListExamples.filter(input1, new StartsWithCapital()));
    }
}
*/