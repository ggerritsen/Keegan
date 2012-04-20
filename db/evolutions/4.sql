# assessment schema
# --- !Ups

ALTER TABLE research_subject ALTER COLUMN comments TYPE varchar(500);

# --- !Downs

ALTER TABLE research_subject ALTER COLUMN comments TYPE varchar(200);
