package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonMethod.BaseClass;

public class Locators {
	
	BaseClass base=BaseClass.getInstance();
	
	
	
	public Locators() {
		PageFactory.initElements(base.driver, this);
	}
	
	@FindBy(xpath ="//h6[text()='Life Insurance']")
	private WebElement lifeInsurance;
	
	@FindBy(xpath ="//span[text()=' View whole life insurance plans ']")
	private WebElement moduleInsurance;
	
	@FindBy(xpath ="(//div[@class=\"icn-group\"]//following::span[text()=' Learn more '])[1]")
	private WebElement lifeInsuLearnMore;
	
	@FindBy(xpath ="//h2[@id=\"find-the-plan-thats-right-for-you\"]")
	private WebElement planRightForYou;
	
	@FindBy(xpath ="//div[@class='dropdown']//following::span[contains(text(),'Select a plan')]")
	private WebElement selectAPlan;
	
	@FindBy(xpath ="//div[@class=\"dropdown-menu show\"]//following-sibling::p[text()='Maternity 360']")
	private WebElement maternity360;
	
	@FindBy(xpath ="(//span[text()=' Learn more '])[2]")
	private WebElement maternity360LearnMore;
	
	@FindBy(xpath ="(//button[text()='Talk to us'])[2]")
	private WebElement talkToUS;
	
	@FindBy(xpath ="//input[@aria-label=\"First name\"]")
	private WebElement maternityFirstName;
	
	@FindBy(xpath ="//input[@aria-label=\"Last name\"]")
	private WebElement maternityLastName;
	
	@FindBy(xpath ="//input[@aria-label=\"You can email me at\"]")
	private WebElement maternityEmail;
	
	@FindBy(xpath ="//div[@class=\"dropdown__single-value css-1uccc91-singleValue\"]")
	private WebElement materityMobileStartingNo;
	
	@FindBy(xpath ="//input[@aria-label=\"My phone number is\"]")
	private WebElement maternityMobileNO;
	
	@FindBy(xpath ="//div[contains(text()='+91')]")
	private WebElement maternity91;

	
	
	
	@FindBy(xpath="//p[text()='Insurance']")
	private WebElement insuranceModule;
	
	@FindBy(xpath="//span[text()=' Insurance Savings & Investments']")
	private WebElement insuranceSavingAndInvestment;
	
	@FindBy(xpath="//span[text()=' View Insurance Savings plans  ']")
	private WebElement viewInsuranceSavingPlan;
	
	@FindBy(xpath="//span[text()='Select your needs']")
	private WebElement myPlanShouldHave;
	
	@FindBy(xpath="//label[text()='Regular premium term']")
	private WebElement regularPremiumTerm;
	
	@FindBy(xpath="//button[@class=\"btn secondary\"]")
	private WebElement doneButton;
	
	@FindBy(xpath="//h4[text()='Gro Power Saver Pro']")
	private WebElement groPowerSaverPRo;
	
	@FindBy(xpath="(//div[@class=\"icn-group\"]/following::span[text()=' Learn more '])[5]")
	private WebElement groPowerSaverProLearnMore;
	
	@FindBy(xpath ="//h2[text()='Your policy toolkit.']")
	private WebElement yourPolicyToolkit;
	
	@FindBy(xpath="//i[text()='Brochures']")
	private WebElement brochures;
	
	@FindBy(xpath="(//i[@class=\"far fa-file-pdf\"])[1]")
	private WebElement groPowerSaverProBrochure;
	
	@FindBy(xpath="//embed")
	private WebElement pdfPage;
	
	
	
	
	@FindBy(xpath ="//ul[@class=\"grand-list\"]//following::span[text()=' Commercial Insurance']")
	private WebElement commercialInsurance;
	
	@FindBy(xpath ="//h4[contains(text(),'Contractor Suite')]")
	private WebElement contractorSuite;

	@FindBy(xpath ="(//span[text()=' Learn more '])[2]")
	private WebElement contractorSuiteLearnMore;
	
	@FindBy(xpath ="//h3[text()='Limits of coverage']")
	private WebElement contractorSuiteLimitOfCoverage;
	
	@FindBy(xpath ="//tr/following::b[text()='Third-Party Liability Limit']/following::td[text()='Up to $5,000,000']")
	private WebElement contractorSuiteThirdPartyLiabilityLimit;
	
	
	
	@FindBy(xpath ="//span[text()=' Travel Insurance']")
	private WebElement travelInsurance;

	@FindBy(xpath ="//strong[text()='Travel delay']")
	private WebElement travelDelay;
	
	@FindBy(xpath="//h2[text()='Here are some of the key items we cover.']")
	private WebElement keyItem;
	
	@FindBy(xpath ="(//p[@class=\"collapse-all\"]//following::img[@src=\"/assets/images/icons/arrow-down-blue.svg\"])[1]")
	private WebElement travelInsuranceExpanAll;

	@FindBy(xpath ="//a[text()='view full coverage of plans']")
	private WebElement standardPlansViewFullCoverage;

	@FindBy(xpath ="(//strong[text()='Travel delay']//following::td[text()='3,000'])[1]")
	private WebElement travelDelayDeluxeTotalAmount;
	
	
	
	
	
