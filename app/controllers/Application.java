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
        subject.getIntelligentie().setAssessmentOrder(1);
        subject.getIntelligentie().setTime(time);
        subject.getIntelligentie().setValue(value);
        subject.getAangenaamheid().setAssessmentOrder(2);
        subject.getAangenaamheid().setTime("3");
        subject.getAangenaamheid().setValue(4);
        subject.save();
        Logger.info(String.format("Stored subject %s", subject));
    }
}
