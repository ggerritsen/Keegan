package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity(name = "research_subject")
public class ResearchSubject extends Model {
    private Assessments assessments;

    public ResearchSubject() {
        this.assessments = new Assessments();
    }

    public Assessments getAssessments() {
        return assessments;
    }
}
