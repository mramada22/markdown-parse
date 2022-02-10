import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


<<<<<<< HEAD
public class MarkdownParseTest {
    //declare a test method
=======

public class MarkdownParseTest {
>>>>>>> d7c3228536903149a218a9428cb479cacc713b6a
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

<<<<<<< HEAD
@Test 
 public void Testgetlinks()throws IOException{

    Path fileName = Path.of("test-file.md");
	String contents = Files.readString(fileName);
    ArrayList<String> links = MarkdownParse.getLinks(contents);
    assertEquals(List.of("https://something.com","some-page.html"),links);
 }
 
 @Test 
 public void Testgetlink2()throws IOException{

    Path fileName = Path.of("test-file2.md");
	String contents = Files.readString(fileName);
    ArrayList<String> links = MarkdownParse.getLinks(contents);
    assertEquals(List.of("something.in"),links);
 }
 
 @Test 
 public void Testgetlink3()throws IOException{

    Path fileName = Path.of("test-file3.md");
	String contents = Files.readString(fileName);
    ArrayList<String> links = MarkdownParse.getLinks(contents);
    assertEquals(List.of("rocknroll.com","wowcserocks.com","profpolitzisprettychill.com","gotritons.edu"),links);
 }
 
 @Test 
 public void Testgetlink4()throws IOException{
    Path fileName = Path.of("test-file4.md");
	String contents = Files.readString(fileName);
    ArrayList<String> links = MarkdownParse.getLinks(contents);
    assertEquals(List.of(),links);
 }
 @Test
 public void Testgetlink5()throws IOException{
    Path fileName = Path.of("test-file6.md");
	String contents = Files.readString(fileName);
    ArrayList<String> links = MarkdownParse.getLinks(contents);
    assertEquals(List.of(),links);
 }
 
 
}

=======
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
>>>>>>> d7c3228536903149a218a9428cb479cacc713b6a
