/*init entities database  */

CREATE TABLE user (
  id       INTEGER      NOT NULL AUTO_INCREMENT PRIMARY KEY,
  login    VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL
);

CREATE TABLE user_role (
  id      INTEGER      NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name    VARCHAR(255) NOT NULL,
  user_id INTEGER      NOT NULL,
  FOREIGN KEY (user_id) REFERENCES user (id)
);

CREATE TABLE doctor (
  id         INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
  first_name VARCHAR(255),
  last_name  DATETIME
);

CREATE TABLE schedule (
  id           INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
  doctor_id    INTEGER             NOT NULL,
  day          DATETIME,
  period_start DATETIME,
  period_end   DATETIME,
  user_id      INTEGER,
  FOREIGN KEY (doctor_id) REFERENCES doctor (id),
  FOREIGN KEY (user_id) REFERENCES user (id)
);