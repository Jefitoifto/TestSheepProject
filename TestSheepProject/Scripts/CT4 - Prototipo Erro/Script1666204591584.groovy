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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://testsheepnz.github.io/BasicCalculator.html')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Basic Calculator/select_Prototype                          1_8a1659'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Page_Basic Calculator/input_First number_number1'), 'passo')

WebUI.setText(findTestObject('Object Repository/Page_Basic Calculator/input_Second number_number2'), '5')

WebUI.click(findTestObject('Object Repository/Page_Basic Calculator/input_Operation_calculateButton'))

WebUI.verifyElementText(findTestObject('Page_Basic Calculator/label_Number 1 is not a number'), 'Number 1 is not a number')

