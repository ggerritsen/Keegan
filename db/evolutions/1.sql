# assessment schema
# --- !Ups

CREATE TABLE research_subject (
    id bigint(20) NOT NULL AUTO_INCREMENT,
    intelligentie_Bvolgorde int DEFAULT -1,
    intelligentie_Vtijd double DEFAULT -1.0,
    intelligentie_score int DEFAULT -1,
    commercieelInzicht_Bvolgorde int DEFAULT -1,
    commercieelInzicht_Vtijd double DEFAULT -1.0,
    commercieelInzicht_score int DEFAULT -1,
    verkoopVaardigheden_Bvolgorde int DEFAULT -1,
    verkoopVaardigheden_Vtijd double DEFAULT -1.0,
    verkoopVaardigheden_score int DEFAULT -1,
    onderhandelen_Bvolgorde int DEFAULT -1,
    onderhandelen_Vtijd double DEFAULT -1.0,
    onderhandelen_score int DEFAULT -1,
    productkennis_Bvolgorde int DEFAULT -1,
    productkennis_Vtijd double DEFAULT -1.0,
    productkennis_score int DEFAULT -1,
    klantGerichtheid_Bvolgorde int DEFAULT -1,
    klantGerichtheid_Vtijd double DEFAULT -1.0,
    klantGerichtheid_score int DEFAULT -1,
    communicatieveVaardigheid_Bvolgorde int DEFAULT -1,
    communicatieveVaardigheid_Vtijd double DEFAULT -1.0,
    communicatieveVaardigheid_score int DEFAULT -1,
    openheid_Bvolgorde int DEFAULT -1,
    openheid_Vtijd double DEFAULT -1.0,
    openheid_score int DEFAULT -1,
    conscientieusheid_Bvolgorde int DEFAULT -1,
    conscientieusheid_Vtijd double DEFAULT -1.0,
    conscientieusheid_score int DEFAULT -1,
    extraversie_Bvolgorde int DEFAULT -1,
    extraversie_Vtijd double DEFAULT -1.0,
    extraversie_score int DEFAULT -1,
    aangenaamheid_Bvolgorde int DEFAULT -1,
    aangenaamheid_Vtijd double DEFAULT -1.0,
    aangenaamheid_score int DEFAULT -1,
    neuroticisme_Bvolgorde int DEFAULT -1,
    neuroticisme_Vtijd double DEFAULT -1.0,
    neuroticisme_score int DEFAULT -1,
    eerlijkheid_Bvolgorde int DEFAULT -1,
    eerlijkheid_Vtijd double DEFAULT -1.0,
    eerlijkheid_score int DEFAULT -1,
    PRIMARY KEY (id)
);

# --- !Downs

DROP TABLE research_subject;
