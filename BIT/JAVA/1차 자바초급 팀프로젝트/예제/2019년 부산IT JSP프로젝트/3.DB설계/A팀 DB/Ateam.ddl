
CREATE TABLE ad (
    adnum    INT(10) NOT NULL,
    adlink   VARCHAR(50) NOT NULL
)COLLATE='euckr_korean_ci';

ALTER TABLE ad ADD CONSTRAINT ad_pk PRIMARY KEY ( adnum );
ALTER TABLE ad MODIFY adnum INT NOT NULL AUTO_INCREMENT;

CREATE TABLE beer (
    beernum     INT(5) NOT NULL,
    beername    VARCHAR(50) NOT NULL,
    typebig     VARCHAR(30) NOT NULL,
    typesmall   VARCHAR(50) NOT NULL,
    alchol      DOUBLE(3, 2) NOT NULL,
    company     VARCHAR(30) NOT NULL,
    country     VARCHAR(50) NOT NULL
)COLLATE='euckr_korean_ci';

ALTER TABLE beer ADD CONSTRAINT beer_pk PRIMARY KEY ( beernum );
ALTER TABLE beer MODIFY beernum INT NOT NULL AUTO_INCREMENT;

CREATE TABLE beergrade (
    beergradenum   INT(5) NOT NULL,
    beerscore      INT(2) NOT NULL,
    beernum        INT(5) NOT NULL,
    usernum        INT(20) NOT NULL
)COLLATE='euckr_korean_ci';

ALTER TABLE beergrade ADD CONSTRAINT beergrade_pk PRIMARY KEY ( beergradenum );
ALTER TABLE beergrade MODIFY beergradenum INT NOT NULL AUTO_INCREMENT;

CREATE TABLE favorite (
    favnum    INT(20) NOT NULL,
    usernum   INT(20) NOT NULL,
    beernum   INT(20) NOT NULL
)COLLATE='euckr_korean_ci';

ALTER TABLE favorite ADD CONSTRAINT favorite_pk PRIMARY KEY ( favnum );
ALTER TABLE favorite MODIFY favnum INT NOT NULL AUTO_INCREMENT;

CREATE TABLE FileTable (
    filenum    INT(20) NOT NULL,
    filename   VARCHAR(50) NOT NULL,
    filetype   VARCHAR(20) NOT NULL,
    filesize   INT(20) NOT NULL
)COLLATE='euckr_korean_ci';

ALTER TABLE FileTable ADD CONSTRAINT file_pk PRIMARY KEY ( filenum );
ALTER TABLE FileTable MODIFY filenum INT NOT NULL AUTO_INCREMENT;

CREATE TABLE freereply (
    requestreplaynum       INT(10) NOT NULL,
    requestreplaycomment   TEXT,
    requestreplaydate      DATE NOT NULL,
    usernum                INT(20) NOT NULL,
    requestboardnum        INT(20) NOT NULL
)COLLATE='euckr_korean_ci';

ALTER TABLE freereply ADD CONSTRAINT requestreply_pk PRIMARY KEY ( requestreplaynum );
ALTER TABLE freereply MODIFY requestreplaynum INT NOT NULL AUTO_INCREMENT;

CREATE TABLE reply (
    replaynum       INT(10) NOT NULL,
    replaycomment   TEXT,
    replaydate      DATE NOT NULL,
    usernum         INT(20) NOT NULL,
    reviewnum       INT(20) NOT NULL
)COLLATE='euckr_korean_ci';

ALTER TABLE reply ADD CONSTRAINT replay_pk PRIMARY KEY ( replaynum );
ALTER TABLE reply MODIFY replaynum INT NOT NULL AUTO_INCREMENT;

CREATE TABLE replylike (
    reviewlikenum   INT(20) NOT NULL,
    usernum         INT(20) NOT NULL,
    replaynum       INT(10) NOT NULL
)COLLATE='euckr_korean_ci';

