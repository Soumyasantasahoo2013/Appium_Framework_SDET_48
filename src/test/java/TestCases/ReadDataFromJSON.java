package TestCases;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

public class ReadDataFromJSON {
	
	@Test
	public void readData() throws Throwable
	{
		//Step=1 Convert physical file into java reference
		FileReader fr=new FileReader("./JSONData.json");
		
		//Step=2 Convert JSON into Java object
		JSONParser jp=new JSONParser();
		Object jobj = jp.parse(fr);
		
		//Step=3 Read Data
		HashMap hp = (HashMap)jobj;
		String name = (String) hp.get("Name");
		System.out.println(name);
	}

}
