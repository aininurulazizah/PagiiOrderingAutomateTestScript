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

WebUI.callTestCase(findTestCase('Cart/HappyCase/SC05_Checkout/TC01_CheckoutWithValidQuantityAndNote'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Checkout/button_data diri'))

WebUI.setText(findTestObject('Page_Checkout/Data Diri Fields/input_nama'), 'Aini')

WebUI.setText(findTestObject('Page_Checkout/Data Diri Fields/input_email'), 'aini@example.com')

WebUI.setText(findTestObject('Page_Checkout/Data Diri Fields/input_telepon'), '085156173645')

WebUI.click(findTestObject('Page_Checkout/Data Diri Fields/span_simpan data diri'))

WebUI.delay(2)

actualURL = WebUI.getUrl()

expectedLink = (('https://pagii-ordering.stg8.smtapps.net/' + GlobalVariable.LinkToko) + '/checkout')

WebUI.verifyMatch(actualURL, expectedLink, false)

WebUI.verifyElementPresent(findTestObject('Page_Checkout/span_Aini'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Checkout/span_email dan phone aini'), 0)