ALTER TABLE replylike ADD CONSTRAINT replylike_pk PRIMARY KEY ( reviewlikenum );
ALTER TABLE replylike MODIFY reviewlikenum INT NOT NULL AUTO_INCREMENT;

CREATE TABLE requestboard (
    requestboardnum       INT(20) NOT NULL,
    requestboardtitle     VARCHAR(100) NOT NULL,
    requestboardcomment   TEXT,
    requestboarddate      DATE NOT NULL,
    requestboardtime      DATE NOT NULL,
    filenum               INT(20) NOT NULL
)COLLATE='euckr_korean_ci';

ALTER TABLE requestboard ADD CONSTRAINT requestboard_pk PRIMARY KEY ( requestboardnum );
ALTER TABLE requestboard MODIFY requestboardnum INT NOT NULL AUTO_INCREMENT;

CREATE TABLE rereply (
    rereplynum       INT NOT NULL,
    rereplycomment   TEXT,
    rereplydata      DATE NOT NULL,
    replaynum        INT(10) NOT NULL,
    usernum          INT(20) NOT NULL
)COLLATE='euckr_korean_ci';

ALTER TABLE rereply ADD CONSTRAINT rereplay_pk PRIMARY KEY ( rereplynum );
ALTER TABLE rereply MODIFY rereplynum INT NOT NULL AUTO_INCREMENT;

CREATE TABLE reviewboard (
    reviewnum       INT(20) NOT NULL,
    reviewtitle     VARCHAR(100) NOT NULL,
    reviewcomment   TEXT,
    reviewdate      DATE NOT NULL,
    reviewtime      DATE NOT NULL,
    usernum         INT(20) NOT NULL,
    beernum         INT(5) NOT NULL,
    file_filenum    INT(20) NOT NULL
)COLLATE='euckr_korean_ci';

ALTER TABLE reviewboard ADD CONSTRAINT reviewboard_pk PRIMARY KEY ( reviewnum );
ALTER TABLE reviewboard MODIFY reviewnum INT NOT NULL AUTO_INCREMENT;

CREATE TABLE reviewgrade (
    reviewgradenum   INT(5) NOT NULL,
    reviewscore      INT(2) NOT NULL,
    usernum          INT(20) NOT NULL,
    reviewnum        INT(20) NOT NULL
)COLLATE='euckr_korean_ci';

ALTER TABLE reviewgrade ADD CONSTRAINT reviewgrade_pk PRIMARY KEY ( reviewgradenum );
ALTER TABLE reviewgrade MODIFY reviewgradenum INT NOT NULL AUTO_INCREMENT;

CREATE TABLE reviewlike (
    reviewlikenum   INT(20) NOT NULL,
    reviewnum       INT(20) NOT NULL,
    usernum         INT(20) NOT NULL
)COLLATE='euckr_korean_ci';

ALTER TABLE reviewlike ADD CONSTRAINT like_pk PRIMARY KEY ( reviewlikenum );
ALTER TABLE reviewlike MODIFY reviewlikenum INT NOT NULL AUTO_INCREMENT;

CREATE TABLE UserData (
    usernum     INT(20) NOT NULL,
    usergrant   INT(1) NOT NULL,
    email       VARCHAR(100) NOT NULL,
    pwd         VARCHAR(50) NOT NULL,
    nickname    VARCHAR(24) NOT NULL,
    name        VARCHAR(50) NOT NULL,
    address     VARCHAR(50) NOT NULL,
    tel         VARCHAR(20) NOT NULL
)COLLATE='euckr_korean_ci';

ALTER TABLE UserData ADD CONSTRAINT user_pk PRIMARY KEY ( usernum );
ALTER TABLE UserData MODIFY usernum INT NOT NULL AUTO_INCREMENT;

CREATE TABLE usertrand (
    usernum         INT(20) NOT NULL,
    pilsner         INT(10),
    europeanlager   INT(10),
    germanlager     INT(10),
    americanlager   INT(10),
    germanale       INT(10),
    belgianale      INT(10),
    paleale         INT(10),
    stout           INT(10),
    porter          INT(10),
    irishale        INT(10),
    brownale        INT(10)
)COLLATE='euckr_korean_ci';

