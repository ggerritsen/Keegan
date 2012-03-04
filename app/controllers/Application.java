package controllers;

import models.Assessment;
import models.ResearchSubject;
import play.Logger;
import play.mvc.Controller;

public class Application extends Controller {

    private static final String SUBJECT_ID = "subjectId";

    public static void index() {
        render();
    }

    // page 1
    public static void start() {
        render();
    }

    // page 2
    public static void instructions(String pp_code, String pp_code_repeated) throws Exception {
        validation.required(pp_code);
        validation.required(pp_code_repeated);
        validation.equals(pp_code, pp_code_repeated);
        if (validation.hasErrors()) {
            params.flash();
            validation.keep();
            start();
        }
        Logger.info("Proefpersoon with code %s is here", pp_code);
        ResearchSubject subject = new ResearchSubject();
        subject.setPpCode(pp_code);
        subject.save();
        session.put(SUBJECT_ID, subject.getId());
        Logger.info("Proefpersoon with code %s is stored with id %s", subject.getPpCode(), subject.getId());
        render();
    }

    // page 3
    public static void explanationOfScales() {
        render();
    }

    // page 4
    public static void interview() {
        render();
    }

    // called with ajax on page 4
    public static void postAssessmentData(String scaleLabel, int value, String time) {
        Logger.info(String.format("Incoming assessment data: scale = %s, value = %s, time = %s", scaleLabel, value, time));
        String subjectId = session.get(SUBJECT_ID);
        Logger.info("Retrieved subjectId %s from session", subjectId);
        ResearchSubject subject = getSubjectWithId(subjectId);
        Assessment assessment = subject.getAssessmentWithLabel(scaleLabel);

        assessment.setTime(time).setValue(value);
        assessment.setAssessmentOrder(subject.getNextInOrder());

        subject.save();
        Logger.info(String.format("Stored subject %s", subject));
        Logger.debug("Returning subjectId " + subject.getId());
        renderJSON(subject.getId());
    }

    private static ResearchSubject getSubjectWithId(String subjectId) {
        ResearchSubject subject = ResearchSubject.findById(Long.valueOf(subjectId));
        if (subject == null) {
            subject = new ResearchSubject();
        }
        return subject;
    }
}
