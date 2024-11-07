create database ATM;

show databases;
use atm;

create table signup(formno varchar(20), name varchar(20), father_name varchar(20), dob varchar(20),
gender varchar(20), email varchar(40), marital varchar(20), address varchar(40), city varchar(20), 
state varchar(20), pincode varchar(20));


-- show tables;


create table signuptwo(formno varchar(20), religion varchar(20), category varchar(20), income varchar(20), qualification varchar(40), occupation varchar(20), pan_number varchar(40), aadhar_number varchar(20), 
senior_citizen varchar(20), existing_account varchar(20));

create table signupthree(formno varchar(20), account_type varchar(30), card_number varchar(30), pin_number varchar(20), facilities varchar(100));

create table login(formno varchar(20), cardNumber varchar(30), PinNumber varchar(10));


create table bank(pin varchar(10), date varchar(100), type varchar(30), amount varchar(50));

-- drop table bank;
