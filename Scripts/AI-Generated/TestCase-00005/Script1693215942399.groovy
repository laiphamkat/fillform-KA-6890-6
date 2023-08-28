import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page_dvc-home_tax-form1_tax-form2'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/dvc-home/tax-form1/tax-form2')

'step 2: At Page_dvc-home_tax-form1_tax-form2 input on input_name'

testObj = findTestObject('Object Repository/Page_dvc-home/input_text')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_1_input_text)

'step 3: At Page_dvc-home_tax-form1_tax-form2 input on input_address'

testObj = findTestObject('Object Repository/Page_dvc-home/input_address')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_2_input_address)

'step 4: At Page_dvc-home_tax-form1_tax-form2 input on input_phone'

testObj = findTestObject('Object Repository/Page_dvc-home/input_phone')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_3_input_phone)

'step 5: At Page_dvc-home_tax-form1_tax-form2 click on input_name'

testObj = findTestObject('Object Repository/Page_dvc-home/input_text')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 6: At Page_dvc-home_tax-form1_tax-form2 input on input_email'

testObj = findTestObject('Object Repository/Page_dvc-home/input_email')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_4_input_email)

'step 7: At Page_dvc-home_tax-form1_tax-form2 input on input_phone'

testObj = findTestObject('Object Repository/Page_dvc-home/input_phone')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_5_input_phone)

'step 8: At Page_dvc-home_tax-form1_tax-form2 click on div_object'

testObj = findTestObject('Object Repository/Page_dvc-home/div_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 9: Add visual checkpoint at Page_dvc-home_tax-form1_tax-form2'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00005_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
