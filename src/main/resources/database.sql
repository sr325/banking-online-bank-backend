--drop and create table ACCOUNT
--sequence
--trigger for auto increment
DROP TABLE ACCOUNT;
CREATE TABLE ACCOUNT
(
accountUid int NOT NULL,
description varchar(255) NOT NULL,
defaultCategory varchar(255) NOT NULL,
currency varchar(255) NOT NULL,
createdAt varchar(255) NOT NULL
);

ALTER TABLE ACCOUNT ADD (
CONSTRAINT account_id_pk PRIMARY KEY (accountUid));

CREATE SEQUENCE account_id_pk START WITH 1;

CREATE OR REPLACE TRIGGER account_seq
BEFORE INSERT ON ACCOUNT
FOR EACH ROW

BEGIN
    SELECT account_id_pk.nextval
    INTO :new.accountUid
    FROM dual;
END;
/
COMMIT;
