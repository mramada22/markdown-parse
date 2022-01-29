import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;



public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testMarkdownParse() throws IOException{
        Path fileName = Path.of("Test-file.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of("https://something.com","some-page.html"),links);
    }

    @Test
    public void testMarkdownParse2() throws IOException{
        Path fileName = Path.of("Test-file2.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of("something.in"), links);
    }

    @Test
    public void testMarkdownParse3() throws IOException{
        Path fileName = Path.of("Test-file3.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of("https://someurl.com","https://another.com","https://oops.com"), links);
    }

    @Test
    public void testMarkdownParse4() throws IOException{
        Path fileName = Path.of("Test-file4.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of(), links);
    }
}

//