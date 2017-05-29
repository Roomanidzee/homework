import org.junit.Assert;
import org.junit.Test;
import processing.WorkingWithFiles;

import java.nio.file.Path;

public class ProjectTests {

    @Test
    public void checkEncoding(){

        WorkingWithFiles work = new WorkingWithFiles();

        String result = work.getEncoding();

        Assert.assertNotEquals(result, null, "UTF-8");

    }

    @Test
    public void checkDirectory(){

        WorkingWithFiles work = new WorkingWithFiles();

        Path path = work.getDirectory();

        Assert.assertNotEquals(path.toString(), null, work.getDirectory());

    }

    @Test
    public void checkCounter(){

        WorkingWithFiles work = new WorkingWithFiles();

        Path path = work.getCounter();

        Assert.assertNotEquals(path.toString(), null, work.getCounter());

    }

}

