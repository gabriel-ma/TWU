package assingments1;


import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import assingments.AsterisksGenerator;

import java.util.Arrays;

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
        String diamond = asterisks.drawDiamondWithName(3);
        Assert.assertEquals("", diamond);
    }

    @Test
    public void fizzBuzzTest(){
        String fizzBuzz = asterisks.fizzBuzzGame();
        Assert.assertEquals("1\n" +
                "2\n" +
                "Fizz\n" +
                "4\n" +
                "Buzz\n" +
                "Fizz\n" +
                "7\n" +
                "8\n" +
                "Fizz\n" +
                "Buzz\n" +
                "11\n" +
                "Fizz\n" +
                "13\n" +
                "14\n" +
                "FizzBuzz", fizzBuzz);
    }
    @Test
    public void primeFactorsTest(){
        Assert.assertEquals(Arrays.asList(2,3,5), asterisks.getPrimeFactors(30));
    }
}
