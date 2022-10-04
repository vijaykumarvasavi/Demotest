 package libraryfiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Notepaddata {

	public String getnotefilepath(String key) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream file = new FileInputStream(Pathstorage.notepad);
		Properties pre1 = new Properties();
		pre1.load(file);
		String valuve = pre1.getProperty(key);
		return valuve;

	}

}
