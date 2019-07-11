/*****
 * Converter library 
 * developed by
 * C. Obed Otto.
 * obedotto@saveetha.ac.in
 */

package converterlibrary;

public class AreaConverter {
	
	public static double squareFeetToGround(double feet)
	{
		double ground;
			ground=feet/2400.0;
		return ground;
	}
	
	public static double groundToSquareFeet(double ground)
	{
		double feet;
			feet=ground*2400.0;
		return feet;
	}
}
