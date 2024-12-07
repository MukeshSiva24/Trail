package StepDefinition;

import CommonMethod.BaseClass;
import POM.Locators;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	BaseClass base=BaseClass.getInstance();
	Locators locate=new Locators();
	
	@Given("Launch the application{string}")
	public void launch_the_application(String url) {
	    base.launchApplication(url);
	}


	@When("Scroll down and click Life Insurance")
	public void scroll_down_and_click_Life_Insurance() {
	    base.javaScriptClick(locate.getLifeInsurance());
	}

	@When("Scroll down and click Direct star protect pro")
	public void scroll_down_and_click_Direct_star_protect_pro() throws InterruptedException {
		Thread.sleep(3000);
	    base.javaScriptScrollUp(locate.getModuleInsurance());
		Thread.sleep(3000);
	    base.javaScriptClick(locate.getLifeInsuLearnMore());
	}


	@When("scroll down and click Maternity")
	public void scroll_down_and_click_Maternity() throws InterruptedException {
		Thread.sleep(3000);

	   base.javaScriptScrollUp(locate.getPlanRightForYou());
		Thread.sleep(2000);
		base.javaScriptClick(locate.getSelectAPlan());
		Thread.sleep(2000);
	   base.javaScriptClick(locate.getMaternity360());
	}

	@When("user clicks on Learn more")
	public void user_clicks_on_Learn_more() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}


	
	
	
	
	
	
	@When("user clicks insurance dropdown")
	public void user_clicks_insurance_dropdown() {
	   base.explicityWaits(locate.getInsuranceModule());
	}

	@When("Click Insurance savings & Investments in personal Insurance")
	public void click_Insurance_savings_Investments_in_personal_Insurance() {
	   base.explicityWaits(locate.getInsuranceSavingAndInvestment());
	}

	@When("scroll down and click my plan should have dropdown")
	public void scroll_down_and_click_my_plan_should_have_dropdown() throws InterruptedException {
//		Thread.sleep(3000);
	    base.javaScriptScrollUp(locate.getViewInsuranceSavingPlan());
	    Thread.sleep(3000);
	    base.javaScriptClick(locate.getMyPlanShouldHave());
	}

	@When("click Regular premium term option")
	public void click_Regular_premium_term_option() {
	    base.explicityWaits(locate.getRegularPremiumTerm());
	    base.javaScriptClick(locate.getDoneButton());
	}

	@Then("verify the text in Gro Power Save Pro option")
	public void verify_the_text_in_Gro_Power_Save_Pro_option() {
		if(base.display(locate.getGroPowerSaverPRo())) {
			System.out.println("Gro Power Saver Pro is Visible");
		}
		else {
			System.out.println("Gro Power Saver Pro is not Visible");

		}
	   
	}

	@When("user clicks on learn more option")
	public void user_clicks_on_learn_more_option() {
	    base.javaScriptClick(locate.getGroPowerSaverProLearnMore());
	}

	@When("scroll down and click Brouchers")
	public void scroll_down_and_click_Brouchers() {
		base.javaScriptScrollUp(locate.getYourPolicyToolkit());
	    base.javaScriptClick(locate.getBrochures());
	}

	@When("click Gro Power Saver Pro brouchers English")
	public void click_Gro_Power_Saver_Pro_brouchers_English() throws InterruptedException {
		Thread.sleep(2000);
	    base.explicityWaits(locate.getGroPowerSaverProBrochure());
	}

	@Then("verify whether Gro Power Saver Pro brouchers English is opening")
	public void verify_whether_Gro_Power_Saver_Pro_brouchers_English_is_opening() {
	    base.multiWindowHandles(1);
	   if(base.display(locate.getPdfPage())) {
		   System.out.println("PDF Page is Visible");
	   }
	   else {
		   System.out.println("PDF Page is not Visible");

	   }
	}



	
	
	
	
	@When("click Commerical Insurance in corporate insurance")
	public void click_Commerical_Insurance_in_corporate_insurance() throws InterruptedException {
		
		Thread.sleep(2000);
		base.clicks(locate.getCommercialInsurance());
	
	}

	@When("Scrolldown and click Learn more in Contractor Suite option")
	public void scrolldown_and_click_Learn_more_in_Contractor_Suite_option() {
	    base.javaScriptScrollUp(locate.getContractorSuite());
	    base.javaScriptClick(locate.getContractorSuiteLearnMore());
	}

	@Then("verify the amount for Third party Liability Limit in the Limits of coverage table")
	public void verify_the_amount_for_Third_party_Liability_Limit_in_the_Limits_of_coverage_table() {
		base.javaScriptScrollUp(locate.getContractorSuiteLimitOfCoverage());
	    if(base.display(locate.getContractorSuiteThirdPartyLiabilityLimit())) {
	    	System.out.println("Third Party Liability Limit Amount is Visible. The Amount is ="+base.text(locate.getContractorSuiteThirdPartyLiabilityLimit()));
	    }
	    else {
	    	System.out.println("Third Party Liability Limit Amount is not Visible");

	    }
	}
	
	
	
	
	
	


