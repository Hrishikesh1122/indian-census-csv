package helper;

import model.IndianCensusCSVModel;

public class ObjectBuilder {
	
	public static IndianCensusCSVModel createObjectOfIndianCensus(String[] data) {
		String state = data[0];
		int population = Integer.parseInt(data[1]);
		int areaPerSqKm = Integer.parseInt(data[2]);
		int densityPerSqKm = Integer.parseInt(data[3]);
		
		return new IndianCensusCSVModel(state,population,areaPerSqKm,densityPerSqKm);
		
	}

}
