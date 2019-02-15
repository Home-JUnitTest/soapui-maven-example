//import com.eviware.SoapUI.tools.SoapUITestCaseRunner;

import javafx.animation.Animation;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;
import org.junit.Test;
import org.springframework.xml.XmlException;

import java.io.IOException;

public class SoapUITestCase {
//    SoapUITestCaseRunner SoapUITestCaseRunner = new SoapUITestCaseRunner();
//    SoapUITestCaseRunner.setProjectFile("src/test/resources/WeatherSoapTest-SoapUI-project.xml");
//    SoapUITestCaseRunner.setProjectProperties(prop);
//    SoapUITestCaseRunner.setTestSuite("TestSuite 1");
//    SoapUITestCaseRunner.setTestCase("TestCase 1");
//    SoapUITestCaseRunner.run();

    private static final String TEST_FILE = "src/test/resources/REST-Project-1-soapui-project.xml";

    @Test
    public void shouldExecuteAllTestCases() throws Exception {
        SoapUITestCaseRunner soapUITestCaseRunner = new SoapUITestCaseRunner();
        soapUITestCaseRunner.setProjectFile(TEST_FILE);
        soapUITestCaseRunner.run();
        //No asserts in this mode
    }

    @Test
    public void shouldExecuteSpecificTestCase() throws XmlException, IOException, SoapUIException {
        // given
        WsdlProject project = new WsdlProject(TEST_FILE);
        TestSuite testSuite = project.getTestSuiteByName("TestSuite");
        TestCase testCase = testSuite.getTestCaseByName("TestCase");
        for (int i = 0; i < 10; i++) {
            PropertiesMap propertiesMap = new PropertiesMap();
            //Sets parameter defined in Soap UI teste case
            testCase.setPropertyValue("name", "aName_" + i);
            TestRunner runner = testCase.run(propertiesMap, false);
            assertEquals(Animation.Status.FINISHED, runner.getStatus());
        }
    }

}