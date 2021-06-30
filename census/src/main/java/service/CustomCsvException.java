/***************************************************************************
 * Purpose : Custom Exception Class to throw Custom Exception messages.
 * @author Hrishikesh
 * @Since 30-06-2021
 * @Version 1.0 
 ***************************************************************************/
package service;
public class CustomCsvException extends Exception{

	public CustomCsvException(String message) {
		super(message);
	}
	

}
