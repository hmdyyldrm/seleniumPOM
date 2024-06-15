package com.pluralsight;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnitTest {

    @Test
    void canGoToHomePage() {
        Pages.homePage().goTo();
        Assertions.assertTrue(Pages.homePage().isAt());
    }

    @AfterAll
    public static void cleanUp() {
        Browser.close();
    }
}
