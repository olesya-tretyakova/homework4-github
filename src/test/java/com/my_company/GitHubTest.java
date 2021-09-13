package com.my_company;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubTest {
    @Test
    void softAssertionPageHasJunitFiveCode() {
        //Открыть страницу Selenide в Github
        open("https://github.com/selenide/selenide");

        //Перейти в раздел Wiki проекта
        $("#wiki-tab").click();

        //Ввести в поле фильтра 'SoftAssertions'
        $("#wiki-pages-filter").setValue("SoftAssertions");

        //Убедиться, что в списке страниц (Pages) есть страница SoftAssertions
        $("[data-filterable-for=wiki-pages-filter]").shouldHave(text("SoftAssertions"));

        // Открыть страницу SoftAssertions
        $("[data-filterable-for=wiki-pages-filter]").$(byText("SoftAssertions")).click();

        //Проверить, что внутри есть пример кода для JUnit5
        $("#wiki-body").shouldHave(text("JUnit5"));
    }
}
