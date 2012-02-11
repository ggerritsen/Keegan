package controllers;

import models.ResearchSubject;
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
        ResearchSubject subject = new ResearchSubject();
        subject.getAssessments().setIntelligentie_assessmentOrder(1);
        subject.getAssessments().setIntelligentie_time(time);
        subject.getAssessments().setIntelligentie_value(value);
        subject.save();
        Logger.info(String.format("Stored subject %s", subject));
    }
}
