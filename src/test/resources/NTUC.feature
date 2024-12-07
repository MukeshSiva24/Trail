Feature: Life Insurance

Background: 
Given Launch the application"https://www.income.com.sg/"

#@Smoke
Scenario: Verify Life Insurance
When Scroll down and click Life Insurance
And Scroll down and click Direct star protect pro
And scroll down and click Maternity
And user clicks on Learn more
#And Maternity page will navigate in new Tab and Click Talk To Us
#And Chat with an advisor will navigate in new tab and click Book a Time
#And Enter FirstName, FamilyName, EmailID, MyPhoneNo


@Smoke
Scenario: Verify Grow your health
When user clicks insurance dropdown
And Click Insurance savings & Investments in personal Insurance 
And scroll down and click my plan should have dropdown
And click Regular premium term option
Then verify the text in Gro Power Save Pro option
When user clicks on learn more option
And scroll down and click Brouchers
And click Gro Power Saver Pro brouchers English
Then verify whether Gro Power Saver Pro brouchers English is opening


#@Smoke
Scenario: Verify Protect Business
When user clicks insurance dropdown
And click Commerical Insurance in corporate insurance
And Scrolldown and click Learn more in Contractor Suite option
Then verify the amount for Third party Liability Limit in the Limits of coverage table 


#@Smoke
Scenario: Verify Travel Insurance
When user clicks insurance dropdown 
And User clicks on Travel Insurance in personal insurance 
And user clicks on Expand all in key items
And click view full coverage of plans in Standard plans 
Then verify Family total amount for Travel delay in the Deluxe section


#@Smoke
Scenario: Verify Funds 
When user clicks Fund prices in home page	
And user click Filter By dropdown
And user click core Funds option in Fund Type
And Click low to medium risk option in CPFIS risk classification
And user cicks on cash option in source of funds
And click Filter button
And click historical Prices & Perforanmce button
Then verify all the fund options in the Core Funds table



