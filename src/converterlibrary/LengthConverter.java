/*****
 * Converter library 
 * developed by
 * C. Obed Otto.
 * 
 */
package converterlibrary;

/****
 * Program for length conversion
 * @author obedotto
 *  obedotto@saveetha.ac.in
 */
public class LengthConverter {
	
	public static double inchToMills(double inch)
	{
		double mills;
		
			mills=inch*1000.0;
		return mills;
	}
	
	public static double millsToInch(double mills)
	{
		double inch;
		
			inch=mills/1000.0;
		return inch;
	}	

}
