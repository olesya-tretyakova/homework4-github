package com.my_company;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubSelenideTest {
    String baseUrl = "https://github.com";
    @Test
    void searchSelenideRepoOnGitHub(){
            open(baseUrl);
            $(By.name("q")).setValue("selenide").pressEnter();
            $(".repo-list").shouldHave(Condition.text("selenide"));

    }
}
