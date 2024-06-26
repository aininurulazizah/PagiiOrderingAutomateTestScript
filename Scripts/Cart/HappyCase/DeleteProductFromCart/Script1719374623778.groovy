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

WebUI.callTestCase(findTestCase('AddToCart/HappyCase/AddProductToCartWithValidStocksAndNotes'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Home/a_Pesanan Saya'))

while (true) {
    String quantity = WebUI.getAttribute(findTestObject('Page_Cart/input quantity'), 'value')

    if (quantity == '1') {
        WebUI.click(findTestObject('Page_Cart/decrease button'))
        break
    }
    
    WebUI.click(findTestObject('Page_Cart/decrease button'))
}

WebUI.click(findTestObject('Page_Cart/div_Ya, Hapus'))

WebUI.verifyElementNotPresent(findTestObject('Page_Cart/increase button'), 2, FailureHandling.STOP_ON_FAILURE)