@When("User clicks on Travel Insurance in personal insurance")
public void user_clicks_on_Travel_Insurance_in_personal_insurance() {
    base.explicityWaits(locate.getTravelInsurance());
}

@When("user clicks on Expand all in key items")
public void user_clicks_on_Expand_all_in_key_items() {
base.javaScriptScrollUp(locate.getKeyItem());
base.javaScriptClick(locate.getTravelInsuranceExpanAll());
}

@When("click view full coverage of plans in Standard plans")
public void click_view_full_coverage_of_plans_in_Standard_plans() {
    base.javaScriptClick(locate.getStandardPlansViewFullCoverage());
}

@Then("verify Family total amount for Travel delay in the Deluxe section")
public void verify_Family_total_amount_for_Travel_delay_in_the_Deluxe_section() {
	
	base.javaScriptScrollUp(locate.getTravelDelay());
    if(base.display(locate.getTravelDelayDeluxeTotalAmount())) {
    	System.out.println("Travel Delay Deluxe Total Amount is Visible");
    }
    else {
    	System.out.println("Travel Delay Deluxe Total Amount is not Visible");

    }
}







@When("user clicks Fund prices in home page")
public void user_clicks_Fund_prices_in_home_page() {
   base.explicityWaits(locate.getFundPrices());
}

@When("user click Filter By dropdown")
public void user_click_Filter_By_dropdown() {
    base.javaScriptScrollUp(locate.getFundPricesFilter());
    base.explicityWaits(locate.getSelectByPreference());
}

@When("user click core Funds option in Fund Type")
public void user_click_core_Funds_option_in_Fund_Type() throws InterruptedException {
	Thread.sleep(0100);

   base.explicityWaits(locate.getCoreFunds());
}

@When("Click low to medium risk option in CPFIS risk classification")
public void click_low_to_medium_risk_option_in_CPFIS_risk_classification() throws InterruptedException {
	Thread.sleep(1000);

    base.explicityWaits(locate.getLowToMediumRisk());
}

@When("user cicks on cash option in source of funds")
public void user_cicks_on_cash_option_in_source_of_funds() throws InterruptedException {
	Thread.sleep(1000);

   base.explicityWaits(locate.getCash());
}

@When("click Filter button")
public void click_Filter_button() throws InterruptedException {
	Thread.sleep(1000);
    base.explicityWaits(locate.getFilterButton());
}

@When("click historical Prices & Perforanmce button")
public void click_historical_Prices_Perforanmce_button() {
    base.explicityWaits(locate.getHistoricalPricesAndPerformance());
}

@Then("verify all the fund options in the Core Funds table")
public void verify_all_the_fund_options_in_the_Core_Funds_table() {
    if(base.display(locate.getCoreeFundsTable())) {
    	System.out.println("Core Funds Table is Visible");
    }
    else {
    	System.out.println("Core Funds Table is not Visible");

    }
}




}
