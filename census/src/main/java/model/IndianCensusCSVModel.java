/************************************************************************
 * Purpose : Pojo model for Census csv file
 * Entries in state code csv file will be made as objects of this class
 * @author Hrishikesh Ugavekar
 * @Since 30-06-2021
 * @Version 1.1
 *********************************************************************/
package model;
public class IndianCensusCSVModel {
	
	public String state;
	public int population;
	public int areaPerSqKm;
	public int densityPerSqKm;
	
	
	public IndianCensusCSVModel(String state, int population, int areaPerSqKm, int densityPerSqKm) {
		this.state = state;
		this.population = population;
		this.areaPerSqKm = areaPerSqKm;
		this.densityPerSqKm = densityPerSqKm;
	}

}
