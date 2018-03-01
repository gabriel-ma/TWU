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
    @Test
    public void printVerticalLineTest(){
        AsterisksGenerator asterisks  = new AsterisksGenerator();
        String asterisk = asterisks.printVerticalLine(3);
        Assert.assertEquals("*\n*\n*\n", asterisk);
    }
    @Test
    public void drawRightTriangleTest(){
        AsterisksGenerator asterisks = new AsterisksGenerator();
        String triangle = asterisks.drawRightTriangle(3);
        Assert.assertEquals("*\n**\n***\n", triangle);
    }
}
