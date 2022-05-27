package hooks;
//bir çok feature olduğunda butun feature ayağa kaldırmak için maven clean intall etmeden istenilen feature çalıştırmak için )
//cucumber optionlarını yapmak için

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features"},// feature path verildiği yer
        glue = {"steps"}, // stepdef içerisindekileri belirtiyoruz
        tags = "@login",
        monochrome=true,
        plugin = {"pretty", "html:target/cucumber"} // html pluggin, html rapor verebilecek istenilen brow açılabilir.
)
public class Runner extends AbstractTestNGCucumberTests {

}
