CREATE TABLE  TEMPERATURA(
  ID INTEGER IDENTITY PRIMARY KEY NOT NULL,
  NO VARCHAR(10) NOT NULL,
  DATETIME VARCHAR(255) NOT NULL,
  TEMP VARCHAR (5) NOT NULL
);

INSERT INTO TEMPERATURA  (NO,DATETIME,TEMP) VALUES( '0','2020-01-01 00:00:00','99.0')
