package TestNG_listners_ExtendReport;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;
public class Extendreport_Manager implements ITestListener {
    public ExtentSparkReporter sparkreport; //UI of the report
    public ExtentReports extent; // common project information
    public ExtentTest test;//creating test case entry and update status of the test methods
    public void onStart(ITestContext context) {
        sparkreport = new ExtentSparkReporter(System.getProperty("user.dir") + "/reports/myreport.html"); // mark the location for report save
        sparkreport.config().setDocumentTitle("AUTOMATION REPORT"); //TITLE  of the report
        sparkreport.config().setReportName("Functional Testing"); //name of the report
        sparkreport.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.attachReporter(sparkreport);

        extent.setSystemInfo("computer name", "localhost");
        extent.setSystemInfo("Env", "QA");
        extent.setSystemInfo("Tester name", "ABHAI");
        extent.setSystemInfo("OS", "wind10");
        extent.setSystemInfo("Browser", "chrome");
    }
        public void onTestSuccess(ITestResult result) {

            test = extent.createTest(result.getName()); //create new entry in the report
            test.log(Status.PASS,"Test case PASSED is : "+result.getName()); //update status pass /fail/skipped,getName return the result data, result located the result
        }
        public void onTestFailure(ITestResult result) {
            test = extent.createTest(result.getName()); //create new entry in the report
            test.log(Status.FAIL,"Test case FAILED is : "+result.getName()); //update status pass /fail/skipped
            test.log(Status.FAIL,"Test case FAILED due to : "+result.getThrowable());//result locate the result and getthrows return the console error
        }
        public void onTestSkipped(ITestResult result) {

            test = extent.createTest(result.getName()); //create new entry in the report
            test.log(Status.SKIP,"Test case SKIPS is : "+result.getName());//update status pass /fail/skipped,getName return the result data, result located the result
        }
    public void onFinish(ITestContext context) {
        extent.flush();
    }
}
