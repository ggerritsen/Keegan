package models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.*;

import play.Logger;
import play.db.jpa.Model;

@Entity(name = "research_subject")
public class ResearchSubject extends Model implements Serializable {

    @Column(name = "pp_code")
    private String ppCode;

    public void setPpCode(String ppCode) {
        this.ppCode = ppCode;
    }

    public Assessment getAssessmentWithLabel(String label) {
        Map<String, Assessment> allAssessments = getAllAssessments();
        for (Map.Entry<String, Assessment> entry : allAssessments.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(label)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public int getNextInOrder() {
        int count = 0;
        for (Map.Entry<String, Assessment> entry : getAllAssessments().entrySet()) {
            Logger.debug("assessing stuff...: " + entry.getKey());
            if (entry.getValue().getAssessmentOrder() > 0) {
                Logger.debug("assessment order > 0 --> " + entry.getValue().getAssessmentOrder());
                count++;
            }
        }
        return count + 1;
    }

    private Map<String, Assessment> getAllAssessments() {
        return new HashMap<String, Assessment>() {{
            put("intelligentie", intelligentie);
            put("commercieelInzicht", commercieelInzicht);
            put("verkoopVaardigheden", verkoopVaardigheden);
            put("onderhandelen", onderhandelen);
            put("klantgerichtheid", klantGerichtheid);
            put("mondelingCommuniceren", mondelingCommuniceren);
            put("openheid", openheid);
            put("conscientieusheid", conscientieusheid);
            put("extraversie", extraversie);
            put("aangenaamheid", aangenaamheid);
            put("emotioneleStabiliteit", emotioneleStabiliteit);
            put("eerlijkheid", eerlijkheid);
        }};
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "assessmentOrder", column = @Column(name = "intelligentie_Bvolgorde")),
        @AttributeOverride(name = "value", column = @Column(name = "intelligentie_score")),
        @AttributeOverride(name = "time", column = @Column(name = "intelligentie_Vtijd"))
    })
    private Assessment intelligentie = new Assessment();

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "assessmentOrder", column = @Column(name = "commercieelInzicht_Bvolgorde")),
            @AttributeOverride(name = "value", column = @Column(name = "commercieelInzicht_score")),
            @AttributeOverride(name = "time", column = @Column(name = "commercieelInzicht_Vtijd"))
    })
    private Assessment commercieelInzicht = new Assessment();

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "assessmentOrder", column = @Column(name = "verkoopVaardigheden_Bvolgorde")),
            @AttributeOverride(name = "value", column = @Column(name = "verkoopVaardigheden_score")),
            @AttributeOverride(name = "time", column = @Column(name = "verkoopVaardigheden_Vtijd"))
    })
    private Assessment verkoopVaardigheden = new Assessment();

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "assessmentOrder", column = @Column(name = "onderhandelen_Bvolgorde")),
            @AttributeOverride(name = "value", column = @Column(name = "onderhandelen_score")),
            @AttributeOverride(name = "time", column = @Column(name = "onderhandelen_Vtijd"))
    })
    private Assessment onderhandelen = new Assessment();

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "assessmentOrder", column = @Column(name = "klantGerichtheid_Bvolgorde")),
            @AttributeOverride(name = "value", column = @Column(name = "klantGerichtheid_score")),
            @AttributeOverride(name = "time", column = @Column(name = "klantGerichtheid_Vtijd"))
    })
    private Assessment klantGerichtheid = new Assessment();

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "assessmentOrder", column = @Column(name = "mondelingCommuniceren_Bvolgorde")),
            @AttributeOverride(name = "value", column = @Column(name = "mondelingCommuniceren_score")),
            @AttributeOverride(name = "time", column = @Column(name = "mondelingCommuniceren_Vtijd"))
    })
    private Assessment mondelingCommuniceren = new Assessment();

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "assessmentOrder", column = @Column(name = "openheid_Bvolgorde")),
            @AttributeOverride(name = "value", column = @Column(name = "openheid_score")),
            @AttributeOverride(name = "time", column = @Column(name = "openheid_Vtijd"))
    })
    private Assessment openheid = new Assessment();

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "assessmentOrder", column = @Column(name = "conscientieusheid_Bvolgorde")),
            @AttributeOverride(name = "value", column = @Column(name = "conscientieusheid_score")),
            @AttributeOverride(name = "time", column = @Column(name = "conscientieusheid_Vtijd"))
    })
    private Assessment conscientieusheid = new Assessment();

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "assessmentOrder", column = @Column(name = "extraversie_Bvolgorde")),
            @AttributeOverride(name = "value", column = @Column(name = "extraversie_score")),
            @AttributeOverride(name = "time", column = @Column(name = "extraversie_Vtijd"))
    })
    private Assessment extraversie = new Assessment();

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "assessmentOrder", column = @Column(name = "aangenaamheid_Bvolgorde")),
            @AttributeOverride(name = "value", column = @Column(name = "aangenaamheid_score")),
            @AttributeOverride(name = "time", column = @Column(name = "aangenaamheid_Vtijd"))
    })
    private Assessment aangenaamheid = new Assessment();

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "assessmentOrder", column = @Column(name = "emotioneleStabiliteit_Bvolgorde")),
            @AttributeOverride(name = "value", column = @Column(name = "emotioneleStabiliteit_score")),
            @AttributeOverride(name = "time", column = @Column(name = "emotioneleStabiliteit_Vtijd"))
    })
    private Assessment emotioneleStabiliteit = new Assessment();

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "assessmentOrder", column = @Column(name = "eerlijkheid_Bvolgorde")),
            @AttributeOverride(name = "value", column = @Column(name = "eerlijkheid_score")),
            @AttributeOverride(name = "time", column = @Column(name = "eerlijkheid_Vtijd"))
    })
    private Assessment eerlijkheid = new Assessment();

    public Assessment getIntelligentie() {
        return intelligentie;
    }

    public Assessment getCommercieelInzicht() {
        return commercieelInzicht;
    }

    public Assessment getVerkoopVaardigheden() {
        return verkoopVaardigheden;
    }

    public Assessment getOnderhandelen() {
        return onderhandelen;
    }

    public Assessment getKlantGerichtheid() {
        return klantGerichtheid;
    }

    public Assessment getMondelingCommuniceren() {
        return mondelingCommuniceren;
    }

    public Assessment getOpenheid() {
        return openheid;
    }

    public Assessment getConscientieusheid() {
        return conscientieusheid;
    }

    public Assessment getExtraversie() {
        return extraversie;
    }

    public Assessment getAangenaamheid() {
        return aangenaamheid;
    }

    public Assessment getEmotioneleStabiliteit() {
        return emotioneleStabiliteit;
    }

    public Assessment getEerlijkheid() {
        return eerlijkheid;
    }

    public String getPpCode() {
        return ppCode;
    }
}
