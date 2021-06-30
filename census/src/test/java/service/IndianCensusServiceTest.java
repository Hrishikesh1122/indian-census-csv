package service;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IndianCensusServiceTest {
	IndianCensusService census = null;
	
	@Before
	public void setUp() {
		census = new IndianCensusService();
	}

	@Test
	public void  given_IndianCensusCSVFile_ReturnsNumberOfRecords() throws CustomCsvException{
		int result = census.getSizeOfCsv("IndiaStateCensusData.csv");
		Assert.assertEquals(29, result);
	}

}
