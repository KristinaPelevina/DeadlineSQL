package ru.netology.web.page;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.visible;

public class DashboardPage {

    public DashboardPage() {
        SelenideElement dashboard = $("[data-test-id=dashboard]");
        dashboard.shouldBe(visible);
    }
}