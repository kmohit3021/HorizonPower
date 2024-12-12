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
 *  Automating a series of actions on a web page for opening an electricity account.
 *
 *  1. Clicks on 'Open an account' button.
 *  2. Takes a full-page screenshot as a checkpoint.
 *  3. Clicks on 'Open an electricity account' heading.
 *  4. Verifies the text of 'Open an electricity account' heading.
 *  5. Waits for the 'Open an electricity account' heading to be present.
 *  6. Scrolls to the 'Are you a Life Support Customer' element.
 *  7. Verifies the text of 'Are you a Life Support Customer' element.
 *  8. Clicks on 'No' button.
 *  9. Verifies the text of 'Are you opening an account for home' element.
 *  10. Clicks on 'For Home' button.
 *  11. Verifies the text of 'Are you moving in to the property' element.
 *  12. Clicks on 'Yes' button.
 *  13. Clicks on 'Next step' button.
 *
 */

WebUI.click(findTestObject('Object Repository/OR HorizonPower/span_Open an account'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshotAsCheckpoint('ElectricityAccountPage')

WebUI.click(findTestObject('Object Repository/OR HorizonPower/h1_Open an electricity account'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR HorizonPower/h1_Open an electricity account'), 'Open an electricity account', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/OR HorizonPower/h1_Open an electricity account'), 30, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/OR HorizonPower/a_Cancel'), FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('OR HorizonPower/legend_Are you a Life Support Customer'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR HorizonPower/legend_Are you a Life Support Customer'), 'Are you a Life Support Customer?', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR HorizonPower/div_No'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR HorizonPower/legend_Are you opening an account for home'), 
    'Are you opening an account for home or business?', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR HorizonPower/div_For Home'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR HorizonPower/legend_Are you moving in to the property'), 'Are you moving in to the property within the next two business days?', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR HorizonPower/div_Yes'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR HorizonPower/button_Next step'), FailureHandling.STOP_ON_FAILURE)


