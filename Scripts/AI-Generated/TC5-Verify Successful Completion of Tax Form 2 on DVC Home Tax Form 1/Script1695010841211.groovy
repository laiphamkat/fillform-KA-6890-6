import com.kms.katalon.core.model.FailureHandling
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Do navigate at Page_dvc-home_tax-form1_tax-form2'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/dvc-home/tax-form1/tax-form2')

'step 2: At Page_dvc-home_tax-form1_tax-form2 input on input_name'

testObj = findTestObject('Object Repository/Page_dvc-home/input_text')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_1_input_text)

'step 3: At Page_dvc-home_tax-form1_tax-form2 input on input_address'

testObj = findTestObject('Object Repository/Page_dvc-home/input_province')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_2_input_province)

'step 4: At Page_dvc-home_tax-form1_tax-form2 input on input_phone'

testObj = findTestObject('Object Repository/Page_dvc-home/input_district')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_3_input_district)

'step 5: At Page_dvc-home_tax-form1_tax-form2 click on input_name'

testObj = findTestObject('Object Repository/Page_dvc-home/input_text')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 6: At Page_dvc-home_tax-form1_tax-form2 input on input_email'

testObj = findTestObject('Object Repository/Page_dvc-home/input_village')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_4_input_village)

'step 7: At Page_dvc-home_tax-form1_tax-form2 input on input_phone'

testObj = findTestObject('Object Repository/Page_dvc-home/input_district')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_5_input_district)

'step 8: At Page_dvc-home_tax-form1_tax-form2 click on div_object'

testObj = findTestObject('Object Repository/Page_dvc-home/div_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 9: Add visual checkpoint at Page_dvc-home_tax-form1_tax-form2'

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Verify Successful Completion of Tax Form 2 on DVC Home Tax Form 1_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
