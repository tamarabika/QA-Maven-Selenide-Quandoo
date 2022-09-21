package SelenideDemo;

import org.junit.jupiter.api.Test;
import SelenideDemo.pages.EnquiryPage;

import static com.codeborne.selenide.Selenide.open;
import static SelenideDemo.pages.Page.ENQUIRY_URL;

/**
 * Class EnquiryTest contains tests to Send Enquiry functionality
 */
public class EnquiryTest {

    // classes
    SelenideDemo.pages.EnquiryPage enquiryPage;

    @Test
    /**
     * Negative test which ensures that there is no ability to send enquiry without ticking Terms checkbox.
     */
    public void enquiryWithoutTermsAndPrivacy() {
        //open
        enquiryPage = open(ENQUIRY_URL, EnquiryPage.class);
        EnquiryPage.acceptCookies();

        enquiryPage.sendEnquiryBtnElt().attr("disabled");
        //choose date
        enquiryPage.dayChoose();
        //choose  time
        enquiryPage.timeChoose();
        //fill in data
        enquiryPage.fillInDataFields();
        //check the btn
        enquiryPage.sendEnquiryBtnIsActive();

    }
}



