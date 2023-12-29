package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC001_LogInStepDefiniton {
	@Given("user is on Home Page")
	public void user_is_on_home_page() {
		System.out.println("Launch Rediff");
	}
	@When("user enters user name")
	public void user_enters_user_name() {
	   System.out.println("Enter User Name");
	   System.out.println("Ensure you enter a valid name");
	}
	@And("user enters password")
	public void user_enters_password() {
	   System.out.println("Enter Password");
	   System.out.println("Ensure you enter the correct password");
	}
	@And("clicks on submit button")
	public void clicks_on_submit_button() {
	    System.out.println("Click Submit Button");
	}
	@Then("validate User and display message as successful")
	public void validate_user_and_display_message_as_successful() {
	    System.out.println("Validates User and Displays Message as Log In Successful");
	}
	@And("close") 
	public void close() {
	   System.out.println("Closes Browser");
	}


}
