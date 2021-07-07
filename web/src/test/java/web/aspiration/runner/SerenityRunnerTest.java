package web.aspiration.runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
  
  @RunWith(Cucumber.class)
  
  
  @CucumberOptions(plugin = {"html:target/cucumberHtmlReport"}, features = "src/test/resources/tests", glue={"web.aspiration.steps"}) 
  public class  SerenityRunnerTest{
  
  } 

 
 