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
 *  Automates filling out a form for a property details page.
 *
 *  1. Takes a full-page screenshot as a checkpoint.
 *  2. Verifies the element text for 'Electricity Supply Address'.
 *  3. Sets text for various input fields like lot location number, unit number, unit type, street number, street name, suburb, state, postcode.
 *  4. Clicks on elements like unit type label, state label, and a button for the next step.
 *  5. Verifies the element text for 'State'.
 *  6. Selects an option by value for the postal address.
 */

WebUI.takeFullPageScreenshotAsCheckpoint('PropertyDetailsPage')
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


