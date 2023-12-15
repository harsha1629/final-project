package com.runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(plugin = "json:target/cucumber-report.json",features="C:\\Users\\hviswanathan\\eclipse-workspace\\Purple_Rangers-Pilot_Project\\SportsJam\\src\\test\\resources\\Features",
glue="com.StepDefinition")

public class TestCreateAccountTestNG extends AbstractTestNGCucumberTests{

}
