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
