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
  id         INTEGER      NOT NULL AUTO_INCREMENT PRIMARY KEY,
  first_name VARCHAR(255) NOT NULL,
  last_name  VARCHAR(255) NOT NULL
);

CREATE TABLE schedule (
  id           INTEGER  NOT NULL AUTO_INCREMENT PRIMARY KEY,
  doctor_id    INTEGER  NOT NULL,
  day          DATETIME NOT NULL,
  period_start DATETIME NOT NULL,
  period_end   DATETIME NOT NULL,
  user_id      INTEGER,
  FOREIGN KEY (doctor_id) REFERENCES doctor (id),
  FOREIGN KEY (user_id) REFERENCES user (id)
);

/*insert data*/

INSERT INTO user (login, password) VALUES ('user1', '$2a$10$hbzufY.65cFNyV5bsAOwZOW350dyLsaGveEco6ej0UpPxXbCui4Hq');
INSERT INTO user (login, password) VALUES ('user2', '$2a$10$hbzufY.65cFNyV5bsAOwZOW350dyLsaGveEco6ej0UpPxXbCui4Hq');


INSERT INTO user_role (name, user_id) VALUES ('USER', 1);
INSERT INTO user_role (name, user_id) VALUES ('USER', 2);


INSERT INTO doctor (first_name, last_name) VALUES ('Вася', 'Пупкин');
INSERT INTO doctor (first_name, last_name) VALUES ('Иван', 'Долгоправов');
INSERT INTO doctor (first_name, last_name) VALUES ('Иван', 'Грозный');

INSERT INTO schedule (doctor_id, day, period_start, period_end)
VALUES (1, '2016-12-27', '2016-12-27 11:00:00', '2016-12-28 12:00:00');
INSERT INTO schedule (doctor_id, day, period_start, period_end)
VALUES (1, '2016-12-27', '2016-12-27 12:00:00', '2016-12-28 13:00:00');
INSERT INTO schedule (doctor_id, day, period_start, period_end)
VALUES (1, '2016-12-27', '2016-12-27 13:00:00', '2016-12-28 14:00:00');

INSERT INTO schedule (doctor_id, day, period_start, period_end)
VALUES (2, '2016-12-27', '2016-12-27 11:00:00', '2016-12-28 12:00:00');
INSERT INTO schedule (doctor_id, day, period_start, period_end)
VALUES (2, '2016-12-27', '2016-12-27 12:00:00', '2016-12-28 13:00:00');
INSERT INTO schedule (doctor_id, day, period_start, period_end)
VALUES (2, '2016-12-27', '2016-12-27 13:00:00', '2016-12-28 14:00:00');

INSERT INTO schedule (doctor_id, day, period_start, period_end)
VALUES (3, '2016-12-27', '2016-12-27 11:00:00', '2016-12-28 12:00:00');
INSERT INTO schedule (doctor_id, day, period_start, period_end)
VALUES (3, '2016-12-27', '2016-12-27 12:00:00', '2016-12-28 13:00:00');
INSERT INTO schedule (doctor_id, day, period_start, period_end)
VALUES (3, '2016-12-27', '2016-12-27 13:00:00', '2016-12-28 14:00:00');


