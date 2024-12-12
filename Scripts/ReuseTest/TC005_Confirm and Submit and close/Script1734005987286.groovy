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
 *  Perform various actions on a web page related to taking screenshots, verifying element text, clicking on an element, and adding a delay.
 *
 *  1. Take a full page screenshot with the checkpoint name 'ApplicationDeclarationPage'.
 *  2. Verify that the text of the element with the locator 'OR HorizonPower/legend_Application Declaration' is 'Application Declaration'.
 *  3. Click on the element with the locator 'OR HorizonPower/label_I confirm all the details I have entered in this application are correct'.
 *  4. Pause the execution for 2 seconds.
 *
 */


WebUI.takeFullPageScreenshotAsCheckpoint('ApplicationDeclarationPage')
WebUI.verifyElementText(findTestObject('OR HorizonPower/legend_Application Declaration'), 'Application Declaration')

WebUI.click(findTestObject('OR HorizonPower/label_I confirm all the details I have entered in this application are correct'))

WebUI.delay(2)


WebUI.closeBrowser()

