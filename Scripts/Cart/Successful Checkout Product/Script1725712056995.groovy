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

WebUI.verifyElementVisible(findTestObject('Cartpage/checkout_button'))

WebUI.click(findTestObject('Cartpage/checkout_button'))

WebUI.verifyElementVisible(findTestObject('Checkoutpage/title_checkout_page'))

WebUI.setText(findTestObject('Checkoutpage/input_firstname'), firstname)

WebUI.setText(findTestObject('Checkoutpage/input_lastname'), lastname)

WebUI.setText(findTestObject('Checkoutpage/input_postal_code'), postal_code)

WebUI.click(findTestObject('Checkoutpage/continue_button'))

WebUI.verifyElementVisible(findTestObject('Overviewpage/title_overview_page'))

WebUI.click(findTestObject('Overviewpage/finish_button'))

WebUI.verifyElementVisible(findTestObject('Completepage/success_order_message'))

