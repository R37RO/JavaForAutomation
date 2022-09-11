package com.test.testcase;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class RegisterDemo {

	public static void main(String[] args) {

		/*
		 * Selenium demo user registration end to end flow.
		 */

		//Selenium 4 webdriver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		



		//Parameterized all input values
		String url = "https://nxtgenaiacademy.com";
		String actualWebPageTitle = "NxtGen A.I Academy – Learn With Clarity";
		String firstNameInput = "Deepak";
		String lastNameInput = "Singh";
		String streetInput = "The xyz Road";
		String cityInput = "Mumbai";
		String countryInput = "India";
		String stateInput = "Maharashtra";
		String postalInput = "400001";
		String emailInput = "abcd@gmail.com";
		String dateInput = "05/08/2022";
		String mobileInput = "9400000000";
		String hourInput = "11";
		String minutesInput = "30";
		String queryInput = "What is the duration of the course";



		//Step 1: Open the browser and launch url
		driver.get(url);

		//Maximize the browser window
		driver.manage().window().maximize();
				
		//Application is launched
		System.out.println("Application launched successfully\n");

		
		System.out.println("******** REGISTER DEMO END TO END TEST LOG ********");
		//Separator for clean output on console
		System.out.println(" ");		

		//Step 2: WebPage Title validation
		String expectedWebPageTitle = driver.getTitle();		
		if(actualWebPageTitle.equals(expectedWebPageTitle)) 
		{
			System.out.println("The title of the web page is: " + actualWebPageTitle);
		}

		else
		{
			System.out.println("The actual and expected web page title are not same");
			System.out.println("The actual web page title is: " + actualWebPageTitle);
			System.out.println("The expected web page title is: " + expectedWebPageTitle);
		}

		//Separator for clear output on console
		System.out.println(" ");


		/* 
		 * Step 3: Navigating to Register Demo page from home page.
		 * through Qa automation > Practice Automation > click-Registration Form
		 */	

		//create the 'action' instance in Actions class
		Actions action = new Actions(driver);


		//linktext navigator for QA automation
		WebElement qaAutomation = driver.findElement(By.linkText("QA AUTOMATION"));		
		//mouse navigation to QA automation

		//validating the QA automation menu
		if(qaAutomation.isDisplayed()) {
			//Getting the actual form title
			String qaAutomationMenu = qaAutomation.getText();
			System.out.println(qaAutomationMenu + " menu is displayed");

			//mouse navigation to QA automation
			action.moveToElement(qaAutomation).perform();
		}
		else
		{
			System.out.println("Qa Automation menu is not displayed");

		}


		//linktext navigator for practice automation
		WebElement practiceAutomation = driver.findElement(By.linkText("Practice Automation"));


		//validating the Practice Automation menu
		if(practiceAutomation.isDisplayed()) {

			String practiceAutomationMenu = practiceAutomation.getText();
			System.out.println(practiceAutomationMenu + " menu is Displayed");

			//perform mouse navigation to practice automation
			action.moveToElement(practiceAutomation).perform();

		}
		else
		{
			System.out.println("Practice Automation is not displayed");
		}


		//Partial link text for registration form
		WebElement registrationForm = driver.findElement(By.partialLinkText("Registration Form"));

		//Validating the Registration Form menu
		if(registrationForm.isDisplayed()) {

			String registrationFormMenu = registrationForm.getText();
			System.out.println(registrationFormMenu + " menu button is displayed.");

			//perform mouse navigation action and click on registration form
			action.moveToElement(registrationForm).perform();

			//click on registration form
			registrationForm.click();
			System.out.println(registrationFormMenu + " menu is clicked");

		}
		else
		{
			System.out.println("Register on Demo page link is not displayed");
		}

		//Separator for clean output on console
		System.out.println(" ");

		/*
		 * Registration form
		 * Address, mail, courses convenient time
		 */

		//Step 4: Registration-Form title validation
		//crating the formTitle webelement for formTitle
		WebElement formTitle = driver.findElement(By.xpath("//*[normalize-space()='Register For Demo']"));

		//Getting the actual form title
		String actualFormTitle = formTitle.getText();
		String expectedFormTitle = "Register For Demo";

		//Validating the form title
		if (formTitle.isDisplayed()) 

		{
			System.out.println("The form title name is displayed");

			//Validating the actual and expected title
			if (actualFormTitle.equals(expectedFormTitle))

			{
				System.out.println("The actual form title name is: " + actualFormTitle);
			}

			else				
			{
				System.out.println("The actual and expected form title name are not same");
				System.out.println("The actual form title name is: " + actualFormTitle);
				System.out.println("The expected form title name is: " + expectedFormTitle);
			}

		}

		else
		{
			System.out.println("The form title is not displayed");
		}

		//Separator for clean output on console
		System.out.println(" ");


		//Demo user registration

		/* First Name Text Box Handling 
		 * isDisplayed()
		 * isEnabled() 
		 * sendKeys() 
		 */

		//Step 5: Enter the first name
		//declare the webelement object
		WebElement firstName = driver.findElement(By.id("vfb-5"));


		//Verify the first name is displayed or not
		if(firstName.isDisplayed()) {
			System.out.println("First Name text box is displayed");


			//Verify the first name is enabled or not
			if(firstName.isEnabled()) {

				System.out.println("Text box is enabled");
				//sending the first name input value
				firstName.sendKeys(firstNameInput);
				System.out.println("First Name is: " + firstNameInput);

			}
			else {
				System.out.println("Text box is not enabled ");
			}

		}
		else {
			System.out.println("First Name text box is not displayed");
		}

		//Separator for clean output on console
		System.out.println(" ");





		//Step 6: Enter the last name
		//declare the webelement object
		WebElement lastName = driver.findElement(By.id("vfb-7"));

		//Verify the last name is displayed or not
		if(lastName.isDisplayed()) {
			System.out.println("Last Name text box is displayed");

			//Verify the Last Name is enabled or not
			if(lastName.isEnabled()) {

				System.out.println("Last Name text box is enabled");
				//sending the last name input value
				lastName.sendKeys(lastNameInput);
				System.out.println("Last Name is: " + lastNameInput);

			}
			else {
				System.out.println("Last Name Text box is not enabled ");
			}

		}
		else {
			System.out.println("Last Name text box is not displayed");
		}

		//Separator for clean output on console
		System.out.println(" ");





		/* Step 7: Select the Gender
		 * Gender radio button handling
		 * isDisplayed()
		 * isEnabled() 
		 * isSelected() 
		 */

		//declare the webelement object
		WebElement genderMale = driver.findElement(By.id("vfb-8-1"));	

		//Verify the male gender button is displayed or not
		if(genderMale.isDisplayed()) {
			System.out.println("Gender radio button is displayed");

			//Verify the male gender button is enabled or not
			if(genderMale.isEnabled()) {

				System.out.println("Gender radio button is enabled");

				if(genderMale.isSelected()) {

					System.out.println("Gender Male radio button is selected");
				}
				else
				{	
					//select the male gender
					genderMale.click();
					System.out.println("Gender radio button is selected as Male");
				}

			}
			else {
				System.out.println("Gender radio button is not enabled ");
			}

		}
		else {
			System.out.println("Gender radio button is not displayed");
		}


		//Separator for clean output on console
		System.out.println(" ");






		/*
		 * Address Fields
		 * city, state, postal code, country-DropDown
		 */



		//Step:8 Street Address
		//declare the webelement object
		WebElement streetAddress = driver.findElement(By.id("vfb-13-address"));

		//Verify the street address text box is displayed or not
		if(streetAddress.isDisplayed()) {
			System.out.println("Street address text box is displayed");

			//Verify the street address text field is enabled or not
			if(streetAddress.isEnabled()) {

				System.out.println("Street address text box is enabled");
				//sending the street address input value
				streetAddress.sendKeys(streetInput);
				System.out.println("Street address is: " + streetInput);

			}
			else {
				System.out.println("Street address Text box is not enabled ");
			}

		}
		else {
			System.out.println("Street address text box is not displayed");
		}


		//Separator for clean output on console
		System.out.println(" ");





		//Step 9: Enter the city
		//declare the webelement object
		WebElement city = driver.findElement(By.id("vfb-13-city"));

		//Verify the city text box is displayed or not
		if(city.isDisplayed()) {
			System.out.println("City text box is displayed");

			//Verify the city text field is enabled or not
			if(city.isEnabled()) {

				System.out.println("City text box is enabled");
				//sending the city name input value
				city.sendKeys(cityInput);
				System.out.println("City Name is: " + cityInput);

			}
			else {
				System.out.println("City Text box is not enabled ");
			}

		}
		else {
			System.out.println("City text box is not displayed");
		}

		//Separator for clean output on console
		System.out.println(" ");





		//Step 10: Enter the state
		//declare the webelement object
		WebElement state = driver.findElement(By.id("vfb-13-state"));

		//Verify the city text box is displayed or not		
		if(state.isDisplayed()) {
			System.out.println("State text box is displayed");

			//Verify the state text field is enabled or not
			if(state.isEnabled()) {

				System.out.println("State text box is enabled");
				//sending the state name input value
				state.sendKeys(stateInput);
				System.out.println("State Name is: " + stateInput);

			}
			else {
				System.out.println("State Text box is not enabled ");
			}

		}
		else {
			System.out.println("State text box is not displayed");
		}

		//Separator for clean output on console
		System.out.println(" ");		





		//Step 11: postal code
		//declare the webelement object
		WebElement postalCode = driver.findElement(By.id("vfb-13-zip"));

		//Verify the postal code text box is displayed or not				
		if(postalCode.isDisplayed()) {
			System.out.println("Postal code box is displayed");

			//Verify the postal text field is enabled or not			
			if(postalCode.isEnabled()) {

				System.out.println("Postal code field is enabled");
				//sending the postal code input value
				postalCode.sendKeys(postalInput);
				System.out.println("Postal code is: " + postalInput);

			}
			else {
				System.out.println("Postal code field is not enabled ");
			}

		}
		else {
			System.out.println("Postal code box is not displayed");
		}

		//Separator for clean output on console
		System.out.println(" ");		





		//Step 11: country selection
		//declare the webelement object
		WebElement country = driver.findElement(By.id("vfb-13-country"));


		//Verify the country selection displayed or not				
		if(country.isDisplayed()) {
			System.out.println("Country dropdown box is displayed");

			//Verify the country selection is enabled or not
			if(country.isEnabled()) {

				System.out.println("Country dropdown is enabled");

				//create the 'countryDropDown' instance in Select class
				Select countryDropDown = new Select(country);

				//Select the country by visible text
				countryDropDown.selectByVisibleText(countryInput);
				System.out.println("Country dropdown is selected: " + countryInput);

			}
			else {
				System.out.println("Country dropdown is not enabled ");
			}

		}
		else {
			System.out.println("Country dropdown is not displayed");
		}		



		//Separator for clean output on console
		System.out.println(" ");


		//Step:12 Enter the Email
		//declare the webelement object
		WebElement email = driver.findElement(By.id("vfb-14"));

		//Verify the email address text box is displayed or not				
		if(email.isDisplayed()) {
			System.out.println("Email address text box is displayed");

			//Verify the email address field is enabled or not
			if(email.isEnabled()) {

				System.out.println("Email box is enabled");
				//sending the email address input value
				email.sendKeys(emailInput);
				System.out.println("Email address is: " + emailInput);

			}
			else {
				System.out.println("Email address Text box is not enabled ");
			}

		}
		else {
			System.out.println("Email address text box is not displayed");
		}

		//Separator for clean output on console
		System.out.println(" ");		





		//Step 13: Date of Demo as text box
		//declare the webelement object
		WebElement dateOfDemo = driver.findElement(By.id("vfb-18"));

		//Verify the date of demo text box is displayed or not				
		if(dateOfDemo.isDisplayed()) {
			System.out.println("Date of demo text box is displayed");

			//Verify the date of demo text field is enabled or not
			if(dateOfDemo.isEnabled()) {

				System.out.println("Date of demo box is enabled");
				//sending the date of demo input value
				dateOfDemo.sendKeys(dateInput);
				System.out.println("Date of demo is: " + dateInput);

			}
			else {
				System.out.println("Date of demo Text box is not enabled ");
			}

		}
		else {
			System.out.println("Date of demo text box is not displayed");
		}

		//Separator for clean output on console
		System.out.println(" ");		





		/*Step 14: Select the demo time
		 * Convenient Time
		 * Drop Down List
		 */

		//Hour selection by id
		//declare the webelement object
		WebElement timeHour = driver.findElement(By.id("vfb-16-hour"));
		//create the 'timeHourDropDown' instance in Select class		
		Select timeHourDropDown = new Select(timeHour);


		//Verify the hour selection box is displayed or not				
		if(timeHour.isDisplayed()) {
			System.out.println("Hour selection box is displayed");

			//Verify the hour selection is enabled or not
			if(timeHour.isEnabled()) {

				System.out.println("Hour selection is enabled");
				//selecting the hour
				timeHourDropDown.selectByVisibleText(hourInput);
				System.out.println("Hour is selected: " + hourInput);

			}
			else {
				System.out.println("Hour selection is not enabled ");
			}

		}
		else {
			System.out.println("Hour selection box is not displayed");
		}		

		//Separator for clean output on console
		System.out.println(" ");



		//Minute selection by id
		//declare the webelement object
		WebElement timeMinutes = driver.findElement(By.id("vfb-16-min"));
		//create the 'timeMinutesDropDown' instance in Select class
		Select timeMinutesDropDown = new Select(timeMinutes);


		//Verify the minute dropdown is displayed or not				
		if(timeMinutes.isDisplayed()) {
			System.out.println("Minute selection box is displayed");

			//Verify the minute selection is enabled or not
			if(timeMinutes.isEnabled()) {

				System.out.println("Minute selection is enabled");
				//selecting the minutes
				timeMinutesDropDown.selectByVisibleText(minutesInput);
				System.out.println("Minute is: " + minutesInput);

			}
			else {
				System.out.println("Minute selection is not enabled ");
			}

		}
		else {
			System.out.println("Minute selection box is not displayed");
		}		


		//Separator for clean output on console
		System.out.println(" ");





		//Step:15 Enter the Mobile Number
		//declare the webelement object
		WebElement mobileNumber = driver.findElement(By.id("vfb-19"));

		//Verify the mobile number text box is displayed or not				
		if(mobileNumber.isDisplayed()) {
			System.out.println("Mobile number text box is displayed");

			//Verify the mobile number text field is enabled or not
			if(mobileNumber.isEnabled()) {

				System.out.println("Mobile number field is enabled");
				//sending the mobile no input value
				mobileNumber.sendKeys(mobileInput);
				System.out.println("Mobile number is: " + mobileInput);

			}
			else {
				System.out.println("Mobile number field is not enabled ");
			}

		}
		else {
			System.out.println("Mobile number text box is not displayed");
		}

		//Separator for clean output on console
		System.out.println(" ");





		//Step: 16 Select two cources with check box (Test NG, Core Java)
		//TestNG
		//declare the webelement object
		WebElement courseTestNG = driver.findElement(By.xpath("//input[@id='vfb-20-2']"));


		//Verify the TestNG checkbox is displayed or not
		if(courseTestNG.isDisplayed()) {
			System.out.println("TestNG checkbox is displayed");

			//Verify the TestNG checkbox is enabled or not
			if(courseTestNG.isEnabled()) {

				System.out.println("TestNG checkbox is enabled");

				if(courseTestNG.isSelected()) {

					System.out.println("TestNG checkbox is checked");
				}
				else
				{	
					//check the TestNG checkbox
					courseTestNG.click();
					System.out.println("TestNG checkbox is checked successfully");
				}

			}
			else {
				System.out.println("TestNG checkbox not enabled ");
			}

		}
		else {
			System.out.println("TestNG checkbox is not displayed");
		}

		//Separator for clean output on console
		System.out.println(" ");





		//CoreJava
		//declare the webelement object
		WebElement courseCoreJava = driver.findElement(By.xpath("//input[@id='vfb-20-3']"));


		//Verify the courseCoreJava checkbox is displayed or not
		if(courseCoreJava.isDisplayed()) {
			System.out.println("CoreJava checkbox is displayed");

			//Verify the CoreJava checkbox is enabled or not
			if(courseCoreJava.isEnabled()) {

				System.out.println("CoreJava checkbox is enabled");

				if(courseCoreJava.isSelected()) {

					System.out.println("CoreJava checkbox is checked");
				}
				else
				{	
					//check the CoreJava checkbox 
					courseCoreJava.click();
					System.out.println("CoreJava checkbox is checked successfully");
				}

			}
			else {
				System.out.println("CoreJava checkbox not enabled ");
			}

		}
		else {
			System.out.println("CoreJava checkbox is not displayed");
		}


		//Separator for clean output on console
		System.out.println(" ");


		//Query Box
		//Declare the webelement object
		WebElement query = driver.findElement(By.id("vfb-23"));
		
		//Verify the query text box is displayed or not				
		if(query.isDisplayed()) {
			System.out.println("Query text box is displayed");

			//Verify the query text field is enabled or not
			if(query.isEnabled()) {

				System.out.println("Query field is enabled");
				//sending the query input value
				query.sendKeys(queryInput);
				System.out.println("Query is: " + queryInput);

			}
			else {
				System.out.println("Query field is not enabled ");
			}

		}
		else {
			System.out.println("Query text box is not displayed");
		}

		//Separator for clean output on console
		System.out.println(" ");



		//Step:17 Extract the two digits from verification example
		//Verification text xpath locator		
		//declare the webelement object
		WebElement example = driver.findElement(By.xpath("//label[contains(text(),'Example:')]"));
		//Getting the text from verification Example
		String exampleValue = example.getText();


		//getting two digits string with split method and saving to arrExample[]
		String arrExample[] = exampleValue.split(":");

		//saving two digit number to array at index 1
		String verification = arrExample[1];

		//trimming the extra space and saving to string variable
		String verificationNumber = verification.trim();
		//System.out.println(VerificationNumber);



		//Step: 18 Enter the two extracted digits in the verification field
		//declare the webelement object
		WebElement verificationField = driver.findElement(By.xpath("//input[@id='vfb-3']"));

		//Verify the verification box is displayed or not		
		if(verificationField.isDisplayed()) {
			System.out.println("Verification field is displayed");

			//Verify the verification field is enabled or not
			if(verificationField.isEnabled()) {

				System.out.println("Verification field is enabled");
				//sending the verification input value
				verificationField.sendKeys(verificationNumber);
				System.out.println("Verification number is entered: " + verificationNumber);

			}
			else {
				System.out.println("Verification field is not enabled ");
			}

		}
		else {
			System.out.println("Verification field is not displayed");
		}

		//Separator for clean output on console
		System.out.println(" ");



		//Step: 19 Submit the form.
		//declare the webelement object
		WebElement submitButton = driver.findElement(By.id("vfb-4"));

		//Verify the submit button is displayed or not		
		if(submitButton.isDisplayed()) {
			System.out.println("Submit button is displayed");

			//Verify the Submit button is enabled or not
			if(submitButton.isEnabled()) {

				System.out.println("Submit button is enabled");
				//click on submit button
				submitButton.click();
				System.out.println("Register Demo Form is submitted");

			}
			else {
				System.out.println("Submit button is not enabled ");
			}

		}
		else {
			System.out.println("Submit button is not displayed");
		}

		//Separator for clean output on console
		System.out.println(" ");





		//Step 20: Success transaction message validation
		//declare the webelement object
		WebElement transactionMessage = driver.findElement(By.xpath("//*[contains(text(),'Registration Form is Successfully Submitted.')]"));
		String transactionString = transactionMessage.getText();
		String transactionConfirmation = "Registration Form is Successfully Submitted.";

		//Validate the Transaction message

		//Verify the transaction message is displayed or not
		if(transactionMessage.isDisplayed()) {
			System.out.println("The Transaction message is displayed");

			//Verify the transaction message is valid or not
			if (transactionString.contains(transactionConfirmation)) {
				System.out.println("The Transaction message contain: " + transactionConfirmation);
				System.out.println("The Full Transaction message is: " + transactionString );

				//getting the transaction id from the transaction message 
				String arrTransaction[] = transactionString.split(":");

				//transaction id at index 1
				String transactionId = arrTransaction[1];

				//trimming the transaction ID
				String transactionIdTrim = transactionId.trim();
				System.out.println("The transaction id is: " + transactionIdTrim);

			}
			else
			{
				System.out.println("The transaction message is not valid");
				System.out.println("The transaction message does not contain: " + transactionConfirmation);
			}

		}

		else
		{
			System.out.println("The Transaction message is not displayed");
		}




		//Step 21: Close the browser
		driver.close();
		System.out.println("Application closed successfully\n");

		//End of testing
		System.out.println(" ");
		System.out.println("******** Register Demo End to End Flow is Successful ********");

	}


}
