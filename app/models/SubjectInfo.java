package models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.*;

import play.Logger;
import play.db.jpa.Model;

@Entity(name = "subject_info")
public class SubjectInfo extends Model implements Serializable {

    @OneToOne
    @JoinColumn(name = "subject_id")
    private ResearchSubject subject;

    private String name;

    public void setName(String name) {
        this.name = name;
    }
}
