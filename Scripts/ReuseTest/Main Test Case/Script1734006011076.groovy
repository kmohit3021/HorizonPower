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

WebUI.openBrowser('', FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://www.horizonpower.com.au/', FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/OR HorizonPower/a_For business'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/OR HorizonPower/a_For business'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR HorizonPower/span_Create, open or transfer account'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/OR HorizonPower/span_Open an account'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR HorizonPower/span_Open an account'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR HorizonPower/h1_Open an electricity account'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR HorizonPower/h1_Open an electricity account'), 'Open an electricity account', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/OR HorizonPower/h1_Open an electricity account'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR HorizonPower/a_Cancel'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('OR HorizonPower/legend_Are you a Life Support Customer'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR HorizonPower/legend_Are you a Life Support Customer'), 'Are you a Life Support Customer?', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR HorizonPower/div_No'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR HorizonPower/legend_Are you opening an account for home'), 'Are you opening an account for home or business?', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR HorizonPower/div_For Home'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR HorizonPower/legend_Are you moving in to the property'), 'Are you moving in to the property within the next two business days?', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR HorizonPower/div_Yes'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR HorizonPower/button_Next step'), FailureHandling.STOP_ON_FAILURE)

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

WebUI.verifyElementText(findTestObject('Object Repository/OR HorizonPower/h2_Electricity Supply Address'), 'Electricity Supply Address', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/OR HorizonPower/input_Lot location number'), '12345678', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/OR HorizonPower/input_Unit number'), '12', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/OR HorizonPower/input_Unit type'), 'K202', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR HorizonPower/label_Unit type'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/OR HorizonPower/input_Street number'), '123', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/OR HorizonPower/input_Street name'), 'Street1', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/OR HorizonPower/input_Suburb'), '123', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/OR HorizonPower/input_State'), 'WA', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/OR HorizonPower/input_Postcode'), '1234', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR HorizonPower/label_State'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR HorizonPower/label_State'), 'State', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/OR HorizonPower/select_Select an option_Is your postal address the same as your supply address'), 
    'Yes', true, FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Object Repository/OR HorizonPower/button_Next step'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('OR HorizonPower/legend_Application Declaration'), 'Application Declaration')

WebUI.click(findTestObject('OR HorizonPower/label_I confirm all the details I have entered in this application are correct'))

WebUI.delay(2)

WebUI.closeBrowser()

