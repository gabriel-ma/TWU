package assingments;

import java.io.StringWriter;

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
        isocelesTriangle.append(padLeft(" ", n) + printOneAsterisk() + "\n");
        for(int i = 1, j= 1; j < n; i = i+2, j++)
            isocelesTriangle.append(padLeft(" ", n - j) + printHorizontalLine(i + 2)+ "\n");
        return isocelesTriangle.toString();
    }


    public static String padLeft(String s, int n) {
        if(n == 0) return "";
        else return String.format("%1$" + n + "s", s);
    }
}
