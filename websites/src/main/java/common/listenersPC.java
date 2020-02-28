package common;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listenersPC extends browsers implements ITestListener {
public void onTestSuccess(ITestResult result) {
	try {
		screenshots();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
public void onTestFailure(ITestResult result) {
	try {
		screenshots();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
