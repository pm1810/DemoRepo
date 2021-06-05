package walgreens.runners;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import walgreens.managers.FileReaderManager;


@CucumberOptions(
		features = {"src/test/resources/features/walgreens.feature"}, 
				glue = {"walgreens.stepDefinitions" }, 
				monochrome = true,
				dryRun = false,
				strict = true
		)


public class TestRunner extends AbstractTestNGCucumberTests {

	@AfterClass
	public static void writeExtentReport() throws IOException {

		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigFileReader().getReportConfigPath()));
		
		
	//	String str = System.getProperty("user.dir");
		//String filepath = str + "/src/test/resources/configs/extent-config.xml";
	//	Reporter.loadXMLConfig(filepath);
	}
	@BeforeClass
	public static void myMethod() {
		
	}
}
