/************************************************************************
 * Purpose : Pojo model for State code csv file
 * Entries in state code csv file will be made as objects of this class
 * @author Hrishikesh Ugavekar
 * @Since 30-06-2021
 * @Version 1.1
 *********************************************************************/
package model;
public class IndianStateCodeCsvModel {
	
	int serialNumber;
	String stateName;
	int tin;
	String stateCode;
	
	public IndianStateCodeCsvModel(int serialNumber, String stateName, int tin, String stateCode) {
		this.serialNumber = serialNumber;
		this.stateName = stateName;
		this.tin = tin;
		this.stateCode = stateCode;
	}
	
	

}
