import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class MarkdownParseTest {
    //declare a test method
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

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
 
 /*@Test 
 public void Testgetlink3()throws IOException{

    Path fileName = Path.of("test-file3.md");
	String contents = Files.readString(fileName);
    ArrayList<String> links = MarkdownParse.getLinks(contents);
    assertEquals(List.of("rocknroll.com","wowcserocks.com","profpolitzisprettychill.com","gotritons.edu"),links);
 }
 */
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
 
 @Test
 public void TestSnippet1()throws IOException{
    Path fileName = Path.of("snippet1.md");
	String contents = Files.readString(fileName);
    ArrayList<String> links = MarkdownParse.getLinks(contents);
    assertEquals(List.of("'google.com","google.com", "ucsd.edu"),links);
 }

 @Test
 public void TestSnippet2()throws IOException{
    Path fileName = Path.of("snippet2.md");
	String contents = Files.readString(fileName);
    ArrayList<String> links = MarkdownParse.getLinks(contents);
    assertEquals(List.of("a.com","a.com(())", "example.com"),links);
 }

 @Test
 public void TestSnippet3()throws IOException{
    Path fileName = Path.of("snippet3.md");
	String contents = Files.readString(fileName);
    ArrayList<String> links = MarkdownParse.getLinks(contents);
    assertEquals(List.of("https://www.twitter.com ","https://ucsd-cse15l-w22.github.io/", "https://cse.ucsd.edu/"),links);
 }

}

