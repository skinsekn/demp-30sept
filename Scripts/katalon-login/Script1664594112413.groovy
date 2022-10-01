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

WebUI.navigateToUrl('https://katalon.com/')

WebUI.click(findTestObject('Object Repository/katalon-login/Page_Katalon Software Quality Management Platform/a_Log in'))

WebUI.setText(findTestObject('Object Repository/katalon-login/Page_Sign in  Katalon Solution/input_Welcome back_user_email'), 
    'demo@drsnehaskinclinic.com')

WebUI.setEncryptedText(findTestObject('Object Repository/katalon-login/Page_Sign in  Katalon Solution/input_Valid email is required to activate p_255484'), 
    'X6tYX+DEmSrmEcuwQ1wXKg==')

WebUI.click(findTestObject('Object Repository/katalon-login/Page_Sign in  Katalon Solution/input_Incorrect email or password. Please t_566e02'))

WebUI.click(findTestObject('Object Repository/katalon-login/Page_Sign in  Katalon Solution/img_Valid email is required to activate pro_07b384'))

WebUI.setText(findTestObject('Object Repository/katalon-login/Page_Sign in  Katalon Solution/input_Valid email is required to activate p_255484_1'), 
    'supp0rt$ESDS')

WebUI.click(findTestObject('Object Repository/katalon-login/Page_Sign in  Katalon Solution/input_Incorrect email or password. Please t_566e02'))

WebUI.click(findTestObject('Object Repository/katalon-login/Page_My Organization_01 - Katalon TestOps/span_R'))

WebUI.click(findTestObject('Object Repository/katalon-login/Page_My Organization_01 - Katalon TestOps/a_Sign Out'))

WebUI.closeBrowser()

