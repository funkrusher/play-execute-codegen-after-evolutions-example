-- Users schema

-- !Ups

ALTER TABLE User MODIFY COLUMN isAdmin int NOT NULL;


-- !Downs

ALTER TABLE User MODIFY COLUMN isAdmin boolean NOT NULL;