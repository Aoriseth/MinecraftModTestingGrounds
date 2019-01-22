import org.junit.Test;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;

import static org.junit.Assert.assertTrue;

public class itemTests {

    private String dir="src/main/java/mcjty/modtut";


    @Test
    public void printClassPath(){
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        URL[] urls = ((URLClassLoader) cl).getURLs();
        for (URL url: urls) {
            System.out.println(url.getFile());
        }
    }

    @Test
    public void mushTest(){
        String name = "Mush";
        File file = new File(dir+"/items/"+name+"Item.java");
        System.out.println(file.getAbsolutePath());
        assertTrue(file.exists());


    }
}
