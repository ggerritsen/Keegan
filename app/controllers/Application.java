package controllers;

import models.Assessment;
import play.Logger;
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
        Logger.info(String.format("Incoming assessment data: scale = %s, value = %s, time = %s", scale, value, time));
        Assessment assessment = new Assessment(scale, value, time);
        assessment.save();
        Logger.info(String.format("Stored assessment %s", assessment));
    }
}
