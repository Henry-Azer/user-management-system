create table users (id  bigserial not null, created_date timestamp, modified_date timestamp, address varchar(255), age int4, name varchar(255) not null, phone_number varchar(255) not null, primary key (id));