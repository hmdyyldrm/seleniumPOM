package com.pluralsight;

public class HomePage {

    static String url = "http://www.pluralsight.com";
    static String title = "Online Courses, Learning Paths, and Certifications - Pluralsight";

    public void goTo() {
        Browser.goTo(url);
    }

    public boolean isAt() {
        return Browser.title().equals(title);
    }
}
