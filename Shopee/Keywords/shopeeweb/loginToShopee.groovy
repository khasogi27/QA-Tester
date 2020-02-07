package shopeeweb

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

public class loginToShopee {
	def static void login(){
		def popup = findTestObject('login/popup-shopee')
		def Login = findTestObject('Login/login-btn')
		def Username = findTestObject('Login/Username-input')
		def Password = findTestObject('Login/Password-input')
		def submit = findTestObject('Login/login-btn2')

		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl('shopee.co.id')
		WebUI.delay(2)
		WebUI.click(popup)
		WebUI.delay(2)
		WebUI.click(Login)
		WebUI.delay(2)
		WebUI.setText(Username, 'khasogi27@gmail.com')
		WebUI.delay(2)
		WebUI.setText(Password, 'passwordtest123
')
		WebUI.delay(2)
		WebUI.click(submit)
		WebUI.delay(2)
	}
}
