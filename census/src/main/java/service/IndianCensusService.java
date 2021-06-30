/************************************************************
 * Purpose : To perform required operations on csv data
 * @author Hrishikesh Ugavekar
 * @Version 1.0
 * @since 30-06-2021
 *
 ************************************************************/
package service;
import java.util.List;
import helper.CSVHelper;
import model.IndianCensusCSVModel;
import model.IndianStateCodeCsvModel;

public class IndianCensusService {
	
	private List<IndianCensusCSVModel> censuslist ;
	private List<IndianStateCodeCsvModel> stateCodeList;
	/**
	 * @param csvFilePath
	 * @return number of entries in census csv file.
	 * @throws CustomCsvException
	 */
	public int getSizeOfCsv(String csvFilePath) throws CustomCsvException {
		censuslist = CSVHelper.readIndianCensusCsv(csvFilePath );
		return censuslist.size();
	}
	
	/**
	 * @param csvFileParth
	 * @return number of entries in State code csv file
	 * @throws CustomCsvException
	 */
	public int getSizeOfIndianStateCodeCsv(String csvFileParth) throws CustomCsvException {
		stateCodeList = CSVHelper.readIndianStateCodeCsv(csvFileParth);
		return stateCodeList.size();
	}
}
