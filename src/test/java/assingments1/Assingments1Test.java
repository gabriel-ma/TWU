package assingments1;


import org.junit.Assert;
import org.junit.Test;
import assingments.AsterisksGenerator;
public class Assingments1Test {
    @Test
    public void printOneAsteriskTest(){
        AsterisksGenerator asterisks = new AsterisksGenerator();
        String asterisk = asterisks.printOneAsterisk();
        Assert.assertEquals("*", asterisk);
    }
    @Test
    public void printHorizontalLineTest(){
        AsterisksGenerator asterisks = new AsterisksGenerator();
        String horizontalLine = asterisks.printHorizontalLine(3);
        Assert.assertEquals("***", horizontalLine);
    }
}