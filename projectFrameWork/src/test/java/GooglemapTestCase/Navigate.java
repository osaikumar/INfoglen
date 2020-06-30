package GooglemapTestCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.infoglen.ObjectRepository.HomePageClass;
import com.infoglen.genericLib.BaseClass;
@Test
public class Navigate extends BaseClass {

	HomePageClass hp= PageFactory.initElements(driver, HomePageClass.class);
	
}
