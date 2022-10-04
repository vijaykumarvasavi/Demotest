package Library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Notepad {
	
	
	public String getnotepaddata(String key) throws Exception  {		
		
		FileInputStream file = new FileInputStream(Pathdata.data);
		Properties per = new Properties();
		per.load(file);
		String value =  per.getProperty(key);
		return(value);
		
		
		
	}

}
