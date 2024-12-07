package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pojo {
	
	
	

	@FindBy(xpath ="(//a[contains(text(),'Products')])[1]")
	private WebElement product;

	@FindBy(xpath ="//a[contains(text(),'EXPLORE ALL MOTOR PRODUCTS')]")
	private WebElement exploreAllMotorProducts;

	@FindBy(xpath ="//span[text()='Private Car']")
	private WebElement privateCar;
	
	@FindBy(xpath ="(//a[text()='Get Quote'])[1]")
	private WebElement getQuote;

	@FindBy(xpath ="(//a[text()='Know More'])[1]")
	private WebElement privateCareKnowMore;

	@FindBy(xpath ="//h5[text()='Calculate Premium']")
	private WebElement calculatePremium;

	@FindBy(xpath ="//span[@class=\"mat-select-placeholder ng-tns-c19-46 ng-star-inserted\"]")
	private WebElement vehicleType;

	@FindBy(xpath ="//span[text()=' New ']")
	private WebElement vehicleTypeNew;

	@FindBy(xpath ="//span[@class=\"mat-select-placeholder ng-tns-c19-48 ng-star-inserted\"]")
	private WebElement planType;

	@FindBy(xpath ="//span[text()='3 Years Long Term Liability ']")
	private WebElement longTermLiability;

	@FindBy(xpath ="//input[@class=\"mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored ng-pristine ng-valid ng-touched\"]")
	private WebElement rtoLocation;

	@FindBy(xpath ="//span[text()=' Delhi - Central - DL 06 ']")
	private WebElement delhiCentral;

	@FindBy(xpath ="(//input[@class=\"mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored ng-untouched ng-pristine ng-invalid\"])[1]")
	private WebElement make;

	@FindBy(xpath ="//span[text()=' BAJAJ ']")
	private WebElement bajaj;

	@FindBy(xpath ="(//input[@class=\"mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored ng-untouched ng-pristine ng-invalid\"])[1]")
	private WebElement model;

	@FindBy(xpath ="//span[text()=' QUTE (2018-2020) ']")
	private WebElement dute2018To2020;

	@FindBy(xpath ="//input[@class=\"mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored ng-pristine ng-invalid ng-touched\"]")
	private WebElement variant;
	
	@FindBy(xpath ="//span[text()=' PETROL (2018-2020) ']")
	private WebElement petrol2018To2020;
	
	@FindBy(xpath ="//span[text()=' Generate Quick Quote ']")
	private WebElement generateQuickQuote;
	
	@FindBy(xpath ="//h5[text()='Payable Premium Breakup ']")
	private WebElement payablePremiumBreakup;
	
	
	
	@FindBy(xpath ="(//a[contains(text(),'Contact Us')])[1]")
	private WebElement contactUs;
	
	@FindBy(xpath ="//h2[text()='Connect With Us']")
	private WebElement connectWithUs;
	
	@FindBy(xpath ="//select[@class=\"state_select form-select required\"]")
	private WebElement selectState;
	
	@FindBy(xpath ="//select[@class=\"city_select form-select required\"]")
	private WebElement selectCity;
	
	@FindBy(xpath ="//select[@class=\"office_select form-select\"]")
	private WebElement selectOfficeName;
	
	@FindBy(xpath ="//select[@class=\"office_code_select form-select\"]")
	private WebElement selectOfficeCode;
	
	@FindBy(xpath ="//input[@id=\"edit-search--2\"]")
	private WebElement searchButton;
	
	@FindBy(xpath ="(//div[@class=\"views-view-responsive-grid__item-inner\"])[1]")
	private WebElement addressInList;
	

	
	




	

}
