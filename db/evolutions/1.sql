# assessment schema
# --- !Ups

CREATE TABLE research_subject (
    id bigint(20) NOT NULL AUTO_INCREMENT,
    intelligentie_Bvolgorde int DEFAULT -1,
    intelligentie_Vtijd double DEFAULT -1.0,
    intelligentie_score int DEFAULT -1,
    PRIMARY KEY (id)
);

# --- !Downs

DROP TABLE research_subject;
