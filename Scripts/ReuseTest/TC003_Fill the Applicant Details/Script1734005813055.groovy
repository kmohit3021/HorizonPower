import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


/*
 *  Automates filling out an applicant details form on a web page.
 *
 *  1. Takes a full page screenshot as a checkpoint named 'ApplicantDetailsPage'.
 *  2. Selects 'Mr' from a dropdown menu.
 *  3. Enters 'mohit' in the 'First name' field.
 *  4. Enters 'Kumar' in the 'Middle name' field.
 *  5. Enters 'Sharma' in the 'Surname' field.
 *  6. Enters '02/04/1990' in the 'Date of birth' field.
 *  7. Enters '1234567890' in the 'Home phone number' field.
 *  8. Clicks on the 'Date of birth' field.
 *  9. Enters '1234567890' in the 'Mobile phone number' field.
 *  10. Enters '1234567890' in the 'Work phone number' field.
 *  11. Clicks on the 'Mobile phone number' field.
 *  12. Enters 'abc@katalon.com' in the 'Email address' field.
 *  13. Selects 'No' from a dropdown menu for paperless billing.
 *  14. Selects 'Yes' from a dropdown menu for holding a valid concession card.
 *  15. Selects 'Centrelink Health Care Card' from a dropdown menu for an eligible concession card.
 *  16. Enters '123456' in the 'Customer reference number (CRN)' field.
 *  17. Selects 'Yes' from a dropdown menu for having dependent children.
 *  18. Enters '2' in the 'How many dependent children do you' field.
 *  19. Clicks on the 'Next step' button.
 *
 */

WebUI.takeFullPageScreenshotAsCheckpoint('ApplicantDetailsPage')
WebUI.selectOptionByValue(findTestObject('Object Repository/OR HorizonPower/select_Select an option_Title'), 'Mr', true, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/OR HorizonPower/input_First name'), 'mohit', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/OR HorizonPower/input_Middle name'), 'Kumar', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/OR HorizonPower/input_Surname'), 'Sharma', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/OR HorizonPower/input_Date of birth'), '02/04/1990', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/OR HorizonPower/input_Home phone numbe'), '1234567890', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR HorizonPower/div_Date of birth'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/OR HorizonPower/input_Mobile phone number'), '1234567890', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/OR HorizonPower/input_Work phone number'), '1234567890', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR HorizonPower/div_Mobile phone number'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/OR HorizonPower/input_Email address'), 'abc@katalon.com', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/OR HorizonPower/select_Select an option_Would you like paperless billing'), 
    'No', true, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/OR HorizonPower/select_Select an option_Do you hold a valid concession card'), 
    'Yes', true, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/OR HorizonPower/select_Select an eligible concession card'), 'Centrelink Health Care Card', 
    true, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/OR HorizonPower/input_Customer reference number (CRN)'), '123456', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/OR HorizonPower/select_Select an option_Do you have any dependent children'), 
    'Yes', true, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/OR HorizonPower/input_How many dependent children do you'), '2', FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Object Repository/OR HorizonPower/button_Next step'), FailureHandling.STOP_ON_FAILURE)


