/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     5/17/2021 4:25:51 PM                         */
/*==============================================================*/


drop table if exists REPLY;

drop table if exists POST;

drop table if exists BLOCK;

drop table if exists USER;

/*==============================================================*/
/* Table: BLOCK                                                 */
/*==============================================================*/
create table BLOCK
(
   GENKEY               varchar(32) not null unique,
   NAME                 varchar(32) not null unique,
   DISC                 varchar(512) not null,
   primary key (GENKEY)
);

/*==============================================================*/
/* Table: POST                                                  */
/*==============================================================*/
create table POST
(
   GENKEY               varchar(32) not null unique,
   TITLE                varchar(128)not null unique,
   BLOCK_GK             varchar(32) not null,
   AUTHOR_GK            varchar(32)	not null,
   primary key (GENKEY)
);

/*==============================================================*/
/* Table: REPLY                                                 */
/*==============================================================*/
create table REPLY
(
   GENKEY               varchar(32) not null unique,
   POST_GK              varchar(32) not null,
   LEVEL                integer(4)	not null,
   AUTHOR_GK            varchar(32)	not null,
   COMMENT              longtext    not null,
   REPLY_TO_GK          varchar(32) not null,
   primary key (GENKEY)
);

/*==============================================================*/
/* Table: USER                                                  */
/*==============================================================*/
create table USER
(
   GENKEY               varchar(32) not null unique,
   USERNAME             varchar(20) not null unique,
   PASSWORD             varchar(20) not null,
   PHONE                integer(13) unique,
   EMAIL                varchar(30) unique,
   QQ                   integer(15) unique,
   primary key (GENKEY)
);

alter table POST add constraint FK_REFERENCE_1 foreign key (AUTHOR_GK)
      references USER (GENKEY) on delete restrict on update restrict;

alter table POST add constraint FK_REFERENCE_2 foreign key (BLOCK_GK)
      references BLOCK (GENKEY) on delete restrict on update restrict;

alter table REPLY add constraint FK_REFERENCE_3 foreign key (POST_GK)
      references POST (GENKEY) on delete restrict on update restrict;

alter table REPLY add constraint FK_REFERENCE_4 foreign key (AUTHOR_GK)
      references USER (GENKEY) on delete restrict on update restrict;

alter table REPLY add constraint FK_REFERENCE_5 foreign key (REPLY_TO_GK)
      references REPLY (GENKEY) on delete restrict on update restrict;

