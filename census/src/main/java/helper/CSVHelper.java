/************************************************************
 * Purpose : This Helper class performs basic csv operations
 * 			like reading and writing a csv file.
 * @author Hrishikesh Ugavekar
 * @Version 1.0
 * @since 30-06-2021
 *
 ************************************************************/
package helper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.IndianCensusCSVModel;
import model.IndianStateCodeCsvModel;
import service.CustomCsvException;

public class CSVHelper<E> {
	
	/**
	 * @param csvFilepath
	 * @return List of contents of CSV file
	 * @throws CustomCsvException
	 */
	public static List<IndianCensusCSVModel> readIndianCensusCsv(String csvFilepath) throws CustomCsvException{
		List<IndianCensusCSVModel> returnList = new ArrayList<>();
		try(BufferedReader reader = new BufferedReader(new FileReader(csvFilepath)))
		{
			@SuppressWarnings("unused")
			String headerLine = reader.readLine();
			String line = reader.readLine();
			while(line != null) {
				String[] attributes = line.split(",");
				IndianCensusCSVModel csvmodel = ObjectBuilder.createObjectOfIndianCensus(attributes);
				returnList.add(csvmodel);
				line = reader.readLine();
			}
		}
		catch(IOException e) {
			throw new CustomCsvException(e.getMessage(),CustomCsvException.ExceptionType.INCORRECT_FILE);
		}
		catch(RuntimeException e) {
			throw new CustomCsvException(e.getMessage(),CustomCsvException.ExceptionType.IMPROPER_CSV);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return returnList;
	}
	
	
	/**
	 * @param csvFilepath of State code csv file
	 * @return List of contents from csv file
	 * @throws CustomCsvException
	 */
	public static List<IndianStateCodeCsvModel> readIndianStateCodeCsv(String csvFilepath) throws CustomCsvException{
		List<IndianStateCodeCsvModel> returnList = new ArrayList<>();
		try(BufferedReader reader = new BufferedReader(new FileReader(csvFilepath)))
		{
			@SuppressWarnings("unused")
			String headerLine = reader.readLine();
			String line = reader.readLine();
			while(line != null) {
				String[] attributes = line.split(",");
				IndianStateCodeCsvModel csvmodel = ObjectBuilder.createObjectOfIndianStateCode(attributes);
				returnList.add(csvmodel);
				line = reader.readLine();
			}
		}
		catch(IOException e) {
			throw new CustomCsvException(e.getMessage(),CustomCsvException.ExceptionType.INCORRECT_FILE);
		}
		catch(RuntimeException e) {
			throw new CustomCsvException(e.getMessage(),CustomCsvException.ExceptionType.IMPROPER_CSV);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return returnList;
	}
}
