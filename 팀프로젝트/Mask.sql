CREATE TABLE Maskstock
(
    KFType      VARCHAR2(20)    NOT NULL, 
    stock       NUMBER          NULL, 
    CONSTRAINT MASK_PK PRIMARY KEY (KFType)
);

INSERT INTO maskstock (KFType, stock) VALUES ('KF-94',320);
INSERT INTO maskstock (KFType, stock) VALUES ('KF-90',282);
INSERT INTO maskstock (KFType, stock) VALUES ('KF-80',343);
INSERT INTO maskstock (KFType, stock) VALUES ('KF-AD',362);

CREATE TABLE BuyingMask
(
    KFType2      VARCHAR2(20)    NOT NULL,
    RRnumber    VARCHAR2(13)    NOT NULL,
    available   NUMBER          NOT NULL
    );


INSERT INTO BuyingMask (KFType2, RRnumber, available) VALUES ('KF-94', '9412251234567', 2);
INSERT INTO BuyingMask (KFType2, RRnumber, available) VALUES ('KF-90', '9412251234567', 2);
INSERT INTO BuyingMask (KFType2, RRnumber, available) VALUES ('KF-80', '9412251234567', 2);
INSERT INTO BuyingMask (KFType2, RRnumber, available) VALUES ('KF-AD', '9412251234567', 2);

INSERT INTO BuyingMask (KFType2, RRnumber, available) VALUES ('KF-94', '9312251234567', 1);
INSERT INTO BuyingMask (KFType2, RRnumber, available) VALUES ('KF-90', '9312251234567', 1);
INSERT INTO BuyingMask (KFType2, RRnumber, available) VALUES ('KF-80', '9312251234567', 1);
INSERT INTO BuyingMask (KFType2, RRnumber, available) VALUES ('KF-AD', '9312251234567', 1);

INSERT INTO BuyingMask (KFType2, RRnumber, available) VALUES ('KF-94', '9412251234567', 0);
INSERT INTO BuyingMask (KFType2, RRnumber, available) VALUES ('KF-90', '9412251234567', 0);
INSERT INTO BuyingMask (KFType2, RRnumber, available) VALUES ('KF-80', '9412251234567', 0);
INSERT INTO BuyingMask (KFType2, RRnumber, available) VALUES ('KF-AD', '9412251234567', 0);

INSERT INTO BuyingMask (KFType2, RRnumber, available) VALUES ('KF-94', '9612251234567', 3);
INSERT INTO BuyingMask (KFType2, RRnumber, available) VALUES ('KF-90', '9612251234567', 3);
INSERT INTO BuyingMask (KFType2, RRnumber, available) VALUES ('KF-80', '9612251234567', 3);
INSERT INTO BuyingMask (KFType2, RRnumber, available) VALUES ('KF-AD', '9612251234567', 3);

INSERT INTO BuyingMask (KFType2, RRnumber, available) VALUES ('KF-94', '9712251234567', 1);
INSERT INTO BuyingMask (KFType2, RRnumber, available) VALUES ('KF-90', '9712251234567', 1);
INSERT INTO BuyingMask (KFType2, RRnumber, available) VALUES ('KF-80', '9712251234567', 1);
INSERT INTO BuyingMask (KFType2, RRnumber, available) VALUES ('KF-AD', '9712251234567', 1);