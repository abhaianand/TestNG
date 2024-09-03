package TestNG_listners_ExtendReport;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerManager implements ITestListener {
    public void onStart(ITestContext context) {

        System.out.println("before starting all the test case....!");
    }
    public void onTestStart(ITestResult result) {
        System.out.println("before testing test case....!");
    }
    public void onTestSuccess(ITestResult result) {
        System.out.println("successfully run the test case....!");
    }
    public void onTestFailure(ITestResult result) {
        System.out.println("Test case fail...!");
    }
    public void onTestSkipped(ITestResult result) {

        System.out.println("Testcase skipped due to some reason....!");
    }
    public void onFinish(ITestContext context) {

        System.out.println("after completed all the testing...!");
    }
}
