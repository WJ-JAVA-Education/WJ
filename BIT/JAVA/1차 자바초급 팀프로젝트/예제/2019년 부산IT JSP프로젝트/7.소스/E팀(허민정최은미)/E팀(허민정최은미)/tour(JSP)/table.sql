CREATE TABLE toMember (
  id char(20) NOT NULL,
  pwd char(20) NOT NULL,
  name char(20) NOT NULL,
  birthday char(6) NOT NULL,
  gender char(6) NOT NULL,
  email char(30) NOT NULL,
  hp char(20) NOT NULL,
  grade char(2) default '0',
  PRIMARY KEY (id)
)COLLATE='euckr_korean_ci';

create table toCost(
	num int(11) NOT NULL  auto_increment,
	name char(20) not null,
	childbirth char(20),
	saleitem1 char(50),
    	saleitem2 char(50),
    	saleitem3 char(50),
    	saleitem4 char(50),
	email char(30),
	hp char(40),
	adultNum int(10),
	childNum int(10),
	tourDay date,
	tourTime date,
	regdate date,
	senddate date,
	comment varchar(200),
	PRIMARY KEY ( `num` )
)COLLATE='euckr_korean_ci';


CREATE TABLE `toBoard` (
	`num`               int(11)              NOT NULL  auto_increment  ,
	`name`              varchar(20)                    ,
	`subject`           varchar(50)                    ,
	`content`           text                           ,
	`pos`                smallint(7) unsigned           ,
	`ref`               smallint(7)                    ,
	`depth`             smallint(7) unsigned           ,
	`regdate`          date                           ,
	`pass`              varchar(15)                    ,
	`ip`                  varchar(15)                    ,
	`count`             smallint(7) unsigned           ,
	`filename`         varchar(30)                    ,
	`filesize`           int(11)                        ,
	PRIMARY KEY ( `num` )
)COLLATE='euckr_korean_ci';


create table toBComment(
 cnum int primary key auto_increment,
 num int,
 name varchar(20),
 comment varchar(200),
 regdate date
)COLLATE='euckr_korean_ci';

insert toBoard(name,content,subject,ref,pos,depth,regdate,pass,count,ip,filename,filesize)
values('aaa', 'bbb', 'ccc', 0, 0, 0, now(), '1111',0, '127.0.0.1', null, 0);tobcomment

CREATE TABLE toProduct (
	no                int(5)   auto_increment  ,
	proName            varchar(20) ,
	coName            varchar(20)  ,
	adultPrice             int (11)     ,
	childPrice            int  (11)     ,
	detail            text   NULL ,
	category	    int(11),
	PRIMARY KEY ( no )
)COLLATE='euckr_korean_ci';

CREATE TABLE toOrder (
	no                    int                          auto_increment  ,
	productNo      int                            NULL  ,
	quantity1          int                           NULL      ,
	quantity2         int                           NULL      ,
	date                varchar(20)           NULL      ,
	tourdate                varchar(20)           NULL      ,
	tourtime                varchar(20)           NULL      ,
	senddate               varchar(20)           NULL      ,
	state               varchar(10)           NULL      ,
	id                     varchar(10)           NULL      ,
	name                    varchar(10)           NULL      ,
	PRIMARY KEY ( no )
)COLLATE='euckr_korean_ci';