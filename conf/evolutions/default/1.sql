-- Users schema

-- !Ups

CREATE TABLE User (
                      id bigint(20) NOT NULL AUTO_INCREMENT,
                      email varchar(255) NOT NULL,
                      password varchar(255) NOT NULL,
                      fullname varchar(255) NOT NULL,
                      isAdmin boolean NOT NULL,
                      PRIMARY KEY (id)
);


CREATE TABLE RuntimeAppConfig (
    `key` varchar(255) NOT NULL,
    `value` varchar(255) NOT NULL
);


-- !Downs

DROP TABLE User;

DROP TABLE RuntimeAppConfig;