package controllers;

import models.Assessment;
import models.ResearchSubject;
import play.Logger;
import play.mvc.Controller;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void start() {
        render();
    }

    public static void interview(String pp_name) {
        Logger.info("Proefpersoon %s is here", pp_name);
        ResearchSubject subject = subject = new ResearchSubject();
        subject.setName(pp_name);
        subject.save();
        render(subject);
    }

    // called with ajax
    public static void postAssessmentData(String scaleLabel, int value, String time, long subjectId) {
        Logger.info(String.format("Incoming assessment data: scale = %s, value = %s, time = %s, id = %s", scaleLabel, value, time, subjectId));
        ResearchSubject subject = getSubjectWithId(subjectId);
        Assessment assessment = subject.getAssessmentWithLabel(scaleLabel);

        assessment.setTime(time).setValue(value);
        assessment.setAssessmentOrder(subject.getNextInOrder());

        subject.save();
        Logger.info(String.format("Stored subject %s", subject));
        Logger.info("Returning subjectId " + subject.getId());
        renderJSON(subject.getId());
    }

    private static ResearchSubject getSubjectWithId(long subjectId) {
        ResearchSubject subject = ResearchSubject.findById(subjectId);
        if (subject == null) {
            subject = new ResearchSubject();
        }
        return subject;
    }
}
