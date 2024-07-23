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

Windows.startApplicationWithTitle('C:\\Users\\1556\\OneDrive\\Desktop\\Wikipedia.lnk', 'Wikipedia')

Windows.waitForElementPresent(findWindowsObject('Wikipedia/button_Menu'), 5)

Windows.delay(1)

Windows.click(findWindowsObject('Wikipedia/button_Menu'))

Windows.delay(3)

Windows.waitForElementPresent(findWindowsObject('Wikipedia/menu_Login'), 5)

Windows.delay(1)

Windows.click(findWindowsObject('Wikipedia/menu_Login'))

Windows.delay(3)

Windows.waitForElementPresent(findWindowsObject('Wikipedia/field_Username'), 5)

Windows.delay(1)

Windows.setText(findWindowsObject('Wikipedia/field_Username'), 'Test Account Tester')

Windows.delay(3)

Windows.waitForElementPresent(findWindowsObject('Wikipedia/field_Password'), 5)

Windows.delay(1)

Windows.setText(findWindowsObject('Wikipedia/field_Password'), 'Password123!@#')

Windows.delay(3)

Windows.waitForElementPresent(findWindowsObject('Wikipedia/button_Login'), 5)

Windows.click(findWindowsObject('Wikipedia/button_Login'), FailureHandling.STOP_ON_FAILURE)

Windows.delay(2)

Windows.waitForElementPresent(findWindowsObject('Wikipedia/verify_LoginSuccess'), 3)

Windows.verifyElementPresent(findWindowsObject('Wikipedia/verify_LoginSuccess'), 40)

