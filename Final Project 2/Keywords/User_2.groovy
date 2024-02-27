import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class User_2 {
	@Keyword
	def login () {

		def data = findTestData('Data Files/Users')
		def username = data.getObjectValue('Username',2)
		def password = data.getObjectValue('Password',2)

		WebUI.setText(findTestObject('Object Repository/Page_ACME Demo App by Applitools/input_Username_username'),username)
		WebUI.setText(findTestObject('Object Repository/Page_ACME Demo App by Applitools/input_Password_password'),password)
		WebUI.click(findTestObject('Object Repository/Page_ACME Demo App by Applitools/input_Remember Me_form-check-input'))
		WebUI.click(findTestObject('Object Repository/Page_ACME Demo App by Applitools/a_Sign in'))
	}
}
