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

WebUI.navigateToUrl('https://academy-for-test.herokuapp.com/view/course')

WebUI.click(findTestObject('Object Repository/Page_Course/button_Load course'))

WebUI.click(findTestObject('Object Repository/Page_Course/th_'))

WebUI.click(findTestObject('Object Repository/Page_Course/th_Price'))

WebUI.click(findTestObject('Object Repository/Page_Course/th_Last Update'))

WebUI.click(findTestObject('Object Repository/Page_Course/th_Last Update'))

WebUI.click(findTestObject('Object Repository/Page_Course/th_Last Update'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Course/select_102550100'), '25', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Course/select_102550100'), '50', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Course/select_102550100'), '100', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Course/select_102550100'), '10', true)

WebUI.click(findTestObject('Object Repository/Page_Course/a_2'))

WebUI.click(findTestObject('Object Repository/Page_Course/a_Previous'))

WebUI.click(findTestObject('Object Repository/Page_Course/a_Next'))

WebUI.click(findTestObject('Object Repository/Page_Course/a_1'))

WebUI.setText(findTestObject('Object Repository/Page_Course/input_Search_form-control form-control-sm'), 'javascript')

WebUI.sendKeys(findTestObject('Object Repository/Page_Course/input_Search_form-control form-control-sm'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Course/input_Search_form-control form-control-sm'), '')

WebUI.click(findTestObject('Object Repository/Page_Course/div_Search'))

