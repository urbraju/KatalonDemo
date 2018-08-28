import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join

WebUI.openBrowser('')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://github.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.open('https://github.com/')

selenium.click('link=Sign in')

selenium.type('id=login_field', 'urbraju@gmail.com')

selenium.type('id=password', 'Cognizant4work')

selenium.click('name=commit')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'urbraju\'])[5]/following::span[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Find file\'])[1]/following::summary[1]')

selenium.click('css=svg.octicon.octicon-clippy')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Find file\'])[1]/following::summary[1]')

selenium.click('css=svg.octicon.octicon-mark-github')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'New organization\'])[1]/following::img[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Settings\'])[1]/following::button[1]')

WebUI.closeBrowser()

