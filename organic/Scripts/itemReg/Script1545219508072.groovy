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

WebUI.click(findTestObject('Object Repository/Page_organic - Stock Registration/a_  New (1)'))

WebUI.setText(findTestObject('Object Repository/Page_organic - Stock Registration/input_ItemName_ox_organic_Item (1)'), name)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_organic - Stock Registration/select_BOTTLES LANKA (PVT) LTD (1)'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_organic - Stock Registration/select_05 GallonDispenserNew B (1)'), 
    '12', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_organic - Stock Registration/select_MALIBAN PVT LTD null nu'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Page_organic - Stock Registration/input_ItemDiscount_ox_organic_ (1)'), 
    '10.00')

WebUI.click(findTestObject('Object Repository/Page_organic - Stock Registration/a_  Save (1)'))

WebUI.click(findTestObject('Object Repository/Page_organic - Stock Registration/td_Stock Registration created'))

