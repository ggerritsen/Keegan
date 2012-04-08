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

    public void setTweedeGesprek(int tweedeGesprek) {
        this.tweedeGesprek = tweedeGesprek;
    }

    public int getAanneemt() {
        return aanneemt;
    }

    public void setAanneemt(int aanneemt) {
        this.aanneemt = aanneemt;
    }

    public int getAfwijst() {
        return afwijst;
    }

    public void setAfwijst(int afwijst) {
        this.afwijst = afwijst;
    }

    public int getCommercieel() {
        return commercieel;
    }

    public void setCommercieel(int commercieel) {
        this.commercieel = commercieel;
    }

    public int getBackOffice() {
        return backOffice;
    }

    public void setBackOffice(int backOffice) {
        this.backOffice = backOffice;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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
