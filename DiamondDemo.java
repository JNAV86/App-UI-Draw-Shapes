/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package UIDrawShapes;

/**
*
* @author Home User
*/
/**
A program that draws a fir tree composed of a triangle and
a rectangle, both drawn using keyboard characters.
*/
public class DiamondDemo
{
    public static final int INDENT = 5;
    public static final int DIAMOND_WIDTH = 21;// must be odd

    
    public static void main(String[] args)
    {
        drawDiamond(DIAMOND_WIDTH);
    }

    public static void drawDiamond(int topWidth)
    {

        TriangleInterface diamondTop = new Triangle(INDENT, topWidth);
        drawTop(diamondTop);
    }
    
    private static void drawTop(TriangleInterface diamondTop)
    {
        diamondTop.drawAt(1);
    }
}
