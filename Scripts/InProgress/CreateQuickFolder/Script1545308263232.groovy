import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.delay(5)

WebUI.click(findTestObject('Headers/Repository'))

WebUI.delay(10)

WebUI.click(findTestObject('Content_Repository/QuickFolder_btn'))

WebUI.delay(5)

FolderName = RandomStringUtils.randomAlphabetic(10)

WebUI.setText(findTestObject('Content_Repository/FolderNameQuick_txt'), FolderName)

WebUI.delay(5)

WebUI.click(findTestObject('Content_Repository/QuickFolderSave_btn'))

WebUI.delay(5)

WebUI.click(findTestObject('Content_Repository/RootFolder'))

WebUI.delay(5)

//WebUI.verifyTextPresent('', FolderName)
WebUI.verifyTextPresent(FolderName, false)


