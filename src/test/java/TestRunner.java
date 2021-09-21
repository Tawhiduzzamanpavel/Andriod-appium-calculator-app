import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestRunner extends BasePage {
    TestCase objTest;

    public TestRunner() throws IOException, InterruptedException {
    }

    @Test
    public void runApp() throws IOException, InterruptedException {
        objTest=new TestCase();
        String res =objTest.doSum();
        Assert.assertEquals(res,"12");
    }
    @Test
    public void runApp1() throws IOException, InterruptedException {
        objTest=new TestCase();
        String res =objTest.doSubtraction();
        Assert.assertEquals(res,"6");

    }
    @Test
    public void runApp2() throws IOException, InterruptedException {
        objTest=new TestCase();
        String res =objTest.doMultiplication();
        Assert.assertEquals(res,"35");

    }
    @Test
    public void runApp3() throws IOException, InterruptedException {
        objTest=new TestCase();
        String res =objTest.doDivision();
        Assert.assertEquals(res,"5");

    }
}
