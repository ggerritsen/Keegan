package controllers;

import play.mvc.Controller;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void interview() {
        render();
    }

    // called with ajax
    public static void postAssessmentData(String scale, int value, String time) {
        System.out.println(String.format("scale: %s, value: %s, time: %s", scale, value, time));
    }
}
