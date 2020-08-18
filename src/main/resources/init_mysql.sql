create database task;
use task;
show tables;

CREATE TABLE SALES
(
    ID INT NOT NULL,
    ITEM VARCHAR(30) NOT NULL,
    CURRENCY VARCHAR(3) NOT NULL,
    SUM decimal (10,3),
    PRIMARY KEY (ID)
);

CREATE TABLE CURRENCY_RATES
(
    RATE_DATE date NOT NULL,
    CURRENCY VARCHAR(3) NOT NULL,
    RATE decimal (10,3),
    PRIMARY KEY (RATE_DATE, CURRENCY)
);

insert into SALES values (1, 'Cell phone', 'EUR', 130.11);
insert into SALES values (2, 'Laptop', 'CAD', 1450);
insert into SALES values (6, 'Laptop 3', 'EUR', 550);
insert into SALES values (7, 'Skate', 'EUR', 250);
insert into SALES values (8, 'Skate', 'EUR', 250.234);

insert into CURRENCY_RATES values ('2020-01-01', 'CAD', 0.85);
insert into CURRENCY_RATES values ('2020-01-02', 'CAD', 0.87);
insert into CURRENCY_RATES values ('2020-01-05', 'CAD', 0.81);
insert into CURRENCY_RATES values ('2020-01-03', 'EUR', 1.22);
insert into CURRENCY_RATES values ('2020-01-07', 'EUR', 1.24);
insert into CURRENCY_RATES values ('2020-01-08', 'EUR', 1.24);
insert into CURRENCY_RATES values ('2020-05-13', 'EUR', 1.20);
