package assingments;

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
    public String drawRightTriangle(int n){
        StringBuffer asteriksTriangle = new StringBuffer();
        for(int i = 1; i <= n; i++)
            asteriksTriangle.append(printHorizontalLine(i) + "\n");
        return asteriksTriangle.toString();
    }
}
