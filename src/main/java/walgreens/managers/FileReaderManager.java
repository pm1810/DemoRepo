package walgreens.managers;

import java.io.IOException;

import myCommonUtilities.ConfigFileReader;

public class FileReaderManager {

/*	private WebDriver driver;
	private CommonUtilities commonUtilitiespage;
	private ConfigFileReader cfr;
	
	
	public FileReaderManager(WebDriver driver) {
		this.driver = driver;
	}

	public ConfigFileReader getConfigReader(){
		return (cfr == null) ? cfr = new ConfigFileReader(driver): cfr;
		
	}*/


private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static ConfigFileReader configFileReader;

	public static FileReaderManager getInstance() {
		return fileReaderManager;
	}

	public ConfigFileReader getConfigFileReader() throws IOException {

		return (configFileReader == null) ? configFileReader = new ConfigFileReader() : configFileReader;
	}
}
