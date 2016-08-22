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
Interface for simple shapes drawn on
the screen using keyboard characters.
*/

public interface ShapeInterface {
/**
Sets the offset for the shape.
*/
public void setOffset(int newOffset);
/**
Returns the offset for the shape.
*/
public int getOffset();
/**
Draws the shape at lineNumber lines down
from the current line.
*/
public void drawAt(int lineNumber);
/**
Draws the shape at the current line.
*/
public void drawHere();

}
