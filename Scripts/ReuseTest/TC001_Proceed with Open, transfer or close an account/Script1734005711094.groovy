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
 *  Automates the process of opening a specific website and performing various actions on the webpage.
 *
 *  1. Opens a browser with a specified URL.
 *  2. Maximizes the browser window.
 *  3. Navigates to a specific URL.
 *  4. Takes a full-page screenshot as a checkpoint.
 *  5. Waits for a specific element to be present on the webpage.
 *  6. Adds a delay of 5 seconds.
 *  7. Clicks on a specific element on the webpage.
 *  8. Waits for another element to be present on the webpage.
 *  9. Takes a full-page screenshot as a checkpoint.
 *
 */
 

WebUI.openBrowser('', FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://www.horizonpower.com.au/', FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshotAsCheckpoint('HomePage')

WebUI.waitForElementPresent(findTestObject('Object Repository/OR HorizonPower/a_For business'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/OR HorizonPower/a_For business'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR HorizonPower/span_Create, open or transfer account'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/OR HorizonPower/span_Open an account'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshotAsCheckpoint('OpenAnAccount')



