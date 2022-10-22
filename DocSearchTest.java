import static org.junit.Assert.*;

import java.net.URI;

import org.junit.*;

public class DocSearchTest {
    @Test
    public void testHandleURL() {
        // no idea why handler even is taking an argument now, it wasn't like this in the lecture, nor was it like this in wavelet
        Handler testHandler = new Handler(""); //don't know what to put here
        URI rootPath = new URI("http://localhost/"); //put this in only cause it looked like what was done in the lecture
        assertEquals("Don't know how to handle that path!", testHandler.handleRequest(rootPath));
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