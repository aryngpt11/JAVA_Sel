package TestNGIntro;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.ITestContext;

public class Listeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test failed: " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test skipped: " + result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Test failed but within success percentage: " + result.getName());
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("Test failed due to timeout: " + result.getName());
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test context started: " + context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test context finished: " + context.getName());
    }
}
