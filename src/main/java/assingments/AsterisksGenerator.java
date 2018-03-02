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
        for(int i = 1; i <= n; i++){
            isocelesTriangle.append(drawHorizontalLineWithSpaces(n - i, (2*i - 1)) + "\n");
        }
        return isocelesTriangle.toString();
    }

    public String drawDiamond(int n){
        StringBuffer diamond  =  new StringBuffer();
        diamond.append(drawIsocelesTriangle(n));
        diamond.append(drawInvertedTriangle(n));
        return diamond.toString();
    }
    public String drawDiamondWithName(int n){
        StringBuffer diamond  =  new StringBuffer();
        diamond.append(drawIsocelesTriangle(n - 1));
        diamond.append("Gabriel\n");
        diamond.append(drawInvertedTriangle(n));
        return diamond.toString();
    }
    //private functions
    private String drawInvertedTriangle(int n){
        StringBuffer invertedTriangle  =  new StringBuffer();
        for(int i = n-1; i >= 1; i--){
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
