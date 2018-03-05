package assingments1;


import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import assingments.AsterisksGenerator;
public class Assingments1Test {
    AsterisksGenerator asterisks;
    @Before
    public void setUp(){
        asterisks = new AsterisksGenerator();
    }

    @Test
    public void printOneAsteriskTest(){

        String asterisk = asterisks.printOneAsterisk();
        Assert.assertEquals("*", asterisk);
    }
    @Test
    public void printHorizontalLineTest(){
        String horizontalLine = asterisks.printHorizontalLine(3);
        Assert.assertEquals("***", horizontalLine);
    }
    @Test
    public void printVerticalLineTest(){
        String asterisk = asterisks.printVerticalLine(3);
        Assert.assertEquals("*\n*\n*\n", asterisk);
    }
    @Test
    public void drawRightTriangleTest(){
        String triangle = asterisks.drawRightTriangle(3);
        Assert.assertEquals("*\n**\n***\n", triangle);
    }
    @Test
    public void drawIsoscelesTriangleTest(){
        String isocelesTriangle = asterisks.drawIsocelesTriangle(3);
        Assert.assertEquals("   *\n" +
                "  ***\n" +
                " *****\n", isocelesTriangle);

    }
    @Test
    public void drawDiamondTest(){
        String diamond = asterisks.drawDiamond(3);
        Assert.assertEquals("", diamond);
    }
    @Test
    public void drawDiamondWithNameTest(){
        String diamond = asterisks.drawDiamondWithName(4);
        Assert.assertEquals("", diamond);
    }
}
