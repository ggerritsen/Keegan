package models;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class ExtraQuestions implements Serializable {
    private int tweedeGesprek;
    private int aanneemt;
    private int afwijst;
    private int commercieel;
    private int backOffice;
    private String comments = "";

    public int getTweedeGesprek() {
        return tweedeGesprek;
    }

    public ExtraQuestions setTweedeGesprek(int tweedeGesprek) {
        this.tweedeGesprek = tweedeGesprek;
        return this;
    }

    public int getAanneemt() {
        return aanneemt;
    }

    public ExtraQuestions setAanneemt(int aanneemt) {
        this.aanneemt = aanneemt;
        return this;
    }

    public int getAfwijst() {
        return afwijst;
    }

    public ExtraQuestions setAfwijst(int afwijst) {
        this.afwijst = afwijst;
        return this;
    }

    public int getCommercieel() {
        return commercieel;
    }

    public ExtraQuestions setCommercieel(int commercieel) {
        this.commercieel = commercieel;
        return this;
    }

    public int getBackOffice() {
        return backOffice;
    }

    public ExtraQuestions setBackOffice(int backOffice) {
        this.backOffice = backOffice;
        return this;
    }

    public String getComments() {
        return comments;
    }

    public ExtraQuestions setComments(String comments) {
        this.comments = comments;
        return this;
    }

    @Override
    public String toString() {
        return "ExtraQuestions{" +
                "tweedeGesprek=" + tweedeGesprek +
                ", aanneemt=" + aanneemt +
                ", afwijst=" + afwijst +
                ", commercieel=" + commercieel +
                ", backOffice=" + backOffice +
                ", comments='" + comments + '\'' +
                '}';
    }
}
