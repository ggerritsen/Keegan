package models;

import java.io.Serializable;

//@Embeddable
public class ExtraQuestions implements Serializable {
    private int tweedeGesprek = -1;
    private int aanneemt = -1;
    private int afwijst = -1;
    private int commercieel = -1;
    private int backOffice = -1;
    private String comments = "";



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
