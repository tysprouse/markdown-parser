import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MarkdownParseTest {

    @Test                                      // forces this method to be run
    public void addition() {                   // method declaration
        assertEquals(2, 1 + 1);        /* Uses the assertEquals method (from import)
                                                   to see check if the arguments are equal then
                                                   prints the result */
    }


    @Test
    public void testfile1() throws IOException {
        assertEquals(List.of("https://something.com", "some-thing.html"), MarkdownParse.getLinks(Files.readString(Path.of("test-file.md"))));
    }

}
