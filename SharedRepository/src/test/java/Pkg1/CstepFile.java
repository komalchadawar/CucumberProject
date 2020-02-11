package Pkg1;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CstepFile {
	

	@Given("I enter 50 in claculator")
	public void fun1()
	{
		System.out.println("I enter 50 in claculator");
	}
	
	@And("I press Add")
	public void fun2()
	{
		System.out.println("I press Add");
	}
	
	@And("I have enter 50 in claculator")
	public void funm3()
	{
		System.out.println("I have enter 50 in claculator");
	}
	
	@When("I press equal symbol")
	public void fun4()
	{
		System.out.println("I press equal symbol");
	}
	
	@Then("the result should be 100 on the system")
	public void fun5()
	{
		System.out.println("the result should be 100 on the system");
	}

}
