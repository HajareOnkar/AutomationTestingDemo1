package stepDefs;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import genericLib.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class dashbordvalues extends BaseClass {
	
	public String getData() {
		  //Connection connection = DatabaseConnectionManager.getConnection();
		  String data="";
//	        try {
//	            
//	        	 Statement stmt = connection.createStatement();
//				ResultSet rs = stmt.executeQuery("SELECT * FROM practice");
//
//	            while (rs.next()) {
//	            data =  rs.getString("column_name");
//	            }
//	        } catch (SQLException e) {
//	            e.printStackTrace();
//	        }
			return data;
		}
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		String data = getData();
		System.out.println("in Given data = "+data);
	    
	}

	@And("some other precondition")
	public void some_other_precondition() {
	    
	}

	@When("I complete action")
	public void i_complete_action() {
	    
	}

	@And("some other action")
	public void some_other_action() {
	    
	}

	@And("yet another action")
	public void yet_another_action() {
	    
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    
	}

	@And("check more outcomes")
	public void check_more_outcomes() {
	    
	}

	@Given("I want to write a step with {string}")
	public void i_want_to_write_a_step_with(String name) {


	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(int value) {
	    
	}

	@Then("I verify the {string} in step")
	public void i_verify_the_in_step(String status) {
	    
	}

	




}
