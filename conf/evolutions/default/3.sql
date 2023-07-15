-- !Ups

ALTER TABLE `user` MODIFY COLUMN isAdmin boolean NOT NULL;


-- !Downs

ALTER TABLE `user` MODIFY COLUMN isAdmin int NOT NULL;