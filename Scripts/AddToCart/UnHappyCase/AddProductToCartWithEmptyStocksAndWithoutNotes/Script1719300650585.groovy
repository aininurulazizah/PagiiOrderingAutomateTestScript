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

WebUI.callTestCase(findTestCase('Web/Navigate To Toko'), [('Toko') : GlobalVariable.Toko], FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.scrollToElement(findTestObject('Page_Home/p_Semua Menu'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Page_Home/div_Banana Cream'))

WebUI.scrollToElement(findTestObject('Page_AddToCart/notes'), 0)

WebUI.setText(findTestObject('Page_AddToCart/quantity'), '')

WebUI.delay(2)

TestObject divButtonElement = findTestObject('Page_AddToCart/div_Tambah ke keranjang Banana')

String classAttributeValue = WebUI.getAttribute(divButtonElement, 'class')

assert classAttributeValue.contains('cursor-not-allowed')

