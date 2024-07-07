package stepsdefinition.ToolApi;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValidateToolApiSteps {
	String url, method;
	@Given("I have url and method")
	public void i_have_url_and_method( List<Map<String, String>> givenTable) {
		Map<String, String> row1 = givenTable.get(0);
		url = row1.get("URL");
		method = row1.get("Method").trim();
	    
	}

	@When("I send request")
	public void i_send_request() {
	    
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Response is returned status code")
	public void response_is_returned_status_code() {
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Response is returned response data")
	public void response_is_returned_response_data() {
	    throw new io.cucumber.java.PendingException();
	}

}
