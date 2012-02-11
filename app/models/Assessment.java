package models;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class Assessment implements Serializable {

    private int assessmentOrder;
    private int value;
    private double time;

    public int getAssessmentOrder() {
        return assessmentOrder;
    }

    public void setAssessmentOrder(int assessmentOrder) {
        this.assessmentOrder = assessmentOrder;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public double getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = Double.valueOf(time);
    }
}
