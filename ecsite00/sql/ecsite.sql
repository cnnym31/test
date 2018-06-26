set names utf8;
set foreign_key_checks = 0;
drop database if exists ecsite;

create database if not exists ecsite;
use ecsite;

drop table if exists login_user_transaction;

create table login_user_transaction(
	id int not null primary key auto_increment,
	login_id varchar(16) unique,
	login_pass varchar(16),
	user_name varchar(50),
	insert_date datetime,
	update_date datetime,
	admin varchar(50)
);

drop table if exists item_info_transaction;

create table item_info_transaction(
	id int not null primary key auto_increment,
	item_name varchar(30),
	item_price int,
	item_stock int,
	image_file_path varchar(100),
	image_file_name varchar(50),
	insert_date datetime,
	update_date datetime
);

create table cart_info(
	id int primary key not null auto_increment,
	user_id varchar(16),
	item_id int,
	item_count int,
	item_price int,
	insert_date datetime,
	update_date datetime
);

drop table if exists user_buy_item_transaction;

create table user_buy_item_transaction(
	id int not null primary key auto_increment,
	item_transaction_id int,
	total_price int,
	total_count int,
	user_master_id varchar(16),
	pay varchar(30),
	insert_date datetime,
	update_date datetime
);

insert into item_info_transaction(item_name, item_price, item_stock, image_file_path, image_file_name) values("test01", 100, 50, "./images", "test.png");
insert into item_info_transaction(item_name, item_price, item_stock, image_file_path, image_file_name) values("test02", 100, 50, "./images", "test.png");
insert into item_info_transaction(item_name, item_price, item_stock, image_file_path, image_file_name) values("test03", 100, 50, "./images", "test.png");
insert into login_user_transaction(login_id, login_pass, admin) values("admin", "admin", "1");
insert into login_user_transaction(login_id, login_pass, user_name) values("internous", "internous01", "test");
insert into login_user_transaction(login_id, login_pass, user_name) values("taro", "123", "yamadataro");



