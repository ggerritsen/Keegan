# assessment schema
# --- !Ups

CREATE TABLE assessment (
    id bigint(20) NOT NULL AUTO_INCREMENT,
    scale varchar(255) NOT NULL,
    value int DEFAULT -1,
    time bigint DEFAULT -1,
    PRIMARY KEY (id)
);

# --- !Downs

DROP TABLE assessment;