	@FindBy(xpath="//span[text()=' Fund Prices ']")
	private WebElement fundPrices;
	
	@FindBy(xpath="(//a[text()='Fund Prices'])[2]")
	private WebElement fundPricesFilter;
	
	@FindBy(xpath="//input[@class=\"dropdown-toggle\"]")
	private WebElement selectByPreference;
	
	@FindBy(xpath="//label[text()='Core Funds']")
	private WebElement coreFunds;
	
	@FindBy(xpath="//label[text()='Low to medium risk']")
	private WebElement lowToMediumRisk;
	
	@FindBy(xpath="//label[text()='Cash']")
	private WebElement cash;
	
	@FindBy(xpath="//button[text()='Filter']")
	private WebElement filterButton;
	
	@FindBy(xpath="//a[text()='Historical Prices & Performance ']")
	private WebElement historicalPricesAndPerformance;
	
	@FindBy(xpath="//div[@id=\"mCSB_1\"]")
	private WebElement coreeFundsTable;
	
	
	
	

	public WebElement getLifeInsurance() {
		return lifeInsurance;
	}

	public WebElement getLifeInsuLearnMore() {
		return lifeInsuLearnMore;
	}

	public WebElement getPlanRightForYou() {
		return planRightForYou;
	}

	public WebElement getSelectAPlan() {
		return selectAPlan;
	}

	public WebElement getMaternity360() {
		return maternity360;
	}

	public WebElement getModuleInsurance() {
		return moduleInsurance;
	}

	public WebElement getMaternity360LearnMore() {
		return maternity360LearnMore;
	}

	public WebElement getTalkToUS() {
		return talkToUS;
	}

	public WebElement getMaternityFirstName() {
		return maternityFirstName;
	}

	public WebElement getMaternityLastName() {
		return maternityLastName;
	}

	public WebElement getMaternityEmail() {
		return maternityEmail;
	}

	public WebElement getMaterityMobileStartingNo() {
		return materityMobileStartingNo;
	}

	public WebElement getMaternityMobileNO() {
		return maternityMobileNO;
	}

	public WebElement getMaternity91() {
		return maternity91;
	}

	public WebElement getInsuranceModule() {
		return insuranceModule;
	}

	public WebElement getInsuranceSavingAndInvestment() {
		return insuranceSavingAndInvestment;
	}

	public WebElement getMyPlanShouldHave() {
		return myPlanShouldHave;
	}

	public WebElement getRegularPremiumTerm() {
		return regularPremiumTerm;
	}

	public WebElement getDoneButton() {
		return doneButton;
	}

	public WebElement getGroPowerSaverPRo() {
		return groPowerSaverPRo;
	}

	public WebElement getGroPowerSaverProLearnMore() {
		return groPowerSaverProLearnMore;
	}

	public WebElement getBrochures() {
		return brochures;
	}

	public WebElement getGroPowerSaverProBrochure() {
		return groPowerSaverProBrochure;
	}

	public WebElement getPdfPage() {
		return pdfPage;
	}

	public WebElement getViewInsuranceSavingPlan() {
		return viewInsuranceSavingPlan;
	}

	public WebElement getYourPolicyToolkit() {
		return yourPolicyToolkit;
	}

	public WebElement getCommercialInsurance() {
		return commercialInsurance;
	}

	public WebElement getContractorSuite() {
		return contractorSuite;
	}

	public WebElement getContractorSuiteLearnMore() {
		return contractorSuiteLearnMore;
	}

	public WebElement getContractorSuiteLimitOfCoverage() {
		return contractorSuiteLimitOfCoverage;
	}

	public WebElement getContractorSuiteThirdPartyLiabilityLimit() {
		return contractorSuiteThirdPartyLiabilityLimit;
	}

	public WebElement getTravelInsurance() {
		return travelInsurance;
	}

	public WebElement getTravelInsuranceExpanAll() {
		return travelInsuranceExpanAll;
	}

	public WebElement getStandardPlansViewFullCoverage() {
		return standardPlansViewFullCoverage;
	}

	public WebElement getTravelDelayDeluxeTotalAmount() {
		return travelDelayDeluxeTotalAmount;
	}

	public WebElement getKeyItem() {
		return keyItem;
	}

	public WebElement getTravelDelay() {
		return travelDelay;
	}

	public WebElement getFundPrices() {
		return fundPrices;
	}

	public WebElement getFundPricesFilter() {
		return fundPricesFilter;
	}

	public WebElement getSelectByPreference() {
		return selectByPreference;
	}

	public WebElement getCoreFunds() {
		return coreFunds;
	}

	public WebElement getLowToMediumRisk() {
		return lowToMediumRisk;
	}

	public WebElement getCash() {
		return cash;
	}

	public WebElement getFilterButton() {
		return filterButton;
	}

	public WebElement getHistoricalPricesAndPerformance() {
		return historicalPricesAndPerformance;
	}

	public WebElement getCoreeFundsTable() {
		return coreeFundsTable;
	}
	
	
	
	

	
	
	
	

}
