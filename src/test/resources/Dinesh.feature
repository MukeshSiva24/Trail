Feature: Nation Insurnace

Scenario: Product
When Click The Product Module
Then Validate Motor Dropdown data
When Click The Explore All Motor Products
And Click The Private car Know More
And Click The Get Quote
Then Validate Vehicle Details page is navigate in new Tab
When Click The Vehicle Type and Click New in dropdown
And Click The Plan Type and Click Three Years Long Term Liability in dropdown
And Click RTO Location and Click Delhi - Central in dropdown
And Click Make and Click Bajaj in dropdown
And Click Model and Click  QUTE2018to2020 in dropdown
And Click Variant and Click Petrol2018to2020 in dropdown
And Click Generate Quick Quote
Then Validate Payable Premium Breakup is Visible


Scenario: ContactUs
When Click The Contact Us
And Click Select State Dropdown and Click Tamil Nadu
And Click Select City Dropdown and Click Chennai
And Click Select Office Name DropDown and Click Chennai Motor
And Click Select Office Code DropDown and Click Code
And Click Search button
Then Validate Address is Visible in List



 
