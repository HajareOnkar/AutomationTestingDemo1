package Runner;

import genericLib.BaseClass;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="Featerfiles",
        glue={"stepDefs","Hooks"},
        plugin="rerun:target/failedTc.txt"
		)
public class RunnerClass extends BaseClass{

}
