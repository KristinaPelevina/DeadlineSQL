package ru.netology.web.test;

import lombok.val;
import org.junit.jupiter.api.*;
import ru.netology.web.data.DataHelper;
import ru.netology.web.page.LoginPage;

import static com.codeborne.selenide.Selenide.open;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ATest {
    @AfterAll
    static void cleanBase() {
        DataHelper.clearTables();
    }

    @Order(1)
    @Test
    void shouldSignIn() {
        val loginPage = open("http://localhost:9999", LoginPage.class);
        val authInfo = DataHelper.getActiveAuthInfo();
        loginPage.login(authInfo);
        loginPage.returnVerificationPage().validVerify(DataHelper.getVerificationCodeFor(authInfo));
    }

    @Order(2)
    @Test
    void shouldBlockedWithErrorPass() {
        val loginPage = open("http://localhost:9999", LoginPage.class);
        val authInfo = DataHelper.getInActiveAuthInfo();
        loginPage.login(authInfo);
        loginPage.login(authInfo);
        loginPage.login(authInfo);
        loginPage.blocked();
    }
}