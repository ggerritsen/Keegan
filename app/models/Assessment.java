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

    public Assessment setAssessmentOrder(int assessmentOrder) {
        this.assessmentOrder = assessmentOrder;
        return this;
    }

    public int getValue() {
        return value;
    }

    public Assessment setValue(int value) {
        this.value = value;
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
                ", value=" + value +
                ", time=" + time +
                '}';
    }
}
