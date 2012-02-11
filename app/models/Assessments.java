package models;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Assessments {

    @Column(name = "intelligentie_Bvolgorde")
    private int intelligentie_assessmentOrder;

    @Column(name = "intelligentie_score")
    private int intelligentie_value;

    @Column(name = "intelligentie_Vtijd")
    private double intelligentie_time;

    // package private, for test purposes
    public Assessments() {}

    public int getIntelligentie_assessmentOrder() {
        return intelligentie_assessmentOrder;
    }

    public void setIntelligentie_assessmentOrder(int assessmentOrder) {
        this.intelligentie_assessmentOrder = assessmentOrder;
    }

    public int getIntelligentie_value() {
        return intelligentie_value;
    }

    public void setIntelligentie_value(int value) {
        this.intelligentie_value = value;
    }

    public double getIntelligentie_time() {
        return intelligentie_time;
    }

    public void setIntelligentie_time(String time) {
        this.intelligentie_time = Double.valueOf(time);
    }
}
