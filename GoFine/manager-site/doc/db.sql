create table t_app
(
	appid bigint auto_increment
		primary key,
	`key` varchar(64) not null,
	name varchar(128) not null,
	state int default '0' not null,
	addDate date not null,
	updateDate date not null,
	constraint t_app_key_uindex
		unique (key)
)
;

create table t_auth
(
	authid bigint auto_increment
		primary key,
	authCode varchar(32) not null,
	authName varchar(168) not null,
	modifyDate date not null
)
;

create table t_role
(
	roleid bigint auto_increment
		primary key,
	roleName varchar(128) not null
)
;

create table t_user
(
	userid int auto_increment
		primary key,
	userName varchar(45) not null,
	password varchar(45) not null,
	realName varchar(45) null,
	age int null,
	phoneNumber varchar(45) null,
	headPicture varchar(45) null,
	addDate date null,
	updateDate date null,
	state int default '0' null comment '1：正常
	2：冻结
	3：删除',
	constraint name_UNIQUE
		unique (userName)
)
;