ALTER TABLE usertrand ADD CONSTRAINT usertrand_pk PRIMARY KEY ( usernum );

ALTER TABLE beergrade
    ADD CONSTRAINT beergrade_beer_fk FOREIGN KEY ( beernum )
        REFERENCES beer ( beernum );

ALTER TABLE beergrade
    ADD CONSTRAINT beergrade_user_fk FOREIGN KEY ( usernum )
        REFERENCES UserData ( usernum );

ALTER TABLE favorite
    ADD CONSTRAINT favorite_beer_fk FOREIGN KEY ( beernum )
        REFERENCES beer ( beernum );

ALTER TABLE favorite
    ADD CONSTRAINT favorite_user_fk FOREIGN KEY ( usernum )
        REFERENCES UserData ( usernum );

ALTER TABLE reviewlike
    ADD CONSTRAINT like_reviewboard_fk FOREIGN KEY ( reviewnum )
        REFERENCES reviewboard ( reviewnum );

ALTER TABLE reviewlike
    ADD CONSTRAINT like_user_fk FOREIGN KEY ( usernum )
        REFERENCES UserData ( usernum );

ALTER TABLE reply
    ADD CONSTRAINT reply_reviewboard_fk FOREIGN KEY ( reviewnum )
        REFERENCES reviewboard ( reviewnum );

ALTER TABLE reply
    ADD CONSTRAINT reply_user_fk FOREIGN KEY ( usernum )
        REFERENCES UserData ( usernum );

ALTER TABLE replylike
    ADD CONSTRAINT replylike_reply_fk FOREIGN KEY ( replaynum )
        REFERENCES reply ( replaynum );

ALTER TABLE replylike
    ADD CONSTRAINT replylike_user_fk FOREIGN KEY ( usernum )
        REFERENCES UserData ( usernum );

ALTER TABLE requestboard
    ADD CONSTRAINT requestboard_file_fk FOREIGN KEY ( filenum )
        REFERENCES FileTable ( filenum );

ALTER TABLE freereply
    ADD CONSTRAINT requestreply_requestboard_fk FOREIGN KEY ( requestboardnum )
        REFERENCES requestboard ( requestboardnum );

ALTER TABLE freereply
    ADD CONSTRAINT requestreply_user_fk FOREIGN KEY ( usernum )
        REFERENCES UserData ( usernum );

ALTER TABLE rereply
    ADD CONSTRAINT rereply_reply_fk FOREIGN KEY ( replaynum )
        REFERENCES reply ( replaynum );

ALTER TABLE rereply
    ADD CONSTRAINT rereply_user_fk FOREIGN KEY ( usernum )
        REFERENCES UserData ( usernum );

ALTER TABLE reviewboard
    ADD CONSTRAINT reviewboard_beer_fk FOREIGN KEY ( beernum )
        REFERENCES beer ( beernum );

ALTER TABLE reviewboard
    ADD CONSTRAINT reviewboard_file_fk FOREIGN KEY ( file_filenum )
        REFERENCES FileTable ( filenum );

ALTER TABLE reviewboard
    ADD CONSTRAINT reviewboard_user_fk FOREIGN KEY ( usernum )
        REFERENCES UserData ( usernum );

ALTER TABLE reviewgrade
    ADD CONSTRAINT reviewgrade_reviewboard_fk FOREIGN KEY ( reviewnum )
        REFERENCES reviewboard ( reviewnum );

ALTER TABLE reviewgrade
    ADD CONSTRAINT reviewgrade_user_fk FOREIGN KEY ( usernum )
        REFERENCES UserData ( usernum );

ALTER TABLE usertrand
    ADD CONSTRAINT usertrand_user_fk FOREIGN KEY ( usernum )
        REFERENCES UserData ( usernum );

