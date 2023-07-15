-- !Ups

CREATE TABLE RuntimeAppConfig (
                                  `key` varchar(255) NOT NULL,
                                  `value` varchar(255) NOT NULL
);

CREATE TABLE role
(
    roleId VARCHAR(50) NOT NULL,
    PRIMARY KEY (roleId)
);

CREATE TABLE user
(
    userId     INT NOT NULL AUTO_INCREMENT,
    clientId   INT NOT NULL,
    email      VARCHAR(255) NOT NULL,
    firstname  VARCHAR(255) NOT NULL,
    lastname   VARCHAR(255) NOT NULL,
    isAdmin    INT NOT NULL,
    PRIMARY KEY (userId),
    CONSTRAINT fk_user_clientId FOREIGN KEY (clientId) REFERENCES client (clientId) ON DELETE CASCADE
);

CREATE TABLE user_role
(
    userId     INT NOT NULL,
    roleId     VARCHAR(50) NOT NULL,
    PRIMARY KEY (userId, roleId),
    CONSTRAINT fk_user_role_userId FOREIGN KEY (userId) REFERENCES user (userId) ON DELETE CASCADE,
    CONSTRAINT fk_user_role_roleId FOREIGN KEY (roleId) REFERENCES role (roleId) ON DELETE CASCADE
);

INSERT INTO role (roleId)
VALUES ("ADMIN");
INSERT INTO role (roleId)
VALUES ("EDITOR");
INSERT INTO role (roleId)
VALUES ("VIEWER");

-- !Downs

DROP TABLE user_role;
DROP TABLE user;
DROP TABLE role;
DROP TABLE RuntimeAppConfig;