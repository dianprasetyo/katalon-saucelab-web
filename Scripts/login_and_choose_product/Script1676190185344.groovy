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

WebUI.openBrowser('https://www.saucedemo.com/')

WebUI.setText(findTestObject('login/Page_Swag Labs/field_username'), 'standard_user')

WebUI.setText(findTestObject('login/Page_Swag Labs/field_password'), 'secret_sauce')

WebUI.click(findTestObject('login/Page_Swag Labs/login_button'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('login/Page_Swag Labs/Add to cart bolt t shirt'))

WebUI.click(findTestObject('login/Page_Swag Labs/button_cart'))

WebUI.click(findTestObject('login/Page_Swag Labs/button_Checkout'))

WebUI.setText(findTestObject('login/Page_Swag Labs/checkout_firstName'), 'dian')

WebUI.setText(findTestObject('login/Page_Swag Labs/checkout_lastName'), 'prasetyo')

WebUI.setText(findTestObject('login/Page_Swag Labs/checkout_postalCode'), '13790')

WebUI.click(findTestObject('login/Page_Swag Labs/button_continue'))

WebUI.takeScreenshot()

