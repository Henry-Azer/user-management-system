MYSQL - create table user (id bigint not null auto_increment, created_date datetime(6), modified_date datetime(6), address varchar(255), age integer, name varchar(255) not null, phone_number varchar(255) not null, primary key (id)) engine=InnoDB;
Postgres - create table user (id  bigserial not null, created_date timestamp, modified_date timestamp, address varchar(255), age int4, name varchar(255) not null, phone_number varchar(255) not null, primary key (id));