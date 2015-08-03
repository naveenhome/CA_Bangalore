package test.java;

import main.java.Ride;
import main.java.RidePosting;
import junit.framework.TestCase;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberSteps extends TestCase {
	Ride ride = new Ride();
	String actionButton;
	@Given("^user has entered valid data$")
	public void user_has_entered_valid_data() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		ride.setDestination("Kormangala");
		ride.setSource("Airport Road");
		ride.setEmail("naveen.singh@leanpitch.com");
		ride.setPhone("9810547500");
		ride.setStartTime("5:30");
		ride.setEmpolyeeName("Naveen Kumar Singh");
	}
	@Given("^user has not entered valid data$")
	public void user_has_not_entered_valid_data() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		ride=null;
	}
	@Given("^user enter name as \"([^\"]*)\" and source as \"([^\"]*)\", destination as \"([^\"]*)\", time as \"([^\"]*)\" and email \"([^\"]*)\" and phone as \"([^\"]*)\"$")
	public void InvalidName(String userName, String src, String dest, String time, String email, String phone) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		ride.setDestination(dest);
		ride.setSource(src);
		ride.setEmail(email);
		ride.setPhone(phone);
		ride.setStartTime(time);
		ride.setEmpolyeeName(userName);
	}


	@When("^click on \"([^\"]*)\"$")
	public void click_on(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		actionButton= arg1;
	}

	@Then("^system should display message \"([^\"]*)\"$")
	public void system_should_display_message(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		RidePosting posting = new RidePosting();
		assertEquals(arg1, posting.SaveRide(ride));
	}

}
