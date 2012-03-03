# assessment schema
# --- !Ups

CREATE TABLE research_subject (
    id int PRIMARY KEY DEFAULT nextval('subject_sequence'),
    pp_code varchar DEFAULT '',
    intelligentie_Bvolgorde int DEFAULT -1,
    intelligentie_Vtijd real DEFAULT -1.0,
    intelligentie_score int DEFAULT -1,
    commercieelInzicht_Bvolgorde int DEFAULT -1,
    commercieelInzicht_Vtijd real DEFAULT -1.0,
    commercieelInzicht_score int DEFAULT -1,
    verkoopVaardigheden_Bvolgorde int DEFAULT -1,
    verkoopVaardigheden_Vtijd real DEFAULT -1.0,
    verkoopVaardigheden_score int DEFAULT -1,
    onderhandelen_Bvolgorde int DEFAULT -1,
    onderhandelen_Vtijd real DEFAULT -1.0,
    onderhandelen_score int DEFAULT -1,
    productkennis_Bvolgorde int DEFAULT -1,
    productkennis_Vtijd real DEFAULT -1.0,
    productkennis_score int DEFAULT -1,
    klantGerichtheid_Bvolgorde int DEFAULT -1,
    klantGerichtheid_Vtijd real DEFAULT -1.0,
    klantGerichtheid_score int DEFAULT -1,
    communicatieveVaardigheid_Bvolgorde int DEFAULT -1,
    communicatieveVaardigheid_Vtijd real DEFAULT -1.0,
    communicatieveVaardigheid_score int DEFAULT -1,
    openheid_Bvolgorde int DEFAULT -1,
    openheid_Vtijd real DEFAULT -1.0,
    openheid_score int DEFAULT -1,
    conscientieusheid_Bvolgorde int DEFAULT -1,
    conscientieusheid_Vtijd real DEFAULT -1.0,
    conscientieusheid_score int DEFAULT -1,
    extraversie_Bvolgorde int DEFAULT -1,
    extraversie_Vtijd real DEFAULT -1.0,
    extraversie_score int DEFAULT -1,
    aangenaamheid_Bvolgorde int DEFAULT -1,
    aangenaamheid_Vtijd real DEFAULT -1.0,
    aangenaamheid_score int DEFAULT -1,
    neuroticisme_Bvolgorde int DEFAULT -1,
    neuroticisme_Vtijd real DEFAULT -1.0,
    neuroticisme_score int DEFAULT -1,
    eerlijkheid_Bvolgorde int DEFAULT -1,
    eerlijkheid_Vtijd real DEFAULT -1.0,
    eerlijkheid_score int DEFAULT -1
);

# --- !Downs

DROP TABLE research_subject;
