/************************************************************************
 * Purpose : Builds objcet of the entries from csv file.
 * @author Hrishikesh Ugavekar
 * @Since 30-06-2021
 * @Version 1.1
 *********************************************************************/
package helper;
import model.IndianCensusCSVModel;
import model.IndianStateCodeCsvModel;

public class ObjectBuilder {
	
	/**
	 * @param data
	 * @return object of IndianCensus pojo
	 */
	public static IndianCensusCSVModel createObjectOfIndianCensus(String[] data) {
		String state = data[0];
		int population = Integer.parseInt(data[1]);
		int areaPerSqKm = Integer.parseInt(data[2]);
		int densityPerSqKm = Integer.parseInt(data[3]);
		
		return new IndianCensusCSVModel(state,population,areaPerSqKm,densityPerSqKm);
	}
	
	/**
	 * @param data
	 * @return object of State code pojo
	 */
	public static IndianStateCodeCsvModel createObjectOfIndianStateCode(String[] data) {
		int serialNumber = Integer.parseInt(data[0]);
		String stateName = data[1];
		int tin = Integer.parseInt(data[2]);
		String stateCode = data[3];
		
		return new IndianStateCodeCsvModel(serialNumber,stateName,tin,stateCode);
		
	}

}
