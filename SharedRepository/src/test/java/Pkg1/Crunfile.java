package Pkg1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"json:src/test/java/Repository/output/cucu.json"})
public class Crunfile {

}
