CREATE TABLE Mask
(
    KFType    VARCHAR2(20)    NOT NULL, 
    stock     NUMBER          NULL, 
	RRnumber  VARCHAR (13)	  NOT NULL,
	count	  NUMBER	  	  NULL
    CONSTRAINT MASK_PK PRIMARY KEY (RRnumber)
)