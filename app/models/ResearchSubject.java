package models;

import java.io.Serializable;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity(name = "research_subject")
public class ResearchSubject extends Model implements Serializable {

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "assessmentOrder", column = @Column(name = "intelligentie_Bvolgorde")),
        @AttributeOverride(name = "value", column = @Column(name = "intelligentie_score")),
        @AttributeOverride(name = "time", column = @Column(name = "intelligentie_Vtijd"))
    })
    private Assessment intelligentie;

    public ResearchSubject() {
        this.intelligentie = new Assessment();
    }

    public Assessment getIntelligentie() {
        return intelligentie;
    }
}
