package assingments;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class AsterisksGenerator {
    public String printOneAsterisk(){
        return "*";
    }
    public String printHorizontalLine(int n){
        StringBuffer asteriksLine = new StringBuffer();
        for (int i = 1; i <= n; i++)
            asteriksLine.append("*");
        return asteriksLine.toString();

    }
    public String printVerticalLine(int n){
        StringBuffer asteriskVerticalLine = new StringBuffer();
        for(int i = 1; i <= n; i++){
            asteriskVerticalLine.append(printOneAsterisk() + "\n");
        }
        return asteriskVerticalLine.toString();
    }
    public String drawRightTriangle(int n){
        StringBuffer asteriksTriangle = new StringBuffer();
        for(int i = 1; i <= n; i++)
            asteriksTriangle.append(printHorizontalLine(i) + "\n");
        return asteriksTriangle.toString();
    }

    public String drawIsocelesTriangle(int n){
        StringBuffer  isocelesTriangle = new StringBuffer();
        for(int i = 1; i <= n; i++){
            isocelesTriangle.append(drawHorizontalLineWithSpaces(n - i, (2*i - 1)) + "\n");
        }

        return isocelesTriangle.toString();
    }

    public String drawDiamond(int n){
        StringBuffer diamond  =  new StringBuffer();
        ArrayList<String> invertedDiamond = new ArrayList<String>();
        invertedDiamond.addAll(Arrays.asList(drawInvertedTriangle(n).split("\n")));
        diamond.append(drawIsocelesTriangle(n));

        invertedDiamond.remove(0);

        diamond.append(String.join("\n", invertedDiamond));
        return diamond.toString();
    }
    public String drawDiamondWithName(int n){
        StringBuffer diamond  =  new StringBuffer();
        diamond.append(drawIsocelesTriangle(n-1));
        diamond.append("gabriel\n");
        diamond.append(drawInvertedTriangle(n-1));

        return diamond.toString();
    }

    public String fizzBuzzGame(){
        StringBuffer fizzBuzz = new StringBuffer();
        for(int i = 1; i <= 100; i++){
            fizzBuzz.append(getFizzBuzz(i) + "\n");
        }
        return fizzBuzz.toString();
    }
    public ArrayList<Integer> getPrimeFactors(int n){
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++){
            if (n % i == 0){
                primeFactors.add(i);
                n = n / i;
            }
        }
        return primeFactors;
    }
    //private functions
    private String getFizzBuzz(int n){
        if(getFizz(n) == 1 && getBuzz(n) == 1)
            return "FizzBuzz";
        else if(getFizz(n) == 1)
            return "Fizz";
        else if(getBuzz(n) == 1)
            return "Buzz";
        else
            return Integer.toString(n);
    }
    private int getFizz(int n){
        return (n % 3 == 0 ? 1 : 0);
    }
    private int getBuzz(int n){
        return (n % 5 == 0 ? 1 : 0);
    }
    private String drawInvertedTriangle(int n){
        StringBuffer invertedTriangle  =  new StringBuffer();
        for(int i = n; i >= 1; i--){
            invertedTriangle.append(drawHorizontalLineWithSpaces(n - i, (2*i - 1)) + "\n");
        }
        return invertedTriangle.toString();
    }
    private String drawHorizontalLineWithSpaces(int line, int lineSize){
        return padLeft(" ", line) + printHorizontalLine(lineSize);

    }

    private  String padLeft(String s, int n) {
        if(n == 0) return "";
        else return String.format("%1$" + n + "s", s);
    }
}
