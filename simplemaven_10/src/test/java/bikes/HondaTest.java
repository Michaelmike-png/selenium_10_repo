package bikes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HondaTest {
	@Test
	public void lunchhonda() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.heromotocorp.com/");
		Reporter.log("honda is launched",true);
		Reporter.log("modified launched",true);

}
}
