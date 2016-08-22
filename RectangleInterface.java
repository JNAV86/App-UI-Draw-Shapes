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
Interface for a rectangle to be drawn on the screen.
*/

public interface RectangleInterface extends ShapeInterface {

 /**
Sets the rectangle's dimensions.
*/
public void set(int newHeight, int newWidth);
    
}
