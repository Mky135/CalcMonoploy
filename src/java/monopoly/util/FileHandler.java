package monopoly.util;


import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * A class to ease the handling of files
 */
public class FileHandler
{
    private File file;

    public FileHandler(URI uri)
    {
        file = new File(uri);
    }

    public String getLine(int line)
    {
        try
        {
            return  Files.readAllLines(Paths.get(file.getPath())).get(line);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
