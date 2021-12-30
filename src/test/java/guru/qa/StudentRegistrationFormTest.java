package guru.qa;

import guru.qa.pages.RegistrationFormPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static guru.qa.pages.RegistrationFormPage.URL;

public class StudentRegistrationFormTest extends BaseTest {

    @Test
    void fillRegistrationFormTest() {
        BaseData data = new BaseData();

        open(URL, RegistrationFormPage.class)
                .checkThatPageIsLoaded()
                .typeFirstName(data.firstName)
                .typeLastName(data.lastName)
                .typeUserEmail(data.email)
                .setMaleRadio()
                .typeUserPhoneNo(data.phoneNo)
                .setBirthDate("30", "April", "2013")
                .setSubjects(data.subjects)
                .setHobbies(data.hobbies)
                .uploadPicture(data.path)
                .typeAddress(data.address)
                .selectState(data.state)
                .selectCity(data.city)
                .pushSubmitButton()
                .checkResultSubmitting(data.getValuesForCheckingAfterSubmitting());
    }
}
