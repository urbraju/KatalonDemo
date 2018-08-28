import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.G_URL)

WebUI.waitForPageLoad(GlobalVariable.G_TimeOut)

WebUI.waitForElementVisible(findTestObject('Page_myATT Login - Pay Bills Online/h1_Sign in to manage your acco'), GlobalVariable.G_TimeOut)

WebUI.setText(findTestObject('Object Repository/Page_myATT Login - Pay Bills Online/input_userName'), GlobalVariable.G_UserName)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_myATT Login - Pay Bills Online/input_password'), GlobalVariable.G_password)

WebUI.click(findTestObject('Object Repository/Page_myATT Login - Pay Bills Online/span_Sign in'))

WebUI.waitForElementVisible(findTestObject('Page_Overview Landing Page/span_bheemaraj'), GlobalVariable.G_TimeOut)

WebUI.verifyElementPresent(findTestObject('Page_Overview Landing Page/h1_Welcome Bheemaraj'), GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Object Repository/Page_Overview Landing Page/span_bheemaraj'))

WebUI.click(findTestObject('Object Repository/Page_Overview Landing Page/a_Sign out'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_myATT Login - Pay Bills Online/h1_Sign in to manage your acco'), 
    GlobalVariable.G_TimeOut)

WebUI.verifyElementPresent(findTestObject('Page_myATT Login - Pay Bills Online/h1_Sign in to manage your acco'), GlobalVariable.G_TimeOut)

WebUI.closeBrowser()

