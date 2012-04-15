package models;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class Assessment implements Serializable {

    private int assessmentOrder;
    private int score;
    private double time;

    public int getAssessmentOrder() {
        return assessmentOrder;
    }

    public Assessment setAssessmentOrder(int assessmentOrder) {
        this.assessmentOrder = assessmentOrder;
        return this;
    }

    public int getScore() {
        return score;
    }

    public Assessment setScore(int score) {
        this.score = score;
        return this;
    }

    public double getTime() {
        return time;
    }

    public Assessment setTime(String time) {
        this.time = Double.valueOf(time);
        return this;
    }

    @Override
    public String toString() {
        return "Assessment{" +
                "assessmentOrder=" + assessmentOrder +
                ", score=" + score +
                ", time=" + time +
                '}';
    }
}
