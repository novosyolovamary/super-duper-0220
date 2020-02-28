package testingPCcatalog;

import org.testng.annotations.Test;

import common.browsers;
import pagesPC.PCcatalog;

public class TestDownloadErrorMSG extends browsers {
  @Test
  public void f() throws InterruptedException {
	  PCcatalog download= new PCcatalog(driver);
		download.PassField("bubu");
		download.Downloading();
		download.GetErrorMessage();
  }
}
