# sequence for sequence hibernate_sequence (which, apparently, is necessary) 
# --- !Ups

CREATE SEQUENCE hibernate_sequence START 1;

# --- !Downs

DROP SEQUENCE hibernate_sequence;
