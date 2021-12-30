package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }
}
